package exp11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class exp11 {

    public static void main(String[] args) throws InterruptedException {
    	
    	//pgm 11_Write a test program to demonstrate selecting and deselecting option from multi select dropdown

        //Creating instance of Chrome driver
    	System.setProperty("webdriver.chrome.driver", "E:\\ECLIPSESW\\chromedriver_win32\\chromedriver.exe");
	             ChromeDriver driver = new ChromeDriver();

        // Navigate to the URL
        driver.get("file:///E:/cars.html");

        //Maximizing window
        driver.manage().window().maximize();

        //Selecting the multi-select element by locating its id
        Select select = new Select(driver.findElement(By.name("cars")));

        //Get the list of all the options
        System.out.println("The dropdown options are -");

        List<WebElement> options = select.getOptions();

        for(WebElement element: options)
            System.out.println(element.getText());

        //Using isMultiple() method to verify if the element is multi-select, if yes go onto next steps else eit
        if(select.isMultiple()){

            //Selecting option as 'Opel'-- ByIndex
            System.out.println("Select option Opel by Index");
            select.selectByIndex(2);
            Thread.sleep(10000);

            //Selecting the option as 'Saab'-- ByValue
            System.out.println("Select option saab by Value");
            select.selectByValue("saab");
            Thread.sleep(10000);

            // Selecting the option by text
            System.out.println("Select option Audi by Text");
            select.selectByVisibleText("Audi");
            Thread.sleep(10000);

            //Get the list of selected options
            System.out.println("The selected values in the dropdown options are -");

            List<WebElement> selectedOptions = select.getAllSelectedOptions();

            for(WebElement element: selectedOptions)
                System.out.println(element.getText());


            // Deselect the value "Audi" by Index
            System.out.println("DeSelect option Audi by Index");
            select.deselectByIndex(3);
            Thread.sleep(10000);

            //Deselect the value "Opel" by visible text
            System.out.println("Select option Opel by Text");
            select.deselectByVisibleText("Opel");
            Thread.sleep(10000);

            //Validate that both the values are deselected
            System.out.println("The selected values after deselect in the dropdown options are -");
            List<WebElement> selectedOptionsAfterDeselect = select.getAllSelectedOptions();

            for(WebElement element: selectedOptionsAfterDeselect)
                System.out.println(element.getText());

            //Step#8- Deselect all values
            select.deselectAll();
        }

    }

}