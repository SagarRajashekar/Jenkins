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

public class SearchTextFieldTest extends Base_Test{

	@Test(dataProvider = "testData")

	public void searchTextField(String email,String pwd,String value) {
		HomePage hp = new HomePage(driver);
		hp.clickSigninButton();
		SigninPage sp = new SigninPage(driver);
		sp.enterValueInEmail(email);
		sp.enterValueInPwd(pwd);
		sp.clickSubmitButton();
		test.log(LogStatus.INFO, "User is successfully logged in");
		hp.mouseHoverOnBeauty(driver);
		hp.scrollToFeaturedProducts();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success']"))));
		hp.enterValueToSearchTF(value);
		hp.clickOnSearchLookUpIcon();
		test.log(LogStatus.PASS, "Product page is displayed");
		hp.clickAddToCart();
		hp.clickCart();
		hp.scrollCartItems(driver);
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
		Object [][]testdata=ReadExcel.getMultipleData("Product");
		return testdata;
	}
	
}
