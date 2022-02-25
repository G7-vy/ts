package exp12;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class exp12b {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty ("webdriver.chrome.driver","E:\\ECLIPSESW\\chromedriver_win32\\chromedriver.exe" );
	ChromeDriver driver = new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver, 10);
	String eTitle = "LOGIN";
	String aTitle = "" ;
	// launch Chrome and redirect it to the Base URL
	driver.get("file:///E:/page1.html" );
	//Maximizes the browser window
	driver.manage().window().maximize() ;
	//get the actual value of the title
	aTitle = driver.getTitle();
	//compare the actual title with the expected title
	if (aTitle.contentEquals(eTitle))
	{
	System.out.println( "Test Passed") ;
	}
	else {
	System.out.println( "Test Failed" );
	}
	//driver.close();
	WebElement submit=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//button")));
	submit.click();
	
	}
	
}
