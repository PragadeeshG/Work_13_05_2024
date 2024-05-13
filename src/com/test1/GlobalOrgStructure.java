package com.test1;

public class GlobalOrgStructure {
	private Integer recordKey;
	private Integer orgPortfolioCode;
	private String orgPortfolioCodePosition;
	private String orgPortfolioCodeLength;
	private String orgCheckDigitsPosition;
	private String orgCheckDigitsLength;
	private boolean orgIdentifierPosition;
	private String orgIdentifierLength;
	private String branchIdentifierPosition;
	private String branchIdentifierLength;
	private String orgNationalIdLength;
	private String accessNumberPosition;
	private String accessNumberLength;
	private String orgTotalLength;

	public GlobalOrgStructure() {

	}

	public GlobalOrgStructure(Integer recordKey, Integer orgPortfolioCode, String orgPortfolioCodePosition,
			String orgPortfolioCodeLength, String orgCheckDigitsPosition, String orgCheckDigitsLength,
			boolean orgIdentifierPosition, String orgIdentifierLength, String branchIdentifierPosition,
			String branchIdentifierLength, String orgNationalIdLength, String accessNumberPosition,
			String accessNumberLength, String orgTotalLength) {
		super();
		this.recordKey = recordKey;
		this.orgPortfolioCode = orgPortfolioCode;
		this.orgPortfolioCodePosition = orgPortfolioCodePosition;
		this.orgPortfolioCodeLength = orgPortfolioCodeLength;
		this.orgCheckDigitsPosition = orgCheckDigitsPosition;
		this.orgCheckDigitsLength = orgCheckDigitsLength;
		this.orgIdentifierPosition = orgIdentifierPosition;
		this.orgIdentifierLength = orgIdentifierLength;
		this.branchIdentifierPosition = branchIdentifierPosition;
		this.branchIdentifierLength = branchIdentifierLength;
		this.orgNationalIdLength = orgNationalIdLength;
		this.accessNumberPosition = accessNumberPosition;
		this.accessNumberLength = accessNumberLength;
		this.orgTotalLength = orgTotalLength;
	}

	public Integer getRecordKey() {
		return recordKey;
	}

	public void setRecordKey(Integer recordKey) {
		this.recordKey = recordKey;
	}

	public Integer getOrgPortfolioCode() {
		return orgPortfolioCode;
	}

	public void setOrgPortfolioCode(Integer orgPortfolioCode) {
		this.orgPortfolioCode = orgPortfolioCode;
	}

	public String getOrgPortfolioCodePosition() {
		return orgPortfolioCodePosition;
	}

	public void setOrgPortfolioCodePosition(String orgPortfolioCodePosition) {
		this.orgPortfolioCodePosition = orgPortfolioCodePosition;
	}

	public String getOrgPortfolioCodeLength() {
		return orgPortfolioCodeLength;
	}

	public void setOrgPortfolioCodeLength(String orgPortfolioCodeLength) {
		this.orgPortfolioCodeLength = orgPortfolioCodeLength;
	}

	public String getOrgCheckDigitsPosition() {
		return orgCheckDigitsPosition;
	}

	public void setOrgCheckDigitsPosition(String orgCheckDigitsPosition) {
		this.orgCheckDigitsPosition = orgCheckDigitsPosition;
	}

	public String getOrgCheckDigitsLength() {
		return orgCheckDigitsLength;
	}

	public void setOrgCheckDigitsLength(String orgCheckDigitsLength) {
		this.orgCheckDigitsLength = orgCheckDigitsLength;
	}

	public boolean isOrgIdentifierPosition() {
		return orgIdentifierPosition;
	}

	public void setOrgIdentifierPosition(boolean orgIdentifierPosition) {
		this.orgIdentifierPosition = orgIdentifierPosition;
	}

	public String getOrgIdentifierLength() {
		return orgIdentifierLength;
	}

	public void setOrgIdentifierLength(String orgIdentifierLength) {
		this.orgIdentifierLength = orgIdentifierLength;
	}

	public String getBranchIdentifierPosition() {
		return branchIdentifierPosition;
	}

	public void setBranchIdentifierPosition(String branchIdentifierPosition) {
		this.branchIdentifierPosition = branchIdentifierPosition;
	}

	public String getBranchIdentifierLength() {
		return branchIdentifierLength;
	}

	public void setBranchIdentifierLength(String branchIdentifierLength) {
		this.branchIdentifierLength = branchIdentifierLength;
	}

	public String getOrgNationalIdLength() {
		return orgNationalIdLength;
	}

	public void setOrgNationalIdLength(String orgNationalIdLength) {
		this.orgNationalIdLength = orgNationalIdLength;
	}

	public String getAccessNumberPosition() {
		return accessNumberPosition;
	}

	public void setAccessNumberPosition(String accessNumberPosition) {
		this.accessNumberPosition = accessNumberPosition;
	}

	public String getAccessNumberLength() {
		return accessNumberLength;
	}

	public void setAccessNumberLength(String accessNumberLength) {
		this.accessNumberLength = accessNumberLength;
	}

	public String getOrgTotalLength() {
		return orgTotalLength;
	}

	public void setOrgTotalLength(String orgTotalLength) {
		this.orgTotalLength = orgTotalLength;
	}

}
