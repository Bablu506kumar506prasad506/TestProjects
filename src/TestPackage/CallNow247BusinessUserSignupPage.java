package TestPackage;

import java.io.FileInputStream;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;

public class CallNow247BusinessUserSignupPage {

	static WebDriver driver;

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
		Sheet sh11 = wbo.getSheet("BusinessUsersRegistrationData");
		
		String Data_NoOfLocation = sh11.getCell(6, 2).getContents();
		String Data_City = sh11.getCell(7, 2).getContents();
		String Data_POBox = sh11.getCell(8, 2).getContents();
		String Data_Street = sh11.getCell(9, 2).getContents();
		String Data_Area = sh11.getCell(10, 2).getContents();
		String Data_Landmark = sh11.getCell(11, 2).getContents();
		String Data_MOBNO2 = sh11.getCell(12, 2).getContents();
		String Data_Landline1 = sh11.getCell(13, 2).getContents();
		String Data_Landline2 = sh11.getCell(14, 2).getContents();
		String Data_EmailPrimary = sh11.getCell(15, 2).getContents();
		String Data_EmailSecondary = sh11.getCell(16, 2).getContents();
		String Data_CompanyName = sh11.getCell(17, 2).getContents();
		String Data_FB = sh11.getCell(18, 2).getContents();
		String Data_TWIT = sh11.getCell(19, 2).getContents();
		String Data_LINKD = sh11.getCell(20, 2).getContents();
		String Data_GOGPULS = sh11.getCell(21, 2).getContents();
		String Data_INSTGRM = sh11.getCell(22, 2).getContents();
		String Data_SANPCHAT = sh11.getCell(23, 2).getContents();
		String Data_NoOfImp = sh11.getCell(24, 2).getContents();
		String Data_Category = sh11.getCell(25, 2).getContents();
		String Data_SubCategory = sh11.getCell(26, 2).getContents();
		String Data_Keywords = sh11.getCell(27, 2).getContents();
		String Data_Description = sh11.getCell(28, 2).getContents();
		String Data_FridayFrom = sh11.getCell(29, 2).getContents();
		String Data_FridayTo = sh11.getCell(30, 2).getContents();
		String Data_MondayFrom = sh11.getCell(31, 2).getContents();
		String Data_MondayTo = sh11.getCell(32, 2).getContents();
		String Data_Password = sh11.getCell(44, 2).getContents();
		String Data_ReEnterPassword = sh11.getCell(45, 2).getContents();


	}

	public static void gettingOTP() throws Exception {

		FileInputStream fs1 = new FileInputStream("C:\\Selenium_Files\\TestFiles\\Userdata.xls");
		Workbook wb1 = Workbook.getWorkbook(fs1);
		Sheet sh11 = wb1.getSheet("BusinessUsersRegistrationData");
		String Data_CompName = sh11.getCell(0, 2).getContents();
		String Data_Title = sh11.getCell(1, 2).getContents();
		String Data_FirstName = sh11.getCell(2, 2).getContents();
		String Data_LastName = sh11.getCell(3, 2).getContents();
		String Data_Designation = sh11.getCell(4, 2).getContents();
		String Data_MobileNumber = sh11.getCell(5, 2).getContents();
				// System.out.println(Mobile_Numbers);

		// -------------Register------------//
		// -----Click SignUp Link----//
		driver.findElement(By.xpath(".//*[@id='mainNav']/div/div/div[2]/ul/li[3]/a")).click();

		// driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("company_name")).sendKeys(Data_CompName);
		driver.findElement(By.id("title")).sendKeys(Data_Title);
		driver.findElement(By.id("firstname")).sendKeys(Data_FirstName);
		driver.findElement(By.id("lastname")).sendKeys(Data_LastName);
		driver.findElement(By.id("designation")).sendKeys(Data_Designation);
		driver.findElement(By.id("mobile_no")).sendKeys(Data_MobileNumber);
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