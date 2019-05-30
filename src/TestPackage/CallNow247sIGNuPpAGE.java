package TestPackage;

import java.io.FileInputStream;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;

public class CallNow247sIGNuPpAGE {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		FileInputStream fs = new FileInputStream("C:\\Selenium_Files\\TestFiles\\Userdata.xls");
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh1 = wb.getSheet("User details");
		String URL = sh1.getCell(1, 0).getContents();
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get(URL);

		gettingOTP();

		FileInputStream fIs = new FileInputStream("C:\\Selenium_Files\\TestFiles\\Userdata.xls");
		Workbook wbo = Workbook.getWorkbook(fIs);
		Sheet sh = wbo.getSheet("EndUsersSignUpData");
		String Title_Data = sh.getCell(0, 1).getContents();
		String FirstName_Data = sh.getCell(1, 1).getContents();
		String MiddleName_Data = sh.getCell(2, 1).getContents();
		String LastName_Data = sh.getCell(3, 1).getContents();
		String MotherName_Data = sh.getCell(4, 1).getContents();
		String EmailId_Data = sh.getCell(5, 1).getContents();
		String Gender_Data = sh.getCell(6, 1).getContents();
		String Area_Data = sh.getCell(7, 1).getContents();
		String Street_Data = sh.getCell(8, 1).getContents();
		String City_Data = sh.getCell(9, 1).getContents();
		String DOB_Data = sh.getCell(10, 1).getContents();
		String Password_Data = sh.getCell(11, 1).getContents();
		String ReEnterPassword_Data = sh.getCell(12, 1).getContents();

		// ---------Title----------//
		WebElement element = driver.findElement(By.id("title"));
		Select dropdown = new Select(element);
		dropdown.selectByValue(Title_Data);

		// ---------First Name----------//
//		WebElement element1 = driver.findElement(By.id("firstname"));
//		element1.sendKeys(FirstName_Data);

		// ---------Middle Name----------//
		WebElement element11 = driver.findElement(By.id("middlename"));
		element11.sendKeys(MiddleName_Data);

		// ---------Last Name----------//
		WebElement element12 = driver.findElement(By.id("lastname"));
		element12.sendKeys(LastName_Data);

		// ---------Mother Name----------//
		WebElement element13 = driver.findElement(By.id("mothername"));
		element13.sendKeys(MotherName_Data);

		// ---------Email Id's----------//
		WebElement element14 = driver.findElement(By.id("email"));
		element14.sendKeys(EmailId_Data);

		// ---------Gender Name----------//
//		WebElement element15 = driver.findElement(By.id("reggender"));
//		Select dropdown1 = new Select(element15);
//		dropdown1.selectByValue(Gender_Data);

		// ---------Area Name----------//
		WebElement element16 = driver.findElement(By.id("area"));
		element16.sendKeys(Area_Data);

		// ---------Street Name----------//
		WebElement element17 = driver.findElement(By.id("street"));
		element17.sendKeys(Street_Data);

		// ---------City Name----------//
		WebElement element18 = driver.findElement(
				By.xpath("html/body/div[6]/form/div/div/div[2]/div/div/div[1]/div[5]/div[5]/div[2]/div/select"));
		Select dropdown2 = new Select(element18);
		dropdown2.selectByValue(City_Data);

		// ---------Password----------//
		WebElement element2 = driver.findElement(By.id("userpassword"));
		element2.sendKeys(Password_Data);

		// ---------Re_Enter-Password----------//
		WebElement element20 = driver.findElement(By.id("reenterpassword"));
		element20.sendKeys(ReEnterPassword_Data);

		// ---------Date of birth----------//
//		WebElement element19 = driver.findElement(By.cssSelector("#registerdateofbirth"));
//		element19.sendKeys(DOB_Data);
		String s = "document.getElementById('registerdateofbirth').value = '" + DOB_Data + "'";
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript(s);
		
		//---------Click Submit Button---------//
		WebElement ele = driver.findElement(By.cssSelector(".waves-light.btn.margin-auto"));
		ele.click();

	}

	public static void gettingOTP() throws Exception {

		FileInputStream fs1 = new FileInputStream("C:\\Selenium_Files\\TestFiles\\Userdata.xls");
		Workbook wb1 = Workbook.getWorkbook(fs1);
		Sheet sh11 = wb1.getSheet("User details");
		String Mobile_Numbers = sh11.getCell(2, 1).getContents();
		// System.out.println(Mobile_Numbers);

		// -------------Register------------//
		// -----Click SignUp Link----//
		driver.findElement(By.xpath(".//*[@id='mainNav']/div/div/div[2]/ul/li[2]/a")).click();

		// driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("mobile_no")).sendKeys(Mobile_Numbers);
		driver.findElement(By.id("button")).click();
		Alert OTP = driver.switchTo().alert();
		// System.out.println(OTP.getText());
		String str = OTP.getText();
		OTP.accept();
		Thread.sleep(1500);
		driver.findElement(By.id("otp")).sendKeys(str);

		driver.findElement(By.id("sub_otp")).click();

	}

}
