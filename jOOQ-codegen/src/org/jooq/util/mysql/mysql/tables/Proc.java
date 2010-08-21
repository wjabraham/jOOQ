/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.mysql.tables;

import java.sql.Timestamp;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.mysql.mysql.Mysql;
import org.jooq.util.mysql.mysql.tables.records.ProcRecord;


/**
 * This class is generated by jOOQ.
 *
 * Stored Procedures
 */
public class Proc extends TableImpl {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of proc
	 */
	public static final Proc PROC = new Proc();

	/**
	 * The class holding records for this table
	 */
	private static final Class<ProcRecord> RECORD_TYPE = ProcRecord.class;

	/**
	 * The class holding records for this table
	 */
	@Override
	public Class<ProcRecord> getRecordType() {
		return RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<String> DB = new TableFieldImpl<String>("db", String.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> NAME = new TableFieldImpl<String>("name", String.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TYPE = new TableFieldImpl<String>("type", String.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> SPECIFIC_NAME = new TableFieldImpl<String>("specific_name", String.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> LANGUAGE = new TableFieldImpl<String>("language", String.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> SQL_DATA_ACCESS = new TableFieldImpl<String>("sql_data_access", String.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> IS_DETERMINISTIC = new TableFieldImpl<String>("is_deterministic", String.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> SECURITY_TYPE = new TableFieldImpl<String>("security_type", String.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<byte[]> PARAM_LIST = new TableFieldImpl<byte[]>("param_list", byte[].class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<byte[]> RETURNS = new TableFieldImpl<byte[]>("returns", byte[].class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<byte[]> BODY = new TableFieldImpl<byte[]>("body", byte[].class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> DEFINER = new TableFieldImpl<String>("definer", String.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<Timestamp> CREATED = new TableFieldImpl<Timestamp>("created", Timestamp.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<Timestamp> MODIFIED = new TableFieldImpl<Timestamp>("modified", Timestamp.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> SQL_MODE = new TableFieldImpl<String>("sql_mode", String.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> COMMENT = new TableFieldImpl<String>("comment", String.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> CHARACTER_SET_CLIENT = new TableFieldImpl<String>("character_set_client", String.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> COLLATION_CONNECTION = new TableFieldImpl<String>("collation_connection", String.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> DB_COLLATION = new TableFieldImpl<String>("db_collation", String.class, PROC);

	/**
	 * An uncommented item
	 */
	public static final TableField<byte[]> BODY_UTF8 = new TableFieldImpl<byte[]>("body_utf8", byte[].class, PROC);

	/**
	 * No further instances allowed
	 */
	private Proc() {
		super("proc", Mysql.MYSQL);
	}
}
