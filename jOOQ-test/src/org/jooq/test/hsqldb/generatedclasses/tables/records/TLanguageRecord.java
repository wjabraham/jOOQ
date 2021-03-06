/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TLanguageRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.TLanguageRecord> implements org.jooq.Record4<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer>, org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ITLanguage {

	private static final long serialVersionUID = -301369346;

	/**
	 * The table column <code>PUBLIC.T_LANGUAGE.CD</code>
	 */
	@Override
	public void setCd(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TLanguage.T_LANGUAGE.CD, value);
	}

	/**
	 * The table column <code>PUBLIC.T_LANGUAGE.CD</code>
	 */
	@Override
	public java.lang.String getCd() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TLanguage.T_LANGUAGE.CD);
	}

	/**
	 * The table column <code>PUBLIC.T_LANGUAGE.DESCRIPTION</code>
	 */
	@Override
	public void setDescription(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TLanguage.T_LANGUAGE.DESCRIPTION, value);
	}

	/**
	 * The table column <code>PUBLIC.T_LANGUAGE.DESCRIPTION</code>
	 */
	@Override
	public java.lang.String getDescription() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TLanguage.T_LANGUAGE.DESCRIPTION);
	}

	/**
	 * The table column <code>PUBLIC.T_LANGUAGE.DESCRIPTION_ENGLISH</code>
	 */
	@Override
	public void setDescriptionEnglish(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TLanguage.T_LANGUAGE.DESCRIPTION_ENGLISH, value);
	}

	/**
	 * The table column <code>PUBLIC.T_LANGUAGE.DESCRIPTION_ENGLISH</code>
	 */
	@Override
	public java.lang.String getDescriptionEnglish() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TLanguage.T_LANGUAGE.DESCRIPTION_ENGLISH);
	}

	/**
	 * The table column <code>PUBLIC.T_LANGUAGE.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TLanguage.T_LANGUAGE.ID, value);
	}

	/**
	 * The table column <code>PUBLIC.T_LANGUAGE.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TLanguage.T_LANGUAGE.ID);
	}

	/**
	 * The table column <code>PUBLIC.T_LANGUAGE.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord> fetchTBookList() {
		return create()
			.selectFrom(org.jooq.test.hsqldb.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.hsqldb.generatedclasses.tables.TBook.T_BOOK.LANGUAGE_ID.equal(getValue(org.jooq.test.hsqldb.generatedclasses.tables.TLanguage.T_LANGUAGE.ID)))
			.fetch();
	}

	/**
	 * Create a detached TLanguageRecord
	 */
	public TLanguageRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.TLanguage.T_LANGUAGE);
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
		return org.jooq.test.hsqldb.generatedclasses.tables.TLanguage.T_LANGUAGE.CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.hsqldb.generatedclasses.tables.TLanguage.T_LANGUAGE.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.hsqldb.generatedclasses.tables.TLanguage.T_LANGUAGE.DESCRIPTION_ENGLISH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.jooq.test.hsqldb.generatedclasses.tables.TLanguage.T_LANGUAGE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getDescriptionEnglish();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getId();
	}
}
