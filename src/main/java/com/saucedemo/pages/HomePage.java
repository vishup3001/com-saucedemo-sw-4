package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
    By productMessage = By.xpath("//span[@class='title']");
    By listOfProduct = By.xpath("//div[@class='inventory_item']");


    /**
     * This method is used to get the title of homepage
     * @return
     */
    public String getProductMessage(){
        return getTextFromElement(productMessage);
    }

    /**
     * This method is used to get the list of product
     * @return
     */
    public int getNumberofProductOnHomePage(){
        List<WebElement> totalproduct = driver.findElements(listOfProduct);
        return totalproduct.size();
    }
}
