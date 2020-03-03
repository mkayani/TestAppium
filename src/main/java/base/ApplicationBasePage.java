package base;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class ApplicationBasePage extends Base {


    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver driver = capabilities();
    }




/*
      // driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
     driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
            driver.findElementById("android:id/checkbox").click();
            driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
            driver.findElementByClassName("android.widget.EditText").sendKeys("name");
            List<MobileElement> ok = driver.findElementsByClassName("android.widget.Button");
            ok.get(1).click();
*/


    }





