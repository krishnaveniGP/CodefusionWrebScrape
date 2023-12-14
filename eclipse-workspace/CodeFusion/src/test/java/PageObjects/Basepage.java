package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Basepage {
	WebDriver driver;
	public Basepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void selectOptionFromSortLit(By options, String text) 
	{
        List<WebElement> allOptions = driver.findElements(options);
        String option;
        for (int i = 1; i < allOptions.size(); i++)
        {
            option = allOptions.get(i).getText();
            if (option.equals(text)) {
                allOptions.get(i).click();
                break;
            }
        }
    
	}
	 public void selectFromList(List<WebElement> elements,String optionElement)
	    {
	       for(WebElement element:elements)
	        {
	            String option=element.getText();
	            if(option.equals(optionElement))
	            {
	                element.click();
	                break;
	            }
	        }
	    }
}
