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
  private Account account1;
  private Account account2;
  private Account account3;
  private Account account4;
  private Account account5;
  private ArrayList<Account> AccountList;
  
  public C206_CaseStudyTest() {
      super();
    }

  @Before
  public void setUp() throws Exception {
	  DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	  
    bid1 = new bidInfo(1, "Used Shoe", "daisy.lim@gmail.com", "fiona.goh@gmail.com", 4.50);
    bid2 = (new bidInfo(2, "Used Iphone 7", "sally.lim@gmail.com", "grace.ng@gmail.com", 4.50));
    
    BidList = new ArrayList<bidInfo>();    
    
    deal1 = new DealInfo(1, "Used Shoe", "sally.lim@gmail.com", "grace.ng@gmail.com", 4.50,
			LocalDate.parse("17/10/2020", formatter1));
    deal2 = new DealInfo(2, "Used Iphone 7", "daisy.lim@gmail.com", "fiona.goh@gmail.com", 4.50,
			LocalDate.parse("18/10/2020", formatter1));
    
    DealList = new ArrayList<DealInfo>();
    
    account1 = new Account("James Tan", "admin", "james.tan@gmail.com", "abc456");
    account2 =new Account("Daisy Lim", "student", "daisy.lim@gmail.com", "909090");
    account3 =new Account("Grace Ng", "student", "grace.ng@gmail.com", "098765");
    account4 =new Account("Sally Lim", "student", "sally.lim@gmail.com", "012345");
    account5 =new Account("Fiona Goh", "student", "fiona.goh@gmail.com", "123abc");

    AccountList = new ArrayList<Account>();
    
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
	  @Test
	  public void ViewAllUserTest() {
		    // Test if user list is not null but empty, so that can add a new item
		    assertNotNull("Test if there is valid deal arraylist to add to", AccountList);
		    
		    AccountList.add(account1);
		    AccountList.add(account2);
		    AccountList.add(account3);
		    AccountList.add(account4);
		    AccountList.add(account5);
		    assertEquals("Test if that deal arraylist size is 5?", 5, AccountList.size());  
		  }
	  
	  @Test
	  public void AddUserTest() {
	    // Test if Item list is not null but empty, so that can add a new item
	    assertNotNull("Test if there is valid deal arraylist to add to", DealList);
	    
	    // adds and check for arraylist size
	    AccountList.add(account1);
	    assertEquals("Test if that deal arraylist size is 1?", 2, AccountList.size()); 
	    
	    AccountList.add(account2);
	    assertEquals("Test if that deal arraylist size is 2?", 3, AccountList.size()); 
	  }
	  
	  @Test
	  public void DeleteUserTest() {
	    // Test if User list is not null but empty, so that can add a new item
	    assertNotNull("Test if there is valid deal arraylist to add to", DealList);
	    
	    // adds and check for arraylist size
	    AccountList.add(account1);
	    AccountList.add(account2);
	    AccountList.add(account3);
	    AccountList.add(account4);
	    assertEquals("Test if that deal arraylist size is 4?", 4, DealList.size());
	    
	    // deletes and check if it was removed from arraylist
	    AccountList.remove(0);
	    AccountList.remove(1);
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
    account1 = null;
    account2 = null;
    account3 = null;
    account4 = null;
    account5 = null;
  }
  
    

  }