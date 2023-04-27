package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.HomePage;
import pom_scripts.SigninPage;

public class TestScript1 extends Base_Test{
	
	@Test(dataProvider = "testdata")
	public void testScript1(String email, String pwd) throws IOException {
		
		  HomePage hp=new HomePage(driver); 
		  hp.clickSigninButton();
		  SigninPage lp=new SigninPage(driver); 
		  lp.enterValueInEmail(email); 
		  lp.enterValueInPwd(pwd);
		  test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver))); 
		  lp.clickSubmitButton();
		  test.log(LogStatus.INFO, "User is logged in");
	}
	
	@DataProvider(name = "testdata")
	public Object[][] getTestData() throws IOException {
		Object [][]testdata=ReadExcel.getMultipleData("Sheet1");
		return testdata;
	}

}
