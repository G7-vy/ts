package exp12;


	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	
	import org.openqa.selenium.chrome.ChromeDriver;
	//import org.testng.annotations.Test;
	public class exp12a {
		public static void main(String[] args) throws InterruptedException {
	System.setProperty ("webdriver.chrome.driver","E:\\ECLIPSESW\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES) ;
		String eTitle = "NEXT PAGE";
		String aTitle = "" ;
		
		driver.get("file:///E:/page2.html" );

		driver.manage().window().maximize() ;
		//get the actual value of the title
		aTitle = driver.getTitle();
		
		if (aTitle.equals(eTitle))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
		}
		//close browser
		driver.close();
	}
	}

