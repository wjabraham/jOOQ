/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ProductSubcategory", schema = "Production")
public class Productsubcategory implements java.io.Serializable {

	private static final long serialVersionUID = 505503316;

	private java.lang.Integer  productsubcategoryid;
	private java.lang.Integer  productcategoryid;
	private java.lang.String   name;
	private java.lang.String   rowguid;
	private java.sql.Timestamp modifieddate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ProductSubcategoryID", unique = true)
	public java.lang.Integer getProductsubcategoryid() {
		return this.productsubcategoryid;
	}

	public void setProductsubcategoryid(java.lang.Integer productsubcategoryid) {
		this.productsubcategoryid = productsubcategoryid;
	}

	@javax.persistence.Column(name = "ProductCategoryID")
	public java.lang.Integer getProductcategoryid() {
		return this.productcategoryid;
	}

	public void setProductcategoryid(java.lang.Integer productcategoryid) {
		this.productcategoryid = productcategoryid;
	}

	@javax.persistence.Column(name = "Name")
	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	@javax.persistence.Column(name = "rowguid")
	public java.lang.String getRowguid() {
		return this.rowguid;
	}

	public void setRowguid(java.lang.String rowguid) {
		this.rowguid = rowguid;
	}

	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return this.modifieddate;
	}

	public void setModifieddate(java.sql.Timestamp modifieddate) {
		this.modifieddate = modifieddate;
	}
}