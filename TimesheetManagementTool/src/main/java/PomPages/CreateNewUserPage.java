package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewUserPage extends BaseClass {

	public CreateNewUserPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@FindBy(name = "username")
	private WebElement usernameTextField;
	
	
	@FindBy(name = "passwordText")
	private WebElement passwordTextField;
	
	@FindBy(name = "passwordTextRetype")
	private WebElement confirmPasswordTextField;
	
	@FindBy(name = "firstName")
	private WebElement firstNameTextField;
	
	
	@FindBy(name = "lastName")
	private WebElement lastNameTextField;
	
	@FindBy(xpath = "//input[contains(@value,'Create User')]")
	private WebElement createUserButton;

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getCreateUserButton() {
		return createUserButton;
	}
	
	
	public void toCreateUser(String username,String password,String firstName,String lastName)
	{
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		confirmPasswordTextField.sendKeys(password);
		firstNameTextField.sendKeys(firstName);
		lastNameTextField.sendKeys(lastName);
		createUserButton.click();
	}
	
	
	
	

}
