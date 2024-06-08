package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.Flib;
import PomPages.LoginPage;

public class ValidLoginTest extends BaseTest {

	@Test(description = "Verify the user is able to login with valid credentials or not")
	public void login() throws EncryptedDocumentException, IOException {
		Flib file = new Flib();
		String username = file.getDataFromExcelFile(EXCEL_PATH, SHEET_NAME, 1, 0);
		String password = file.getDataFromExcelFile(EXCEL_PATH, SHEET_NAME, 1, 1);
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(username, password);
	}

}
