package bytemare.tests;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import bytemare.utils.ConfigurationReader;
import bytemare.utils.TestBase;
public class FillingForm extends TestBase {
	
	 
	
	@Test
	public void ApplicationTest1() {
	
		
	    WebDriver driver = new ChromeDriver();
	
		driver.get(ConfigurationReader.getProperty("url"));       
	    try
        {   
             ArrayList<Customer> testDataList = new DataBase().getData();

             for(Customer testData : testDataList) {
               
                    	 
            	 driver.findElement(By.id("comp-k29n3ahiinput")).clear();
                driver.findElement(By.id("comp-k29n3ahiinput")).sendKeys(testData.getFirstName());
                driver.findElement(By.id("comp-k29n3ahqinput")).clear();
                driver.findElement(By.id("comp-k29n3ahqinput")).sendKeys(testData.getLastName());  
                driver.findElement(By.id("comp-k29n3ahwinput")).clear();
                driver.findElement(By.id("comp-k29n3ahwinput")).sendKeys(testData.getPhoneNumber());
                driver.findElement(By.id("comp-k29n3ailinput")).clear();
                driver.findElement(By.id("comp-k29n3ailinput")).sendKeys(testData.getEmail());       
                driver.findElement(By.id("comp-k2dsdffqinput")).clear();
                driver.findElement(By.id("comp-k2dsdffqinput")).sendKeys("09-09-2025");
                driver.findElement(By.id("comp-k2l4dhm9input")).clear();
                driver.findElement(By.id("comp-k2l4dhm9input")).sendKeys(testData.getSsn());
             WebElement Continue = driver.findElement((By.id("comp-k29n3aitlink")));
             Continue.click();
       
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {           
            driver.quit();          
        }
    }

	}
