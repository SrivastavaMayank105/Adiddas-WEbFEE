import org.openqa.selenium.Alert;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class WebFee {
	public static void main(String[] args) throws InterruptedException {  
	      
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mayank\\Downloads\\geckodriver-v0.27.0-win64\\geckodriver.exe" );  
        
        // Initialize Gecko Driver using Desired Capabilities Class  
  DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
  capabilities.setCapability("marionette",true);  
  WebDriver driver= new FirefoxDriver(capabilities);
  driver.navigate().to("https://www.demoblaze.com/index.html");
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  List<WebElement> myElements =driver.findElements(By.id("itemc"));
  for(WebElement e : myElements) {
	  if(e.getText().equals("Laptops")) {
		  e.click();
		  Thread.sleep(5000);
		  	driver.findElement(By.xpath("//a[@href='prod.html?idp_=8']")).click();
		  	//System.out.println("clicled");
		  	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  	driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a")).click();
		  	Thread.sleep(5000);
		  	driver.switchTo().alert().accept();
		  	driver.navigate().to("https://www.demoblaze.com/index.html");
		  	
		  break;
		  }
		}
  //driver.navigate().to("https://www.demoblaze.com/index.html");
  Thread.sleep(5000);
  List<WebElement> myElements1 =driver.findElements(By.id("itemc"));
  for(WebElement f : myElements1) {
	  if(f.getText().equals("Laptops")) {
		  f.click();
		  driver.findElement(By.xpath("//a[@href='prod.html?idp_=12']")).click();
		  driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a")).click();
		  	Thread.sleep(5000);
		  	driver.switchTo().alert().accept();
		  	driver.navigate().to("https://www.demoblaze.com/cart.html");
		  	Thread.sleep(5000);
		  	break;	
	  	}
  	 }
  driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/table/tbody/tr[2]/td[4]/a")).click();
  Thread.sleep(3000);
  driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/button")).click();
  String mainWindowHandle = driver.getWindowHandle();
  //System.out.println(mainWindowHandle);
  driver.switchTo().window(mainWindowHandle);
  driver.findElement(By.id("name")).sendKeys("test"); 
  driver.findElement(By.id("country")).sendKeys("test"); 
  driver.findElement(By.id("city")).sendKeys("test"); 
  driver.findElement(By.id("card")).sendKeys("123456"); 
  driver.findElement(By.id("month")).sendKeys("1");
  driver.findElement(By.id("year")).sendKeys("2020");
  driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
  
  String mainWindowHandle1 = driver.getWindowHandle();
  //System.out.println(mainWindowHandle1);
driver.switchTo().window(mainWindowHandle1);
  WebElement PopWind=driver.findElement(By.xpath("/html/body/div[10]/p"));
	  System.out.println(PopWind.getText());
  driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
  }
}