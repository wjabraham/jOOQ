/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class TIdentityPkRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.mysql.generatedclasses.tables.records.TIdentityPkRecord> {

	private static final long serialVersionUID = 595483820;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.TIdentityPk.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.TIdentityPk.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setVal(java.lang.Integer value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.TIdentityPk.VAL, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getVal() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.TIdentityPk.VAL);
	}

	/**
	 * Create a detached TIdentityPkRecord
	 */
	public TIdentityPkRecord() {
		super(org.jooq.test.mysql.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK);
	}
}