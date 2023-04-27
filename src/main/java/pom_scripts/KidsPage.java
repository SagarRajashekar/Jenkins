package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KidsPage extends BasePage {

	public KidsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Kids')]")
	WebElement kidsTab;
	public void mouseHoverOnKids(WebDriver driver) {
		actions_classObject(driver).moveToElement(kidsTab).perform();
	}
	public void clickOnKidsTab() {
		clickAction(kidsTab);
	}
	
	@FindBy(xpath = "//a[contains(text(),'T-Shirts')]")
	WebElement boysTshirts;
	public void clickBoysTshirts() {
		clickAction(boysTshirts);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Shirts')])[4]")
	WebElement boysShirts;
	public void clickBoysShirts() {
		clickAction(boysShirts);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Shorts')])[3]")
	WebElement boysShorts;
	public void clickBoysShorts() {
		clickAction(boysShorts);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Jeans')])[3]")
	WebElement boysJeans;
	public void clickBoysJeans() {
		clickAction(boysJeans);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Trousers')])[3]")
	WebElement boysTrousers;
	public void clickBoysTrousers() {
		clickAction(boysTrousers);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Clothing Sets')])[1]")
	WebElement boysClothingSets;
	public void clickBoysClothingSets() {
		clickAction(boysClothingSets);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Ethnic Wear')])[2]")
	WebElement boysEthnicWear;
	public void clickBoysEthnicWear() {
		clickAction(boysEthnicWear);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Party wear')])[1]")
	WebElement boysPartyWear;
	public void clickBoysPartyWear() {
		clickAction(boysPartyWear);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Inner & Thermals')])[1]")
	WebElement boysInnerAndThermals;
	public void clickBoysInnerAndThermals() {
		clickAction(boysInnerAndThermals);
	}
	
	@FindBy(xpath ="(//a[contains(text(),'Nightwear')])")
	WebElement boysNightWear;
	public void clickBoysNightWear() {
		clickAction(boysNightWear);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Value Packs')])[1]")
	WebElement boysValuePacks;
	public void clickBoysValuePacks() {
		clickAction(boysValuePacks);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Dresses')])[2]")
	WebElement girlsDresses;
	public void clickGirlsDresses() {
		clickAction(girlsDresses);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Tops')])[2]")
	WebElement girlsTops;
	public void clickGirlsTops() {
		clickAction(girlsTops);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Tshirts')])[2]")
	WebElement girlsTshirts;
	public void clickGirlsTshirts() {
		clickAction(girlsTshirts);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Clothing Sets')])[2]")
	WebElement girlsClothingSets;
	public void clickGirlsClothingSets() {
		clickAction(girlsClothingSets);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Lehenga choli')")
	WebElement girlsLehengaCholi;
	public void clickGirlsLehengaCholi() {
		clickAction(girlsLehengaCholi);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Kurta Sets')")
	WebElement girlsKurtaSets;
	public void clickGirlsKurtaSets() {
		clickAction(girlsKurtaSets);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Party wear')])[2]")
	WebElement girlsPartyWear;
	public void clickGirlsPartyWear() {
		clickAction(girlsPartyWear);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Dungarees & Jumpsuits')])")
	WebElement girlsDungareesAndJumpsuits;
	public void clickGirlsDungareesAndJumpsuits() {
		clickAction(girlsDungareesAndJumpsuits);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Skirts & shorts')])")
	WebElement girlsSkirtsAndShorts;
	public void clickGirlsSkirtsAndShorts() {
		clickAction(girlsSkirtsAndShorts);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Tights & Leggings')])")
	WebElement girlsTightsAndLeggings;
	public void clickGirlsTightsAndLeggings() {
		clickAction(girlsTightsAndLeggings);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Jeans,Trousers & Capris')])")
	WebElement girlsJeansTrousersAndCapris;
	public void clickGirlsJeansTrousersAndCapris() {
		clickAction(girlsJeansTrousersAndCapris);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Inner & Thermals')])[2]")
	WebElement girlsInnerAndThermals;
	public void clickGirlsInnerAndThermals() {
		clickAction(girlsInnerAndThermals);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Loungewear')])")
	WebElement girlsLoungeWear;
	public void clickGirlsLoungeWear() {
		clickAction(girlsLoungeWear);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Value Packs')])[2]")
	WebElement girlsValuePacks;
	public void clickGirlsValuePacks() {
		clickAction(girlsValuePacks);
	}
	
}