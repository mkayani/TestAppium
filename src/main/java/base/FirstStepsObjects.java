package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.MalformedURLException;

public class FirstStepsObjects extends Base{


    public WebElement accessibility() throws MalformedURLException {

        return capabilities().findElementByXPath("//android.widget.TextView[@text='Accessibility']");
    }


    @FindBy (xpath = "android.widget.TextView[@='App']")
    private WebElement app;


    public void appMethod(){
        app.click();
    }


}
