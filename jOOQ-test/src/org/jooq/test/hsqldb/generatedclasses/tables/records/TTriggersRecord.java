/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TTriggersRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.TTriggersRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>, org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ITTriggers {

	private static final long serialVersionUID = 366643763;

	/**
	 * The table column <code>PUBLIC.T_TRIGGERS.ID_GENERATED</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public void setIdGenerated(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TTriggers.T_TRIGGERS.ID_GENERATED, value);
	}

	/**
	 * The table column <code>PUBLIC.T_TRIGGERS.ID_GENERATED</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public java.lang.Integer getIdGenerated() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TTriggers.T_TRIGGERS.ID_GENERATED);
	}

	/**
	 * The table column <code>PUBLIC.T_TRIGGERS.ID</code>
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TTriggers.T_TRIGGERS.ID, value);
	}

	/**
	 * The table column <code>PUBLIC.T_TRIGGERS.ID</code>
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TTriggers.T_TRIGGERS.ID);
	}

	/**
	 * The table column <code>PUBLIC.T_TRIGGERS.COUNTER</code>
	 */
	@Override
	public void setCounter(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TTriggers.T_TRIGGERS.COUNTER, value);
	}

	/**
	 * The table column <code>PUBLIC.T_TRIGGERS.COUNTER</code>
	 */
	@Override
	public java.lang.Integer getCounter() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TTriggers.T_TRIGGERS.COUNTER);
	}

	/**
	 * Create a detached TTriggersRecord
	 */
	public TTriggersRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.TTriggers.T_TRIGGERS);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.hsqldb.generatedclasses.tables.TTriggers.T_TRIGGERS.ID_GENERATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.hsqldb.generatedclasses.tables.TTriggers.T_TRIGGERS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.hsqldb.generatedclasses.tables.TTriggers.T_TRIGGERS.COUNTER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIdGenerated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getCounter();
	}
}
