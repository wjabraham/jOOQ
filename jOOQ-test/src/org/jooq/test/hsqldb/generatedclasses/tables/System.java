/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class System extends org.jooq.impl.TableImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.SystemRecord> {

	private static final long serialVersionUID = 52362382;

	/**
	 * The singleton instance of SYSTEM
	 */
	public static final org.jooq.test.hsqldb.generatedclasses.tables.System SYSTEM = new org.jooq.test.hsqldb.generatedclasses.tables.System();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.SystemRecord> __RECORD_TYPE = org.jooq.test.hsqldb.generatedclasses.tables.records.SystemRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.SystemRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.SystemRecord, java.lang.Integer> ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.SystemRecord, java.lang.Integer>("ID", org.jooq.impl.SQLDataType.INTEGER, SYSTEM);

	/**
	 * No further instances allowed
	 */
	private System() {
		super("SYSTEM", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);
	}
}