import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
public class C206_CaseStudyTest {
  
  private bidInfo bid1;
  private bidInfo bid2;
  private ArrayList <bidInfo> BidList;
  
  public C206_CaseStudyTest() {
      super();
    }

  @Before
  public void setUp() throws Exception {
    bid1 = new bidInfo(1, "Used Condom", "abc@gmail.com", "cadmusChau@gamil.com", 
        4.50);
    bid2 = (new bidInfo(2, "Used socks", "sccc@gmail.com", "DogeKing@gamil.com", 
        4.50));
    
    BidList = new ArrayList<bidInfo>();        
  }

  

  @Test
  public void c206_test() {
    //fail("Not yet implemented"); 
    assertTrue("C206_CaseStudy_SampleTest ",true);
  }
  @Test
  public void ShowAllBidTest() {
    // Test if Item list is not null but empty, so that can add a new item
    assertNotNull("Test if there is valid Bid arraylist to add to", BidList);
    
    BidList.add(bid1);
    BidList.add(bid2);
    assertEquals("Test if that Bid arraylist size is 2?", 2, BidList.size());  
  }
  @Test
  public void DeleteBidTest() {
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
    // Test if Item list is not null but empty, so that can add a new item
    assertNotNull("Test if there is valid Bid arraylist to add to", BidList);
    BidList.add(bid1);
    assertEquals("Test if that Bid arraylist size is 1?", 1, BidList.size());
    BidList.add(bid2);
    assertEquals("Test if that Bid arraylist size is 2?", 2, BidList.size());
    
    
  }
  @After
  public void tearDown() throws Exception {
    bid1 = null;
    bid2 = null;
    BidList = null;
  }
  
    

  }