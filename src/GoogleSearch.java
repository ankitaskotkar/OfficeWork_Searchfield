import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akotkar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@class,'gLFyf')]")).sendKeys("java");
		
		Thread.sleep(3000);
	
		List<WebElement> element =driver.findElements(By.xpath("//ul[@class='erkvQe']//li//descendant::div[@class='sbl1']"));
		
		System.out.println(element.size());
		
		for(int i=0;i<element.size();i++) {
			System.out.println(element.get(i).getText());
			if(element.get(i).getText().contains("javascript")) {
				element.get(i).click();
				System.out.println("clicked");
				break;
			}
				
		}
		
		
	
		
	}

}
