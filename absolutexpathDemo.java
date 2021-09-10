import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class absolutexpathDemo {
//03-08-2021
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	//XA0634 --- 1234567	//IG5760 --- Vdf@1234

		System.setProperty("webdriver.chrome.driver","E:\\DeepJyot Creators\\SMP\\IT\\Software Testing\\Utkarsha May 2021\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();

	//Xpath locator -- using FULL Xpath	
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/ul/li[11]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		
		Thread.sleep(3000);
		driver.close();
	}
}	
		







/*	
  
 
		//09-08-2021 ----- Xpath Locator
	//using Child::	axis

		driver.get("https://www.demoqa.com/text-box");
		driver.findElement(By.xpath("//label[@id='userName-label']//ancestor::div[2]//following::input[1]")).sendKeys("Rudra");
		driver.findElement(By.xpath("//div[@id='userEmail-wrapper']//child::input")).sendKeys("Rudra_shete@rediffmail.com");
		driver.findElement(By.xpath("//div[@id='currentAddress-wrapper']//child::textarea")).sendKeys("Pune");
		
	//using descendant::	axis
		driver.findElement(By.xpath("//div[@id='permanentAddress-wrapper']//descendant::textarea")).sendKeys("Pune");
		
	// 07-08-2021 ----- Xpath Locator
	//using following::
	
/*		driver.get("https://www.google.com");	
		driver.navigate().to("https://kite.zerodha.com/");
		driver.findElement(By.xpath("//div[@id='outer-base']//following::input[1]")).sendKeys("XA0634"); 
		driver.findElement(By.xpath("//div[@id='outer-base']//following::input[2]")).sendKeys("1234567");
		driver.findElement(By.xpath("//div[@id='outer-base']//following::button")).click();
	
		driver.get("https://www.demoqa.com/tool-tips/");
		WebElement Contrary=driver.findElement(By.xpath("//a[text()='Contrary']"));

		Actions act=new Actions(driver);
		act.moveToElement(Contrary).build().perform();
		
		WebElement ContraryText=driver.findElement(By.xpath("//div[@id='contraryTexToolTip']"));
		System.out.println(ContraryText.getText());
*/
/*	//ancestor-Locates the ancestors of the current node, that includes parents upto root node.
		driver.get("https://Facebook.com");			//driver.get("https://www.google.com");	
		System.out.println("	Browser Opened for Facebook/zerodha Website");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9764046959");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123467");
		driver.findElement(By.xpath("//button[@type='submit']")).click();//
		//driver.navigate().back();
	    Thread.sleep(2000);
		driver.get("https://www.demoqa.com/text-box");
		driver.findElement(By.xpath("//label[@id='userName-label']//ancestor::div[2]//following::input[1]")).sendKeys("Rudra");
		driver.findElement(By.xpath("//div[@id='userEmail-wrapper']//child::input")).sendKeys("Rudra_shete@rediffmail.com");
		driver.findElement(By.xpath("//div[@id='currentAddress-wrapper']//child::textarea")).sendKeys("Pune");
*/		
/*		driver.get("https://kite.zerodha.com");		//				driver.get("https://Facebook.com");			//driver.get("https://www.google.com");	
		System.out.println("	Browser Opened for Facebook/zerodha Website");
		
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("IG57605");//IG5760 or XA0634
		driver.findElement(By.xpath("//div[@id='container']//following::input[1]")).sendKeys("IG57605");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Vdf@1234");//Vdf@1234 or 1234567
		driver.findElement(By.xpath("//div[@id='container']//following::input[2]")).sendKeys("Vdf@1234");//Vdf@1234 or 1234567
		driver.findElement(By.xpath("//button[@type='submit']")).click();//
		//driver.navigate().back();
		//driver.findElement(By.xpath("//input[@placeholder='PIN']")).sendKeys("291990");//291990 or
		//driver.findElement(By.xpath("//button[@type='submit']")).click();//		
		
	//using axes methods(following::input) used to find complex or dynamic elements
		//driver.findElement(By.xpath("//a[@title='English (UK)']")).click();
		//driver.findElement(By.name("email")).click();
		//driver.findElement(By.xpath("//form[@class='_9vtf']//following::input[2]")).sendKeys("9764046959");
		//driver.findElement(By.xpath("//form[@class='_9vtf']//following::input[3]")).sendKeys("123456");
		//driver.findElement(By.xpath("//button[(text()='Log In')]")).click();	
*/		
/*		//using starts with and text
		driver.findElement(By.xpath("//a[@title='English (UK)']")).click();
		driver.findElement(By.name("email")).click();
		driver.findElement(By.xpath("//input[starts-with(@id,'ema')]")).sendKeys("9764046959");
		driver.findElement(By.xpath("//input[starts-with(@id,'pass')]")).sendKeys("123456");
		driver.findElement(By.xpath("//button[(text()='Log In')]")).click();
*/		
		
/*	//using input start- with 	
		driver.findElement(By.xpath("//a[@title='English (UK)']")).click();
		driver.findElement(By.name("email")).click();
		driver.findElement(By.xpath("//input[starts-with(@id,'ema')]")).sendKeys("9764046959");
		driver.findElement(By.xpath("//input[starts-with(@id,'pass')]")).sendKeys("123456");
		driver.findElement(By.xpath("//button[starts-with(@id,'u_0_d_')]")).click();
*/
		
/*	//Using contains 'and'  'or' word 	
		driver.findElement(By.xpath("//a[@title='English (UK)']")).click();
		driver.findElement(By.name("email")).click();
		driver.findElement(By.xpath("//input[contains(@class,'inputtext ') or name='email' ]")).sendKeys("9764046959");
		//driver.findElement(By.xpath("//input[contains(@data-testid,'email')]")).sendKeys("9764046959");
		//driver.findElement(By.xpath("//input[contains(@data-testid,'pass')]")).sendKeys("123456");
		driver.findElement(By.xpath("//input[contains(@data-testid,'pass')]")).sendKeys("123456");
		driver.findElement(By.xpath("//button[contains(@class,'selected ')]")).click();		
		*/


		
/*	//Contains word in locator
		driver.findElement(By.xpath("//a[@title='English (UK)']")).click();
		driver.findElement(By.name("email")).click();
		driver.findElement(By.xpath("//input[contains(@data-testid,'email')]")).sendKeys("9764046959");
		//driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("9764046959");
		driver.findElement(By.xpath("//input[contains(@data-testid,'pass')]")).sendKeys("123456");
		driver.findElement(By.xpath("//button[contains(@class,'selected ')]")).click();		*/
		
		
/*	//Relative xpath	
		driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		
		driver.findElement(By.xpath("//a[@title='English (UK)']")).click();
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("9764046959");
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("123456");
		
		
		WebElement heading=driver.findElement(By.xpath("//h2[@class='_8eso']"));
		
		System.out.print(heading.getText());
		
		WebElement CreateNew = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		
		System.out.println(CreateNew.getText());
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//driver.close();		
*/	