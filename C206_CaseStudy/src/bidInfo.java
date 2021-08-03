
public class bidInfo {
	private int bid_id;
	private String name;
	private String sellerEmail;
	private String buyerEmail;
	private double current_bid_price;
	
	
	public bidInfo(int bid_id, String name,String sellerEmail, String buyerEmail, double current_bid_price) {
		
		this.bid_id = bid_id;
		this.name = name;
		this.sellerEmail = sellerEmail;
		this.buyerEmail = buyerEmail;
		this.current_bid_price = current_bid_price;
		
	}
	public int getBidId() {
		return bid_id;
	}
	public String getName() {
		return name;
	}
	public String getSellerEmail() {
		return sellerEmail;
	}
	public String getBuyerEmail() {
		return buyerEmail;
	}
	public double getBidPrice() {
		return current_bid_price;
	}
	public void setBuyerEmail(String x) {
		this.buyerEmail = x;
	}
	public void setNewBidPrice(double x) {
		this.current_bid_price = x;
	}

}
