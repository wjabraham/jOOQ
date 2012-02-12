/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.multi_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class TBookRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord> {

	private static final long serialVersionUID = -1667731665;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [MULTI_SCHEMA.T_BOOK.AUTHOR_ID]
	 * REFERENCES T_AUTHOR [MULTI_SCHEMA.T_AUTHOR.ID]
	 * </pre></code>
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [MULTI_SCHEMA.T_BOOK.AUTHOR_ID]
	 * REFERENCES T_AUTHOR [MULTI_SCHEMA.T_AUTHOR.ID]
	 * </pre></code>
	 */
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [MULTI_SCHEMA.T_BOOK.AUTHOR_ID]
	 * REFERENCES T_AUTHOR [MULTI_SCHEMA.T_AUTHOR.ID]
	 * </pre></code>
	 */
	public org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TAuthorRecord fetchTAuthorByAuthorId() {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR.ID.equal(getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [MULTI_SCHEMA.T_BOOK.CO_AUTHOR_ID]
	 * REFERENCES T_AUTHOR [MULTI_SCHEMA.T_AUTHOR.ID]
	 * </pre></code>
	 */
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CO_AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [MULTI_SCHEMA.T_BOOK.CO_AUTHOR_ID]
	 * REFERENCES T_AUTHOR [MULTI_SCHEMA.T_AUTHOR.ID]
	 * </pre></code>
	 */
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CO_AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [MULTI_SCHEMA.T_BOOK.CO_AUTHOR_ID]
	 * REFERENCES T_AUTHOR [MULTI_SCHEMA.T_AUTHOR.ID]
	 * </pre></code>
	 */
	public org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TAuthorRecord fetchTAuthorByCoAuthorId() {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR.ID.equal(getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CO_AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.DETAILS_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.DETAILS_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.TITLE);
	}

	/**
	 * An uncommented item
	 */
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.PUBLISHED_IN, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.PUBLISHED_IN);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [MULTI_SCHEMA.T_BOOK.LANGUAGE_ID]
	 * REFERENCES T_LANGUAGE [TEST.T_LANGUAGE.ID]
	 * </pre></code>
	 */
	public void setLanguageId(org.jooq.test.oracle.generatedclasses.test.enums.TLanguage value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.LANGUAGE_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [MULTI_SCHEMA.T_BOOK.LANGUAGE_ID]
	 * REFERENCES T_LANGUAGE [TEST.T_LANGUAGE.ID]
	 * </pre></code>
	 */
	public org.jooq.test.oracle.generatedclasses.test.enums.TLanguage getLanguageId() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.LANGUAGE_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CONTENT_TEXT, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CONTENT_TEXT);
	}

	/**
	 * An uncommented item
	 */
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CONTENT_PDF, value);
	}

	/**
	 * An uncommented item
	 */
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK.CONTENT_PDF);
	}

	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK);
	}
}