package stepDefs;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class CptScreenSht {

   public void cptScrSht(WebDriver driver, String screenShotName)
    {

        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        try
        {
            FileUtils.copyFile(source,new File("./src/test/ScreenShots/"+screenShotName+System.nanoTime()+".png"));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
