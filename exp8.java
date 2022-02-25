package exp8;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class exp8{
public static void main(String[] args)
{
System.setProperty("webdriver.chrome.driver","E:\\ECLIPSESW\\chromedriver_win32\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
driver.get("E:/page1.html");
driver.manage().window().maximize();
driver.findElement(By.name("username")).sendKeys("mercury");
driver.findElement(By.name("password")).sendKeys("mercury");
driver.findElement(By.name("submit")).click();
}
}

