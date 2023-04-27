package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.JavaScriptUtil;

public class SigninPage extends BasePage {
	
	public SigninPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "username")
	WebElement emailTF;
	public void enterValueInEmail(String email) {
		
		enter_value(emailTF, email);
	}
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement pwdTF;
	public void enterValueInPwd(String pwd) {
		enter_value(pwdTF, pwd);
	}
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement SubmitButton;
	public void clickSubmitButton() {
		JavaScriptUtil js = new JavaScriptUtil(driver);
		js.jsClick(SubmitButton);
	}

}
