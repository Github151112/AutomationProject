package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.Flib;
import GenericLib.WorkLib;
import PomPages.ActiveProjectAndCustomers;
import PomPages.HomePage;
import PomPages.LoginPage;
import PomPages.OpenTaskPage;

public class CreateCustomerAndProjectTest extends BaseTest {
	
	@Test(groups = "RT")
	public void createCustomerAndProject() throws EncryptedDocumentException, IOException
	{
		//login
		Flib file = new Flib();
		String username = file.getDataFromExcelFile(EXCEL_PATH, SHEET_NAME, 1, 0);
		String password = file.getDataFromExcelFile(EXCEL_PATH, SHEET_NAME, 1, 1);
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(username, password);
		
		//click on task link
		HomePage hp = new HomePage(driver);
		hp.clickOnTasksLink();
		
		//click on project and customer
		OpenTaskPage otp = new OpenTaskPage(driver);
		otp.clickOnProjectAndCustomerLink();
		
		//create the project and customer
		WorkLib wlib = new WorkLib();
		String customerName = file.getDataFromExcelFile(EXCEL_PATH, CUST_PROJ_SHEET, 1, 0)+wlib.getRandomNo();
		String ProjectName = file.getDataFromExcelFile(EXCEL_PATH, CUST_PROJ_SHEET, 1, 0)+wlib.getRandomNo();
		ActiveProjectAndCustomers  apac = new ActiveProjectAndCustomers(driver);
		apac.createCustomerAndProject(customerName, ProjectName);
		
		
		
	}
	

}
