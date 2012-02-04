/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the Production schema
 */
@SuppressWarnings({"unchecked"})
public class Keys extends org.jooq.impl.AbstractKeys {

	// IDENTITY definitions
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillofmaterialsRecord, java.lang.Integer> IDENTITY_BillOfMaterials = createIdentity(org.jooq.examples.sqlserver.adventureworks.production.tables.Billofmaterials.BILLOFMATERIALS, org.jooq.examples.sqlserver.adventureworks.production.tables.Billofmaterials.BILLOFMATERIALS.BILLOFMATERIALSID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.DocumentRecord, java.lang.Integer> IDENTITY_Document = createIdentity(org.jooq.examples.sqlserver.adventureworks.production.tables.Document.DOCUMENT, org.jooq.examples.sqlserver.adventureworks.production.tables.Document.DOCUMENT.DOCUMENTID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.IllustrationRecord, java.lang.Integer> IDENTITY_Illustration = createIdentity(org.jooq.examples.sqlserver.adventureworks.production.tables.Illustration.ILLUSTRATION, org.jooq.examples.sqlserver.adventureworks.production.tables.Illustration.ILLUSTRATION.ILLUSTRATIONID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.LocationRecord, java.lang.Short> IDENTITY_Location = createIdentity(org.jooq.examples.sqlserver.adventureworks.production.tables.Location.LOCATION, org.jooq.examples.sqlserver.adventureworks.production.tables.Location.LOCATION.LOCATIONID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductRecord, java.lang.Integer> IDENTITY_Product = createIdentity(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT, org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.PRODUCTID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductcategoryRecord, java.lang.Integer> IDENTITY_ProductCategory = createIdentity(org.jooq.examples.sqlserver.adventureworks.production.tables.Productcategory.PRODUCTCATEGORY, org.jooq.examples.sqlserver.adventureworks.production.tables.Productcategory.PRODUCTCATEGORY.PRODUCTCATEGORYID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductdescriptionRecord, java.lang.Integer> IDENTITY_ProductDescription = createIdentity(org.jooq.examples.sqlserver.adventureworks.production.tables.Productdescription.PRODUCTDESCRIPTION, org.jooq.examples.sqlserver.adventureworks.production.tables.Productdescription.PRODUCTDESCRIPTION.PRODUCTDESCRIPTIONID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelRecord, java.lang.Integer> IDENTITY_ProductModel = createIdentity(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodel.PRODUCTMODEL, org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodel.PRODUCTMODEL.PRODUCTMODELID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductphotoRecord, java.lang.Integer> IDENTITY_ProductPhoto = createIdentity(org.jooq.examples.sqlserver.adventureworks.production.tables.Productphoto.PRODUCTPHOTO, org.jooq.examples.sqlserver.adventureworks.production.tables.Productphoto.PRODUCTPHOTO.PRODUCTPHOTOID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductreviewRecord, java.lang.Integer> IDENTITY_ProductReview = createIdentity(org.jooq.examples.sqlserver.adventureworks.production.tables.Productreview.PRODUCTREVIEW, org.jooq.examples.sqlserver.adventureworks.production.tables.Productreview.PRODUCTREVIEW.PRODUCTREVIEWID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductsubcategoryRecord, java.lang.Integer> IDENTITY_ProductSubcategory = createIdentity(org.jooq.examples.sqlserver.adventureworks.production.tables.Productsubcategory.PRODUCTSUBCATEGORY, org.jooq.examples.sqlserver.adventureworks.production.tables.Productsubcategory.PRODUCTSUBCATEGORY.PRODUCTSUBCATEGORYID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ScrapreasonRecord, java.lang.Short> IDENTITY_ScrapReason = createIdentity(org.jooq.examples.sqlserver.adventureworks.production.tables.Scrapreason.SCRAPREASON, org.jooq.examples.sqlserver.adventureworks.production.tables.Scrapreason.SCRAPREASON.SCRAPREASONID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionhistoryRecord, java.lang.Integer> IDENTITY_TransactionHistory = createIdentity(org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistory.TRANSACTIONHISTORY, org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistory.TRANSACTIONHISTORY.TRANSACTIONID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.VproductmodelcatalogdescriptionRecord, java.lang.Integer> IDENTITY_vProductModelCatalogDescription = createIdentity(org.jooq.examples.sqlserver.adventureworks.production.tables.Vproductmodelcatalogdescription.VPRODUCTMODELCATALOGDESCRIPTION, org.jooq.examples.sqlserver.adventureworks.production.tables.Vproductmodelcatalogdescription.VPRODUCTMODELCATALOGDESCRIPTION.PRODUCTMODELID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.VproductmodelinstructionsRecord, java.lang.Integer> IDENTITY_vProductModelInstructions = createIdentity(org.jooq.examples.sqlserver.adventureworks.production.tables.Vproductmodelinstructions.VPRODUCTMODELINSTRUCTIONS, org.jooq.examples.sqlserver.adventureworks.production.tables.Vproductmodelinstructions.VPRODUCTMODELINSTRUCTIONS.PRODUCTMODELID);
	public static final org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderRecord, java.lang.Integer> IDENTITY_WorkOrder = createIdentity(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER, org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER.WORKORDERID);

	// UNIQUE and PRIMARY KEY definitions
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillofmaterialsRecord> PK_BillOfMaterials_BillOfMaterialsID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.production.tables.Billofmaterials.BILLOFMATERIALS, org.jooq.examples.sqlserver.adventureworks.production.tables.Billofmaterials.BILLOFMATERIALS.BILLOFMATERIALSID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.CultureRecord> PK_Culture_CultureID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.production.tables.Culture.CULTURE, org.jooq.examples.sqlserver.adventureworks.production.tables.Culture.CULTURE.CULTUREID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.DocumentRecord> PK_Document_DocumentID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.production.tables.Document.DOCUMENT, org.jooq.examples.sqlserver.adventureworks.production.tables.Document.DOCUMENT.DOCUMENTID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.IllustrationRecord> PK_Illustration_IllustrationID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.production.tables.Illustration.ILLUSTRATION, org.jooq.examples.sqlserver.adventureworks.production.tables.Illustration.ILLUSTRATION.ILLUSTRATIONID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.LocationRecord> PK_Location_LocationID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.production.tables.Location.LOCATION, org.jooq.examples.sqlserver.adventureworks.production.tables.Location.LOCATION.LOCATIONID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductRecord> PK_Product_ProductID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT, org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.PRODUCTID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductcategoryRecord> PK_ProductCategory_ProductCategoryID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.production.tables.Productcategory.PRODUCTCATEGORY, org.jooq.examples.sqlserver.adventureworks.production.tables.Productcategory.PRODUCTCATEGORY.PRODUCTCATEGORYID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductcosthistoryRecord> PK_ProductCostHistory_ProductID_StartDate = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.production.tables.Productcosthistory.PRODUCTCOSTHISTORY, org.jooq.examples.sqlserver.adventureworks.production.tables.Productcosthistory.PRODUCTCOSTHISTORY.PRODUCTID, org.jooq.examples.sqlserver.adventureworks.production.tables.Productcosthistory.PRODUCTCOSTHISTORY.STARTDATE);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductdescriptionRecord> PK_ProductDescription_ProductDescriptionID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.production.tables.Productdescription.PRODUCTDESCRIPTION, org.jooq.examples.sqlserver.adventureworks.production.tables.Productdescription.PRODUCTDESCRIPTION.PRODUCTDESCRIPTIONID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductdocumentRecord> PK_ProductDocument_ProductID_DocumentID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.production.tables.Productdocument.PRODUCTDOCUMENT, org.jooq.examples.sqlserver.adventureworks.production.tables.Productdocument.PRODUCTDOCUMENT.PRODUCTID, org.jooq.examples.sqlserver.adventureworks.production.tables.Productdocument.PRODUCTDOCUMENT.DOCUMENTID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductinventoryRecord> PK_ProductInventory_ProductID_LocationID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.production.tables.Productinventory.PRODUCTINVENTORY, org.jooq.examples.sqlserver.adventureworks.production.tables.Productinventory.PRODUCTINVENTORY.PRODUCTID, org.jooq.examples.sqlserver.adventureworks.production.tables.Productinventory.PRODUCTINVENTORY.LOCATIONID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductlistpricehistoryRecord> PK_ProductListPriceHistory_ProductID_StartDate = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.production.tables.Productlistpricehistory.PRODUCTLISTPRICEHISTORY, org.jooq.examples.sqlserver.adventureworks.production.tables.Productlistpricehistory.PRODUCTLISTPRICEHISTORY.PRODUCTID, org.jooq.examples.sqlserver.adventureworks.production.tables.Productlistpricehistory.PRODUCTLISTPRICEHISTORY.STARTDATE);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelRecord> PK_ProductModel_ProductModelID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodel.PRODUCTMODEL, org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodel.PRODUCTMODEL.PRODUCTMODELID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelillustrationRecord> PK_ProductModelIllustration_ProductModelID_IllustrationID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelillustration.PRODUCTMODELILLUSTRATION, org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelillustration.PRODUCTMODELILLUSTRATION.PRODUCTMODELID, org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelillustration.PRODUCTMODELILLUSTRATION.ILLUSTRATIONID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelproductdescriptioncultureRecord> PK_ProductModelProductDescriptionCulture_ProductModelID_ProductDescriptionID_CultureID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelproductdescriptionculture.PRODUCTMODELPRODUCTDESCRIPTIONCULTURE, org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelproductdescriptionculture.PRODUCTMODELPRODUCTDESCRIPTIONCULTURE.PRODUCTMODELID, org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelproductdescriptionculture.PRODUCTMODELPRODUCTDESCRIPTIONCULTURE.PRODUCTDESCRIPTIONID, org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelproductdescriptionculture.PRODUCTMODELPRODUCTDESCRIPTIONCULTURE.CULTUREID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductphotoRecord> PK_ProductPhoto_ProductPhotoID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.production.tables.Productphoto.PRODUCTPHOTO, org.jooq.examples.sqlserver.adventureworks.production.tables.Productphoto.PRODUCTPHOTO.PRODUCTPHOTOID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductproductphotoRecord> PK_ProductProductPhoto_ProductID_ProductPhotoID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.production.tables.Productproductphoto.PRODUCTPRODUCTPHOTO, org.jooq.examples.sqlserver.adventureworks.production.tables.Productproductphoto.PRODUCTPRODUCTPHOTO.PRODUCTID, org.jooq.examples.sqlserver.adventureworks.production.tables.Productproductphoto.PRODUCTPRODUCTPHOTO.PRODUCTPHOTOID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductreviewRecord> PK_ProductReview_ProductReviewID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.production.tables.Productreview.PRODUCTREVIEW, org.jooq.examples.sqlserver.adventureworks.production.tables.Productreview.PRODUCTREVIEW.PRODUCTREVIEWID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductsubcategoryRecord> PK_ProductSubcategory_ProductSubcategoryID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.production.tables.Productsubcategory.PRODUCTSUBCATEGORY, org.jooq.examples.sqlserver.adventureworks.production.tables.Productsubcategory.PRODUCTSUBCATEGORY.PRODUCTSUBCATEGORYID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ScrapreasonRecord> PK_ScrapReason_ScrapReasonID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.production.tables.Scrapreason.SCRAPREASON, org.jooq.examples.sqlserver.adventureworks.production.tables.Scrapreason.SCRAPREASON.SCRAPREASONID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionhistoryRecord> PK_TransactionHistory_TransactionID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistory.TRANSACTIONHISTORY, org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistory.TRANSACTIONHISTORY.TRANSACTIONID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionhistoryarchiveRecord> PK_TransactionHistoryArchive_TransactionID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistoryarchive.TRANSACTIONHISTORYARCHIVE, org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistoryarchive.TRANSACTIONHISTORYARCHIVE.TRANSACTIONID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.UnitmeasureRecord> PK_UnitMeasure_UnitMeasureCode = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.production.tables.Unitmeasure.UNITMEASURE, org.jooq.examples.sqlserver.adventureworks.production.tables.Unitmeasure.UNITMEASURE.UNITMEASURECODE);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderRecord> PK_WorkOrder_WorkOrderID = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER, org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER.WORKORDERID);
	public static final org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderroutingRecord> PK_WorkOrderRouting_WorkOrderID_ProductID_OperationSequence = createUniqueKey(org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING, org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.WORKORDERID, org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.PRODUCTID, org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.OPERATIONSEQUENCE);

	// FOREIGN KEY definitions
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillofmaterialsRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductRecord> FK_BillOfMaterials_Product_ProductAssemblyID = createForeignKey(PK_Product_ProductID, org.jooq.examples.sqlserver.adventureworks.production.tables.Billofmaterials.BILLOFMATERIALS, org.jooq.examples.sqlserver.adventureworks.production.tables.Billofmaterials.BILLOFMATERIALS.PRODUCTASSEMBLYID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillofmaterialsRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductRecord> FK_BillOfMaterials_Product_ComponentID = createForeignKey(PK_Product_ProductID, org.jooq.examples.sqlserver.adventureworks.production.tables.Billofmaterials.BILLOFMATERIALS, org.jooq.examples.sqlserver.adventureworks.production.tables.Billofmaterials.BILLOFMATERIALS.COMPONENTID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillofmaterialsRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.UnitmeasureRecord> FK_BillOfMaterials_UnitMeasure_UnitMeasureCode = createForeignKey(PK_UnitMeasure_UnitMeasureCode, org.jooq.examples.sqlserver.adventureworks.production.tables.Billofmaterials.BILLOFMATERIALS, org.jooq.examples.sqlserver.adventureworks.production.tables.Billofmaterials.BILLOFMATERIALS.UNITMEASURECODE);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.UnitmeasureRecord> FK_Product_UnitMeasure_SizeUnitMeasureCode = createForeignKey(PK_UnitMeasure_UnitMeasureCode, org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT, org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.SIZEUNITMEASURECODE);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.UnitmeasureRecord> FK_Product_UnitMeasure_WeightUnitMeasureCode = createForeignKey(PK_UnitMeasure_UnitMeasureCode, org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT, org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.WEIGHTUNITMEASURECODE);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductsubcategoryRecord> FK_Product_ProductSubcategory_ProductSubcategoryID = createForeignKey(PK_ProductSubcategory_ProductSubcategoryID, org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT, org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.PRODUCTSUBCATEGORYID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelRecord> FK_Product_ProductModel_ProductModelID = createForeignKey(PK_ProductModel_ProductModelID, org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT, org.jooq.examples.sqlserver.adventureworks.production.tables.Product.PRODUCT.PRODUCTMODELID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductcosthistoryRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductRecord> FK_ProductCostHistory_Product_ProductID = createForeignKey(PK_Product_ProductID, org.jooq.examples.sqlserver.adventureworks.production.tables.Productcosthistory.PRODUCTCOSTHISTORY, org.jooq.examples.sqlserver.adventureworks.production.tables.Productcosthistory.PRODUCTCOSTHISTORY.PRODUCTID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductdocumentRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductRecord> FK_ProductDocument_Product_ProductID = createForeignKey(PK_Product_ProductID, org.jooq.examples.sqlserver.adventureworks.production.tables.Productdocument.PRODUCTDOCUMENT, org.jooq.examples.sqlserver.adventureworks.production.tables.Productdocument.PRODUCTDOCUMENT.PRODUCTID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductdocumentRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.DocumentRecord> FK_ProductDocument_Document_DocumentID = createForeignKey(PK_Document_DocumentID, org.jooq.examples.sqlserver.adventureworks.production.tables.Productdocument.PRODUCTDOCUMENT, org.jooq.examples.sqlserver.adventureworks.production.tables.Productdocument.PRODUCTDOCUMENT.DOCUMENTID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductinventoryRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductRecord> FK_ProductInventory_Product_ProductID = createForeignKey(PK_Product_ProductID, org.jooq.examples.sqlserver.adventureworks.production.tables.Productinventory.PRODUCTINVENTORY, org.jooq.examples.sqlserver.adventureworks.production.tables.Productinventory.PRODUCTINVENTORY.PRODUCTID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductinventoryRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.LocationRecord> FK_ProductInventory_Location_LocationID = createForeignKey(PK_Location_LocationID, org.jooq.examples.sqlserver.adventureworks.production.tables.Productinventory.PRODUCTINVENTORY, org.jooq.examples.sqlserver.adventureworks.production.tables.Productinventory.PRODUCTINVENTORY.LOCATIONID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductlistpricehistoryRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductRecord> FK_ProductListPriceHistory_Product_ProductID = createForeignKey(PK_Product_ProductID, org.jooq.examples.sqlserver.adventureworks.production.tables.Productlistpricehistory.PRODUCTLISTPRICEHISTORY, org.jooq.examples.sqlserver.adventureworks.production.tables.Productlistpricehistory.PRODUCTLISTPRICEHISTORY.PRODUCTID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelillustrationRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelRecord> FK_ProductModelIllustration_ProductModel_ProductModelID = createForeignKey(PK_ProductModel_ProductModelID, org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelillustration.PRODUCTMODELILLUSTRATION, org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelillustration.PRODUCTMODELILLUSTRATION.PRODUCTMODELID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelillustrationRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.IllustrationRecord> FK_ProductModelIllustration_Illustration_IllustrationID = createForeignKey(PK_Illustration_IllustrationID, org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelillustration.PRODUCTMODELILLUSTRATION, org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelillustration.PRODUCTMODELILLUSTRATION.ILLUSTRATIONID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelproductdescriptioncultureRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelRecord> FK_ProductModelProductDescriptionCulture_ProductModel_ProductModelID = createForeignKey(PK_ProductModel_ProductModelID, org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelproductdescriptionculture.PRODUCTMODELPRODUCTDESCRIPTIONCULTURE, org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelproductdescriptionculture.PRODUCTMODELPRODUCTDESCRIPTIONCULTURE.PRODUCTMODELID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelproductdescriptioncultureRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductdescriptionRecord> FK_ProductModelProductDescriptionCulture_ProductDescription_ProductDescriptionID = createForeignKey(PK_ProductDescription_ProductDescriptionID, org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelproductdescriptionculture.PRODUCTMODELPRODUCTDESCRIPTIONCULTURE, org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelproductdescriptionculture.PRODUCTMODELPRODUCTDESCRIPTIONCULTURE.PRODUCTDESCRIPTIONID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductmodelproductdescriptioncultureRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.CultureRecord> FK_ProductModelProductDescriptionCulture_Culture_CultureID = createForeignKey(PK_Culture_CultureID, org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelproductdescriptionculture.PRODUCTMODELPRODUCTDESCRIPTIONCULTURE, org.jooq.examples.sqlserver.adventureworks.production.tables.Productmodelproductdescriptionculture.PRODUCTMODELPRODUCTDESCRIPTIONCULTURE.CULTUREID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductproductphotoRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductRecord> FK_ProductProductPhoto_Product_ProductID = createForeignKey(PK_Product_ProductID, org.jooq.examples.sqlserver.adventureworks.production.tables.Productproductphoto.PRODUCTPRODUCTPHOTO, org.jooq.examples.sqlserver.adventureworks.production.tables.Productproductphoto.PRODUCTPRODUCTPHOTO.PRODUCTID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductproductphotoRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductphotoRecord> FK_ProductProductPhoto_ProductPhoto_ProductPhotoID = createForeignKey(PK_ProductPhoto_ProductPhotoID, org.jooq.examples.sqlserver.adventureworks.production.tables.Productproductphoto.PRODUCTPRODUCTPHOTO, org.jooq.examples.sqlserver.adventureworks.production.tables.Productproductphoto.PRODUCTPRODUCTPHOTO.PRODUCTPHOTOID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductreviewRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductRecord> FK_ProductReview_Product_ProductID = createForeignKey(PK_Product_ProductID, org.jooq.examples.sqlserver.adventureworks.production.tables.Productreview.PRODUCTREVIEW, org.jooq.examples.sqlserver.adventureworks.production.tables.Productreview.PRODUCTREVIEW.PRODUCTID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductsubcategoryRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductcategoryRecord> FK_ProductSubcategory_ProductCategory_ProductCategoryID = createForeignKey(PK_ProductCategory_ProductCategoryID, org.jooq.examples.sqlserver.adventureworks.production.tables.Productsubcategory.PRODUCTSUBCATEGORY, org.jooq.examples.sqlserver.adventureworks.production.tables.Productsubcategory.PRODUCTSUBCATEGORY.PRODUCTCATEGORYID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionhistoryRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductRecord> FK_TransactionHistory_Product_ProductID = createForeignKey(PK_Product_ProductID, org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistory.TRANSACTIONHISTORY, org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistory.TRANSACTIONHISTORY.PRODUCTID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductRecord> FK_WorkOrder_Product_ProductID = createForeignKey(PK_Product_ProductID, org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER, org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER.PRODUCTID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.ScrapreasonRecord> FK_WorkOrder_ScrapReason_ScrapReasonID = createForeignKey(PK_ScrapReason_ScrapReasonID, org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER, org.jooq.examples.sqlserver.adventureworks.production.tables.Workorder.WORKORDER.SCRAPREASONID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderroutingRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderRecord> FK_WorkOrderRouting_WorkOrder_WorkOrderID = createForeignKey(PK_WorkOrder_WorkOrderID, org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING, org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.WORKORDERID);
	public static final org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkorderroutingRecord, org.jooq.examples.sqlserver.adventureworks.production.tables.records.LocationRecord> FK_WorkOrderRouting_Location_LocationID = createForeignKey(PK_Location_LocationID, org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING, org.jooq.examples.sqlserver.adventureworks.production.tables.Workorderrouting.WORKORDERROUTING.LOCATIONID);

	/**
	 * No instances
	 */
	private Keys() {}
}