/**
 * This class is generated by jOOQ
 */
package org.jooq.util.h2.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class FunctionAliases extends org.jooq.impl.TableImpl<org.jooq.util.h2.information_schema.tables.records.FunctionAliasesRecord> {

	private static final long serialVersionUID = 712536806;

	/**
	 * The singleton instance of FUNCTION_ALIASES
	 */
	public static final org.jooq.util.h2.information_schema.tables.FunctionAliases FUNCTION_ALIASES = new org.jooq.util.h2.information_schema.tables.FunctionAliases();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.h2.information_schema.tables.records.FunctionAliasesRecord> __RECORD_TYPE = org.jooq.util.h2.information_schema.tables.records.FunctionAliasesRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.h2.information_schema.tables.records.FunctionAliasesRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.FunctionAliasesRecord, java.lang.String> ALIAS_CATALOG = new org.jooq.impl.TableFieldImpl<org.jooq.util.h2.information_schema.tables.records.FunctionAliasesRecord, java.lang.String>("ALIAS_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, FUNCTION_ALIASES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.FunctionAliasesRecord, java.lang.String> ALIAS_SCHEMA = new org.jooq.impl.TableFieldImpl<org.jooq.util.h2.information_schema.tables.records.FunctionAliasesRecord, java.lang.String>("ALIAS_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, FUNCTION_ALIASES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.FunctionAliasesRecord, java.lang.String> ALIAS_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.util.h2.information_schema.tables.records.FunctionAliasesRecord, java.lang.String>("ALIAS_NAME", org.jooq.impl.SQLDataType.VARCHAR, FUNCTION_ALIASES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.FunctionAliasesRecord, java.lang.String> JAVA_CLASS = new org.jooq.impl.TableFieldImpl<org.jooq.util.h2.information_schema.tables.records.FunctionAliasesRecord, java.lang.String>("JAVA_CLASS", org.jooq.impl.SQLDataType.VARCHAR, FUNCTION_ALIASES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.FunctionAliasesRecord, java.lang.String> JAVA_METHOD = new org.jooq.impl.TableFieldImpl<org.jooq.util.h2.information_schema.tables.records.FunctionAliasesRecord, java.lang.String>("JAVA_METHOD", org.jooq.impl.SQLDataType.VARCHAR, FUNCTION_ALIASES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.FunctionAliasesRecord, java.lang.Integer> DATA_TYPE = new org.jooq.impl.TableFieldImpl<org.jooq.util.h2.information_schema.tables.records.FunctionAliasesRecord, java.lang.Integer>("DATA_TYPE", org.jooq.impl.SQLDataType.INTEGER, FUNCTION_ALIASES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.FunctionAliasesRecord, java.lang.Integer> COLUMN_COUNT = new org.jooq.impl.TableFieldImpl<org.jooq.util.h2.information_schema.tables.records.FunctionAliasesRecord, java.lang.Integer>("COLUMN_COUNT", org.jooq.impl.SQLDataType.INTEGER, FUNCTION_ALIASES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.FunctionAliasesRecord, java.lang.Short> RETURNS_RESULT = new org.jooq.impl.TableFieldImpl<org.jooq.util.h2.information_schema.tables.records.FunctionAliasesRecord, java.lang.Short>("RETURNS_RESULT", org.jooq.impl.SQLDataType.SMALLINT, FUNCTION_ALIASES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.FunctionAliasesRecord, java.lang.String> REMARKS = new org.jooq.impl.TableFieldImpl<org.jooq.util.h2.information_schema.tables.records.FunctionAliasesRecord, java.lang.String>("REMARKS", org.jooq.impl.SQLDataType.VARCHAR, FUNCTION_ALIASES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.FunctionAliasesRecord, java.lang.Integer> ID = new org.jooq.impl.TableFieldImpl<org.jooq.util.h2.information_schema.tables.records.FunctionAliasesRecord, java.lang.Integer>("ID", org.jooq.impl.SQLDataType.INTEGER, FUNCTION_ALIASES);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.h2.information_schema.tables.records.FunctionAliasesRecord, java.lang.String> SOURCE = new org.jooq.impl.TableFieldImpl<org.jooq.util.h2.information_schema.tables.records.FunctionAliasesRecord, java.lang.String>("SOURCE", org.jooq.impl.SQLDataType.VARCHAR, FUNCTION_ALIASES);

	/**
	 * No further instances allowed
	 */
	private FunctionAliases() {
		super("FUNCTION_ALIASES", org.jooq.util.h2.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}
}