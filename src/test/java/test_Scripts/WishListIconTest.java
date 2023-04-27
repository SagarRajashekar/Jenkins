package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.HomePage;
import pom_scripts.SigninPage;

public class WishListIconTest extends Base_Test{
	
	@Test(dataProvider = "testData")

	public void wishListIcon(String email,String pwd) throws Throwable {
		HomePage hp = new HomePage(driver);
		hp.clickSigninButton();
		SigninPage sp = new SigninPage(driver);
		sp.enterValueInEmail(email);
		sp.enterValueInPwd(pwd);
		sp.clickSubmitButton();
		test.log(LogStatus.INFO, "User is successfully logged in");
		hp.mouseHoverOnBeauty(driver);
		hp.clickOnWishlistIcon();
		test.log(LogStatus.PASS, "Clicked on Wishlist Icon");
		hp.clickonAccountSettingsIcon();
		hp.clickonWishList();
		if(driver.getTitle().contains("wishlist")) {
			test.log(LogStatus.PASS, "Wishlist page placed is displayed");
		}else {
			test.log(LogStatus.FAIL, "Wishlist page placed is not displayed");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		}
 }
	
	@DataProvider(name = "testData")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Signin");
		return testdata;
	}
	
}
