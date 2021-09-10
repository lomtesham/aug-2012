package part1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lomte Sir\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.navigate().to("https://demoqa.com/buttons");
	    
	    
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    
	    Actions actions=new Actions(driver);
	    //click actions
	    WebElement Doubleclick=driver.findElement(By.cssSelector("button[id='doubleClickBtn']"));
	    actions.doubleClick(Doubleclick).perform();
	    WebElement Rightclick=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
	    actions.contextClick(Rightclick).perform();
	    WebElement click=driver.findElement(By.xpath("//button[text()='Click Me']"));
	    actions.click(click).perform();
	    

	}

}
