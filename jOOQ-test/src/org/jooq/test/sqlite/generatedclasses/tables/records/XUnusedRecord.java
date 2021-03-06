/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XUnusedRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sqlite.generatedclasses.tables.records.XUnusedRecord> {

	private static final long serialVersionUID = -342186217;

	/**
	 * The table column <code>x_unused.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.ID, value);
	}

	/**
	 * The table column <code>x_unused.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.ID);
	}

	/**
	 * The table column <code>x_unused.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.sqlite.generatedclasses.tables.records.T_986_1Record> fetchT_986_1List() {
		return create()
			.selectFrom(org.jooq.test.sqlite.generatedclasses.tables.T_986_1.T_986_1)
			.where(org.jooq.test.sqlite.generatedclasses.tables.T_986_1.REF.equal(getValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.ID)))
			.fetch();
	}

	/**
	 * The table column <code>x_unused.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.sqlite.generatedclasses.tables.records.T_986_2Record> fetchT_986_2List() {
		return create()
			.selectFrom(org.jooq.test.sqlite.generatedclasses.tables.T_986_2.T_986_2)
			.where(org.jooq.test.sqlite.generatedclasses.tables.T_986_2.REF.equal(getValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.ID)))
			.fetch();
	}

	/**
	 * The table column <code>x_unused.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_64_69Record> fetchXTestCase_64_69List() {
		return create()
			.selectFrom(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69)
			.where(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_64_69.UNUSED_ID.equal(getValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.ID)))
			.fetch();
	}

	/**
	 * The table column <code>x_unused.NAME</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.NAME, value);
	}

	/**
	 * The table column <code>x_unused.NAME</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.String getName() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.NAME);
	}

	/**
	 * The table column <code>x_unused.BIG_INTEGER</code>
	 */
	public void setBigInteger(java.math.BigInteger value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.BIG_INTEGER, value);
	}

	/**
	 * The table column <code>x_unused.BIG_INTEGER</code>
	 */
	public java.math.BigInteger getBigInteger() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.BIG_INTEGER);
	}

	/**
	 * The table column <code>x_unused.ID_REF</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_x_unused_X_UNUSED_1
	 * FOREIGN KEY (ID_REF, NAME_REF)
	 * REFERENCES x_unused (ID)
	 * </pre></code>
	 */
	public void setIdRef(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.ID_REF, value);
	}

	/**
	 * The table column <code>x_unused.ID_REF</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_x_unused_X_UNUSED_1
	 * FOREIGN KEY (ID_REF, NAME_REF)
	 * REFERENCES x_unused (ID)
	 * </pre></code>
	 */
	public java.lang.Integer getIdRef() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.ID_REF);
	}

	/**
	 * The table column <code>x_unused.CLASS</code>
	 */
	public void setClass_(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.CLASS, value);
	}

	/**
	 * The table column <code>x_unused.CLASS</code>
	 */
	public java.lang.Integer getClass_() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.CLASS);
	}

	/**
	 * The table column <code>x_unused.FIELDS</code>
	 */
	public void setFields_(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.FIELDS, value);
	}

	/**
	 * The table column <code>x_unused.FIELDS</code>
	 */
	public java.lang.Integer getFields_() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.FIELDS);
	}

	/**
	 * The table column <code>x_unused.CONFIGURATION</code>
	 */
	public void setConfiguration_(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.CONFIGURATION, value);
	}

	/**
	 * The table column <code>x_unused.CONFIGURATION</code>
	 */
	public java.lang.Integer getConfiguration_() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.CONFIGURATION);
	}

	/**
	 * The table column <code>x_unused.U_D_T</code>
	 */
	public void setUDT(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.U_D_T, value);
	}

	/**
	 * The table column <code>x_unused.U_D_T</code>
	 */
	public java.lang.Integer getUDT() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.U_D_T);
	}

	/**
	 * The table column <code>x_unused.META_DATA</code>
	 */
	public void setMetaData(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.META_DATA, value);
	}

	/**
	 * The table column <code>x_unused.META_DATA</code>
	 */
	public java.lang.Integer getMetaData() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.META_DATA);
	}

	/**
	 * The table column <code>x_unused.TYPE0</code>
	 */
	public void setType0(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.TYPE0, value);
	}

	/**
	 * The table column <code>x_unused.TYPE0</code>
	 */
	public java.lang.Integer getType0() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.TYPE0);
	}

	/**
	 * The table column <code>x_unused.PRIMARY_KEY</code>
	 */
	public void setPrimaryKey(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.PRIMARY_KEY, value);
	}

	/**
	 * The table column <code>x_unused.PRIMARY_KEY</code>
	 */
	public java.lang.Integer getPrimaryKey() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.PRIMARY_KEY);
	}

	/**
	 * The table column <code>x_unused.PRIMARYKEY</code>
	 */
	public void setPrimarykey(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.PRIMARYKEY, value);
	}

	/**
	 * The table column <code>x_unused.PRIMARYKEY</code>
	 */
	public java.lang.Integer getPrimarykey() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.PRIMARYKEY);
	}

	/**
	 * The table column <code>x_unused.NAME_REF</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_x_unused_X_UNUSED_1
	 * FOREIGN KEY (ID_REF, NAME_REF)
	 * REFERENCES x_unused (ID)
	 * </pre></code>
	 */
	public void setNameRef(java.lang.String value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.NAME_REF, value);
	}

	/**
	 * The table column <code>x_unused.NAME_REF</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_x_unused_X_UNUSED_1
	 * FOREIGN KEY (ID_REF, NAME_REF)
	 * REFERENCES x_unused (ID)
	 * </pre></code>
	 */
	public java.lang.String getNameRef() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.NAME_REF);
	}

	/**
	 * The table column <code>x_unused.FIELD 737</code>
	 */
	public void setField_737(java.math.BigDecimal value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.FIELD_737, value);
	}

	/**
	 * The table column <code>x_unused.FIELD 737</code>
	 */
	public java.math.BigDecimal getField_737() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.XUnused.FIELD_737);
	}

	/**
	 * Create a detached XUnusedRecord
	 */
	public XUnusedRecord() {
		super(org.jooq.test.sqlite.generatedclasses.tables.XUnused.X_UNUSED);
	}
}
