package com.amazon.test_ui;

import com.amazon.pages.E_ExtensionInstallationPage;
import com.amazon.utilities.ReusableMethods;
import com.amazon.utilities.WriteToText;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Set;

public class E_ExtensionInstallation {

    //=============In this method i automated the installation of extension===========//
    @Test
    public void extensionInstall() {

        E_ExtensionInstallationPage e_extensionInstallationPage=new E_ExtensionInstallationPage();


        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");


        //Add my downloaded crx file path below.
        options.addExtensions(new File("goFullPage.crx"));


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);


        options.merge(capabilities);


        //Setting up ChromeDriver with WebDriver Manager.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);


        driver.get("chrome-extension://fdpohaocaechififmbbbbbknoalclacl/html/popup.html");


        String firstHandle=driver.getWindowHandle();
        Set<String> handles=driver.getWindowHandles();

        for (String w:handles) {
            if (!w.equals(firstHandle)) {
                driver.close();
                driver.switchTo().window(w);
            }
        }


        String fileName = "extensionPage";
        String url = driver.getCurrentUrl().toString();
        WriteToText.write(fileName, "1. EXTENSION PAGE URL : \n" + url);


        String pageTitle = driver.getTitle();
        WriteToText.write(fileName, "2. EXTENSION HOMEPAGE MESSAGE : \n" + pageTitle);
        ReusableMethods.waitFor(3);
    }

}
