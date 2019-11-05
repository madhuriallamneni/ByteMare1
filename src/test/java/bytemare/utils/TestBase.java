package bytemare.utils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public abstract class TestBase {
	protected WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void setupMethod() {
		driver = Driver.getDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterMethod(alwaysRun = true)
	public void tearDownMethod(ITestResult result) throws IOException {
		Driver.closeDriver();
	}

}
