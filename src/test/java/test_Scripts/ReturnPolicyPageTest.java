package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.HomePage;
import pom_scripts.SigninPage;

public class ReturnPolicyPageTest extends Base_Test {
	
		@Test(dataProvider = "testData")
				
		public void returnPolicyPage(String email,String pwd) {
		HomePage hp = new HomePage(driver);
		hp.clickSigninButton();
		SigninPage sp = new SigninPage(driver);
		sp.enterValueInEmail(email);
		sp.enterValueInPwd(pwd);
		sp.clickSubmitButton();
		test.log(LogStatus.INFO, "User is successfully logged in");
		hp.clickReturnPolicyLink();
		if(driver.getCurrentUrl().contains("Return")) {
			test.log(LogStatus.PASS, "Return policy page placed is displayed");
		}else {
			test.log(LogStatus.FAIL, "Return policy page placed is not displayed");
			test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		}
	}
				
		@DataProvider(name = "testData")
		public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Signin");
		return testdata;
		}
}