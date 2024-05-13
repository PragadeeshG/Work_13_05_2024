package com.test1;

public class AccessResponse {
	private Integer accessId;
	private String accessOwner;
	private boolean activeaccess;
	private Integer accessTypeId;
	private String accessType;
	private String accessStatus;
	private Integer accessDesaccessRequestiption;
	private Integer userGroupsCount;
	private String userCountries;
	private Integer userCountriesCount;
	private String userGroups;
	private String status;
	private String remarks;

	public AccessResponse() {

	}

	public AccessResponse(Integer accessId, String accessOwner, boolean activeaccess, Integer accessTypeId,
			String accessType, String accessStatus, Integer accessDesaccessRequestiption, Integer userGroupsCount,
			String userCountries, Integer userCountriesCount, String userGroups, String status, String remarks) {
		super();
		this.accessId = accessId;
		this.accessOwner = accessOwner;
		this.activeaccess = activeaccess;
		this.accessTypeId = accessTypeId;
		this.accessType = accessType;
		this.accessStatus = accessStatus;
		this.accessDesaccessRequestiption = accessDesaccessRequestiption;
		this.userGroupsCount = userGroupsCount;
		this.userCountries = userCountries;
		this.userCountriesCount = userCountriesCount;
		this.userGroups = userGroups;
		this.status = status;
		this.remarks = remarks;
	}

	public Integer getAccessId() {
		return accessId;
	}

	public void setAccessId(Integer accessId) {
		this.accessId = accessId;
	}

	public String getAccessOwner() {
		return accessOwner;
	}

	public void setAccessOwner(String accessOwner) {
		this.accessOwner = accessOwner;
	}

	public boolean isActiveaccess() {
		return activeaccess;
	}

	public void setActiveaccess(boolean activeaccess) {
		this.activeaccess = activeaccess;
	}

	public Integer getAccessTypeId() {
		return accessTypeId;
	}

	public void setAccessTypeId(Integer accessTypeId) {
		this.accessTypeId = accessTypeId;
	}

	public String getAccessType() {
		return accessType;
	}

	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}

	public String getAccessStatus() {
		return accessStatus;
	}

	public void setAccessStatus(String accessStatus) {
		this.accessStatus = accessStatus;
	}

	public Integer getAccessDesaccessRequestiption() {
		return accessDesaccessRequestiption;
	}

	public void setAccessDesaccessRequestiption(Integer accessDesaccessRequestiption) {
		this.accessDesaccessRequestiption = accessDesaccessRequestiption;
	}

	public Integer getUserGroupsCount() {
		return userGroupsCount;
	}

	public void setUserGroupsCount(Integer userGroupsCount) {
		this.userGroupsCount = userGroupsCount;
	}

	public String getUserCountries() {
		return userCountries;
	}

	public void setUserCountries(String userCountries) {
		this.userCountries = userCountries;
	}

	public Integer getUserCountriesCount() {
		return userCountriesCount;
	}

	public void setUserCountriesCount(Integer userCountriesCount) {
		this.userCountriesCount = userCountriesCount;
	}

	public String getUserGroups() {
		return userGroups;
	}

	public void setUserGroups(String userGroups) {
		this.userGroups = userGroups;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
