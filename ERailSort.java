package week3.day2.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ERailSort {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	
			
//		Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		Launch the URL - https://erail.in/
		driver.get("https://erail.in/");
		
//		Uncheck the check box - sort on date
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
//		clear and type in the source station 
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("Mgr Chennai Ctr",Keys.ENTER);	

//		clear and type in the destination station
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("Ksr Bengaluru",Keys.ENTER);
		Thread.sleep(2000);
		
//		Find all the train names using xpath and store it in a list
		List<WebElement> trainNameList = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]"));
		System.out.println("Before Sorting.......");
		for (WebElement webElement : trainNameList) {
			String text = webElement.getText();
			System.out.println(text);
		}
				
//Convert the WebElement list to ArrayList
		
		System.out.println("After Sorting.......");
		List<String> trainNameList1 = new ArrayList<String>();
		
		for (WebElement webElement : trainNameList) {
			trainNameList1.addAll(Arrays.asList(webElement.getText()));
		}
		
//		Use Java Collections sort to sort it and then print it
		Collections.sort(trainNameList1);
		System.out.println(trainNameList1);
				
		
		

	}

}
