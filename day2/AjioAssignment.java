package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioAssignment {

	public static void main(String[] args) throws Throwable {

		System.out.println("The Automation Testing Started");

		System.out.println("Setting up the driver for chrome browser");
		        WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();

				
				System.out.println("Chrome browser started");
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//accessing the URL
				driver.get("https://www.ajio.com/");
				System.out.println("URL accessed successfully");
				
				//Search for the text
				WebElement Search = driver.findElement(By.xpath("//input[@name='searchVal']"));
				Search.sendKeys("bags\n");
				System.out.println("Entered Text Successfully");
				
				Thread.sleep(3000);
				WebElement optmen = driver.findElement(By.xpath("//label[@for='Men']"));
				optmen.click();
				System.out.println("Clicked on Men option");
				
				Thread.sleep(2000);
				//Click on Fashion Bags under category
				WebElement fBags = driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']"));
				fBags.click();
				System.out.println("Clicked on Fashion Bags Men option");
				
				Thread.sleep(2000);

				//Find total count of items
				WebElement items = driver.findElement(By.xpath("//div[@class='length']"));
				System.out.println(items.getText());
				System.out.println("Printed the Number of Items");
				
				Thread.sleep(2000);

				//display brands through List				
				List <WebElement> list = driver.findElements(By.className("brand"));
				System.out.println("Total Number of brands: "+list.size());
				
				System.out.println("****************Brands List******************");
				
				for (WebElement webElement : list) {
					String text = webElement.getText();
					System.out.println(text);
					
				}
				
				Thread.sleep(2000);
				
				//Get the list of bags name
				List <WebElement> list1 = driver.findElements(By.className("nameCls"));
				System.out.println("Total Number of bags : "+list1.size());
				System.out.println("*******************Bags List************************");
				
				for (WebElement webElement : list1) {
					String text = webElement.getText();
					System.out.println(text);
				}

	}

}
