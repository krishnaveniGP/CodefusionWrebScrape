package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DiabetesPage {
static WebDriver driver;
public DiabetesPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@id='ctl00_txtsearch']") WebElement searchRecipe;
@FindBy(xpath="//input[@id='ctl00_imgsearch']") WebElement searchButton;
@FindBy(xpath="//div[@id='cardholder']//ul/li[2]")private WebElement veganRecipies;
@FindBys(@FindBy(xpath="//span/a"))private List <WebElement> veganRecipiesList;
public void searchRecipe()
{
	
	searchRecipe.sendKeys("vegan");
}
public void click_searchbutton()
{
	searchButton.click();

}
public void clickVeganRecipeList()
{
	veganRecipies.click();

}
public void getVeganRecipeList()
{
	String rurl="";
	for(WebElement recipe:veganRecipiesList)
	{
		System.out.println(recipe.getAttribute("href"));
		//rurl=recipe.getAttribute("href");
		
	}
	//
}

}
