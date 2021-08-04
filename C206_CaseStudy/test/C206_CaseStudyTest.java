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
 
  private Category category1;
  private Category category2;
  private Category category3;
  private ArrayList<Category> CategoryList;
  
  private ArrayList<Item> itemList;
  private Item item1;
  private Item item2;
  
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
    
    CategoryList = new ArrayList<Category>();
    
    category1 = new Category("Clothes");
    category2 = new Category("Electronics");
    category3 = new Category("Kitchen Appliances");
    
    item1 = new Item("Jacket","Used 1 time only. size: M ", 10, LocalDate.parse("19/10/2020", formatter1),LocalDate.parse("30/10/2020", formatter1), 1);
    item2 = new Item ("Sweater","Bought the wrong size. size: S",10, LocalDate.parse("15/10/2020", formatter1),LocalDate.parse("20/10/2020", formatter1),1);
    itemList = new ArrayList<Item>();
     
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
	    assertNotNull("Test if there is valid Account arraylist to add to", AccountList);
	    
	    // adds and check for arraylist size
	    AccountList.add(account1);
	    AccountList.add(account2);
	    assertEquals("Test if that deal arraylist size is 2?", 2, AccountList.size()); 
	    
	    AccountList.add(account2);
	    assertEquals("Test if that deal arraylist size is 3?", 3, AccountList.size()); 
	  }
	  
	  @Test
	  public void DeleteUserTest() {
	    // Test if User list is not null but empty, so that can add a new item
	    assertNotNull("Test if there is valid Account arraylist to add to", AccountList);
	    
	    // adds and check for arraylist size
	    AccountList.add(account1);
	    AccountList.add(account2);
	    AccountList.add(account3);
	    AccountList.add(account4);
	    assertEquals("Test if that deal arraylist size is 4?", 4, AccountList.size());
	    
	    // deletes and check if it was removed from arraylist
	    AccountList.remove(0);
	    AccountList.remove(1);
	    assertEquals("Test if that deal arraylist size is 2?", 2, AccountList.size());    
	  }
	  
	  @Test
	   public void testAddCategory() {
	    //Done by Faith
	     // Test if Category list is not null but empty, so that can add a new category
	     assertNotNull("Test if there is valid Category arraylist to add to", CategoryList);
	     CategoryList.add(category1);
	     assertEquals("Test if that Category arraylist size is 1?", 1, CategoryList.size());
	     CategoryList.add(category2);
	     assertEquals("Test if that Category arraylist size is 2?", 2, CategoryList.size());
	     CategoryList.add(category3);
	     assertEquals("Test if that Category arraylist size is 3?", 3, CategoryList.size());
	   }
	     
	   @Test
	   public void ViewAllCategoryTest() {
	    // Done by Faith
	      // Test if Category list is not null but empty, so that can add a new category
	      assertNotNull("Test if there is valid category arraylist to add to", CategoryList);
	       
	      CategoryList.add(category1);
	      CategoryList.add(category2);
	      CategoryList.add(category3);
	      assertEquals("Test if that category arraylist size is 3?", 3, CategoryList.size());
	    }
	 
	   @Test
	   public void DeleteCategoryTest() {
	    //Done by Faith
	     // Test if Category list is not null but empty, so that can add a new item
	     assertNotNull("Test if there is valid Category arraylist to add to", CategoryList);
	      
	     CategoryList.add(category1);
	     CategoryList.add(category2);
	     CategoryList.add(category3);
	     assertEquals("Test if that Category arraylist size is 3?", 3, CategoryList.size());
	      
	     CategoryList.remove(0);
	     assertEquals("Test if that Category arraylist size is 2?", 2, CategoryList.size());
	   }
	   
	   @Test
	   public void c206_test() {
	     //fail("Not yet implemented");
	     assertTrue("C206_CaseStudy_SampleTest ",true);
	     
	   }
	   
	   public void addItemTest() {
	     assertNotNull("Test if the is valid Item arrayList to add to, itemList");
	     itemList.add(item1);
	     assertEquals("Test if that Item arrayList size is 1?" , 1, itemList.size());
	     itemList.add(item2);
	     assertEquals("Test if that Item arrayLst size is 2", 2, itemList.size());
	   }
	   
	   public void viewAllItemTest() {
	     assertNotNull("Test if there is valid Item arrayList to add to", itemList);
	     itemList.add(item1);
	     itemList.add(item2);
	     assertEquals("Test if that Item arrayList size is 2?", 2, itemList.size());
	   }
	   
	   public void deleteItemTest() {
	     assertNotNull("Test if there is valid Item arrayList to add to", itemList);
	     
	     itemList.add(item1);
	     itemList.add(item2);
	     assertEquals("Test if that Item arrayList size is 2?", 2, itemList.size());
	     
	     itemList.remove(0);
	     assertEquals("Test if that Item arrayList size is 1", 1, itemList.size());
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
    category1 = null;
    category2 = null;
    category3 = null;
    CategoryList = null;
    item1 = null;
    item2 = null;
    itemList = null;
  }
  
    

  }