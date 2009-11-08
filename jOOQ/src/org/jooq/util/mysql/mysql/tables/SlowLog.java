/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.mysql.tables;

import java.sql.Time;
import java.sql.Timestamp;
import org.jooq.Field;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 *
 * Slow log
 */
public class SlowLog extends TableImpl {

	private static final long serialVersionUID = -6609982660827684006L;

	/**
	 * The singleton instance of slow_log
	 */
	public static final SlowLog SLOW_LOG = new SlowLog();

	/**
	 * An uncommented item
	 */
	public static final Field<Timestamp> START_TIME = new TableFieldImpl<Timestamp>("start_time", Timestamp.class, SLOW_LOG);

	/**
	 * An uncommented item
	 */
	public static final Field<String> USER_HOST = new TableFieldImpl<String>("user_host", String.class, SLOW_LOG);

	/**
	 * An uncommented item
	 */
	public static final Field<Time> QUERY_TIME = new TableFieldImpl<Time>("query_time", Time.class, SLOW_LOG);

	/**
	 * An uncommented item
	 */
	public static final Field<Time> LOCK_TIME = new TableFieldImpl<Time>("lock_time", Time.class, SLOW_LOG);

	/**
	 * An uncommented item
	 */
	public static final Field<Integer> ROWS_SENT = new TableFieldImpl<Integer>("rows_sent", Integer.class, SLOW_LOG);

	/**
	 * An uncommented item
	 */
	public static final Field<Integer> ROWS_EXAMINED = new TableFieldImpl<Integer>("rows_examined", Integer.class, SLOW_LOG);

	/**
	 * An uncommented item
	 */
	public static final Field<String> DB = new TableFieldImpl<String>("db", String.class, SLOW_LOG);

	/**
	 * An uncommented item
	 */
	public static final Field<Integer> LAST_INSERT_ID = new TableFieldImpl<Integer>("last_insert_id", Integer.class, SLOW_LOG);

	/**
	 * An uncommented item
	 */
	public static final Field<Integer> INSERT_ID = new TableFieldImpl<Integer>("insert_id", Integer.class, SLOW_LOG);

	/**
	 * An uncommented item
	 */
	public static final Field<Integer> SERVER_ID = new TableFieldImpl<Integer>("server_id", Integer.class, SLOW_LOG);

	/**
	 * An uncommented item
	 */
	public static final Field<String> SQL_TEXT = new TableFieldImpl<String>("sql_text", String.class, SLOW_LOG);

	/**
	 * No further instances allowed
	 */
	private SlowLog() {
		super("slow_log", "mysql");
	}
}
