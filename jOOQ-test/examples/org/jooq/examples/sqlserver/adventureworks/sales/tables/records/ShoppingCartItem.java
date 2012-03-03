/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ShoppingCartItem", schema = "Sales")
public class ShoppingCartItem extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem> {

	private static final long serialVersionUID = -632286363;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setShoppingCartItemID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem.ShoppingCartItem.ShoppingCartItemID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ShoppingCartItemID", unique = true, nullable = false)
	public java.lang.Integer getShoppingCartItemID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem.ShoppingCartItem.ShoppingCartItemID);
	}

	/**
	 * An uncommented item
	 */
	public void setShoppingCartID(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem.ShoppingCartItem.ShoppingCartID, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ShoppingCartID", nullable = false)
	public java.lang.String getShoppingCartID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem.ShoppingCartItem.ShoppingCartID);
	}

	/**
	 * An uncommented item
	 */
	public void setQuantity(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem.ShoppingCartItem.Quantity, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Quantity", nullable = false)
	public java.lang.Integer getQuantity() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem.ShoppingCartItem.Quantity);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ShoppingCartItem_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	public void setProductID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem.ShoppingCartItem.ProductID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ShoppingCartItem_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ProductID", nullable = false)
	public java.lang.Integer getProductID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem.ShoppingCartItem.ProductID);
	}

	/**
	 * An uncommented item
	 */
	public void setDateCreated(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem.ShoppingCartItem.DateCreated, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "DateCreated", nullable = false)
	public java.sql.Timestamp getDateCreated() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem.ShoppingCartItem.DateCreated);
	}

	/**
	 * An uncommented item
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem.ShoppingCartItem.ModifiedDate, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem.ShoppingCartItem.ModifiedDate);
	}

	/**
	 * Create a detached ShoppingCartItem
	 */
	public ShoppingCartItem() {
		super(org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem.ShoppingCartItem);
	}
}