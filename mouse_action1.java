package part1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_action1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lomte Sir\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.navigate().to("https://www.facebook.com/");
	    
	    
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    Actions actions=new Actions(driver);
	    
	    WebElement face=driver.findElement(By.xpath("//span[text()= ' Facebook © 2021']"));
	    
	    actions.moveToElement(face).build().perform();
	    
	}

}
