/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@java.lang.SuppressWarnings("all")
public class VLibrary extends org.jooq.impl.TableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = -1059244108;

	/**
	 * The singleton instance of <code>test2.v_library</code>
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.VLibrary V_LIBRARY = new org.jooq.test.mysql2.generatedclasses.tables.VLibrary();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.VLibraryRecord> getRecordType() {
		return org.jooq.test.mysql2.generatedclasses.tables.records.VLibraryRecord.class;
	}

	/**
	 * The column <code>test2.v_library.AUTHOR</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VLibraryRecord, java.lang.String> AUTHOR = createField("AUTHOR", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>test2.v_library.TITLE</code>. The book's title
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VLibraryRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * Create a <code>test2.v_library</code> table reference
	 */
	public VLibrary() {
		super("v_library", org.jooq.test.mysql2.generatedclasses.Test2.TEST2);
	}

	/**
	 * Create an aliased <code>test2.v_library</code> table reference
	 */
	public VLibrary(java.lang.String alias) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, org.jooq.test.mysql2.generatedclasses.tables.VLibrary.V_LIBRARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.VLibrary as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.VLibrary(alias);
	}
}
