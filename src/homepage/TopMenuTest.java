package homepage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends Utility
{
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setBaseUrl()
    {
        openBrowser();
    }
    @Test
    public void verifyPageNavigation()
    {
        //selectMenu method to select the Menu and click on it and verify the page navigation
        selectMenu(By.linkText("Computers"));
        String expected = "Computers";
        String actual = driver.findElement(By.xpath("//div[@class='page-title']")).getText();
        Assert.assertEquals("message",expected,actual);
        System.out.println(actual);
    }


    }



