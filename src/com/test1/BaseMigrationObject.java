package com.test1;

public class BaseMigrationObject {
	private Integer accessFlowCode;
	private String accessFlowType;
	private String referenceId;
	private String accessRequestType;
	private Integer accessRequestId;
	private Integer accessRequestTypeCode;
	private Integer userId;
	private String keyAtttribute;
	private String ketAttributeValue;
	private String accessRequestCreationDate;
	private String accessRequestModifiedDate;
	private String entityState;

	public BaseMigrationObject() {

	}

	public BaseMigrationObject(Integer accessFlowCode, String accessFlowType, String referenceId,
			String accessRequestType, Integer accessRequestId, Integer accessRequestTypeCode, Integer userId,
			String keyAtttribute, String ketAttributeValue, String accessRequestCreationDate,
			String accessRequestModifiedDate, String entityState) {
		super();
		this.accessFlowCode = accessFlowCode;
		this.accessFlowType = accessFlowType;
		this.referenceId = referenceId;
		this.accessRequestType = accessRequestType;
		this.accessRequestId = accessRequestId;
		this.accessRequestTypeCode = accessRequestTypeCode;
		this.userId = userId;
		this.keyAtttribute = keyAtttribute;
		this.ketAttributeValue = ketAttributeValue;
		this.accessRequestCreationDate = accessRequestCreationDate;
		this.accessRequestModifiedDate = accessRequestModifiedDate;
		this.entityState = entityState;
	}

	public Integer getAccessFlowCode() {
		return accessFlowCode;
	}

	public void setAccessFlowCode(Integer accessFlowCode) {
		this.accessFlowCode = accessFlowCode;
	}

	public String getAccessFlowType() {
		return accessFlowType;
	}

	public void setAccessFlowType(String accessFlowType) {
		this.accessFlowType = accessFlowType;
	}

	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public String getAccessRequestType() {
		return accessRequestType;
	}

	public void setAccessRequestType(String accessRequestType) {
		this.accessRequestType = accessRequestType;
	}

	public Integer getAccessRequestId() {
		return accessRequestId;
	}

	public void setAccessRequestId(Integer accessRequestId) {
		this.accessRequestId = accessRequestId;
	}

	public Integer getAccessRequestTypeCode() {
		return accessRequestTypeCode;
	}

	public void setAccessRequestTypeCode(Integer accessRequestTypeCode) {
		this.accessRequestTypeCode = accessRequestTypeCode;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getKeyAtttribute() {
		return keyAtttribute;
	}

	public void setKeyAtttribute(String keyAtttribute) {
		this.keyAtttribute = keyAtttribute;
	}

	public String getKetAttributeValue() {
		return ketAttributeValue;
	}

	public void setKetAttributeValue(String ketAttributeValue) {
		this.ketAttributeValue = ketAttributeValue;
	}

	public String getAccessRequestCreationDate() {
		return accessRequestCreationDate;
	}

	public void setAccessRequestCreationDate(String accessRequestCreationDate) {
		this.accessRequestCreationDate = accessRequestCreationDate;
	}

	public String getAccessRequestModifiedDate() {
		return accessRequestModifiedDate;
	}

	public void setAccessRequestModifiedDate(String accessRequestModifiedDate) {
		this.accessRequestModifiedDate = accessRequestModifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
