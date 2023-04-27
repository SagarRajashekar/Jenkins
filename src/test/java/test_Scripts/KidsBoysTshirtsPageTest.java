package test_Scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.HomePage;
import pom_scripts.KidsPage;
import pom_scripts.SigninPage;

public class KidsBoysTshirtsPageTest extends Base_Test{
	
	@Test(dataProvider = "testData")

	public void boysTshirts(String email,String pwd) {
		HomePage hp = new HomePage(driver);
		hp.clickSigninButton();
		SigninPage sp = new SigninPage(driver);
		sp.enterValueInEmail(email);
		sp.enterValueInPwd(pwd);
		sp.clickSubmitButton();
		hp.mouseHoverOnBeauty(driver);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success']"))));
		KidsPage kp = new KidsPage(driver);
		kp.mouseHoverOnKids(driver);
		kp.clickBoysTshirts();
		hp.mouseHoverOnBeauty(driver);
		hp.clickAddToCart();
		hp.clickCart();
		hp.clickBuyNowButton();
		hp.clickAddressRadioButton();
		hp.clickProceedButton();
		hp.clickCODRadioButton();
		hp.clickPlaceOrderButton();
}
	@DataProvider(name = "testData")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Signin");
		return testdata;
	}
	
}
