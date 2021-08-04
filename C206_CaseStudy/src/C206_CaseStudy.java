import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		// Wei Jing
		ArrayList<bidInfo> BidList = new ArrayList<bidInfo>();
		BidList.add(new bidInfo(1, "Used Shoe", "abc@gmail.com", "cadmusChau@gamil.com", 4.50));
		BidList.add(new bidInfo(2, "Used socks", "sccc@gmail.com", "DogeKing@gamil.com", 4.50));
		
		//Jarel
		ArrayList<DealInfo> DealList = new ArrayList<DealInfo>();
		DealList.add(new DealInfo(1, "Used Shoe", "abc@gmail.com", "cadmusChau@gamil.com", 4.50, LocalDate.parse("17/10/2020", formatter1)));
		DealList.add(new DealInfo(2, "Used socks", "sccc@gmail.com", "DogeKing@gamil.com", 4.50, LocalDate.parse("18/10/2020", formatter1)));

		//Cindy Ella
		ArrayList<Account> AccountList = new ArrayList<Account>();
		AccountList.add(new Account("Tan ah beng", "admin", "abc123@gmail.com", "123455"));
		AccountList.add(new Account("Your mum", "student", "abcd1222@gmail.com", "99999"));
		
		//Faith
		ArrayList<Category> CategoryList = new ArrayList<Category>();
		CategoryList.add(new Category ("Clothes"));
		CategoryList.add(new Category ("Electronics"));
		CategoryList.add(new Category ("Kitchen Appliances"));

		int optMain = 0; 
		int option = 0; 

		while (option != 3) { 
			mainMenu();  // Cindy Ella
			optMain = Helper.readInt("Enter an option > ");

			if (optMain == 1) { // Cindy Ella
				AddUser(AccountList);
			} else if (optMain == 2) {

				loginMenu(); // Wei Jing
				option = Helper.readInt("Enter type of user > ");

				if (option == 1) { // Wei Jing
					boolean isCorrect = false;
					String username = Helper.readString("Enter your email > ");
					String password = Helper.readString("Enter your password > ");

					for (int i = 0; i < AccountList.size(); i++) { // Wei Jing
						if (username.equals(AccountList.get(i).getEmail())
								&& password.equals(AccountList.get(i).getPassword())
								&& AccountList.get(i).getRole().equalsIgnoreCase("STUDENT")) {
							isCorrect = true;
						}
					}
					if (isCorrect == false) { // Wei Jing
						System.out.println("Either your email or password is invalid");
					} else {
						int option2 = 0;
						while (option2 != 8) {
							StudentMenu();
							option2 = Helper.readInt("Enter an option > ");
							if (option2 == 1) {

							} else if (option2 == 2) {
								//Faith
						        ViewAllCategories(CategoryList);

							} else if (option2 == 3) {

							} else if (option2 == 4) { // Wei Jing
								ShowAllBid(BidList);
								AddBid(BidList);
								
							} else if (option2 == 5) { // Wei Jing
								ShowAllBid(BidList);
								
							} else if (option2 == 6) { // Jarel
								ShowAllDeal(DealList);
							} 
							else if(option2 == 7) { // Jarel
								ShowAllDeal(DealList);
								AddDeal(DealList);
							}
							else if (option2 == 8) { 
								System.out.println("Quit.");
							}
							else { 
								System.out.println("You have enterd an invalid option");
							}
						}

					}
				} else if (option == 2) { // Wei Jing
					boolean isCorrect = false;
					String username = Helper.readString("Enter your email > ");
					String password = Helper.readString("Enter your password > ");
					for (int i = 0; i < AccountList.size(); i++) {
						if (username.equals(AccountList.get(i).getEmail())
								&& password.equals(AccountList.get(i).getPassword())
								&& AccountList.get(i).getRole().equalsIgnoreCase("ADMIN")) {
							isCorrect = true;
						}
					}
					if (isCorrect == false) { // Wei Jing
						System.out.println("Either your email or password is invalid");
					} else { 
						int option3 = 0;
						
						while (option3 != 6) { // Wei Jing
							AdminMenu();
							option3 = Helper.readInt("Enter an option > ");

							if (option3 == 1) { // Cindy Ella
								UserMenu();
								int userOpt = Helper.readInt("Enter an option > ");

								if (userOpt == 1) {
									ViewAllUsers(AccountList);
								} else if (userOpt == 2) {
									DeleteUser(AccountList);
								} else if (userOpt == 3) {
									System.out.println("Thank you");
								} else {
									System.out.println("You have entered an invalid option");
								}
							} else if (option3 == 2) { // Faith
								CategoryMenu();
						        int optionCat = Helper.readInt("Enter an option > ");
						         
						        if (optionCat == 1) {
						         AddCategory(CategoryList);
						        } else if (optionCat == 2) {
						         ViewAllCategories(CategoryList);
						        } else if (optionCat == 3) {
						         DeleteCategory(CategoryList);
						        } else {
						         System.out.println("Quit");
						        }

							} else if (option3 == 3) { // Iffah

							} else if (option3 == 4) { // Wei Jing
								int bidOption = 0;
								while (bidOption != 4) {
									BidMenu();
									bidOption = Helper.readInt("Enter an option > ");
									if (bidOption == 1) {
										ShowAllBid(BidList);
									} else if (bidOption == 2) {
										ShowAllBid(BidList);
										AddBid(BidList);
									} else if (bidOption == 3) {
										ShowAllBid(BidList);
										DeleteBid(BidList);
									} else if (bidOption == 4) {
										System.out.println("QUIT.");
									} else {
										System.out.println("You have enter an invalid option");
									}
								}

							} else if (option3 == 5) { //Jarel
								int dealoption = 0;
								while (dealoption != 4) {
									DealMenu();
									dealoption = Helper.readInt("Enter an option >");
									if (dealoption == 1) {
										ShowAllDeal(DealList);
									} else if (dealoption == 2) {
										ShowAllDeal(DealList);
										AddDeal(DealList);
									} else if (dealoption == 3) {
										ShowAllDeal(DealList);
										DeleteDeal(DealList);
									} else if (dealoption == 4) {
										System.out.println("QUIT.");
									} else {
										System.out.println("You have enter an invalid option");
									}
								}
							}

							else if (option3 == 6) { // Wei Jing
								System.out.println("QUIT.");
							} else {
								System.out.println("You have entered an invalid option");
							}

						}

					}
				} else { // Wei Jing
					System.out.println("Thank you for using the application");
				}
			}
			else if(optMain == 3){ // Wei Jing
				System.out.println("Quit.");
			}
			else { // Wei Jing
				System.out.println("You have enter an invalid option");
			}
		}
	}
	// Cindy Ella
	public static void mainMenu() {
		Helper.line(30, "=");
		System.out.println("CAMPUS ONLINE AUCTION SHOP");
		Helper.line(30, "=");
		System.out.println("1. Register ");
		System.out.println("2. Log in ");
		System.out.println("3. Quit ");
	}

	// Wei Jing
	public static void loginMenu() {
		Helper.line(30, "=");
		System.out.println("LOGIN PAGE");
		Helper.line(30, "=");
		System.out.println("1. Log In as Student");
		System.out.println("2. Log in as Administrator");
	}
	
	// Wei Jing
	public static void StudentMenu() {
		Helper.line(30, "=");
		System.out.println("Student Menu");
		Helper.line(30, "=");
		System.out.println("1. View all categories");
		System.out.println("2. Add item");
		System.out.println("3. View all item");
		System.out.println("4. Add Bids");
		System.out.println("5. View all bids");
		System.out.println("6. View all deal");
		System.out.println("7. Add Deal");
		System.out.println("8. Quit");
	}

	// Wei Jing
	public static void AdminMenu() {
		Helper.line(30, "=");
		System.out.println("Admin Menu");
		Helper.line(30, "=");
		System.out.println("1. Manage Account");
		System.out.println("2. Manage Category");
		System.out.println("3. Manage Item");
		System.out.println("4. Manage Bid");
		System.out.println("5. Manage Deal");
		System.out.println("6. Quit");
	}

	// Wei Jing
	public static void BidMenu() {
		Helper.line(30, "=");
		System.out.println("MANAGE BID");
		Helper.line(30, "=");
		System.out.println("1. Show all bids");
		System.out.println("2. Add bid");
		System.out.println("3. Delete bid");
		System.out.println("4. Quit");
	}

	// Jarel
	public static void DealMenu() {
		Helper.line(30, "=");
		System.out.println("MANAGE DEAL");
		Helper.line(30, "=");
		System.out.println("1. Show all DEALS");
		System.out.println("2. Add DEAL");
		System.out.println("3. Delete DEAL");
		System.out.println("4. Quit");
	}
	
	// Cindy Ella
	public static void UserMenu() {
		Helper.line(30, "=");
		System.out.println("MANAGE USERS");
		Helper.line(30, "=");
		System.out.println("1. View All Users");
		System.out.println("2. Delete User");
		System.out.println("3. Quit");
	}
	
	//Faith
	 public static void CategoryMenu() {
	  Helper.line(30, "=");
	  System.out.println("MANAGE CATEGORY");
	  Helper.line(30,"=");
	  System.out.println("1. Add Categories");
	  System.out.println("2. View All Categories");
	  System.out.println("3. Delete Category");
	  System.out.println("4. Quit");
	 }
	

	 // Cindy Ella
	public static void ViewAllUsers(ArrayList<Account> AccountList) {
		System.out.println("");
		System.out.println("VIEW ALL USERS");
		String output = "";
		output += String.format("%-40s %-39s %-20s %30s\n", "User Name", "Role", "Email", "Password");
		for (Account a : AccountList) {
			output += String.format("%-40s %-39s %-20s %30s\n", a.getName(), a.getRole(), a.getEmail(),
					a.getPassword());
			System.out.println(output);
		}
	}

	 // Cindy Ella
	public static void AddUser(ArrayList<Account> AccountList) {
		String newName = Helper.readString("Enter Name > ");
		String newRole = Helper.readString("Enter Role > ");
		String newEmail = Helper.readString("Enter Email > ");
		String newPassword = Helper.readString("Enter password > ");

		AccountList.add(new Account(newName, newRole, newEmail, newPassword));
		System.out.println("You have sucessfully registered");

	}

	 // Cindy Ella
	public static void DeleteUser(ArrayList<Account> AccountList) {
		System.out.println("");
		String delUser = Helper.readString("Enter the email of the user you want to delete > ");
		for (Account ac : AccountList) {
			if (delUser == ac.getEmail()) {
				AccountList.remove(ac);
				System.out.println("User has been successfully deleted!");
			} else {
				System.out.println("User Email Address does not exist!");
			}
		}

	}
	
	// Faith
	 public static void AddCategory(ArrayList<Category> CategoryList) {
	  System.out.println("");
	  System.out.println("ADD A CATEGORY");
	  String newCat = Helper.readString("Enter category name > ");
	   
	  for (Category c : CategoryList) {
	  if (newCat != c.getName()) {
	   CategoryList.add(new Category(newCat));
	   System.out.println("Category has been successfully added!");
	  }else
	   System.out.println("Category already exist");
	  }
	 }
	 
	 //Faith
	 public static void ViewAllCategories(ArrayList<Category> CategoryList) {
	  String output = "";
	  output += String.format("%s" , "name");
	  for (int x = 0; x < CategoryList.size(); x++) {
	   output += String.format("%s", "BidList.get(x).getName()");
	 
	  System.out.println(output);
	  }
	 }
	 
	 // Faith
	 public static void DeleteCategory(ArrayList<Category> CategoryList) {
	  System.out.println("");
	  String delCategory = Helper.readString("Enter the category you want to delete > ");
	  for (Category c : CategoryList) {
	   if (delCategory == c.getName()) {
	    CategoryList.remove(c);
	    System.out.println("Category has been successfully deleted!");
	   } else {
	    System.out.println("Category cannot be deleted!");
	   }
	  }
	 
	 }

	 // Wei Jing
	public static void ShowAllBid(ArrayList<bidInfo> BidList) {
		String output = "";
		output += String.format("%-40s %-39s %-20s %30s %40s \n", "Bid ID", "Item Name", "Description",
				"Seller Email", "Current Bid Price($)", "Starting Date", "Ending Date");
		for (int x = 0; x < BidList.size(); x++) {
			output += String.format("%-40s %-39s %-20s %30s %40s \n", BidList.get(x).getBidId(),
					BidList.get(x).getName(), BidList.get(x).getSellerEmail(), BidList.get(x).getBuyerEmail(),
					BidList.get(x).getBidPrice());
		}

		System.out.println(output);
	}

	 // Wei Jing
	public static void DeleteBid(ArrayList<bidInfo> BidList) {
		System.out.println("");
		int RemoveBid = Helper.readInt("Enter the bid id of the bid you want to delete > ");
		for (int i = 0; i < BidList.size(); i++) {
			if (RemoveBid == BidList.get(i).getBidId()) {
				BidList.remove(i);
				System.out.println("Bid successfully remove!");
			} else {
				System.out.println("Bid ID does not exist");
			}
		}
	}
	
	 // Wei Jing
	public static void AddBid(ArrayList<bidInfo> BidList) {
		System.out.println("ADD BID");
	    Helper.line(30, "=");
	    int NewID = BidList.size() + 1;
	    String itemName = Helper.readString("Enter item name >");
	    String sellerEmail = Helper.readString("Enter Seller email > ");
	    String buyerEmail = Helper.readString("Enter buyer email > ");
	    double bidPrice = Helper.readDouble("Enter Bid price > ");
	    if(itemName.equals("") || sellerEmail.equals("") || bidPrice == 0) {
	      System.out.println("You did not enter all the details.");
	    }
	    else {
	      System.out.println("Item successfully added!");
	      BidList.add(new bidInfo(NewID, itemName, sellerEmail, buyerEmail, bidPrice));      
	    }	  
	  }
	
	 // Wei Jing
	public static void UpdateBid(ArrayList<bidInfo> BidList) {
		boolean isAvailable = false;
	    System.out.println("");
	    System.out.println("ADD A BID");
	    System.out.println("=");
	    int bidId = Helper.readInt("Enter the bid ID of the item you want to bid > ");  
	    for(int i =0; i < BidList.size(); i++) {
	      if(bidId == BidList.get(i).getBidId()) {
	        isAvailable = true;
	        String BuyerEmail = Helper.readString("Enter your email > ");
	        double newBidPrice = Helper.readDouble("Enter Your Bid Price > $");
	        if(BidList.get(i).getBidPrice() < newBidPrice) {
	          System.out.println("You have successfully bid the item!");
	          BidList.get(i).setBuyerEmail(BuyerEmail);
	          BidList.get(i).setNewBidPrice(newBidPrice);
	        }
	        else {
	          System.out.println("Your bid price is lower than current bid price");
	        }      
	      }
	    }  
	    if(isAvailable == false) {
	      System.out.println("Bid id does not exist");
	    }
	}

	// Jarel
	public static void ShowAllDeal(ArrayList<DealInfo> DealList) {
		String output = "";
		output += String.format("%-40s %-39s %-20s %30s %40s %25s\n", "Deal ID", "Item Name", "Description",
				"Seller Email", "Transaction price($)", "Ending Date");
		for (int x = 0; x < DealList.size(); x++) {
			output += String.format("%-40s %-39s %-20s %30s %40s %25s\n", DealList.get(x).getDealId(),
					DealList.get(x).getName(), DealList.get(x).getSellerEmail(), DealList.get(x).getBuyerEmail(),
					DealList.get(x).getTranscationPrice(), DealList.get(x).getEndDate());
		}

		System.out.println(output);
	}

	// Jarel
	public static void DeleteDeal(ArrayList<DealInfo> DealList) {
		System.out.println("");
		int RemoveDeal = Helper.readInt("Enter the Deal id of the deal you want to delete > ");
		for (int i = 0; i < DealList.size(); i++) {
			if (RemoveDeal == DealList.get(i).getDealId()) {
				DealList.remove(i);
				System.out.println("Deal successfully remove");
			} else {
				System.out.println("Deal ID does not exist");
			}
		}
	}

	// Jarel
	public static void AddDeal(ArrayList<DealInfo> DealList) {
		System.out.println("");
		System.out.println("ADD A DEAL");
		String BuyerEmail = Helper.readString("Enter your email > ");
		double newBidPrice = Helper.readDouble("Enter Your deal Price >");
		int DealId = Helper.readInt("Enter the bid ID of the item you want to bid > ");
		for (int i = 0; i < DealList.size(); i++) {
			if (DealId == DealList.get(i).getDealId()) {

				System.out.println("You have successfully add the deal");
				DealList.get(i).setBuyerEmail(BuyerEmail);
				DealList.get(i).setTranscationPrice(newBidPrice);
			}

			else {
				System.out.println("Deal ID deos not exist");
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	


}
