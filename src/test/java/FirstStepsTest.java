import base.FirstStepsObjects;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class FirstStepsTest extends FirstStepsObjects {

   FirstStepsObjects objOfFirstSteps = new FirstStepsObjects();

   /*@BeforeMethod
   public void initializationOfObject(){
       objOfFirstSteps = PageFactory.initElements(driver,FirstStepsObjects.class);
   }*/

    @Test
    public void accessibilityTest() throws MalformedURLException {
       objOfFirstSteps.accessibility().click();
   }


}
