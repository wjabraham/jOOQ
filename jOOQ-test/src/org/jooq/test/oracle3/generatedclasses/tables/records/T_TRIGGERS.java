/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_TRIGGERS", schema = "TEST")
public class T_TRIGGERS extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_TRIGGERS> implements java.lang.Cloneable, org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>, org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_TRIGGERS_INTERFACE {

	private static final long serialVersionUID = -2034221467;

	/**
	 * The table column <code>TEST.T_TRIGGERS.ID_GENERATED</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public void setID_GENERATED(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_TRIGGERS.T_TRIGGERS.ID_GENERATED, value);
	}

	/**
	 * The table column <code>TEST.T_TRIGGERS.ID_GENERATED</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID_GENERATED", unique = true, nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID_GENERATED() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_TRIGGERS.T_TRIGGERS.ID_GENERATED);
	}

	/**
	 * The table column <code>TEST.T_TRIGGERS.ID</code>
	 */
	@Override
	public void setID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_TRIGGERS.T_TRIGGERS.ID, value);
	}

	/**
	 * The table column <code>TEST.T_TRIGGERS.ID</code>
	 */
	@javax.persistence.Column(name = "ID", nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_TRIGGERS.T_TRIGGERS.ID);
	}

	/**
	 * The table column <code>TEST.T_TRIGGERS.COUNTER</code>
	 */
	@Override
	public void setCOUNTER(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_TRIGGERS.T_TRIGGERS.COUNTER, value);
	}

	/**
	 * The table column <code>TEST.T_TRIGGERS.COUNTER</code>
	 */
	@javax.persistence.Column(name = "COUNTER", nullable = false, precision = 7)
	@Override
	public java.lang.Integer getCOUNTER() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_TRIGGERS.T_TRIGGERS.COUNTER);
	}

	/**
	 * Create a detached T_TRIGGERS
	 */
	public T_TRIGGERS() {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_TRIGGERS.T_TRIGGERS);
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
		return org.jooq.test.oracle3.generatedclasses.tables.T_TRIGGERS.T_TRIGGERS.ID_GENERATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_TRIGGERS.T_TRIGGERS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_TRIGGERS.T_TRIGGERS.COUNTER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getID_GENERATED();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getCOUNTER();
	}
}
