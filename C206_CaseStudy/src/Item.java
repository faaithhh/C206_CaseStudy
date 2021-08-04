
import java.time.LocalDate;
// Iffah
public class Item {
  
  private String itemName;
  
  private String description;
  
  private double minPrice;
  
  private LocalDate startDate;
  
  private LocalDate endDate;
  
  private int bidIncrement;
  
  public Item (String name, String description, double minPrice, LocalDate startDate, LocalDate endDate, int bidIncrement) {
    this.itemName = name;
    this.description = description;
    this.minPrice = minPrice;
    this.startDate = startDate;
    this.endDate = endDate;
    this.bidIncrement = bidIncrement;
  }

  public String getItemName() {
    return itemName;
  }
  
  public String getDesc() {
    return description;
  }
  
  public double getMinPrice() {
    return minPrice;
  }
  
  public LocalDate getStartDate() {
    return startDate;
  }
  
  public LocalDate getEndDate() {
    return endDate;
  }
  
  public int getBidIncrement() {
    return bidIncrement;
  }
}