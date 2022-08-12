import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class AmazonWebsite extends DriverSetup {

    public static String base_url = "https://www.amazon.com/";

    @Test
    public static void runTest() throws InterruptedException {
        driver.get(base_url);
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();
        Thread.sleep(2000);

        Select dropOption = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
        dropOption.selectByValue("search-alias=baby-products-intl-ship");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bag");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        Thread.sleep(2000);

    }
}
