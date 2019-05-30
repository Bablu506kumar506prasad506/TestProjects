package TestPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.eDoc.GlobalMethod.GlobelMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Test {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		driver.get("https://www.askapollo.com:44333/beta/");
		driver.manage().window().maximize();
		
		Thread.sleep(2300);
		driver.findElement(By.xpath("//*[@id='mh']/section[1]/ul/li[2]/a/span[2]")).click();
		// TODO Auto-generated method stub

	}

}
