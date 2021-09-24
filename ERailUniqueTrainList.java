package week3.day2.Assignments;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


public class ERailUniqueTrainList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
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
		System.out.println("TrainNames using List: "+trainNameList.size());
		
		//add the trainName list to a Set
		Set<WebElement> trainNameList1 = new HashSet<WebElement>();
		
		for (WebElement webElement : trainNameList) {
			String text = webElement.getText();
			System.out.println(text);
			trainNameList1.add(webElement);
		}
		
		System.out.println("TrainNames using Set: "+trainNameList1.size());
		
		for (WebElement webElement : trainNameList1) {
			String text = webElement.getText();
			System.out.println(text);
			
		}
	}

}
