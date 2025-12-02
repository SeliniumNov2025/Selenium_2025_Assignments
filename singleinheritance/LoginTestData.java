package org.singleinheritance;

public class LoginTestData extends TestData {
	
	  public void enterUsername() {
		  
		  System.out.println("Enter the Username");
	  }  
	  public void enterPassword() {
		  
		  System.out.println("Enter the Passsword");
	  }
	  public static void main(String[] args) {
		
		  LoginTestData login = new LoginTestData();
		  login.enterCredentials();
		  login.enterUsername();
		  login.enterPassword();
		  login.navigateToHomePage();
		  
	}

}
