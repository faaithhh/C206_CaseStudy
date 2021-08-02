import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		ArrayList<bidInfo> BidList = new ArrayList<bidInfo>();
		
		BidList.add(new bidInfo(1, "Used Condom", "abc@gmail.com", "cadmusChau@gamil.com", 
				4.50, LocalDate.parse("10/10/2020", formatter1), LocalDate.parse("17/10/2020",formatter1)));	
	
		BidList.add(new bidInfo(2, "Used socks", "sccc@gmail.com", "DogeKing@gamil.com", 
				4.50, LocalDate.parse("11/10/2020", formatter1), LocalDate.parse("18/10/2020",formatter1)));
		
		ArrayList<Account> AccountList = new ArrayList<Account>();
		
		AccountList.add(new Account("Tan ah beng", "admin", "abc123@gmail.com", "123455"));
		
		AccountList.add(new Account("Your mum", "student", "abcd1222@gmail.com", "99999"));
		
		int optMain = 0;
		int option = 0;
		
		while (option != 3) {
			mainMenu();
			optMain = Helper.readInt("Enter an option > ");
			
			if(optMain == 1) {
				AddUser(AccountList);
			}
			else if (optMain == 2){
			
			loginMenu();
			option = Helper.readInt("Enter type of user > ");
			
			if(option == 1) {
				boolean isCorrect = false;
				String username = Helper.readString("Enter your email > ");
				String password = Helper.readString("Enter your password > ");
				
				for (int i = 0; i < AccountList.size(); i++) {
					if(username.equals(AccountList.get(i).getEmail()) && password.equals(AccountList.get(i).getPassword()) && AccountList.get(i).getRole().equalsIgnoreCase("STUDENT")) {
						isCorrect = true;
			}			
				}
				if(isCorrect == false) {
					System.out.println("Either your email or password is invalid");
				}
				else {
					int option2 = 0;
					while(option2 != 6) {
						StudentMenu();
						option2 = Helper.readInt("Enter an option > ");
						if(option2 == 1) {
						
						}
						else if(option2 == 2) {
			
						}
						else if(option2 == 3) {
								
						}
						else if(option2 == 4) {
							ShowAllBid(BidList);
								AddBid(BidList);
						}
						else if(option2 == 5) {
							ShowAllBid(BidList);
						}
						else if(option2 == 6) {
							System.out.println("Quit.");
						}
						else {
							System.out.println("You have enterd an invalid option");
							}
					}
				
					}
				}
			else if(option == 2) {
				boolean isCorrect = false;
				String username = Helper.readString("Enter your email > ");
				String password = Helper.readString("Enter your password > ");
				for (int i = 0; i < AccountList.size(); i++) {
					if(username.equals(AccountList.get(i).getEmail()) && password.equals(AccountList.get(i).getPassword()) && AccountList.get(i).getRole().equalsIgnoreCase("ADMIN")) {
						isCorrect = true;
			}			
				}
				if(isCorrect == false) {
					System.out.println("Either your email or password is invalid");
				}
				else {
					int option3 = 0;
					while(option3 != 6) {
						AdminMenu();
						option3 = Helper.readInt("Enter an option > ");
						
						if(option3 == 1) {
							UserMenu();
							int userOpt = Helper.readInt("Enter an option > ");
							
							if (userOpt == 1) {
								ViewAllUsers(AccountList);
							}
							else if (userOpt == 2) {
								AddUser(AccountList);
							}
							else if (userOpt == 3) {
								DeleteUser(AccountList);
							}
							else if (userOpt == 4) {
								System.out.println("Thank you");
							}
							else {
								System.out.println("You have entered an invalid option");
							}
						}
						else if(option3 == 2) {
							
						}
						else if(option3 == 3) {
							
						}
						else if(option3 == 4) {
							int bidOption = 0;
							while(bidOption != 4) {
								BidMenu();
								bidOption = Helper.readInt("Enter an option > ");
								if(bidOption == 1) {
									ShowAllBid(BidList);
								}
								else if(bidOption == 2) {
									ShowAllBid(BidList);
									AddBid(BidList);
								}
								else if(bidOption == 3) {
									ShowAllBid(BidList);
									DeleteBid(BidList);
								}
								else if(bidOption == 4) {
									System.out.println("QUIT.");
								}
								else {
									System.out.println("You have enter an invalid option");
								}
							}
							
							
						}
						else if(option3 == 5) {
							
						}
						else if(option3 == 6) {
							System.out.println("QUIT.");
						}
						else {
							System.out.println("You have entered an invalid option");
						}
							
					}
				
			}
			}
			else {
				System.out.println("Thank you for using the application");
			}
		}
	}
	}
	
	public static void mainMenu() {
		Helper.line(30, "=");
		System.out.println("CAMPUS ONLINE AUCTION SHOP");
		Helper.line(30, "=");
		System.out.println("1. Register ");
		System.out.println("2. Log in ");
		System.out.println("3. Quit ");
	}
	
	
	public static void loginMenu() {
		Helper.line(30, "=");
		System.out.println("LOGIN PAGE");
		Helper.line(30, "=");
		System.out.println("1. Log In as Student");
		System.out.println("2. Log in as Administrator");
	}
	
	
	public static void StudentMenu() {
		Helper.line(30, "=");
		System.out.println("Student Menu");
		Helper.line(30,"=");
		System.out.println("1. View all categories");
		System.out.println("2. Add item");
		System.out.println("3. View all item");
		System.out.println("4. Add Bids");
		System.out.println("5. View all bids");
		System.out.println("6. Quit");
	}
	
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
	
	
	public static void BidMenu() {
		Helper.line(30, "=");
		System.out.println("MANAGE BID");
		Helper.line(30, "=");
		System.out.println("1. Show all bids");
		System.out.println("2. Add bid");
		System.out.println("3. Delete bid");
		System.out.println("4. Quit");
	}
	
	public static void UserMenu() {
		Helper.line(30, "=");
		System.out.println("MANAGE USERS");
		Helper.line(30, "=");
		System.out.println("1. View All Users");
		System.out.println("2. Add User");
		System.out.println("3. Delete User");
		System.out.println("4. Quit");
	}
	
	public static void ViewAllUsers(ArrayList<Account> AccountList) {
		System.out.println("");
		System.out.println("VIEW ALL USERS");
		String output = "";
		output += String.format("%-40s %-39s %-20s %30s\n", "User Name", "Role", "Email", "Password");
		for (Account a : AccountList) {
			output += String.format("%-40s %-39s %-20s %30s\n", a.getName(), a.getRole(), a.getEmail(), a.getPassword());
		System.out.println(output);
	}
}
	
	public static void AddUser(ArrayList<Account> AccountList) {
		String newName = Helper.readString("Enter Name > ");
		String newRole = Helper.readString("Enter Role > ");
		String newEmail= Helper.readString("Enter Email > ");
		String newPassword = Helper.readString("Enter password > ");
		
		AccountList.add(new Account (newName, newRole, newEmail, newPassword));
		System.out.println("You have sucessfully registered");
		
		
	}
	
	public static void DeleteUser(ArrayList<Account>AccountList) {
		System.out.println("");
		String delUser = Helper.readString("Enter the email of the user you want to delete > ");
		for(Account ac : AccountList) {
			if (delUser == ac.getEmail()) {
				AccountList.remove(ac);
				System.out.println("User has been successfully deleted!");
			}
			else {
				System.out.println("User Email Address does not exist!");
			}
		}
		
	}


	
	
	public static void ShowAllBid(ArrayList<bidInfo> BidList) {
		
		String output = "";
		output += String.format("%-40s %-39s %-20s %30s %40s %30s %25s\n", "Bid ID", "Item Name",
					"Description", "Seller Email", "Current Bid Price($)", "Starting Date", "Ending Date");
		for (int x = 0; x < BidList.size(); x++) {
			output += String.format("%-40s %-39s %-20s %30s %40s %30s %25s\n", BidList.get(x).getBidId(), BidList.get(x).getName(),
					BidList.get(x).getSellerEmail(), BidList.get(x).getBuyerEmail(), BidList.get(x).getBidPrice(), BidList.get(x).getStartDate(),
					BidList.get(x).getEndDate());
		}			 
		
		System.out.println(output);
	}
	
	public static void DeleteBid(ArrayList<bidInfo> BidList) {
		System.out.println("");
		int RemoveBid = Helper.readInt("Enter the bid id of the bid you want to delete > ");
		for(int i =0; i < BidList.size(); i++) {
			if (RemoveBid == BidList.get(i).getBidId()) {
				BidList.remove(i);
				System.out.println("Bid successfully remove!");
			}
			else {
				System.out.println("Bid ID does not exist");
			}
		}
		

}
	public static void AddBid(ArrayList<bidInfo> BidList) {
		System.out.println("");
		System.out.println("ADD A BID");
		String BuyerEmail = Helper.readString("Enter your email > ");
		double newBidPrice = Helper.readDouble("Enter Your Bid Price >");
		int bidId = Helper.readInt("Enter the bid ID of the item you want to bid > ");
		for(int i =0; i < BidList.size(); i++) {
			if(bidId == BidList.get(i).getBidId()) {
				if(newBidPrice > BidList.get(i).getBidPrice()) {
					System.out.println("You have successfully Bid the item");
					BidList.get(i).setBuyerEmail(BuyerEmail);
					BidList.get(i).setNewBidPrice(newBidPrice);
			}
				else {
					System.out.println("Your bid id is lesser than the current bid value");
				}			
			}
			else {
				System.out.println("Bid ID deos not exist");
			}
		}
		
		
}
}