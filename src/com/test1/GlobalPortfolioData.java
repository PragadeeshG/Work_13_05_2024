package com.test1;

public class GlobalPortfolioData {
	private String portfolioCode;
	private String portfolioName;
	private String localCurrency;
	private String tradeCurrency;
	private String shortdesaccessRequestiption;
	private String dataIndicator;
	private String consumedBy;
	private String params;
	private String filter;
	private String status;

	public GlobalPortfolioData() {

	}

	public GlobalPortfolioData(String portfolioCode, String portfolioName, String localCurrency, String tradeCurrency,
			String shortdesaccessRequestiption, String dataIndicator, String consumedBy, String params, String filter,
			String status) {
		super();
		this.portfolioCode = portfolioCode;
		this.portfolioName = portfolioName;
		this.localCurrency = localCurrency;
		this.tradeCurrency = tradeCurrency;
		this.shortdesaccessRequestiption = shortdesaccessRequestiption;
		this.dataIndicator = dataIndicator;
		this.consumedBy = consumedBy;
		this.params = params;
		this.filter = filter;
		this.status = status;
	}

	public String getPortfolioCode() {
		return portfolioCode;
	}

	public void setPortfolioCode(String portfolioCode) {
		this.portfolioCode = portfolioCode;
	}

	public String getPortfolioName() {
		return portfolioName;
	}

	public void setPortfolioName(String portfolioName) {
		this.portfolioName = portfolioName;
	}

	public String getLocalCurrency() {
		return localCurrency;
	}

	public void setLocalCurrency(String localCurrency) {
		this.localCurrency = localCurrency;
	}

	public String getTradeCurrency() {
		return tradeCurrency;
	}

	public void setTradeCurrency(String tradeCurrency) {
		this.tradeCurrency = tradeCurrency;
	}

	public String getShortdesaccessRequestiption() {
		return shortdesaccessRequestiption;
	}

	public void setShortdesaccessRequestiption(String shortdesaccessRequestiption) {
		this.shortdesaccessRequestiption = shortdesaccessRequestiption;
	}

	public String getDataIndicator() {
		return dataIndicator;
	}

	public void setDataIndicator(String dataIndicator) {
		this.dataIndicator = dataIndicator;
	}

	public String getConsumedBy() {
		return consumedBy;
	}

	public void setConsumedBy(String consumedBy) {
		this.consumedBy = consumedBy;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
