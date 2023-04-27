package disburse.vo;

public class HouseDisburse {
	private String bioGuideId;
	private String office;
	private String category;
	private String payee;
	private String startDate;
	private String endDate;
	private String purpose;
	private double amount;
	private String year;

	public String getBioGuideId() {
		return bioGuideId;
	}

	public void setBioGuideId(String bioGuideId) {
		this.bioGuideId = bioGuideId;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPayee() {
		return payee;
	}

	public void setPayee(String payee) {
		this.payee = payee;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "HouseDisburse [bioGuideId=" + bioGuideId + ", office=" + office + ", category=" + category + ", payee="
				+ payee + ", startDate=" + startDate + ", endDate=" + endDate + ", purpose=" + purpose + ", amount="
				+ amount + ", year=" + year + "]";
	}

}
