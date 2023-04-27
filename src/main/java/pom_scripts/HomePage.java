package pom_scripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.JavaScriptUtil;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//button[contains(text(),'Sign In')]")
	WebElement signinButton;
	public void clickSigninButton() {
		clickAction(signinButton);
	}
	
	@FindBy(xpath="//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success']")
	WebElement loginNotification;
	public void handleLoginNotification(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(loginNotification));
	}
	
	@FindBy(xpath = "//input[@id='searchbar']")
	WebElement searchTF;
	public void enterValueToSearchTF(String value) {
		enter_value(searchTF, value);
	}
	
	@FindBy(xpath = "(//a[@href='/cart'])[1]")
	WebElement cartIcon;
	public void clickCart() {
		clickAction(cartIcon);
	}
	
	@FindBy(xpath="//button[@aria-label='Account settings']")
	WebElement accountSettingsIcon;
	public void clickonAccountSettingsIcon() {
		JavaScriptUtil js=new JavaScriptUtil(driver);
		js.jsClick(accountSettingsIcon);	
	}
	
	@FindBy(xpath="//li[@role='menuitem'][1]")
	WebElement profileIcon;
	public void clickonProfileIcon() {
		JavaScriptUtil js=new JavaScriptUtil(driver);
		js.jsClick(profileIcon);
	}
	
	@FindBy(xpath="//li[@role='menuitem'][3]")
	WebElement wishList;
	public void clickonWishList() {
		JavaScriptUtil js=new JavaScriptUtil(driver);
		js.jsClick(wishList);
	}
	
	@FindBy(xpath="//li[@role='menuitem'][4]")
	WebElement yourOrdersIcon;
	public void clickOnYourOrders() {
		JavaScriptUtil js=new JavaScriptUtil(driver);
		js.jsClick(yourOrdersIcon);
	}
	
	@FindBy(xpath="//li[@role='menuitem'][5]")
	WebElement walletIcon;
	public void clickOnwalletIcon() {
		JavaScriptUtil js=new JavaScriptUtil(driver);
		js.jsClick(walletIcon);
	}
	
	@FindBy(xpath="//li[@role='menuitem'][6]")
	WebElement logOutIcon;
	public void clickonLogout() {
		JavaScriptUtil js=new JavaScriptUtil(driver);
		js.jsClick(logOutIcon);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Men')]")
	WebElement menTab;
	public void mouseHoverOnMen(WebDriver driver) {
		actions_classObject(driver).moveToElement(menTab).perform();;
	}
	public void clickOnMenTab() {
		clickAction(menTab);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Women')]")
	WebElement womenTab;
	public void mouseHoverOnWomen(WebDriver driver) {
		actions_classObject(driver).moveToElement(womenTab).perform();;
	}
	public void clickOnWomenTab() {
		clickAction(womenTab);
	}

	@FindBy(xpath = "//a[contains(text(),'Kids')]")
	WebElement kidsTab;
	public void mouseHoverOnKids(WebDriver driver) {
		actions_classObject(driver).moveToElement(kidsTab).perform();
	}
	public void clickOnKidsTab() {
		clickAction(kidsTab);
	}
	
	@FindBy(xpath = "//a[text()='Electronic']")
	WebElement electronicTab;
	public void mouseHoverOnElectronic(WebDriver driver) {
		actions_classObject(driver).moveToElement(electronicTab).perform();;
	}
	public void clickOnElectronicTab() {
		clickAction(electronicTab);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Beauty')]")
	WebElement beautyTab;
	public void mouseHoverOnBeauty(WebDriver driver) {
		actions_classObject(driver).moveToElement(beautyTab).perform();
		actions_classObject(driver).moveByOffset(1229,142);
	}
	public void clickOnBeautyTab() {
		clickAction(beautyTab);
	}
	
	@FindBy(xpath = "//h1[contains(text(),'Featured Products')]")
	WebElement featuredProducts;
	public void scrollToFeaturedProducts() {
		JavaScriptUtil js = new JavaScriptUtil(driver);
		js.jsScrollIntoView(true, featuredProducts);
	}
	
	@FindBy(xpath = "//button[text()='add to cart']")
	WebElement addToCartButton;
	public void clickAddToCart() {
		clickAction(addToCartButton);	
	}
	
	@FindBy(xpath = "//a[contains(text(),'Delivery Center')]")
	WebElement deliveryCenterlink;
	public void clickDeliveryCenterlink() {
		clickAction(deliveryCenterlink);
	}
	
	@FindBy(xpath = "//a[text()='Voucher']")
	WebElement voucherLink;
	public void clickVoucherLink() {
		clickAction(voucherLink);
	}
	
	@FindBy(xpath = "//a[contains(text(),'contact us')]")
	WebElement contactUsLink;
	public void clickContactUsLink() {
		clickAction(contactUsLink);
	}
	 
	@FindBy(xpath = "//a[contains(text(),'about us')]")
	WebElement aboutUsLink;
	public void clickAboutUsLink() {
		clickAction(aboutUsLink);
	}
	
	@FindBy(xpath = "//a[contains(text(),'payments')]")
	WebElement paymentsLink;
	public void clickPaymentsLink() {
		clickAction(paymentsLink);
	}
	
	@FindBy(xpath = "//a[contains(text(),'shipping')]")
	WebElement shippingLink;
	public void clickShippingLink() {
		clickAction(shippingLink);
	}
	
	@FindBy(xpath = "//a[contains(text(),'return policy')]")
	WebElement returnPolicyLink;
	public void clickReturnPolicyLink() {
		clickAction(returnPolicyLink);
	}
	
	@FindBy(xpath = "//span[contains(text(),'FIREBOLTT')]")
	WebElement featuredProductsProduct;
	public void clickFeaturedProductsProduct() {
		clickAction(featuredProductsProduct);
	}
	
	@FindBy(css = ".MuiSvgIcon-root.MuiSvgIcon-fontSizeMedium.css-vubbuv")
	List<WebElement> searchLookUpIcon;
	public void clickOnSearchLookUpIcon() {
		searchLookUpIcon.get(0).click();
	}
	
	@FindBy(css = ".MuiSvgIcon-root.MuiSvgIcon-fontSizeMedium.css-vubbuv")
	List<WebElement> wishListIcon;
	public void clickOnWishlistIcon() {
		wishListIcon.get(1).click();
	}
	
	@FindBy(xpath = "//span[text()='Buy Now']")
	WebElement buyNowButton;
	public void clickBuyNowButton() {
		clickAction(buyNowButton);
	}
	
	@FindBy(xpath = "//span[text()='Cart Items']")
	WebElement cartLink;
	public void scrollCartItems(WebDriver driver) {
		JavaScriptUtil js = new JavaScriptUtil(driver);
		js.jsScrollIntoView(true, cartLink);
	}
	
	@FindBy(xpath = "//button[text()='Remove from cart']")
	WebElement removeFromCart;
	public void wait(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(removeFromCart));
	}
	
	@FindBy(xpath = "//input[@name='address']")
	WebElement addressRadioButton;
	public void clickAddressRadioButton() {
		clickAction(addressRadioButton);
	}
	
	@FindBy(xpath = "//button[contains(text(),'Proceed')]")
	WebElement proceedButton;
	public void clickProceedButton() {
		clickAction(proceedButton);
	}
	
	@FindBy(xpath = "//span[text()='Cash On Delivery (COD)']")
	WebElement codRadioButton;
	public void clickCODRadioButton() {
		clickAction(codRadioButton);
	}
	
	@FindBy(xpath = "//button[contains(text(),'Place Order')]" )
	WebElement placeOrderButton;
	public void clickPlaceOrderButton() {
		clickAction(placeOrderButton);
	}
	
}