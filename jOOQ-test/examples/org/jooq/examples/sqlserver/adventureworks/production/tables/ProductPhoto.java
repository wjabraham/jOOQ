/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class ProductPhoto extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductPhoto> {

	private static final long serialVersionUID = -346869173;

	/**
	 * The singleton instance of <code>Production.ProductPhoto</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.ProductPhoto ProductPhoto = new org.jooq.examples.sqlserver.adventureworks.production.tables.ProductPhoto();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductPhoto> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductPhoto.class;
	}

	/**
	 * The column <code>Production.ProductPhoto.ProductPhotoID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductPhoto, java.lang.Integer> ProductPhotoID = createField("ProductPhotoID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Production.ProductPhoto.ThumbNailPhoto</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductPhoto, byte[]> ThumbNailPhoto = createField("ThumbNailPhoto", org.jooq.impl.SQLDataType.VARBINARY, this);

	/**
	 * The column <code>Production.ProductPhoto.ThumbnailPhotoFileName</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductPhoto, java.lang.String> ThumbnailPhotoFileName = createField("ThumbnailPhotoFileName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The column <code>Production.ProductPhoto.LargePhoto</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductPhoto, byte[]> LargePhoto = createField("LargePhoto", org.jooq.impl.SQLDataType.VARBINARY, this);

	/**
	 * The column <code>Production.ProductPhoto.LargePhotoFileName</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductPhoto, java.lang.String> LargePhotoFileName = createField("LargePhotoFileName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The column <code>Production.ProductPhoto.ModifiedDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductPhoto, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>Production.ProductPhoto</code> table reference
	 */
	public ProductPhoto() {
		super("ProductPhoto", org.jooq.examples.sqlserver.adventureworks.production.Production.Production);
	}

	/**
	 * Create an aliased <code>Production.ProductPhoto</code> table reference
	 */
	public ProductPhoto(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.Production, org.jooq.examples.sqlserver.adventureworks.production.tables.ProductPhoto.ProductPhoto);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductPhoto, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.IDENTITY_ProductPhoto;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductPhoto> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_ProductPhoto_ProductPhotoID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductPhoto>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductPhoto>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_ProductPhoto_ProductPhotoID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.ProductPhoto as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.ProductPhoto(alias);
	}
}
