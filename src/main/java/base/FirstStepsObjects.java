package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstStepsObjects extends ApplicationBasePage{

    @FindBy (xpath="android.widget.TextView[@text='Accessibility']")
    private WebElement accessibility;

    @FindBy (xpath = "android.widget.TextView[@='App']")
    private WebElement app;


    public void appMethod(){
        app.click();
    }


}
