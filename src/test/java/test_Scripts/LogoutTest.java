package test_Scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.HomePage;
import pom_scripts.SigninPage;

public class LogoutTest extends Base_Test{
	
	@Test(dataProvider = "testData")

	public void logoutIcon(String email,String pwd) {
		HomePage hp = new HomePage(driver);
		hp.clickSigninButton();
		SigninPage sp = new SigninPage(driver);
		sp.enterValueInEmail(email);
		sp.enterValueInPwd(pwd);
		sp.clickSubmitButton();
		test.log(LogStatus.INFO, "User is successfully logged in");
		hp.mouseHoverOnBeauty(driver);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success']"))));
		hp.clickonAccountSettingsIcon();
		hp.clickonLogout();
		test.log(LogStatus.PASS, "User is successfully logged out");
}
	@DataProvider(name = "testData")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Signin");
		return testdata;
	}
}
