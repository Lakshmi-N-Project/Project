package Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\n.sushanth\\Desktop\\Chromedriver_download\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://shajiskalari.com/indepenn/");
driver.manage().window().setSize(new Dimension(360,740));

//driver.manage().window().maximize();
//driver.findElement(By.id("slider-2-slide-3-layer-5")).click();
//driver.findElement(By.name("xoo_el_reg_email")).sendKeys("abc123");
//driver.findElement(By.name("xoo_el_reg_fname")).sendKeys("madan");
//driver.findElement(By.name("xoo_el_reg_lname")).sendKeys("middle");

driver.findElement(By.className("navbar-toggler")).click();
 
driver.findElement(By.linkText("About Us")).click();
driver.findElement(By.className("navbar-toggler")).click();
driver.findElement(By.linkText("Services")).click();
driver.findElement(By.linkText("iFORshe")).click();
driver.findElement(By.linkText("Contact")).click();
driver.findElement(By.linkText("Home")).click();

driver.quit();

//driver.findElement(By.name("xoo_el_reg_terms")).click();
//driver.findElement(By.className("button btn xoo-el-action-btn xoo-el-register-btn")).click();
}
}