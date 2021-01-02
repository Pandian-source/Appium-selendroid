package AppiumProject.AppiumProject;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class FirstappiumProject {
 
	public static AndroidDriver<AndroidElement> driver = null;
	
	public static void main(String[] args)throws MalformedURLException, InterruptedException
	{  
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
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement> (new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("Application started........");
		
		String header = driver.findElementById("com.android.permissioncontroller:id/permissions_message").getText();
		if(header != null)
		{
		   System.out.println(header);
		}
		else
		{
			System.out.println("header value is empty");
		}
		String cancel = driver.findElementById("com.android.permissioncontroller:id/cancel_button").getText();
		if(cancel != null)
		{
		   System.out.println(cancel);
		}
		else
		{
			System.out.println("cancel value is empty");
		}
		String text = driver.findElementById("com.android.permissioncontroller:id/continue_button").getText();
		if(text != null)
		{
		   System.out.println(text);
		}
		else
		{
			System.out.println("text value is empty");
		}
		driver.findElementById("com.android.permissioncontroller:id/continue_button").click();
		driver.findElementById("android:id/button1").click();
		System.out.println("Application FrontEnd started........");
		driver.findElementById("io.selendroid.testapp:id/my_text_field").click();
	    driver.findElementById("io.selendroid.testapp:id/my_text_field").sendKeys("KISHORE");
	    System.out.println("Kishore input sented........");
	    
	    String display = driver.findElementById("io.selendroid.testapp:id/visibleButtonTest").getText();
	    if(display != null)
		{
		   System.out.println(display);
		}
		else
		{
			System.out.println("display value is empty");
		}
	    driver.findElementById("io.selendroid.testapp:id/visibleButtonTest").click();
	    System.out.println("Display Text View Button clicked.........");
	    driver.findElementById("io.selendroid.testapp:id/my_text_field").click();
	    driver.findElementById("io.selendroid.testapp:id/my_text_field").clear();
	    System.out.println("Kishore input text cleared........");
	    
	    String show = driver.findElementById("io.selendroid.testapp:id/waitingButtonTest").getText();
	    if(show != null)
		{
		   System.out.println(show);
		}
		else
		{
			System.out.println("show value is empty");
		}
	    driver.findElementById("io.selendroid.testapp:id/waitingButtonTest").click();
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    
	    String Firstname = driver.findElementById("io.selendroid.testapp:id/label_username").getText();
	    if(Firstname != null)
		{
		   System.out.println(Firstname);
		}
		else
		{
			System.out.println("Firstname value is empty");
		}
	    driver.findElementById("io.selendroid.testapp:id/inputUsername").click();
	    driver.findElementById("io.selendroid.testapp:id/inputUsername").sendKeys("Kishore");
	    System.out.println("Fistname field entered");
	    
	    String Email = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[3]").getText();
	    if(Email != null)
		{
		   System.out.println(Email);
		}
		else
		{
			System.out.println("Email value is empty");
		}
	    driver.findElementById("io.selendroid.testapp:id/inputEmail").click();
	    driver.findElementById("io.selendroid.testapp:id/inputEmail").sendKeys("Kishore@gmail.com");
	    System.out.println("Email field entered");
	    
	    driver.findElementById("io.selendroid.testapp:id/inputPassword").click();
	    driver.findElementById("io.selendroid.testapp:id/inputPassword").sendKeys("Kishore123");
	    System.out.println("Password field entered");
	    
	    driver.findElementById("io.selendroid.testapp:id/inputName").click();
	    driver.findElementById("io.selendroid.testapp:id/inputName").clear();
	    driver.findElementById("io.selendroid.testapp:id/inputName").sendKeys("Kishore");
	    System.out.println("Name field entered");
	    
	    driver.findElementById("io.selendroid.testapp:id/input_preferedProgrammingLanguage").click();
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[6]").click();
	    System.out.println("Language field selected");
	    driver.hideKeyboard();
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    
	    // MobileElement elementitem = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)" +".instance(0))scrollIntoView(new UiSelector().textMatches(\""+"Register User (verify)"+"\").instance(0))"));
	    // Thread.sleep(1000);
	    // elementitem.click();
	    //System.out.println(elementitem.getLocation());
	    driver.findElementById("io.selendroid.testapp:id/input_adds").click();
	    String Register = driver.findElementById("io.selendroid.testapp:id/btnRegisterUser").getText();
	    System.out.println(Register);
	    driver.findElementById("io.selendroid.testapp:id/btnRegisterUser").click();
	    System.out.println("Registered successfully");
	    
	    driver.findElementById("io.selendroid.testapp:id/buttonRegisterUser").getText();
	    driver.findElementById("io.selendroid.testapp:id/buttonRegisterUser").click();
	    driver.quit();
	}
}
	    
	    
	    
	    
	   
	   
		
	   
		
	    



