package TestCases;

import org.testng.annotations.Test;

import PageObjects.HypertensionPage;

public class HypertensionTest extends BaseClass {
	
	//static WebDriver driver;
	HypertensionPage htPage=new HypertensionPage(driver);
	@Test
	public void getHyperTensionRecipies()
	{
		
		htPage.click_BloodPressure_recipies();
		
	}

}
