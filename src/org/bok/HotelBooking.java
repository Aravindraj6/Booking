package org.bok;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HotelBooking {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Booking\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//*[@id=\'username\']"));
		username.sendKeys("ARAVINDRJ");
		
		WebElement pass = driver.findElement(By.xpath("//*[@id=\'password\']"));
		pass.sendKeys("aravinD");
		
		WebElement btnlogin = driver.findElement(By.xpath("//*[@id=\'login\']"));
		btnlogin.click();
		
		WebElement selLocation = driver.findElement(By.xpath("//*[@id=\'location\']"));
		selLocation.click();
		
		Actions a = new Actions(driver);
		
		Robot r = new Robot();
		
		for (int i = 0; i < 5; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement selHotel = driver.findElement(By.xpath("//*[@id=\'hotels\']/option[4]"));
		selHotel.click();
		
		WebElement rmtyp = driver.findElement(By.xpath("//*[@id=\'room_type\']/option[4]"));
		rmtyp.click();
		
		WebElement numofroom = driver.findElement(By.xpath("//*[@id=\'room_nos\']/option[3]"));
		numofroom.click();
		
		WebElement selCindate = driver.findElement(By.xpath("//*[@id=\'datepick_in\']"));
		selCindate.click();
		
		a.contextClick(selCindate).perform();
		
		for (int i = 0; i <4; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		
		WebElement Cindate = driver.findElement(By.xpath("//*[@id=\'datepick_in\']"));
		Cindate.sendKeys("01/10/2022");
		
		WebElement selCoutdate = driver.findElement(By.xpath("//*[@id=\'datepick_out\']"));
		selCoutdate.click();
		
        a.contextClick(selCoutdate).perform();
		
           for (int i = 0; i <5; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
           r.keyPress(KeyEvent.VK_ENTER);
   		r.keyRelease(KeyEvent.VK_ENTER);
   		
   		
   		r.keyPress(KeyEvent.VK_BACK_SPACE);
   		r.keyRelease(KeyEvent.VK_BACK_SPACE);
   		
   		WebElement Coutdate = driver.findElement(By.xpath("//*[@id=\'datepick_out\']"));
   		Coutdate.sendKeys("03/10/2022");
   		
   		WebElement persons = driver.findElement(By.xpath("//*[@id=\'adult_room\']/option[3]"));
   		persons.click();
   		
   		WebElement searchbtn = driver.findElement(By.xpath("//*[@id=\'Submit\']"));
   		searchbtn.click();
   		
   		WebElement confimsel = driver.findElement(By.xpath("//*[@id=\'radiobutton_0\']"));
   		confimsel.click();
   		
   		WebElement con = driver.findElement(By.xpath("//*[@id=\'continue\']"));
   		con.click();
   		
   		WebElement frstname = driver.findElement(By.xpath("//*[@id=\'first_name\']"));
   		frstname.sendKeys("Aravind");
   		
   		WebElement Lastname = driver.findElement(By.xpath("//*[@id=\'last_name\']"));
   		Lastname.sendKeys("Raj");
   		
   		WebElement Address = driver.findElement(By.xpath("//*[@id=\'address\']"));
   		Address.sendKeys("6,Srinagarcolony,Kumbakonam-612204");
   		
   		WebElement CCnum = driver.findElement(By.xpath("//*[@id=\'cc_num\']"));
   		CCnum.sendKeys("8798675467897656");
   		
   		WebElement CCtype = driver.findElement(By.xpath("//*[@id=\'cc_type\']/option[4]"));
   		CCtype.click();
   		
   		WebElement EDmon = driver.findElement(By.xpath("//*[@id=\'cc_exp_month\']/option[13]"));
   		EDmon.click();
   		
   		WebElement EDyear = driver.findElement(By.xpath("//*[@id=\'cc_exp_year\']/option[13]"));
   		EDyear.click();
   		
   		WebElement CCVnum = driver.findElement(By.xpath("//*[@id=\'cc_cvv\']"));
   		CCVnum.sendKeys("563");
   		
   		WebElement finishBooking = driver.findElement(By.xpath("//*[@id=\'book_now\']"));
   		finishBooking.click();
   		
   		Thread.sleep(10000);
   		 
   		
   		WebElement orderid = driver.findElement(By.id("order_no"));
   		String text = orderid.getAttribute("value");
   		System.out.println(text);   		
	}

}
