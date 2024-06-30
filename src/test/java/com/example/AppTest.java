/*package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

@TestInstance(Lifecycle.PER_CLASS)
class AppTest {
    private WebDriver driver;
    private LoginPage loginPage;
    private SelectProducts products;
    private LoadData loadUserData;


    @BeforeAll
    public void setUp()
    {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        products = new SelectProducts(driver);
        loadUserData = new LoadData(driver);


    }

    @Test
    void testApp() 
    {
        loginPage.navigateTo(loginPage.getConfigProperties("url"));
        loginPage.login(loginPage.getConfigProperties("username"), loginPage.getConfigProperties("password"));
        products.selectProducts();
        loadUserData.loadData();
    }

    @AfterAll
    public void tearDown()
    {
        driver.quit();
    }

}
*/