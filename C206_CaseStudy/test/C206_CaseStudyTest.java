import static org.junit.Assert.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
public class C206_CaseStudyTest {
  
  private bidInfo bid1;
  private bidInfo bid2;
  private ArrayList <bidInfo> BidList;
  private DealInfo deal1;
  private DealInfo deal2;
  private ArrayList <DealInfo> DealList;
  
  public C206_CaseStudyTest() {
      super();
    }

  @Before
  public void setUp() throws Exception {
	  DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	  
    bid1 = new bidInfo(1, "Used Condom", "abc@gmail.com", "cadmusChau@gamil.com", 
        4.50);
    bid2 = (new bidInfo(2, "Used socks", "sccc@gmail.com", "DogeKing@gamil.com", 
        4.50));
    
    BidList = new ArrayList<bidInfo>();    
    
    deal1 = new DealInfo(1, "Used Condom", "abc@gmail.com", "cadmusChau@gamil.com", 
            4.50, LocalDate.parse("17/10/2020", formatter1));
    deal2 = new DealInfo(2, "Used socks", "sccc@gmail.com", "DogeKing@gamil.com", 
            4.50, LocalDate.parse("18/10/2020", formatter1));
    
    DealList = new ArrayList<DealInfo>();
  }

  

  @Test
  public void c206_test() {
    //fail("Not yet implemented"); 
    assertTrue("C206_CaseStudy_SampleTest ",true);
  }
  @Test
  public void ShowAllBidTest() {
	 // Done by WeiJing
    // Test if Item list is not null but empty, so that can add a new item
    assertNotNull("Test if there is valid Bid arraylist to add to", BidList);
    
    BidList.add(bid1);
    BidList.add(bid2);
    assertEquals("Test if that Bid arraylist size is 2?", 2, BidList.size());  
  }
  @Test
  public void DeleteBidTest() {
	  //Done by WeiJing
    // Test if Item list is not null but empty, so that can add a new item
    assertNotNull("Test if there is valid Bid arraylist to add to", BidList);
    
    BidList.add(bid1);
    BidList.add(bid2);
    assertEquals("Test if that Bid arraylist size is 2?", 2, BidList.size());
    
    BidList.remove(0);
    assertEquals("Test if that Bid arraylist size is 1?", 1, BidList.size());    
  }
  @Test
  public void testAddBid() {
	  //Done by WeiJing
    // Test if Item list is not null but empty, so that can add a new item
    assertNotNull("Test if there is valid Bid arraylist to add to", BidList);
    BidList.add(bid1);
    assertEquals("Test if that Bid arraylist size is 1?", 1, BidList.size());
    BidList.add(bid2);
    assertEquals("Test if that Bid arraylist size is 2?", 2, BidList.size());
   
  }
   @Test
  public void ShowAllDealTest() {
	    // Test if Item list is not null but empty, so that can add a new item
	    assertNotNull("Test if there is valid deal arraylist to add to", DealList);
	    
	    DealList.add(deal1);
	    DealList.add(deal2);
	    assertEquals("Test if that deal arraylist size is 2?", 2, DealList.size());  
	  }
	  
	  @Test
	  public void DeleteDealTest() {
	    // Test if Item list is not null but empty, so that can add a new item
	    assertNotNull("Test if there is valid deal arraylist to add to", DealList);
	    
	    DealList.add(deal1);
	    DealList.add(deal2);
	    assertEquals("Test if that deal arraylist size is 2?", 2, DealList.size());
	    
	    DealList.remove(0);
	    assertEquals("Test if that deal arraylist size is 1?", 1, DealList.size());    
	  }
	  
	  @Test
	  public void testAddDeal() {
	    // Test if Item list is not null but empty, so that can add a new item
	    assertNotNull("Test if there is valid deal arraylist to add to", DealList);
	    DealList.add(deal1);
	    assertEquals("Test if that deal arraylist size is 1?", 1, DealList.size());
	    DealList.add(deal2);
	    assertEquals("Test if that deal arraylist size is 2?", 2, DealList.size());
	    
	    
	  }
  
  @After
  public void tearDown() throws Exception {
    bid1 = null;
    bid2 = null;
    BidList = null;
    deal1 = null;
    deal2 = null;
    DealList = null;
  }
  
    

  }