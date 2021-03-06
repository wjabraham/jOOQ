/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class VAuthor extends org.jooq.impl.TableImpl<org.jooq.test.h2.generatedclasses.tables.records.VAuthorRecord> {

	private static final long serialVersionUID = -1515973952;

	/**
	 * The singleton instance of <code>PUBLIC.V_AUTHOR</code>
	 */
	public static final org.jooq.test.h2.generatedclasses.tables.VAuthor V_AUTHOR = new org.jooq.test.h2.generatedclasses.tables.VAuthor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.h2.generatedclasses.tables.records.VAuthorRecord> getRecordType() {
		return org.jooq.test.h2.generatedclasses.tables.records.VAuthorRecord.class;
	}

	/**
	 * The column <code>PUBLIC.V_AUTHOR.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, V_AUTHOR);

	/**
	 * The column <code>PUBLIC.V_AUTHOR.FIRST_NAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.VAuthorRecord, java.lang.String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR, V_AUTHOR);

	/**
	 * The column <code>PUBLIC.V_AUTHOR.LAST_NAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.VAuthorRecord, java.lang.String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR, V_AUTHOR);

	/**
	 * The column <code>PUBLIC.V_AUTHOR.DATE_OF_BIRTH</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.VAuthorRecord, java.sql.Date> DATE_OF_BIRTH = createField("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, V_AUTHOR);

	/**
	 * The column <code>PUBLIC.V_AUTHOR.YEAR_OF_BIRTH</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, V_AUTHOR);

	/**
	 * The column <code>PUBLIC.V_AUTHOR.ADDRESS</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.VAuthorRecord, java.lang.String> ADDRESS = createField("ADDRESS", org.jooq.impl.SQLDataType.VARCHAR, V_AUTHOR);

	/**
	 * No further instances allowed
	 */
	private VAuthor() {
		super("V_AUTHOR", org.jooq.test.h2.generatedclasses.Public.PUBLIC);
	}
}
