import base.FirstStepsObjects;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class FirstStepsTest extends FirstStepsObjects {

   FirstStepsObjects objOfFirstSteps = null;

   @BeforeMethod
   public void initializationOfObject(){
       objOfFirstSteps = PageFactory.initElements(driver,FirstStepsObjects.class);
   }

    @Test
    public void appTest() throws MalformedURLException {
       //objOfFirstSteps.capabilities();
       objOfFirstSteps.appMethod();

   }


}
