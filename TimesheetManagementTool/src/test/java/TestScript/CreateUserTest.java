package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.Flib;
import GenericLib.WorkLib;
import PomPages.CreateNewUserPage;
import PomPages.HomePage;
import PomPages.LoginPage;
import PomPages.UserListPage;

public class CreateUserTest extends BaseTest {
	
	
	@Test(description = "verify the user is able to create the user or not",groups = "RT")
	public void toCreateUser() throws EncryptedDocumentException, IOException
	{
		//perform login operation
		Flib file = new Flib();
		WorkLib wlib = new WorkLib();
		String username = file.getDataFromExcelFile(EXCEL_PATH, SHEET_NAME, 1, 0);
		String password = file.getDataFromExcelFile(EXCEL_PATH, SHEET_NAME, 1, 1);
		String usn = file.getDataFromExcelFile(EXCEL_PATH, USER_SHEET_NAME, 1, 0)+wlib.getRandomNo();
		String pwd = file.getDataFromExcelFile(EXCEL_PATH, USER_SHEET_NAME, 1, 1)+wlib.getRandomNo();
		String fn = file.getDataFromExcelFile(EXCEL_PATH, USER_SHEET_NAME, 1, 2);
		String lstn = file.getDataFromExcelFile(EXCEL_PATH, USER_SHEET_NAME, 1, 3)+wlib.getRandomNo();
		
		
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(username, password);
		
		//click on userLink
		HomePage hp = new HomePage(driver);
		hp.clickOnUsersLink();
		
		//click on create new user Button
		UserListPage uLP = new UserListPage(driver);
		uLP.clickOnCreateNewUser();
		
		//create user
		CreateNewUserPage cnup = new CreateNewUserPage(driver);
		cnup.toCreateUser(usn, pwd, fn, lstn);
		
		
				
				
		
		
	}
	

}
 