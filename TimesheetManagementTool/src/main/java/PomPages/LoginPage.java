package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  extends BaseClass{
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//identify the user name text field
	@FindBy(name = "usern")
	private WebElement usernameTextField;
	
	
	
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}



	public WebElement getPasswordTextField() {
		return passwordTextField;
	}



	public WebElement getLoggedInCheckBox() {
		return loggedInCheckBox;
	}



	public WebElement getLoginButton() {
		return loginButton;
	}

	//idenitfy the password text field
	@FindBy(name = "pwd")
	private WebElement passwordTextField;
	
	
	//idenify the check box
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement loggedInCheckBox;
	
	
	//identify the login button
	@FindBy(id = "loginButton")
	private WebElement loginButton;
	
	
	
	public void validLogin(String username,String password)
	{
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loggedInCheckBox.click();
		loginButton.click();
	}
	
	
	public void invalidLogin(String username,String password)
	{
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loggedInCheckBox.click();
		loginButton.click();
		usernameTextField.clear();
	}
	
	
	
	
	
	
	
	
	
	

}
