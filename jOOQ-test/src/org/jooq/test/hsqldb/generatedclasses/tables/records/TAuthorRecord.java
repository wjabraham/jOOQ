/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

import java.sql.Date;
import org.jooq.Result;
import org.jooq.impl.RecordImpl;
import org.jooq.test.hsqldb.generatedclasses.tables.TAuthor;


/**
 * This class is generated by jOOQ.
 */
public class TAuthorRecord extends RecordImpl {

	private static final long serialVersionUID = 1L;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY 'SYS_PK_11874'
	 */
	public void setId(Integer value) {
		setValue(TAuthor.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY 'SYS_PK_11874'
	 */
	public Integer getId() {
		return getValue(TAuthor.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setFirstName(String value) {
		setValue(TAuthor.FIRST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getFirstName() {
		return getValue(TAuthor.FIRST_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setLastName(String value) {
		setValue(TAuthor.LAST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getLastName() {
		return getValue(TAuthor.LAST_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setDateOfBirth(Date value) {
		setValue(TAuthor.DATE_OF_BIRTH, value);
	}

	/**
	 * An uncommented item
	 */
	public Date getDateOfBirth() {
		return getValue(TAuthor.DATE_OF_BIRTH);
	}

	public TAuthorRecord(Result result) {
		super(result);
	}
}