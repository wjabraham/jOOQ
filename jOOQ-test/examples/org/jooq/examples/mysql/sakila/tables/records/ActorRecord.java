/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class ActorRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.ActorRecord> implements org.jooq.Record4<java.lang.Short, java.lang.String, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = 1715343387;

	/**
	 * Setter for <code>sakila.actor.actor_id</code>. 
	 */
	public void setActorId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Actor.ACTOR.ACTOR_ID, value);
	}

	/**
	 * Getter for <code>sakila.actor.actor_id</code>. 
	 */
	public java.lang.Short getActorId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Actor.ACTOR.ACTOR_ID);
	}

	/**
	 * Setter for <code>sakila.actor.first_name</code>. 
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Actor.ACTOR.FIRST_NAME, value);
	}

	/**
	 * Getter for <code>sakila.actor.first_name</code>. 
	 */
	public java.lang.String getFirstName() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Actor.ACTOR.FIRST_NAME);
	}

	/**
	 * Setter for <code>sakila.actor.last_name</code>. 
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Actor.ACTOR.LAST_NAME, value);
	}

	/**
	 * Getter for <code>sakila.actor.last_name</code>. 
	 */
	public java.lang.String getLastName() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Actor.ACTOR.LAST_NAME);
	}

	/**
	 * Setter for <code>sakila.actor.last_update</code>. 
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Actor.ACTOR.LAST_UPDATE, value);
	}

	/**
	 * Getter for <code>sakila.actor.last_update</code>. 
	 */
	public java.sql.Timestamp getLastUpdate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Actor.ACTOR.LAST_UPDATE);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	/**
	 * Fetch a list of <code>sakila.film_actor</code> referencing this <code>sakila.actor</code>
	 */
	public org.jooq.Result<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord> fetchFilmActorList() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.FilmActor.FILM_ACTOR)
			.where(org.jooq.examples.mysql.sakila.tables.FilmActor.FILM_ACTOR.ACTOR_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Actor.ACTOR.ACTOR_ID)))
			.fetch();
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Short> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Short, java.lang.String, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Short, java.lang.String, java.lang.String, java.sql.Timestamp> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field1() {
		return org.jooq.examples.mysql.sakila.tables.Actor.ACTOR.ACTOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.examples.mysql.sakila.tables.Actor.ACTOR.FIRST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.examples.mysql.sakila.tables.Actor.ACTOR.LAST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return org.jooq.examples.mysql.sakila.tables.Actor.ACTOR.LAST_UPDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value1() {
		return getActorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getFirstName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getLastName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getLastUpdate();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ActorRecord
	 */
	public ActorRecord() {
		super(org.jooq.examples.mysql.sakila.tables.Actor.ACTOR);
	}
}
