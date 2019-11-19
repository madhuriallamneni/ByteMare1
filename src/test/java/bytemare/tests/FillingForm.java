package bytemare.tests;



import java.util.ArrayList;

import org.openqa.selenium.By;

import org.testng.annotations.Test;
import bytemare.utils.ConfigurationReader;
import bytemare.utils.TestBase;
public class FillingForm extends TestBase {
	
	 Customer c=new Customer();
	
	@Test
	public void ApplicationTest1() {
	
		driver.get(ConfigurationReader.getProperty("url"));  
		
		
	    try
        {   
            ArrayList<Customer> testDataList = new DataBase().getData();
            

          for(Customer testData : testDataList) {
        	        	 
         	
                driver.findElement(By.id("comp-k29n3ahiinput")).sendKeys(testData.getFirstName());
           		
                driver.findElement(By.id("comp-k29n3ahqinput")).sendKeys(testData.getLastName());  
           		
                driver.findElement(By.id("comp-k29n3ahwinput")).sendKeys(testData.getPhoneNumber());
           		
                driver.findElement(By.id("comp-k29n3ailinput")).sendKeys(testData.getEmail());  
           		
                driver.findElement(By.id("comp-k2dsdffqinput")).sendKeys(testData.getDob());
           		
                driver.findElement(By.id("comp-k2mm505binput")).sendKeys(testData.getSsn());
                              
               
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

	
   

	
	
