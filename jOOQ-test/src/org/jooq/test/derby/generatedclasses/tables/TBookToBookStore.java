/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class TBookToBookStore extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.derby.generatedclasses.tables.records.TBookToBookStoreRecord> {

	private static final long serialVersionUID = -723965469;

	/**
	 * The singleton instance of T_BOOK_TO_BOOK_STORE
	 */
	public static final org.jooq.test.derby.generatedclasses.tables.TBookToBookStore T_BOOK_TO_BOOK_STORE = new org.jooq.test.derby.generatedclasses.tables.TBookToBookStore();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.derby.generatedclasses.tables.records.TBookToBookStoreRecord> __RECORD_TYPE = org.jooq.test.derby.generatedclasses.tables.records.TBookToBookStoreRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.derby.generatedclasses.tables.records.TBookToBookStoreRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME]
	 * REFERENCES T_BOOK_STORE [TEST.T_BOOK_STORE.NAME]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.String> BOOK_STORE_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.test.derby.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.String>("BOOK_STORE_NAME", org.jooq.impl.SQLDataType.VARCHAR, T_BOOK_TO_BOOK_STORE);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.T_BOOK_TO_BOOK_STORE.BOOK_ID]
	 * REFERENCES T_BOOK [TEST.T_BOOK.ID]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.Integer> BOOK_ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.derby.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.Integer>("BOOK_ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK_TO_BOOK_STORE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.Integer> STOCK = new org.jooq.impl.TableFieldImpl<org.jooq.test.derby.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.Integer>("STOCK", org.jooq.impl.SQLDataType.INTEGER, T_BOOK_TO_BOOK_STORE);

	/**
	 * No further instances allowed
	 */
	private TBookToBookStore() {
		super("T_BOOK_TO_BOOK_STORE", org.jooq.test.derby.generatedclasses.Test.TEST);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.TBookToBookStoreRecord> getMainKey() {
		return org.jooq.test.derby.generatedclasses.Keys.PK_B2BS;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.TBookToBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.TBookToBookStoreRecord>>asList(org.jooq.test.derby.generatedclasses.Keys.PK_B2BS);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.derby.generatedclasses.tables.records.TBookToBookStoreRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.derby.generatedclasses.tables.records.TBookToBookStoreRecord, ?>>asList(org.jooq.test.derby.generatedclasses.Keys.FK_B2BS_BS_NAME, org.jooq.test.derby.generatedclasses.Keys.FK_B2BS_B_ID);
	}
}