package model;

public class OrderDetail {
	Long ordDetId;
	Long ordId;
	Service service;
	String ordMoney;
	Double ordQuantity;
	Double ordAmount;
	Double ordTotal;
	
	public Long getOrdDetId() {
		return ordDetId;
	}
	public void setOrdDetId(Long ordDetId) {
		this.ordDetId = ordDetId;
	}
	public Long getOrdId() {
		return ordId;
	}
	public void setOrdId(Long ordId) {
		this.ordId = ordId;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public String getOrdMoney() {
		return ordMoney;
	}
	public void setOrdMoney(String ordMoney) {
		this.ordMoney = ordMoney;
	}
	public Double getOrdQuantity() {
		return ordQuantity;
	}
	public void setOrdQuantity(Double ordQuantity) {
		this.ordQuantity = ordQuantity;
	}
	public Double getOrdAmount() {
		return ordAmount;
	}
	public void setOrdAmount(Double ordAmount) {
		this.ordAmount = ordAmount;
	}
	public Double getOrdTotal() {
		return ordTotal;
	}
	public void setOrdTotal(Double ordTotal) {
		this.ordTotal = ordTotal;
	}
}
