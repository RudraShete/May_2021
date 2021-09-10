import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo {
//18-08-2021
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","E:\\DeepJyot Creators\\SMP\\IT\\Software Testing\\Utkarsha May 2021\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.navigate().to("https://www.demoqa.com/alerts");
		//driver.manage().window().maximize();	
		
		WebElement AlertButton=driver.findElement(By.xpath("//button[@id='alertButton']"));
		AlertButton.click();
		driver.switchTo().alert().accept();
		
		//Thread.sleep(3000);// No need to use but to understand the selenium working it is used
		
		WebElement TimerAlert=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		TimerAlert.click();
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		
		//Thread.sleep(3000);// No need to use but to understand the selenium working it is used
		
		WebElement ConfirmButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		ConfirmButton.click();
		String alertmessage=driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		driver.switchTo().alert().accept();
		
		//Thread.sleep(3000);// No need to use but to understand the selenium working it is used
		
		driver.findElement(By.xpath("//img[@title='Ad.Plus Advertising']")).click();
		
		WebElement PromptAlert=driver.findElement(By.xpath("//button[@id='promtButton']"));
		PromptAlert.click();
		driver.switchTo().alert().sendKeys("Rudra");
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);// No need to use but to understand the selenium working it is used
		
		//driver.navigate().to("https://www.demoqa.com/frames");
		driver.get("https://www.demoqa.com/frames");
		
		WebElement Frame1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(Frame1);
		//driver.switchTo().frame(1);
		//driver.switchTo().frame("frame1");
		
		String mesage=driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		System.out.println(mesage);
		
		//driver.close();
		
		
	}

}
