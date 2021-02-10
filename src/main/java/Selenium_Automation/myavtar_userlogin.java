package Selenium_Automation;

import java.util.ArrayList;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class myavtar_userlogin {

	public static void main(String[] args) throws InterruptedException {
		
		final String DISABLE_XSS_AUDITOR = "--disable-web-security";
		List<String> chromeSwitches = new ArrayList<String>();
        chromeSwitches.add(DISABLE_XSS_AUDITOR);
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments(chromeSwitches);
        
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\n.sushanth\\Desktop\\Chromedriver_download\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://myavtar.com/betatest/home");
		
		
		driver.findElement(By.className("jobmenu")).click();
		

		driver.findElement(By.id("uname")).sendKeys("saravansivan@gmail.com");
		
		driver.findElement(By.id("upass")).sendKeys("Administration");
		
		driver.findElement(By.xpath("//button[@id='loginpop']")).click();
		driver.findElement(By.xpath("//img[@class='icon_profile']")).click();
		
		driver.findElement(By.linkText("Applied Jobs")).click();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(3000);
		driver.navigate().back();
		
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		//action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
			
		driver.findElement(By.xpath("//input[@class='fstQueryInput fstQueryInputExpanded']")).click();
		WebElement dropdown = driver.findElement(By.xpath("//input[@class='fstQueryInput fstQueryInputExpanded']"));
		dropdown.sendKeys("JAVA");
		
		List<WebElement> dpListValues = dropdown.findElements(By.xpath("//span[@class='fstResultItem']"));
		for (int i=0; i<dpListValues.size();i++)
		 {
		  if ((dpListValues.get(i).getText()).equals("JAVA ARCHITECT") || (dpListValues.get(i).getText()).equals("CORE JAVA") || (dpListValues.get(i).getText()).equals("ADVANCE JAVA"))
		    {
		        dpListValues.get(i).click();
		       
		    	        
		    }
		 }
		
/* dropdown.sendKeys(".NET");
Thread.sleep(3000);
		
		//* dpListValues = dropdown.findElements(By.xpath("//span[@class='fstResultItem']"));
		for (int i=0; i<dpListValues.size();i++)
		 {
		  if ((dpListValues.get(i).getText()).equals(".NET CORE"))
		    {
		        dpListValues.get(i).click();
		        
		    		        
		    }
		 } */
		//action.sendKeys(Keys.PAGE_UP).build().perform();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[3]")).click();
		//action.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//*[@id='jobsearchhome']/div[2]/div/div[1]/input']")).click();
		WebElement loc = driver.findElement(By.xpath("//*[@id='jobsearchhome']/div[2]/div/div[1]/input']"));
		
		loc.sendKeys("CHENNAI");
		loc.click();
		//*[@id="jobsearchhome"]/div[2]/div/div[2]/span[1]
		List<WebElement> dpListValues1 = loc.findElements(By.xpath("//*[@id='jobsearchhome']/div[2]/div/div[2]/span[1]"));
		for (int j=0; j<dpListValues1.size();j++)
		 {
		  if ((dpListValues1.get(j).getText()).equals("CHENNAI"));
		    {
		    	Thread.sleep(3000);
		    	dpListValues1.get(j).click();
		        Thread.sleep(3000);
		    		        
		    }
		 }
		
		Thread.sleep(5000);
		driver.findElement(By.id("homesearchsubmit")).click();
			//driver.findElement(By.xpath("//p[text()='Test Inc' and 'Receptionist']")).click();
			
			//driver.findElement(By.className("applynow")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("answer1")).sendKeys("i would do the best");
			driver.findElement(By.id("answerjob1")).sendKeys("i would do the best");
			
			Select resume = new Select(driver.findElement(By.xpath("//select[@name='resumeid']")));
			Thread.sleep(2000);
			resume.selectByIndex(1);
			driver.findElement(By.xpath("//input[@name='loginsubmit']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@class='close']")).click();
			driver.findElement(By.xpath("//img[@class='icon_profile']")).click();
			driver.findElement(By.linkText("Applied Jobs")).click();
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//img[@class='icon_profile']")).click();
			driver.findElement(By.linkText("Logout")).click();
				
	}

}

