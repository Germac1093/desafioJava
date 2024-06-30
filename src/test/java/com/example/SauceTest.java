package com.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriver;

public class SauceTest {

    private WebDriver driver;
    private LoginPage loginPage;
    private SelectProducts products;
    private LoadData loadUserData;

    @BeforeClass
    public void setUp() {
        // Obtener el navegador desde una variable de entorno o argumento de línea de comandos
        String browser = System.getProperty("browser", "chrome"); // Default to chrome if not set
        driver = WebDriverFactory.getDriver(browser);
        loginPage = new LoginPage(driver);
        products = new SelectProducts(driver);
        loadUserData = new LoadData(driver);
    }

    @Test
    public void testApp() {
        loginPage.navigateTo(loginPage.getConfigProperties("url"));
        loginPage.login(loginPage.getConfigProperties("username"), loginPage.getConfigProperties("password"));
        products.selectProducts();
        loadUserData.loadData();
    }

    @AfterClass
    public void tearDown() {
        WebDriverFactory.quitDriver();
    }
}
