package com.nopcommerce.demo.testsuite;
/**
 * 1. create class "TopMenuTest" into testsuite package
 * 1.1 create method with name "selectMenu" it has one parameter name "menu" of type
 * string
 * 1.2 This method should click on the menu whatever name is passed as parameter.
 * 1.3. create the @Test method name verifyPageNavigation.use selectMenu method to
 * select the Menu and click on it and verify the page navigation.
 */

import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    TopMenuPage topMenuPage = new TopMenuPage();

    @Test
    public void verifyPageNavigation(){
    topMenuPage.selectMenu("Gift Cards");
    }
}
