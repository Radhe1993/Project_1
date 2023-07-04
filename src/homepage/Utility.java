package homepage;

import org.openqa.selenium.By;

public class Utility extends BaseTest
{
    //create method with name "selectMenu" it has one parameter name "menu" of type
    public void selectMenu(By by)
    {
        driver.findElement(by).click();


    }
    public void select(By by)
    {
        driver.findElement(by).click();

    }
    public void remove(By by,String txt)
    {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(txt);


    }
    public void send(By by,String text)
    {
        driver.findElement(by).sendKeys(text);
    }


}
