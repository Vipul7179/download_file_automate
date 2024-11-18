package automate_download_file;

import java.time.Duration;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baselibrary {
	public static void main(String[] args) throws InterruptedException {

		
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://mdm.sbpdclinfra.in/SSO/LoginPage");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.findElement(By.xpath("//input[@id=\"tne\"]")).sendKeys("Con_amr_Buxar");
		 driver.findElement(By.xpath("//input[@id=\"tpw\"]")).sendKeys("Test@123");
		 driver.findElement(By.xpath("//a[@id=\"BtnSubmit\"]")).click();
//		 After login events start
		 
		 driver.findElement(By.xpath("//a[@id=\"ContentPlaceHolder1_authsub_MRPage\"]")).click();

//		 Tab switch
		 java.util.Set<String> windowIds = driver.getWindowHandles();
	        Iterator<String> totalWindowIds = windowIds.iterator();
	        String parentId=totalWindowIds.next();
	        String childId=totalWindowIds.next();
	        driver.switchTo().window(childId);

//	        Select Hierarchy dropdown option
//	        driver.findElement(By.xpath("//span[text()='Subdivision']")).click();
//	        driver.findElement(By.xpath("//ul//li[text()='Section']")).click();


//	        Select Office Name dropdown option
	        Thread.sleep(6000);
	        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_authsub_ddlOfficeName_chosen\"]/a")).click();

	        driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]")).click();
	        
 
	        Thread.sleep(3000);
	        WebElement totalSmartMetersInstalled = driver.findElement(By.id("ContentPlaceHolder1_authsub_dlMenu_ImageButton1_9"));
	        totalSmartMetersInstalled.click();
//
	        Thread.sleep(3000);      
	        WebElement divElement = driver.findElement(By.cssSelector("div.col-md-12.m-b-1.text-center"));

	        // Scroll into view using JavaScript Executor
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", divElement);
	        
//	        click on download button
	        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_authsub_imgBtnXL\"]")).click();
	        driver.navigate().back();
	        
//	        official name dumaro
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_authsub_ddlOfficeName_chosen\"]/a")).click();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ContentPlaceHolder1_authsub_ddlOfficeName_chosen\"]/div/ul/li[2]")));
	        dropdown.click();
	        
	        
//	        click on view button
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_authsub_btnView\"]")).click();
	        
	        
//	        select Total Smart Meters Installed
	        Thread.sleep(3000);
	        WebElement totalSmartMetersInstalled1 = driver.findElement(By.id("ContentPlaceHolder1_authsub_dlMenu_ImageButton1_9"));
	        totalSmartMetersInstalled1.click();
	       
	        
	        
	        Thread.sleep(3000);      
	        WebElement divElement1 = driver.findElement(By.cssSelector("div.col-md-12.m-b-1.text-center"));
	        // Scroll into view using JavaScript Executor
	        JavascriptExecutor jss = (JavascriptExecutor) driver;
	        jss.executeScript("arguments[0].scrollIntoView(true);", divElement1);
	        
//	        click on download button
	        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_authsub_imgBtnXL\"]")).click();
	        driver.navigate().back();
	        
//	        official name itarhi
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_authsub_ddlOfficeName_chosen\"]/a")).click();
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement dropdown2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ContentPlaceHolder1_authsub_ddlOfficeName_chosen\"]/div/ul/li[3]")));
	        dropdown2.click();

//	        click on view button
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_authsub_btnView\"]")).click();
	        
	        
//	        select Total Smart Meters Installed
	        Thread.sleep(3000);
	        WebElement totalSmartMetersInstalled3 = driver.findElement(By.id("ContentPlaceHolder1_authsub_dlMenu_ImageButton1_9"));
	        totalSmartMetersInstalled3.click();
	       
	        
	        
	        Thread.sleep(3000);      
	        WebElement divElement2 = driver.findElement(By.cssSelector("div.col-md-12.m-b-1.text-center"));
	        // Scroll into view using JavaScript Executor
	        JavascriptExecutor jsss = (JavascriptExecutor) driver;
	        jsss.executeScript("arguments[0].scrollIntoView(true);", divElement2);
	        
//	        click on download button
	        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_authsub_imgBtnXL\"]")).click();
	        driver.navigate().back();
	        
	        
//	        official name koran sarai
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_authsub_ddlOfficeName_chosen\"]/a")).click();
	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement dropdown3 = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ContentPlaceHolder1_authsub_ddlOfficeName_chosen\"]/div/ul/li[4]")));
	        dropdown3.click();

//	        click on view button
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_authsub_btnView\"]")).click();
	        
	        
//	        select Total Smart Meters Installed
	        Thread.sleep(3000);
	        WebElement totalSmartMetersInstalled4 = driver.findElement(By.id("ContentPlaceHolder1_authsub_dlMenu_ImageButton1_9"));
	        totalSmartMetersInstalled4.click();
	       
	       
	        Thread.sleep(3000);      
	        WebElement divElement3 = driver.findElement(By.cssSelector("div.col-md-12.m-b-1.text-center"));
	        // Scroll into view using JavaScript Executor
	        JavascriptExecutor jssss = (JavascriptExecutor) driver;
	        jssss.executeScript("arguments[0].scrollIntoView(true);", divElement3);
	        
//	        click on download button
	        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_authsub_imgBtnXL\"]")).click();
	        driver.navigate().back();
		
		 
		 

}
}
