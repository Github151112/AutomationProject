package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ActiveProjectAndCustomers extends BaseClass {
	
	
	public ActiveProjectAndCustomers(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@value='Create New Customer']")
	private WebElement createNewCustomerButton;
	
	
	@FindBy(xpath ="//input[@value='Create New Project']")
	private WebElement createNewProjectButton;
	
	
	@FindBy(name = "name")
	private WebElement custNameTextField;
	
	
	@FindBy(name = "createCustomerSubmit")
	private WebElement createCustomerButton;
	
	
	@FindBy(name= "customerId")
	private WebElement customerDropdown;
	
	@FindBy(name = "name")
	private WebElement projectNameTextField;
	
	@FindBy(name = "createProjectSubmit")
	private WebElement createProjectButton;

	public WebElement getCreateNewCustomerButton() {
		return createNewCustomerButton;
	}

	public WebElement getCreateNewProjectButton() {
		return createNewProjectButton;
	}

	public WebElement getCustNameTextField() {
		return custNameTextField;
	}

	public WebElement getCreateCustomerButton() {
		return createCustomerButton;
	}

	public WebElement getCustomerDropdown() {
		return customerDropdown;
	}

	public WebElement getProjectNameTextField() {
		return projectNameTextField;
	}

	public WebElement getCreateProjectButton() {
		return createProjectButton;
	}
	
	
	
	public void createCustomerAndProject(String customerName,String projectName)
	{
		createNewCustomerButton.click();
		custNameTextField.sendKeys(customerName);
		createCustomerButton.click();
		createNewProjectButton.click();
		Select s = new Select(customerDropdown);
		s.selectByVisibleText(customerName);
		projectNameTextField.sendKeys(projectName);
		createProjectButton.click();
	}
	
	
	
	
	
	

}
