package week3.day2.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplementList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.ajio.com/");
		//driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("bags",Keys.ENTER);
		//driver.findElement(By.xpath("//input[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		
		String totalitems = driver.findElement(By.className("length")).getText();
		System.out.println("Total Items in Bag: "+totalitems);
		
		//Get the list of brand of the products displayed in the page and print the list.
		System.out.println(" List of Brands");
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println("Size: "+bagBrandList.size());
		
		for (WebElement webElement : bagBrandList) {
			String text = webElement.getText();
			System.out.println(text);
		}
		
		
		System.out.println(" List of Bag Names");
		List<WebElement> bagNameList = driver.findElements(By.className("name"));
		System.out.println("Size: "+bagNameList.size());
		
		for (WebElement webElement : bagNameList) {
			String text1 = webElement.getText();
			System.out.println(text1);
		}
		
		
		
		

	}

}

//Men - Fashion Bags