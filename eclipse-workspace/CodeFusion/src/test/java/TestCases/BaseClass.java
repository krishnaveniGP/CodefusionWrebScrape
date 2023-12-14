package TestCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
	public static WebDriver driver;
	public WebDriverWait wait;
	Properties prop=new Properties();
//	ReadConfigFile read=new ReadConfigFile();
//	public String url=read.getUrl1();
	public static Logger logger;
	ResourceBundle rb;
	
	@BeforeClass
	public void setUp()
	
	{
		logger=Logger.getLogger("WebScrapehackthon");
	    
		rb=ResourceBundle.getBundle("config");
		String br=rb.getString("browser");
	    if(br.equals("chrome"))
		{
         //WebDriverManager.chromedriver().setup();
	
		driver=new ChromeDriver();
		}
	    if(br.equals("firefox"))
		{
	    	
		driver=new FirefoxDriver();
		}
	    if(br.equals("ie"))
		{	    		
		driver=new EdgeDriver();
		}
	    driver.get(rb.getString("URL"));
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   // WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	    		
	}
	@AfterClass
	public void tearDown()
	{
		
		driver.quit();
		
	}
	public void captureScreen(WebDriver driver,String testname) throws IOException
	{
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshot/"+testname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("screenshot taken");
	}
	
	
	 public void selectOptionFromSortLit(By options, String text) {
	        List<WebElement> allOptions = driver.findElements(options);
	        String option;
	        for (int i = 1; i < allOptions.size(); i++) {
	            option = allOptions.get(i).getText();
	            if (option.equals(text)) {
	                allOptions.get(i).click();
	                break;
	            }
	        }
	    }

	    public void selectOptionFromSortLit1(By options, String text) {
	        List<WebElement> allOptions = driver.findElements(options);
	        String option;
	        for (int i = 1; i<allOptions.size(); i++) {
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



	        public void selectOptionByText (WebElement element, String option)
	        {
	            Select dropDown = new Select(element);
	            dropDown.selectByVisibleText(option);

	        }
	        public void explict_Wait(WebElement element)
	    	{
	    		wait.until(ExpectedConditions.elementToBeClickable(element));
	    		
	    	}


}
