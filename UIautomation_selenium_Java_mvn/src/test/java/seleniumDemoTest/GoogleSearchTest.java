package seleniumDemoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearchTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the path to your WebDriver executable if not using WebDriverManager
        //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize the ChromeDriver instance
        driver = new ChromeDriver();
    }

    @Test
    public void testOpenGoogle() {
        // Open Google homepage
        driver.get("https://www.google.com");

        // Get the title of the page
        String pageTitle = driver.getTitle();

        // Verify that the title is "Google"
        Assert.assertEquals(pageTitle, "Google", "Title should be 'Google'");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser and quit the WebDriver instance
        if (driver != null) {
            driver.quit();
        }
    }
}
