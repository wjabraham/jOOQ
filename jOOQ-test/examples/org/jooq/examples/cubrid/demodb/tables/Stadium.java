/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.cubrid.demodb.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class Stadium extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.cubrid.demodb.tables.records.StadiumRecord> {

	private static final long serialVersionUID = -1285828996;

	/**
	 * The singleton instance of PUBLIC.stadium
	 */
	public static final org.jooq.examples.cubrid.demodb.tables.Stadium STADIUM = new org.jooq.examples.cubrid.demodb.tables.Stadium();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.cubrid.demodb.tables.records.StadiumRecord> getRecordType() {
		return org.jooq.examples.cubrid.demodb.tables.records.StadiumRecord.class;
	}

	/**
	 * The table column <code>PUBLIC.stadium.code</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.cubrid.demodb.tables.records.StadiumRecord, java.lang.Integer> CODE = createField("code", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>PUBLIC.stadium.nation_code</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.cubrid.demodb.tables.records.StadiumRecord, java.lang.String> NATION_CODE = createField("nation_code", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>PUBLIC.stadium.name</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.cubrid.demodb.tables.records.StadiumRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>PUBLIC.stadium.area</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.cubrid.demodb.tables.records.StadiumRecord, java.math.BigDecimal> AREA = createField("area", org.jooq.impl.SQLDataType.DECIMAL, this);

	/**
	 * The table column <code>PUBLIC.stadium.seats</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.cubrid.demodb.tables.records.StadiumRecord, java.lang.Integer> SEATS = createField("seats", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>PUBLIC.stadium.address</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.cubrid.demodb.tables.records.StadiumRecord, java.lang.String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR, this);

	public Stadium() {
		super("stadium", org.jooq.examples.cubrid.demodb.Public.PUBLIC);
	}

	public Stadium(java.lang.String alias) {
		super(alias, org.jooq.examples.cubrid.demodb.Public.PUBLIC, org.jooq.examples.cubrid.demodb.tables.Stadium.STADIUM);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.cubrid.demodb.tables.records.StadiumRecord> getMainKey() {
		return org.jooq.examples.cubrid.demodb.Keys.STADIUM__PK_STADIUM_CODE;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.cubrid.demodb.tables.records.StadiumRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.cubrid.demodb.tables.records.StadiumRecord>>asList(org.jooq.examples.cubrid.demodb.Keys.STADIUM__PK_STADIUM_CODE);
	}

	@Override
	public org.jooq.examples.cubrid.demodb.tables.Stadium as(java.lang.String alias) {
		return new org.jooq.examples.cubrid.demodb.tables.Stadium(alias);
	}
}
