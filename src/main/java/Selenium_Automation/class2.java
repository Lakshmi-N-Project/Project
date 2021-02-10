package Selenium_Automation;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.*;

public class class2 {

	private static final String TimeSpan = null;

	public static void main(String[] args) throws IOException, InterruptedException  {
		
		final String DISABLE_XSS_AUDITOR = "--disable-web-security";
		List<String> chromeSwitches = new ArrayList<String>();
        chromeSwitches.add(DISABLE_XSS_AUDITOR);
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments(chromeSwitches);
                      
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\n.sushanth\\Desktop\\Chromedriver_download\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://myavtar.com/betatest/home");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jobmenu")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("REGISTER TODAY")).click();
				
		Thread.sleep(5000);
		driver.findElement(By.name("name")).sendKeys("Lakshmi");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys("nlakshmi1886@gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("mobile")).sendKeys("9840578068");
		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		
		Select drpcountry = new Select(driver.findElement(By.xpath("//select[@id='country']")));
		Select drpstate =new Select(driver.findElement(By.xpath("//select[@id='state']")));
		Select drpcity=new Select(driver.findElement(By.xpath("//select[@id='city_id']")));
		
		drpcountry.selectByIndex(101);
					
		System.out.println("Selected Country :" + drpcountry.getFirstSelectedOption().getText());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		drpstate.selectByVisibleText("Tamil Nadu");
			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);					
		
		drpcity.selectByVisibleText("Chennai");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.className("checkmark")).click();
		
		driver.findElement(By.className("attach-label")).click();
		
					
		 Runtime.getRuntime().exec("C:\\Users\\n.sushanth\\Desktop\\Projects\\AutoIT\\r8.exe");
		
		
		 wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//label[@id='tyfilename']"), "Avtar_Resume.pdf"));
		 driver.findElement(By.id("step1")).click();
		
		Select jt=new Select(driver.findElement(By.xpath("//select[@id='jobtype']")));
		jt.selectByVisibleText("Full Time");
		Thread.sleep(2000);
		
		Select av=new Select(driver.findElement(By.xpath("//select[@id='availability']")));
		av.selectByVisibleText("30 Days");
		Thread.sleep(2000);
		
		Select gen=new Select(driver.findElement(By.xpath("//select[@id='gender']")));
		gen.selectByVisibleText("Female");		
		Thread.sleep(2000);
	
		
		WebDriverWait wait1 = new WebDriverWait(driver,30);
		
		driver.findElement(By.xpath("//*[@id='company']/div[4]/div/span/div/button")).click();
		
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='company']/div[4]/div/span/div/ul/li[3]/a/label"))).click();
		
		driver.findElement(By.xpath("//*[@id='company']/div[4]/div/span/div/ul/li[4]/a/label")).click();
		Thread.sleep(5000);
		//driver.manage().window();
		
		WebElement a= driver.findElement(By.xpath("//*[@id=\"upldresume\"]/div/div/div[2]"));
		a.click();
		WebDriverWait wait2 = new WebDriverWait(driver,30);
		
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'showopt\']/div/span/div/button"))).click();
		WebElement dis = driver.findElement(By.xpath("//*[@id='showopt']/div/span/div/ul/li[3]/a/label"));
		dis.click();	
		driver.findElement(By.xpath("//*[@id='showveteran']/div/span/div/button")).click();
		driver.findElement(By.xpath("//*[@id='showveteran']/div/span/div/ul/li[4]/a/label")).click();
		a.click();
		
}
}