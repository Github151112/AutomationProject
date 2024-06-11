package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.Flib;
import PomPages.ActiveProjectAndCustomers;
import PomPages.HomePage;
import PomPages.LoginPage;
import PomPages.OpenTaskPage;

public class DeleteAllProjectAndCustomers extends BaseTest {

	@Test(groups = {"RT","IT"})
	public void deleteAll() throws EncryptedDocumentException, IOException {
		Flib file = new Flib();
		String username = file.getDataFromExcelFile(EXCEL_PATH, SHEET_NAME, 1, 0);
		String password = file.getDataFromExcelFile(EXCEL_PATH, SHEET_NAME, 1, 1);
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(username, password);

		// click on task link
		HomePage hp = new HomePage(driver);
		hp.clickOnTasksLink();

		// click on project and customer
		OpenTaskPage otp = new OpenTaskPage(driver);
		otp.clickOnProjectAndCustomerLink();
		
		
		//delete all
		ActiveProjectAndCustomers apac = new ActiveProjectAndCustomers(driver);
		apac.deleteAllProjectAndCustomers();

	}

}
