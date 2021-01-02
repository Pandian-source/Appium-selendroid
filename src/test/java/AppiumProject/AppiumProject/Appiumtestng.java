package AppiumProject.AppiumProject;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Appiumtestng {

	AndroidDriver<AndroidElement> driver = null;
	
	ExtentReports extentReport;
	ExtentHtmlReporter htmlReporter;
	ExtentTest testCase;
	
	@BeforeSuite
	public void Openapplication() throws MalformedURLException, InterruptedException
	{  
		extentReport = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("ExtentAppium.html");
		extentReport.attachReporter(htmlReporter);
		testCase = extentReport.createTest("Successfully open th application");
		File appDir = new File(System.getProperty("user.dir")+"/Appium");
		File Appium = new File(appDir, "selendroid-test-app.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi Note 8");
		cap.setCapability("udid", "50912488");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("adbExecTimeout", "200000");
		cap.setCapability("app", Appium.getAbsolutePath());
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("appPackage", "io.selendroid.testapp");
		cap.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
		this.driver = new AndroidDriver<AndroidElement> (new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("Application started........");    
		String header = this.driver.findElementById("com.android.permissioncontroller:id/permissions_message").getText();
		if(header != null)
		{
			System.out.println(header);
		}
		else
		{
			System.out.println("header value is empty");
		}
		String cancel = this.driver.findElementById("com.android.permissioncontroller:id/cancel_button").getText();
		if(cancel != null)
		{
			System.out.println(cancel);
		}
		else
		{
			System.out.println("cancel value is empty");
		}
		String text = this.driver.findElementById("com.android.permissioncontroller:id/continue_button").getText();
		if(text != null)
		{
			System.out.println(text);
		}
		else
		{
			System.out.println("text value is empty");
		}
		this.driver.findElementById("com.android.permissioncontroller:id/continue_button").click();
		this.driver.findElementById("android:id/button1").click();
		System.out.println("Application FrontEnd started........");
	}
	@Test
	public void Hellopage() throws IOException, InterruptedException
	{
		this.driver.findElementById("io.selendroid.testapp:id/my_text_field").click();
		this.driver.findElementById("io.selendroid.testapp:id/my_text_field").sendKeys("KISHORE");
		System.out.println("Kishore input sented........");
		testCase = extentReport.createTest("Successfully tested the hellopage");
        String display = this.driver.findElementById("io.selendroid.testapp:id/visibleButtonTest").getText();
		if(display != null)
		{
			System.out.println(display);
		}
		else
		{
			System.out.println("display value is empty");
		}
		this.driver.findElementById("io.selendroid.testapp:id/visibleButtonTest").click();
		System.out.println("Display Text View Button clicked.........");
		this.driver.findElementById("io.selendroid.testapp:id/my_text_field").click();
		this.driver.findElementById("io.selendroid.testapp:id/my_text_field").clear();
		System.out.println("Kishore input text cleared........");

		String show = this.driver.findElementById("io.selendroid.testapp:id/waitingButtonTest").getText();
		if(show != null)
		{
			System.out.println(show);
		}
		else
		{
			System.out.println("show value is empty");
		}
		this.driver.findElementById("io.selendroid.testapp:id/waitingButtonTest").click();
		this.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String Firstname = this.driver.findElementById("io.selendroid.testapp:id/label_username").getText();
		if(Firstname != null)
		{
			System.out.println(Firstname);
		}
		else
		{
			System.out.println("Firstname value is empty");
		}
		this.driver.findElementById("io.selendroid.testapp:id/inputUsername").click();
		this.driver.findElementById("io.selendroid.testapp:id/inputUsername").sendKeys("Kishore");
		System.out.println("Fistname field entered");
	}
	@Test
	public void email() throws IOException
	{   
		
		testCase = extentReport.createTest("Successfully tested the email input page");
		String Email = this.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[3]").getText();
		if(Email != null)
		{
			System.out.println(Email);
		}
		else
		{
			System.out.println("Email value is empty");
		}
		this.driver.findElementById("io.selendroid.testapp:id/inputEmail").click();
		this.driver.findElementById("io.selendroid.testapp:id/inputEmail").sendKeys("Kishore@gmail.com");
		System.out.println("Email field entered");
		this.driver.findElementById("io.selendroid.testapp:id/inputPassword").click();
		this.driver.findElementById("io.selendroid.testapp:id/inputPassword").sendKeys("Kishore123");
		System.out.println("Password field entered");
	}
	@Test
	public void name() throws IOException
	{   
		testCase = extentReport.createTest("Successfully tested name input field");
		this.driver.findElementById("io.selendroid.testapp:id/inputName").click();
		this.driver.findElementById("io.selendroid.testapp:id/inputName").clear();
		this.driver.findElementById("io.selendroid.testapp:id/inputName").sendKeys("Kishore");
		System.out.println("Name field entered");
	}
	@Test
	public void programminglanguage() throws InterruptedException
	{   
		testCase = extentReport.createTest("Successfully tested the programming");
		this.driver.findElementById("io.selendroid.testapp:id/input_preferedProgrammingLanguage").click();
		this.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		this.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[6]").click();
		System.out.println("Language field selected");	
		this.driver.hideKeyboard();
		Thread.sleep(1000);
		this.driver.findElementById("io.selendroid.testapp:id/input_adds").click();
		String Register = this.driver.findElementById("io.selendroid.testapp:id/btnRegisterUser").getText();
		System.out.println(Register);
		this.driver.findElementById("io.selendroid.testapp:id/btnRegisterUser").click();
		System.out.println("Registered successfully");
		this.driver.findElementById("io.selendroid.testapp:id/buttonRegisterUser").getText();
		this.driver.findElementById("io.selendroid.testapp:id/buttonRegisterUser").click();
	}
	@AfterSuite
	public void closeapplication()
	{
		this.driver.quit();
		extentReport.flush();
	}}
