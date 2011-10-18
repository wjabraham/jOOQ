/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class PGetOneCursor extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1153127452;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> TOTAL = new org.jooq.impl.ParameterImpl<java.lang.Integer>("total", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.Result<org.jooq.Record>> BOOKS = new org.jooq.impl.ParameterImpl<org.jooq.Result<org.jooq.Record>>("books", org.jooq.impl.SQLDataType.RESULT);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer[]> BOOK_IDS = new org.jooq.impl.ParameterImpl<java.lang.Integer[]>("book_ids", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType());

	/**
	 * Create a new routine call instance
	 */
	public PGetOneCursor() {
		super(org.jooq.SQLDialect.POSTGRES, "p_get_one_cursor", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);

		addOutParameter(TOTAL);
		addOutParameter(BOOKS);
		addInParameter(BOOK_IDS);
	}

	/**
	 * Set the <code>book_ids</code> parameter to the routine
	 */
	public void setBookIds(java.lang.Integer[] value) {
		setValue(BOOK_IDS, value);
	}

	public java.lang.Integer getTotal() {
		return getValue(TOTAL);
	}

	public org.jooq.Result<org.jooq.Record> getBooks() {
		return getValue(BOOKS);
	}
}