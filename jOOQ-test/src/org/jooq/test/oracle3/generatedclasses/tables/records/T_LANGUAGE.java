/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding language master data
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_LANGUAGE", schema = "TEST")
public class T_LANGUAGE extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_LANGUAGE> implements java.lang.Cloneable, org.jooq.Record4<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer>, org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_LANGUAGE_INTERFACE {

	private static final long serialVersionUID = 1434703131;

	/**
	 * The language ISO code
	 */
	@Override
	public void setCD(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE.T_LANGUAGE.CD, value);
	}

	/**
	 * The language ISO code
	 */
	@javax.persistence.Column(name = "CD", nullable = false, length = 2)
	@Override
	public java.lang.String getCD() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE.T_LANGUAGE.CD);
	}

	/**
	 * The language description
	 */
	@Override
	public void setDESCRIPTION(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE.T_LANGUAGE.DESCRIPTION, value);
	}

	/**
	 * The language description
	 */
	@javax.persistence.Column(name = "DESCRIPTION", length = 50)
	@Override
	public java.lang.String getDESCRIPTION() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE.T_LANGUAGE.DESCRIPTION);
	}

	/**
	 * The table column <code>TEST.T_LANGUAGE.DESCRIPTION_ENGLISH</code>
	 */
	@Override
	public void setDESCRIPTION_ENGLISH(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE.T_LANGUAGE.DESCRIPTION_ENGLISH, value);
	}

	/**
	 * The table column <code>TEST.T_LANGUAGE.DESCRIPTION_ENGLISH</code>
	 */
	@javax.persistence.Column(name = "DESCRIPTION_ENGLISH", length = 50)
	@Override
	public java.lang.String getDESCRIPTION_ENGLISH() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE.T_LANGUAGE.DESCRIPTION_ENGLISH);
	}

	/**
	 * The language ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public void setID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE.T_LANGUAGE.ID, value);
	}

	/**
	 * The language ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE.T_LANGUAGE.ID);
	}

	/**
	 * The language ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK> fetchT_BOOKList() {
		return create()
			.selectFrom(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK)
			.where(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK.T_BOOK.LANGUAGE_ID.equal(getValue(org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE.T_LANGUAGE.ID)))
			.fetch();
	}

	/**
	 * Create a detached T_LANGUAGE
	 */
	public T_LANGUAGE() {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE.T_LANGUAGE);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE.T_LANGUAGE.CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE.T_LANGUAGE.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE.T_LANGUAGE.DESCRIPTION_ENGLISH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE.T_LANGUAGE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getCD();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getDESCRIPTION();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getDESCRIPTION_ENGLISH();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getID();
	}
}
