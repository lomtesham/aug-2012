package part1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_action2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lomte Sir\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
	    
	    
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    Actions actions=new Actions(driver);
	    
	    WebElement source=driver.findElement(By.xpath("//a[text()= ' BANK '] "));
	    WebElement target=driver.findElement(By.xpath("//li[@class='placeholder']"));
	    actions.dragAndDrop(source, target).build().perform();
	    WebElement source1=driver.findElement(By.xpath("//a[text()= ' 5000']"));
	    WebElement target1=driver.findElement(By.xpath("//ol[@id='amt7']"));
	    
	    actions.dragAndDrop(source1, target1).build().perform();
	}

}
