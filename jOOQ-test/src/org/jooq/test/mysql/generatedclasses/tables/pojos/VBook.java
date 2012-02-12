/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
public class VBook implements java.io.Serializable {

	private static final long serialVersionUID = 360277067;

	private java.lang.Integer                                      id;
	private java.lang.Integer                                      authorId;
	private java.lang.Integer                                      coAuthorId;
	private java.lang.Integer                                      detailsId;
	private java.lang.String                                       title;
	private java.lang.Integer                                      publishedIn;
	private java.lang.Integer                                      languageId;
	private java.lang.String                                       contentText;
	private byte[]                                                 contentPdf;
	private org.jooq.test.mysql.generatedclasses.enums.VBookStatus status;

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.Integer getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(java.lang.Integer authorId) {
		this.authorId = authorId;
	}

	public java.lang.Integer getCoAuthorId() {
		return this.coAuthorId;
	}

	public void setCoAuthorId(java.lang.Integer coAuthorId) {
		this.coAuthorId = coAuthorId;
	}

	public java.lang.Integer getDetailsId() {
		return this.detailsId;
	}

	public void setDetailsId(java.lang.Integer detailsId) {
		this.detailsId = detailsId;
	}

	public java.lang.String getTitle() {
		return this.title;
	}

	public void setTitle(java.lang.String title) {
		this.title = title;
	}

	public java.lang.Integer getPublishedIn() {
		return this.publishedIn;
	}

	public void setPublishedIn(java.lang.Integer publishedIn) {
		this.publishedIn = publishedIn;
	}

	public java.lang.Integer getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(java.lang.Integer languageId) {
		this.languageId = languageId;
	}

	public java.lang.String getContentText() {
		return this.contentText;
	}

	public void setContentText(java.lang.String contentText) {
		this.contentText = contentText;
	}

	public byte[] getContentPdf() {
		return this.contentPdf;
	}

	public void setContentPdf(byte[] contentPdf) {
		this.contentPdf = contentPdf;
	}

	public org.jooq.test.mysql.generatedclasses.enums.VBookStatus getStatus() {
		return this.status;
	}

	public void setStatus(org.jooq.test.mysql.generatedclasses.enums.VBookStatus status) {
		this.status = status;
	}
}