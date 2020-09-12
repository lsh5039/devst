package kr.co.devst.model;

public class BoardVO {
	
	private int brdId;
	private String brdTitle;
	private String brdContent;
	private String brdImage;
	private String brdCategory;
	private String brdHashtag;
	private int brdViewCount;
	private int brdLikeCount;
	private int brdDislikeCount;
	private String brdCreateDate; // r_dt
	private String brdUpdateDate; // m_dt
	public int getBrdId() {
		return brdId;
	}
	public void setBrdId(int brdId) {
		this.brdId = brdId;
	}
	public String getBrdTitle() {
		return brdTitle;
	}
	public void setBrdTitle(String brdTitle) {
		this.brdTitle = brdTitle;
	}
	public String getBrdContent() {
		return brdContent;
	}
	public void setBrdContent(String brdContent) {
		this.brdContent = brdContent;
	}
	public String getBrdImage() {
		return brdImage;
	}
	public void setBrdImage(String brdImage) {
		this.brdImage = brdImage;
	}
	public String getBrdCategory() {
		return brdCategory;
	}
	public void setBrdCategory(String brdCategory) {
		this.brdCategory = brdCategory;
	}
	public String getBrdHashtag() {
		return brdHashtag;
	}
	public void setBrdHashtag(String brdHashtag) {
		this.brdHashtag = brdHashtag;
	}
	public int getBrdViewCount() {
		return brdViewCount;
	}
	public void setBrdViewCount(int brdViewCount) {
		this.brdViewCount = brdViewCount;
	}
	public int getBrdLikeCount() {
		return brdLikeCount;
	}
	public void setBrdLikeCount(int brdLikeCount) {
		this.brdLikeCount = brdLikeCount;
	}
	public int getBrdDislikeCount() {
		return brdDislikeCount;
	}
	public void setBrdDislikeCount(int brdDislikeCount) {
		this.brdDislikeCount = brdDislikeCount;
	}
	public String getBrdCreateDate() {
		return brdCreateDate;
	}
	public void setBrdCreateDate(String brdCreateDate) {
		this.brdCreateDate = brdCreateDate;
	}
	public String getBrdUpdateDate() {
		return brdUpdateDate;
	}
	public void setBrdUpdateDate(String brdUpdateDate) {
		this.brdUpdateDate = brdUpdateDate;
	}
	
	
	
}
