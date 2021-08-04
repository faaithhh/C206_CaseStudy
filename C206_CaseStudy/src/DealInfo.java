import java.time.LocalDate;


public class DealInfo {
	private int Deal_id;
	private String name;
	private String sellerEmail;
	private String buyerEmail;
	private double TranscationPrice;
	private LocalDate endingDate;

	
	public DealInfo(int Deal_id, String name,String sellerEmail, String buyerEmail, double  TranscationPrice, 
			 LocalDate endingDate) {
		
		this.Deal_id = Deal_id;
		this.name = name;
		this.sellerEmail = sellerEmail;
		this.buyerEmail = buyerEmail;
		this.TranscationPrice = TranscationPrice;
	
		this.endingDate = endingDate;
	}
	public int getDealId() {
		return Deal_id;
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
	public double getTranscationPrice() {
		return TranscationPrice;
	}
	
	public LocalDate getEndDate() {
		return endingDate;
	}
	public void setBuyerEmail(String x) {
		this.buyerEmail = x;
	}
	public void setTranscationPrice(double x) {
		this.TranscationPrice = x;
	}
	
}
