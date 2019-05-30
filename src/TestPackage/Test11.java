
package TestPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;

public class Test11 {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		FileInputStream fs = new FileInputStream("C:\\Selenium_Files\\TestFiles\\Userdata.xls");
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh1 = wb.getSheet("User details");
		String URL = sh1.getCell(1, 0).getContents();
		driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get(URL);

		// ---------- OTP Functionality -----------//
		GettingOTP();
		// System.out.println(driver.getCurrentUrl());

		String file = "C:\\Selenium_Files\\TestFiles\\Userdata.xls";

		FileInputStream fs1 = new FileInputStream(file);
		Workbook wb1 = Workbook.getWorkbook(fs1);
		Sheet st = wb1.getSheet("CallNow247_Data");

		int numberOfRow = st.getRows();
		for (int i = 0; i <= numberOfRow; i++) {

			List<String> PageControlId = new ArrayList<String>();
			List<WebElement> elements = driver.findElements(By.xpath("//*[@id='register']//*"));

			for (WebElement item : elements) {

				String controlType = item.getAttribute("type");
				if (controlType == null || controlType.trim() == "") {
					continue;
				}

				String controlId = item.getAttribute("id");
				// System.out.println(controlId);
				if (controlType.equalsIgnoreCase("text") || controlType.equalsIgnoreCase("email")
						|| controlType.equalsIgnoreCase("password") || controlType.equalsIgnoreCase("radio")
						|| controlType.equalsIgnoreCase("select-one") || controlType.equalsIgnoreCase("checkbox")) {

					// System.out.println(controlType);
					if (controlType.equalsIgnoreCase("radio")) {
						WebElement parent = item.findElement(By.xpath("../../../.."));
						String controlIdAndType = parent.getAttribute("id") + "~" + controlType;
						boolean controlExists = false;
						for (String existingControlId : PageControlId) {
							if (existingControlId.equalsIgnoreCase(controlIdAndType)) {
								controlExists = true;
							}
						}
						if (!controlExists) {

							PageControlId.add(controlIdAndType);
						}
					} else if (controlType.equalsIgnoreCase("checkbox")) {
						WebElement parentcheckbox = item.findElement(By.xpath("../../../../.."));
						String controlIdAndTypecheck = parentcheckbox.getAttribute("id") + "~" + controlType;
						boolean controlExistscheck = false;
						for (String existingControlIdcheck : PageControlId) {

							if (existingControlIdcheck.equalsIgnoreCase(controlIdAndTypecheck)) {
								controlExistscheck = true;
							}
						}
						if (!controlExistscheck) {

							PageControlId.add(controlIdAndTypecheck);
						}
					} else {
						PageControlId.add(controlId + "~" + controlType);
					}
				}
			}

			int numOfCol = st.getColumns();
			for (int j = 0; j <= numOfCol; j++) {

				String controlData = st.getCell(j, i).getContents();
				System.out.println(controlData);
				String controlIdAndType = PageControlId.get(j);
				String controlId = controlIdAndType.split("~")[0];
				String controlType = controlIdAndType.split("~")[1];
				WebElement element = driver.findElement(By.id(controlId));

				switch (controlType) {
				case "text":

					try {
						if (element.getAttribute("class")
								.equalsIgnoreCase("datepicker form-control date-icon picker__input")) {
							String s = "document.getElementById('" + controlId + "').value = '" + controlData + "'";
							JavascriptExecutor jse = (JavascriptExecutor) driver;
							jse.executeScript(s);
						} else {
							String checkOtherTextBox = element.getAttribute("style");
							if (!checkOtherTextBox.equalsIgnoreCase("display: none;")) {
								element.sendKeys(controlData);
							}
						}
					} catch (Exception e) {
						e.getMessage();
					}

					break;

				case "email":
					try {
						String checkOtherTextBox = element.getAttribute("style");
						if (!checkOtherTextBox.equalsIgnoreCase("display: none;")) {
							element.sendKeys(controlData);
						}
					} catch (Exception e) {
						e.getMessage();
					}

					break;

				case "password":
					try {
						if (element.getAttribute("type").equalsIgnoreCase("password")) {
							String p = "document.getElementById('" + controlId + "').value = '" + controlData + "'";
							JavascriptExecutor js = (JavascriptExecutor) driver;
							js.executeScript(p);
							element.sendKeys(controlData);
						}
						// if
						// (element.getAttribute("name").equalsIgnoreCase("reenterpassword"))
						// {
						// String p = "document.getElementById('" + controlId +
						// "').value = '" + controlData + "'";
						// JavascriptExecutor js = (JavascriptExecutor)driver;
						// js.executeScript(p);
						// element.sendKeys(controlData);
						// }
					} catch (Exception e) {
						e.getMessage();
					}

					break;

				case "select-one":
					try {
						if (element.getAttribute("type").equalsIgnoreCase("select-one")) {
							if (element.getAttribute("class").equalsIgnoreCase("form-control")) {

								Select dropdown = new Select(element);
								dropdown.selectByValue(controlData);
							}
							Select dropdown = new Select(element);
							dropdown.selectByValue(controlData);

						}

					} catch (Exception e) {
						e.getStackTrace();
					}
					break;
				}

			}

		}
	}

	public static void GettingOTP() throws Exception {

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
