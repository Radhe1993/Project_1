package Electronics;

import homepage.Utility;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElectronicsTest extends Utility
{
    @Before
    public void setupUrr()
    {
        openBrowser();
    }
    @Test
    public void TestnameverifyUserShouldNavigateToCellPhonesPageSuccessfully() throws InterruptedException {
        //Mouse Hover on “Electronics” Tab
        WebElement tab = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        Actions action = new Actions(driver) ;
        action.moveToElement(tab).build().perform();
        Thread.sleep(2000);

        //Mouse Hover on “Cell phones” and click
        WebElement phone = driver.findElement(By.xpath("//ul[@class='sublist first-level']//a[contains(text(),'Cell phones ')]"));
        Actions action1 = new Actions(driver) ;
        action.moveToElement(phone).build().perform();
        selectMenu(By.xpath("//ul[@class='sublist first-level']//a[contains(text(),'Cell phones ')]"));
        Thread.sleep(2000);

        //Verify the text “Cell phones”
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Cell phones')]"));
        System.out.println("message = " + message.getText());
        List<String> actual = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        Collections.sort(expected);
        Assert.assertTrue(actual.equals(expected));
        Thread.sleep(2000);

    }
    @Test
    public void TestnameverifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        //Mouse Hover on “Electronics” Tab
        WebElement tab = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(tab).build().perform();
        Thread.sleep(2000);

        //Mouse Hover on “Cell phones” and click
        WebElement phone = driver.findElement(By.xpath("//ul[@class='sublist first-level']//a[contains(text(),'Cell phones ')]"));
        Actions action1 = new Actions(driver);
        action.moveToElement(phone).build().perform();
        selectMenu(By.xpath("//ul[@class='sublist first-level']//a[contains(text(),'Cell phones ')]"));
        Thread.sleep(2000);

        //Verify the text “Cell phones”
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Cell phones')]"));
        System.out.println("message = " + message.getText());
        List<String> actual = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        Collections.sort(expected);
        Assert.assertTrue(actual.equals(expected));
        Thread.sleep(2000);

        // Click on List View Tab
        selectMenu(By.xpath("//a[contains(text(),'List')]"));
        Thread.sleep(2000);

        //Click on product name “Nokia Lumia 1020” link
        selectMenu(By.xpath("//a[contains(text(),'Nokia Lumia 1020')]"));

        //Verify the text “Nokia Lumia 1020
        WebElement message1 = driver.findElement(By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]"));
        System.out.println("message = " + message1.getText());
        List<String> actual1 = new ArrayList<>();
        List<String> expected1 = new ArrayList<>();
        Collections.sort(expected1);
        Assert.assertTrue(actual1.equals(expected1));
        Thread.sleep(2000);

        //Verify the price “$349.00”
        WebElement message2 = driver.findElement(By.xpath("//span[@id='price-value-20']"));
        System.out.println("message = " + message2.getText());
        List<String> actual2 = new ArrayList<>();
        List<String> expected2 = new ArrayList<>();
        Collections.sort(expected2);
        Assert.assertTrue(actual2.equals(expected2));
        Thread.sleep(2000);

        //Change quantity to 2
        remove(By.xpath("//input[@id='product_enteredQuantity_20']"), "2");

        //Click on “ADD TO CART” tab
        selectMenu(By.xpath("//button[@id='add-to-cart-button-20']"));

        //Verify the Message "The product has been added to your shopping cart" on Top
        WebElement message3 = driver.findElement(By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]"));
        System.out.println("message = " + message3.getText());
        List<String> actual3 = new ArrayList<>();
        List<String> expected3 = new ArrayList<>();
        Collections.sort(expected3);
        Assert.assertTrue(actual3.equals(expected3));
        Thread.sleep(2000);

        //After that close the bar clicking on the cross button.
        selectMenu(By.xpath("//span[@class='close']"));
        Thread.sleep(2000);


        //Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        WebElement phone1 = driver.findElement(By.xpath("//span[@class='cart-label']"));
        Actions action2 = new Actions(driver);
        action2.moveToElement(phone1).build().perform();
        selectMenu(By.xpath("//button[contains(text(),'Go to cart')]"));
        Thread.sleep(2000);

        //Verify the message "Shopping cart"
        WebElement message4 = driver.findElement(By.xpath("//h1[contains(text(),'Shopping cart')]"));
        System.out.println("message = " + message4.getText());
        List<String> actual4 = new ArrayList<>();
        List<String> expected4 = new ArrayList<>();
        Collections.sort(expected4);
        Assert.assertTrue(actual4.equals(expected4));
        Thread.sleep(2000);

        //Verify the quantity is 2
        WebElement message5 = driver.findElement(By.xpath("//input[@id='itemquantity11220'][@aria-label='Qty.']"));
        System.out.println("message = " + message5.getText());
        List<String> actual5 = new ArrayList<>();
        List<String> expected5 = new ArrayList<>();
        Collections.sort(expected5);
        Assert.assertTrue(actual5.equals(expected5));
        Thread.sleep(2000);

        //Verify the Total $698.00
        WebElement message6 = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/span[1]"));
        System.out.println("message = " + message6.getText());
        List<String> actual6 = new ArrayList<>();
        List<String> expected6 = new ArrayList<>();
        Collections.sort(expected6);
        Assert.assertTrue(actual6.equals(expected6));
        Thread.sleep(2000);

        //click on checkbox “I agree with the terms of service”
        selectMenu(By.xpath("//input[@id='termsofservice']"));

        //2.16 Click on “CHECKOUT”
        selectMenu(By.xpath("//button[@id='checkout']"));

        //Verify the Text “Welcome, Please Sign In!”
        WebElement message7 = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        System.out.println("message = " + message7.getText());
        List<String> actual7 = new ArrayList<>();
        List<String> expected7 = new ArrayList<>();
        Collections.sort(expected7);
        Assert.assertTrue(actual7.equals(expected7));
        Thread.sleep(2000);

        //Click on “REGISTER” tab
        selectMenu(By.xpath("//button[contains(text(),'Register')]"));
        Thread.sleep(2000);

        //Verify the text “Register”
        WebElement message8 = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
        System.out.println("message = " + message8.getText());
        List<String> actual8 = new ArrayList<>();
        List<String> expected8 = new ArrayList<>();
        Collections.sort(expected8);
        Assert.assertTrue(actual8.equals(expected8));
        Thread.sleep(2000);

        //Fill the mandatory fields

        send(By.xpath("//input[@id='FirstName']"), "Radha");
        send(By.xpath("//input[@id='LastName']"), "krishna");
        send(By.xpath("//input[@id='Email']"), "radhakrishna@gmail.com");
        send(By.xpath("//input[@id='Password']"), "radhe5566");
        send(By.xpath("//input[@id='ConfirmPassword']"), "radhe5566");

        //Click on “REGISTER” Button
        selectMenu(By.xpath("//button[@id='register-button']"));

        //Verify the message “Your registration completed”
        WebElement message9 = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        System.out.println("message = " + message9.getText());
        List<String> actual9 = new ArrayList<>();
        List<String> expected9 = new ArrayList<>();
        Collections.sort(expected9);
        Assert.assertTrue(actual9.equals(expected9));
        Thread.sleep(2000);

        //Click on “CONTINUE” tab
        selectMenu(By.xpath("//a[contains(text(),'Continue')]"));

        //Verify the text “Shopping card”
        WebElement message0 = driver.findElement(By.xpath("//h1[contains(text(),'Shopping cart')]"));
        System.out.println("message = " + message0.getText());
        List<String> actual0 = new ArrayList<>();
        List<String> expected0 = new ArrayList<>();
        Collections.sort(expected0);
        Assert.assertTrue(actual0.equals(expected0));
        Thread.sleep(2000);

        //click on checkbox “I agree with the terms of service”
        select(By.xpath("//input[@id='termsofservice']"));

        //Click on “CHECKOUT”
        selectMenu(By.xpath("//button[@id='checkout']"));
        //Fill the Mandatory fields
        send(By.xpath("//input[@id='BillingNewAddress_FirstName']"), "Ram");
        send(By.xpath("//input[@id='BillingNewAddress_LastName']"), "Sita");
        send(By.id("BillingNewAddress_Email"), "prime@gmail.com");
        send(By.id("BillingNewAddress_CountryId"), "India");
        send(By.xpath("//input[@id='BillingNewAddress_City']"), "surat");
        send(By.xpath("//input[@id='BillingNewAddress_Address1']"), "15,opera");
        send(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"), "567787");
        send(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"), "7985634784");
        Thread.sleep(2000);


        //Click on “CONTINUE
        selectMenu(By.xpath("//button[contains(text(),'Continue')]"));

        //Click on Radio Button “2nd Day Air ($0.00)”
        select(By.id("shippingoption_2"));
        //Click on “CONTINUE”
        selectMenu(By.xpath("//button[contains(text(),'Continue')]"));

        //Select Radio Button “Credit Card”
        select(By.id("paymentmethod_1"));
        select(By.xpath("//button[@name='save' and @class='button-1 payment-method-next-step-button']"));
        Thread.sleep(2000);

        //Select “Visa” From Select credit card dropdown
        select(By.xpath("//select[@class='dropdownlists']//option[text()='Visa']"));
        Thread.sleep(2000);

        //Fill all the details
        send(By.id("CardholderName"), "Roxyy");
        send(By.id("CardNumber"), "56748488497");
        //select[@id='ExpireMonth']//option[@value='5']
       /* WebElement drop = driver.findElement(By.xpath("//select[@id='ExpireMonth']//option[@value='5']"));
        Select select3 = new Select(drop);
        select3.selectByValue("5");*/
        select(By.xpath("//select[@id='ExpireMonth']//option[@value='5']"));
      /*  WebElement drop1 = driver.findElement(By.xpath("//select[@id='ExpireYear']//option[@value='2030']"));
        Select select4 = new Select(drop1);
        select4.selectByValue("2030");*/
        select(By.xpath("//select[@id='ExpireYear']//option[@value='2030']"));
        send(By.id("CardCode"), "4457");
        Thread.sleep(2000);
        select(By.xpath("//button[@onclick='PaymentInfo.save()' and @type='button']"));

        //Click on “CONTINUE
        selectMenu(By.xpath("//button[contains(text(),'Continue')]"));

        //Verify “Payment Method” is “Credit Card”

        //Verify “Payment Method” is “Credit Card”
        WebElement message11 = driver.findElement(By.linkText("Credit Card"));
        System.out.println("message = " + message11.getText());
        List<String> actual11 = new ArrayList<>();
        List<String> expected11 = new ArrayList<>();
        Collections.sort(expected8);
        Assert.assertTrue(actual11.equals(expected11));
        Thread.sleep(2000);

        //Verify “Shipping Method” is “2nd Day Air”
        WebElement message22 = driver.findElement(By.id("shippingoption_2"));
        System.out.println("message = " + message22.getText());
        List<String> actual22 = new ArrayList<>();
        List<String> expected22 = new ArrayList<>();
        Collections.sort(expected22);
        Assert.assertTrue(actual22.equals(expected22));
        Thread.sleep(2000);

        //Verify Total is “$698.00”
        WebElement message33 = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/span[1]"));
        System.out.println("message = " + message33.getText());
        List<String> actual33 = new ArrayList<>();
        List<String> expected33 = new ArrayList<>();
        Collections.sort(expected33);
        Assert.assertTrue(actual33.equals(expected33));
        Thread.sleep(2000);

        //Click on “CONFIRM”
        selectMenu(By.xpath("//button[@id='checkout']"));
    }
        @After
        public void close()
        {
            closeBrowser();
        }

}

