package TestCases;

import java.util.Properties;

import org.testng.annotations.Test;

import PageObjects.DiabetesPage;

public class DiabetisTest extends BaseClass{
	//WebDriver driver=new ChromeDriver();
	DiabetesPage rcpHome=new DiabetesPage(driver);
	
	Properties prop;
	@Test
	public void getRecipies()
	{
		

		rcpHome.searchRecipe();
		rcpHome.click_searchbutton();
		rcpHome.clickVeganRecipeList();
		rcpHome.getVeganRecipeList();
		
	}
	

}
