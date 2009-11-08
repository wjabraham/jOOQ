/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.mysql.tables;

import org.jooq.Field;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 *
 * keyword-topic relation
 */
public class HelpRelation extends TableImpl {

	private static final long serialVersionUID = 8486017723122164152L;

	/**
	 * The singleton instance of help_relation
	 */
	public static final HelpRelation HELP_RELATION = new HelpRelation();

	/**
	 * An uncommented item
	 */
	public static final Field<Integer> HELP_TOPIC_ID = new TableFieldImpl<Integer>("help_topic_id", Integer.class, HELP_RELATION);

	/**
	 * An uncommented item
	 */
	public static final Field<Integer> HELP_KEYWORD_ID = new TableFieldImpl<Integer>("help_keyword_id", Integer.class, HELP_RELATION);

	/**
	 * No further instances allowed
	 */
	private HelpRelation() {
		super("help_relation", "mysql");
	}
}
