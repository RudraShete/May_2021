import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {
//02-08-2021
	//cssSelector Locator
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//call of web interface - chrome
		System.setProperty("webdriver.chrome.driver","E:\\DeepJyot Creators\\SMP\\IT\\Software Testing\\Utkarsha May 2021\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		
	//Creating object of class WebDriver according to web interface
		WebDriver driver=new ChromeDriver();
			
	//launching of web interface	
		driver.get("https://www.facebook.com");
			
	//Wait method		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

/*	//cssselector using tagname#id(hash symbol inbetween) or only #id(start with hash symbol)
		driver.findElement(By.cssSelector("input#email")).sendKeys("9764046959");
		//or -- Here above input is tagname and email is id value
	//	driver.findElement(By.cssSelector("#email")).sendKeys("9764046959");
	//	driver.findElement(By.cssSelector("input#pass")).sendKeys("9764046959");
		//or -- Here above input is tagname and pass is id value
		driver.findElement(By.cssSelector("#pass")).sendKeys("9764046959");
*/		
/*	//cssselector using tagname.classname(dot symbol inbetween) or only .classname(start with dot symbol)
	//	driver.findElement(By.cssSelector("input.inputtext._55r1._6luy")).sendKeys("9764046959");
		//or -- Here above input is tagname and remaining is classname 
		driver.findElement(By.cssSelector(".inputtext._55r1._6luy")).sendKeys("9764046959");
		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("9764046959");
		//or -- Here above input is tagname and remaining is classname 
		driver.findElement(By.cssSelector(".inputtext._55r1._6luy._9npi")).sendKeys("9764046959");
	//	driver.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy")).click();
		//or -- Here above button is tagname and remaining is classname
		driver.findElement(By.cssSelector("._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy")).click();
*/		
/*	//cssselector using tagname[attribute='attribute name']
			driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("9764046959");
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("9764046959");
	//or	driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("9764046959"); //-- not working need to check
			driver.findElement(By.cssSelector("button[type='submit']")).click();
*/			
/*	//cssselector using combination of tagname+classname+attribute
			driver.findElement(By.cssSelector("input.inputtext._55r1._6luy[type='text']")).sendKeys("9764046959");
	//or	driver.findElement(By.cssSelector("input.inputtext._55r1._6luy[placeholder='Email address or phone number']"")).sendKeys("9764046959"); //-- not working need to check
			driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi[name='pass']")).sendKeys("9764046959");
			driver.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy[data-testid='royal_login_button']")).click();	
*/
/*	//cssselector using traverse path from parent tag to child tag plus attribute combination
			driver.findElement(By.cssSelector("div>input[type='text']")).sendKeys("9764046959");
			driver.findElement(By.cssSelector("div>input[name='pass']")).sendKeys("9764046959");
			driver.findElement(By.cssSelector("div>button[type='submit']")).click();		
*/			
	//cssselector using sub-string
		//cssselector using STARTING sub-string(CARROT symbol)
			driver.findElement(By.cssSelector("div>input[type^='te']")).sendKeys("9764046959"); 
		//cssselector using ENDING sub-string(DOLLAR symbol)	
			driver.findElement(By.cssSelector("div>input[type$='word']")).sendKeys("9764046959");
		//cssselector using INTERMEDIATE sub-string(STAR symbol)	
			driver.findElement(By.cssSelector("div>button[type*='ubmi']")).click();				
				
		
/*	//id - Locator
		System.out.println();
		System.out.println("id -- locator");
		System.out.println(" .name, .id, .classname, .linkText, .partialLinkText -- are similar syntax locator");
		System.out.println(" .name, .id, .classname, .linkText, .partialLinkText -- are applicable as per browser developer usage");
		System.out.println();
		driver.findElement(By.id("email")).click();
		System.out.println("By click Cursor is in Login Edit box");
		
		driver.findElement(By.id("email")).sendKeys("9423111564");
		System.out.println("Login Credential provided");
		
		driver.findElement(By.id("pass")).click();
		System.out.println("By click Cursor is in Password Edit box");
		
		driver.findElement(By.id("pass")).sendKeys("12345678");
		System.out.println("Password Credentials provided");
		
		driver.findElement(By.name("login")).click();
		System.out.println("Click on Login Button- Using name locator, Id locator is not applicable here");		*/			

		
/*	//name - Locator	
 		System.out.println();
 		System.out.println("name -- locator");
 		System.out.println(" .name, .id, .classname, .linkText, .partialLinkText -- are similar syntax locator");
		System.out.println(" .name, .id, .classname, .linkText, .partialLinkText -- are applicable as per browser developer usage");
		System.out.println();
 		
		driver.findElement(By.name("email")).click();
		System.out.println("By click Cursor is in Login Edit box");
		
		driver.findElement(By.name("email")).sendKeys("9423111564");
		System.out.println("Login Credential provided");
		
		driver.findElement(By.name("pass")).click();
		System.out.println("By click Cursor is in Password Edit box");
		
		driver.findElement(By.name("pass")).sendKeys("12345678");
		System.out.println("Password Credentials provided");
		
		driver.findElement(By.name("login")).click();
		System.out.println("Click on Login Button");	*/
		
	//Use 'refresh' navigators	
//		driver.navigate().refresh();
//		System.out.println("	Page Refreshed");
//		System.out.println();
		
//		driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).click();
//		System.out.println("	Gmail link Utilized");
//		System.out.println();
		
	//Use 'back' navigators	
//		driver.navigate().back();
//		System.out.println("	Back to main page using Backward arrow");
//		System.out.println();
	
	//Use 'forward' navigators	
//		driver.navigate().forward();
//		System.out.println("	Back to main page using Backward arrow");
//		System.out.println();
		
		
//		driver.findElement(By.xpath("/html/body/div/header/div/div/ul/li[2]/a")).click();
//		System.out.println("	Sign In link Utilized");
//		System.out.println();		
		
	//	driver.findElement(By.name("))
		
		//Thread sleep(10000);
		//driver.close();
		//System.out.println("	Browser closed");		
		
//		driver.get("https:www.zoom.com");
//		driver.quit();
//		System.out.println("	Browser closed");
		
//		System.setProperty("webdriver.chrome.driver","E:\\DeepJyot Creators\\SMP\\IT\\Software Testing\\Utkarsha May 2021\\Jar Files\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//		driver.get("https://Facebook.com");
//		driver.manage().window().maximize();
		
	//Locator tagname
		
		//List <WebElement> links = driver.findElements(By.tagName("a"));
		//List <WebElement> paths = driver.findElements(By.tagName("img"));
		//System.out.println("links a ="+links.size());
		//System.out.println("paths img ="+paths.size());	

	//tagname# value of id syntax like input in tagname#
		
//		driver.findElement(By.cssSelector("input#login1")).sendKeys("Rudra_shete");
		//driver.findElement(By.cssSelector("input#password")).sendKeys("Activa@3315");
		
	//css selector with class name using operator dot(.) 			
//		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy")).sendKeys("9423111564");
//		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("1234567");
//		driver.findElement(By.cssSelector("input._42ft._4jy0._6lth._4jy6._4jy1. selected._51sy")).click();
		
	//css selector with other tagname classname and attribute 	
//		driver.findElement(By.cssSelector("input.inputtext._55r1[name='email']")).sendKeys("9423111564");
//		driver.findElement(By.cssSelector("input.inputtext._55r1[name='email']")).sendKeys("1234567");
//				driver.close();				
	}

}
