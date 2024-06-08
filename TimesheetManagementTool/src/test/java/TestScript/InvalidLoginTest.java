package TestScript;

import java.io.IOException;
import java.net.PasswordAuthentication;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.UsernameAndPassword;
import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.Flib;
import PomPages.LoginPage;

public class InvalidLoginTest extends BaseTest {

	@Test(description = "Verify the user is able to login with different set of data or not")
	public void invalidLogin() throws EncryptedDocumentException, IOException {

		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		int rowNo = flib.getRowNo(EXCEL_PATH, INVALID_SHEET_NAME);
		for (int i = 1; i < rowNo; i++) {
			String username = flib.getDataFromExcelFile(EXCEL_PATH, INVALID_SHEET_NAME, i, 0);
			String password = flib.getDataFromExcelFile(EXCEL_PATH, INVALID_SHEET_NAME, i, 1);
			lp.invalidLogin(username, password);

		}
	}

}
