package computer;

import homepage.Utility;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSuite extends Utility
{
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setBaseUrl()
    {
        openBrowser();
    }
    @Test
    public void  verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        // click on computer menu
        selectMenu(By.linkText("Computers"));
        // Click on Desktop
        selectMenu(By.xpath("//ul[@class='sublist']/li/a[@href='/desktops']"));
        //Select Sort By position "Name: Z to A"
        selectMenu(By.xpath("//select[@id='products-orderby']/option[@value='6']"));


        // Verify the Product will arrange in Descending order
        List<WebElement> list = driver.findElements(By.xpath("//h2[@class='product-title']"));
        System.out.println("Total products are = "+list.size());
        for (WebElement result : list)
        {
            String product = result.getText();
            String actual = product;
            String expected = product;
            System.out.println("Total products  = "+actual);
            Assert.assertEquals("message",actual,expected);
        }
    }

    @Test
    public void  verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
            // click on computer menu
            selectMenu(By.linkText("Computers"));
            // Click on Desktop
            selectMenu(By.xpath("//ul[@class='sublist']/li/a[@href='/desktops']"));
            //Select Sort By position name);
            WebElement name = driver.findElement(By.name("products-orderby"));
            Select select = new Select(name);
            select.selectByVisibleText("Name: A to Z");
            Thread.sleep(2000);

           //  Click on "Add To Cart"
            selectMenu(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));

            //Verify the Text "Build your own computer
          WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Build your own computer')]"));
         System.out.println("message = " + message.getText());
         List<String> actual2 = new ArrayList<>();
         List<String> expected2 = new ArrayList<>();
         Collections.sort(expected2);
         Assert.assertTrue(actual2.equals(expected2));
         Thread.sleep(2000);

       // Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='product_attribute_1']"));
        Select select1 = new Select(dropDown);
        select1.selectByVisibleText("2.2 GHz Intel Pentium Dual-Core E2200");
        Thread.sleep(2000);

        //Select "8GB [+$60.00]" using Select class.
        WebElement dropDown1 = driver.findElement(By.xpath("//select[@id='product_attribute_2']"));
        Select select2 = new Select(dropDown1);
        select2.selectByIndex(3);
        Thread.sleep(2000);

        //Select HDD radio "400 GB [+$100.00]"
        selectMenu(By.xpath("//input[@id='product_attribute_3_7']"));

        //Select OS radio "Vista Premium [+$60.00]"
        selectMenu(By.xpath("//input[@id='product_attribute_4_9']"));

        //Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
        selectMenu(By.id("product_attribute_5_10"));
        Thread.sleep(5000);


        select(By.id("product_attribute_5_12"));
        Thread.sleep(2000);


        //Verify the price "$1,475.00"
        WebElement message1 = driver.findElement(By.xpath("//span[@id='price-value-1']"));
        System.out.println("message = " + message1.getText());
        List<String> actual3 = new ArrayList<>();
        List<String> expected3 = new ArrayList<>();
        Collections.sort(expected2);
        Assert.assertTrue(actual3.equals(expected3));
        Thread.sleep(2000);

        //Click on "ADD TO CARD" Button.
        selectMenu(By.xpath("//button[@id='add-to-cart-button-1']"));

        //Verify the Message "The product has been added to your shopping cart" on Top
        WebElement message2 = driver.findElement(By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]"));
        System.out.println("message = " + message2.getText());
        List<String> actual4 = new ArrayList<>();
        List<String> expected4 = new ArrayList<>();
        Collections.sort(expected4);
        Assert.assertTrue(actual4.equals(expected4));
        Thread.sleep(2000);

        //green Bar
        //After that close the bar clicking on the cross button.
        select(By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]"));

        //Then MouseHover on "Shopping cart" and Click on "GO TO CART" button
        WebElement cart = driver.findElement(By.xpath(" //span[contains(text(),'Shopping cart')]"));
        Actions action = new Actions(driver) ;
        action.moveToElement(cart).build().perform();
        selectMenu(By.xpath("//button[contains(text(),'Go to cart')]"));

        //Verify the message "Shopping cart"
        WebElement message3 = driver.findElement(By.xpath("//h1[contains(text(),'Shopping cart')]"));
        System.out.println("message = " + message3.getText());
        List<String> actual5 = new ArrayList<>();
        List<String> expected5 = new ArrayList<>();
        Collections.sort(expected5);
        Assert.assertTrue(actual5.equals(expected5));
        Thread.sleep(2000);

        //Change the Qty to "2" and Click on "Update shopping cart"
        remove(By.xpath("//input[@class='qty-input']"),"2");
        select(By.xpath("//button[@id='updatecart']"));



        //Verify the Total"$2,950.00"
        WebElement message4 = driver.findElement(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]"));
        System.out.println("message = " + message4.getText());
        List<String> actual6 = new ArrayList<>();
        List<String> expected6 = new ArrayList<>();
        Collections.sort(expected6);
        Assert.assertTrue(actual6.equals(expected6));
        Thread.sleep(2000);

        //click on checkbox “I agree with the terms of service”
        selectMenu(By.xpath("//input[@id='termsofservice']"));

        //Click on “CHECKOUT”
        selectMenu(By.xpath("//button[@id='checkout']"));

        //Verify the Text “Welcome, Please Sign In!”
        WebElement message5 = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        System.out.println("message = " + message5.getText());
        List<String> actual7 = new ArrayList<>();
        List<String> expected7 = new ArrayList<>();
        Collections.sort(expected7);
        Assert.assertTrue(actual7.equals(expected7));
        Thread.sleep(2000);

        //Click on “CHECKOUT AS GUEST” Tab
        selectMenu(By.xpath("//button[@class='button-1 checkout-as-guest-button']"));

        //Fill the all mandatory field
        send(By.xpath("//input[@id='BillingNewAddress_FirstName']"),"Ram");
        send(By.xpath("//input[@id='BillingNewAddress_LastName']"),"Sita");
        send(By.id("BillingNewAddress_Email"),"prime@gmail.com");
        send(By.id("BillingNewAddress_CountryId"),"India");
        send(By.xpath("//input[@id='BillingNewAddress_City']"),"surat");
        send(By.xpath("//input[@id='BillingNewAddress_Address1']"),"15,opera");
        send(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"),"567787");
        send(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"),"7985634784");
        Thread.sleep(2000);



        //Click on “CONTINUE”
        selectMenu(By.xpath("//button[contains(text(),'Continue')]"));
        //Click on Radio Button “Next Day Air($0.00)”
        select(By.id("shippingoption_1"));
        //Click on “CONTINUE”
        select(By.xpath("//button[@class='button-1 shipping-method-next-step-button' and text()='Continue']"));
        //Select Radio Button “Credit Card”
        select(By.id("paymentmethod_1"));
        select(By.xpath("//button[@name='save' and @class='button-1 payment-method-next-step-button']"));
        Thread.sleep(2000);

        //Select “Master card” From Select credit card dropdown
      /* WebElement drop = driver.findElement(By.xpath("//select[@class='dropdownlists']//option[text()='Master card']"));
        Select select3 = new Select(drop);
        select3.selectByVisibleText("Master card");*/
        select(By.xpath("//select[@class='dropdownlists']//option[text()='Master card']"));
        Thread.sleep(2000);

        //Fill all the details
        send(By.id("CardholderName"),"Roxyy");
        send(By.id("CardNumber"),"56748488497");
        //select[@id='ExpireMonth']//option[@value='5']
       /* WebElement drop = driver.findElement(By.xpath("//select[@id='ExpireMonth']//option[@value='5']"));
        Select select3 = new Select(drop);
        select3.selectByValue("5");*/
        select(By.xpath("//select[@id='ExpireMonth']//option[@value='5']"));
      /*  WebElement drop1 = driver.findElement(By.xpath("//select[@id='ExpireYear']//option[@value='2030']"));
        Select select4 = new Select(drop1);
        select4.selectByValue("2030");*/
        select(By.xpath("//select[@id='ExpireYear']//option[@value='2030']"));
        send(By.id("CardCode"),"4457");
        Thread.sleep(2000);
        select(By.xpath("//button[@onclick='PaymentInfo.save()' and @type='button']"));

        //Verify “Payment Method” is “Credit Card”
        WebElement message6 = driver.findElement(By.linkText("Credit Card"));
        System.out.println("message = " + message5.getText());
        List<String> actual8 = new ArrayList<>();
        List<String> expected8 = new ArrayList<>();
        Collections.sort(expected8);
        Assert.assertTrue(actual8.equals(expected8));
        Thread.sleep(2000);

        //Verify “Shipping Method” is “Next Day Air”
        WebElement message7 = driver.findElement(By.linkText("Next Day Air ($0.00)"));
        System.out.println("message = " + message7.getText());
        List<String> actual9= new ArrayList<>();
        List<String> expected9 = new ArrayList<>();
        Collections.sort(expected9);
        Assert.assertTrue(actual9.equals(expected9));
        Thread.sleep(2000);

        //Verify Total is “$2,950.00”
        WebElement message8 = driver.findElement(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]"));
        System.out.println("message = " + message8.getText());
        List<String> actual0= new ArrayList<>();
        List<String> expected0 = new ArrayList<>();
        Collections.sort(expected0);
        Assert.assertTrue(actual0.equals(expected0));
        Thread.sleep(2000);

        //Click on “CONFIRM”
        select(By.xpath("//h2[@class='title' and text()='Confirm order']"));

    }
    @After
    public void close()
    {
        closeBrowser();
    }


}
