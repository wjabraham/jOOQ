/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class KeyColumnUsage extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1200964985;

	/**
	 * The singleton instance of <code>information_schema.key_column_usage</code>
	 */
	public static final org.jooq.util.postgres.information_schema.tables.KeyColumnUsage KEY_COLUMN_USAGE = new org.jooq.util.postgres.information_schema.tables.KeyColumnUsage();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>information_schema.key_column_usage.constraint_catalog</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_CATALOG = createField("constraint_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>information_schema.key_column_usage.constraint_schema</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_SCHEMA = createField("constraint_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>information_schema.key_column_usage.constraint_name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_NAME = createField("constraint_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>information_schema.key_column_usage.table_catalog</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_CATALOG = createField("table_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>information_schema.key_column_usage.table_schema</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_SCHEMA = createField("table_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>information_schema.key_column_usage.table_name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>information_schema.key_column_usage.column_name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLUMN_NAME = createField("column_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>information_schema.key_column_usage.ordinal_position</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> ORDINAL_POSITION = createField("ordinal_position", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>information_schema.key_column_usage.position_in_unique_constraint</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> POSITION_IN_UNIQUE_CONSTRAINT = createField("position_in_unique_constraint", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>information_schema.key_column_usage</code> table reference
	 */
	public KeyColumnUsage() {
		super("key_column_usage", org.jooq.util.postgres.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	/**
	 * Create an aliased <code>information_schema.key_column_usage</code> table reference
	 */
	public KeyColumnUsage(java.lang.String alias) {
		super(alias, org.jooq.util.postgres.information_schema.InformationSchema.INFORMATION_SCHEMA, org.jooq.util.postgres.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.postgres.information_schema.tables.KeyColumnUsage as(java.lang.String alias) {
		return new org.jooq.util.postgres.information_schema.tables.KeyColumnUsage(alias);
	}
}
