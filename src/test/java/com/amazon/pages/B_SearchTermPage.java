package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class B_SearchTermPage {
    public B_SearchTermPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchTextBox;

    @FindBy(id = "nav-search-submit-button")
    public WebElement searchButton;

    @FindBy(id = "productTitle")
    public WebElement productTitle;


}
