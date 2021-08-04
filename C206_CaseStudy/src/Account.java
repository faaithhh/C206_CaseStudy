// Cindy Ella
public class Account {
	private String name;
	private String role;
	private String email;
	private String password;
	
	public Account(String name,String role, String email, String password) {
		this.name = name;
		this.email = email;
		this.role = role;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getRole() {
		return role;
	}
	
	public String getPassword() {
		return password;
	}
}
