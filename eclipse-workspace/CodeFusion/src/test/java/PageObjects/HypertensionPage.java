package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class HypertensionPage extends Basepage {
	static WebDriver driver;
	public HypertensionPage(WebDriver driver)
	{
		super(driver);
	}
		
	
	
	//Actions action=new Actions(driver);

	
	@FindBy(xpath="//ul[@id='nav']/li[1]") WebElement Recipies;
	@FindBy(xpath="//a[text()='Health']") WebElement Health;
	@FindBy(xpath="//a[text()='High Blood Pressure']")private WebElement BloodPresuure;
	@FindBys(@FindBy(xpath="//span/a"))private List <WebElement> veganRecipiesList;

	public void click_BloodPressure_recipies()
	{
		//action.moveToElement(Recipies).moveToElement(Health).moveToElement(BloodPresuure).build().perform();

Recipies.click();

	}

}
