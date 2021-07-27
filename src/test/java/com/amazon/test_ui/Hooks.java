package com.amazon.test_ui;

import com.amazon.utilities.ConfigReader;
import com.amazon.utilities.Driver;
import com.amazon.utilities.Log4j;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


//=============This class is created for before and after methods.==========================//
public class Hooks {

    //=============This is Before method. This method will run before every test method.========//
    @BeforeTest
    public void setup() {

        Log4j.startLog("Test  is Starting");   // I used Log4j for taking logs.

        Driver.getDriver().get(ConfigReader.getProperty("url"));   // Opening Amazon URL

        Log4j.info("Opening Page : " + ConfigReader.getProperty("url"));
    }


    //=============This is Before method. This method will run before every test method.========//
    @AfterTest
    public void tearDown() {
        Log4j.endLog("Test is Ending");

        Driver.closeDriver();
    }
}



