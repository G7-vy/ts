package exp9;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class exp9 {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","E:\\ECLIPSESW\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("E:/page3.html");
		
		List<WebElement> links=driver.findElements(By.xpath("//img"));
		int linkCount = links.size();
		
		
		System.out.println("Total number of image count on webpage="+ linkCount);
		
		List<WebElement> links1=driver.findElements(By.xpath("//ol"));
		int linkCount1 = links1.size();
		System.out.println("Total number of orderlist count on webpage="+ linkCount1);
		
		List<WebElement> allElements= driver.findElements(By.xpath("//*"));
		int elementsCount=allElements.size();
		
		
		
		System.out.println("Total number of count on webpage="+ elementsCount);
	}
}


