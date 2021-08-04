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

	public void setName(String name) {
		this.name = name;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
