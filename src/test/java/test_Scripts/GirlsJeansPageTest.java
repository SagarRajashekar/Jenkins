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
import pom_scripts.KidsPage;
import pom_scripts.SigninPage;

public class GirlsJeansPageTest extends Base_Test{
	
	@Test(dataProvider = "testData")

	public void boysTshirts(String email,String pwd) {
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
		KidsPage kp = new KidsPage(driver);
		kp.mouseHoverOnKids(driver);
		kp.clickGirlsJeansTrousersAndCapris();
		if(driver.getCurrentUrl().contains("girls-jeans")) {
			test.log(LogStatus.PASS, "Girls jeans page is displayed");
		}else {
			test.log(LogStatus.FAIL, "Girls jeans page is not displayed");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		}	
		hp.mouseHoverOnBeauty(driver);
		hp.clickAddToCart();
		hp.clickCart();
		hp.clickBuyNowButton();
		hp.clickAddressRadioButton();
		hp.clickProceedButton();
		hp.clickCODRadioButton();
		hp.clickPlaceOrderButton();
		if(driver.getCurrentUrl().contains("payment-options")) {
			test.log(LogStatus.PASS, "Order is placed successfully");
		}else {
			test.log(LogStatus.FAIL, "Order is not placed successfully");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		}
}
	@DataProvider(name = "testData")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Signin");
		return testdata;
	}
}
