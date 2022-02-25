package exp10;
import org.openqa.selenium.chrome.ChromeDriver;

public class exp10 {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","E:\\ECLIPSESW\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///E:/page2.html");
		driver.manage().window().maximize();
		String str=driver.getTitle();
		String str1=driver.getCurrentUrl();
		System.out.println("The Title of webpage is "+ str+" ");
		

		if(str.equals("NEXT PAGE"))
			System.out.println(true);
		else
			System.out.println(false);
		
		System.out.println("The link of webpage is "+ str1+" ");
		
		if(str1.equals("file:///E:/page2.html"))
			System.out.println(true);
		else
			System.out.println(false);
			
	}

}
