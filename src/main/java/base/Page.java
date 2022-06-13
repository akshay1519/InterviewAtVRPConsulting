package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.*;

public class Page {
    public static WebDriver driver;
    public static HashMap<String,String> storyMap;
    public static WebDriverWait wait;

    @BeforeSuite
    private static WebDriver createDriver(){
        if (driver==null) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            options.addArguments("disable-infobars");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
            driver.get(Constants.testUrl);
            storyMap = new HashMap<>();
        }
        return driver;
    }

    public static WebDriver getDriver() {
        if (driver == null){
            driver = createDriver();
        }
        return driver;
    }

    public void getUrl(String url){
        getDriver().get(url);
    }

    public boolean isElementPresent(WebElement element){
        boolean flag = false;
        try {
            explicitWait(element,10);
            if (element.isDisplayed() || element.isEnabled())
                flag = true;
        }catch (NoSuchElementException | TimeoutException e){
            System.out.println("Not Visible");
        }
        return flag;
    }

    public void type(WebElement element,String value){
        element.clear();
        element.sendKeys(value);
    }

    public void actionClick(WebElement element){
        Actions actions = new Actions(getDriver());
        actions.click(element).build().perform();
    }

    public void click(WebElement element){
        element.click();
    }

    public void clickJs(WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor)getDriver();
        executor.executeScript("arguments[0].click();", element);
    }

    public void selectByValues(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public void selectByVisibleText(WebElement element, String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public void explicitWait(WebElement element, long timeout){
        try {
            new WebDriverWait(getDriver(),Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOf(element));
        }catch (TimeoutException toe){
            toe.printStackTrace();
        }
    }

    public void swithchtoFrame(WebElement element){
        getDriver().switchTo().frame(element);
    }

    public void clickOnListValue(List<WebElement> elementsList, String value){
        for (WebElement element:elementsList) {
            if (element.getText().equals(value)) {
                element.click();
                break;
            }
        }
    }

    public void clickOnAllListValue(List<WebElement> elementsList){
        for (WebElement element:elementsList) {
            if (isElementPresent(element)) {
                click(element);
            }
        }
    }

    public Map<String,String> activeWindowsList(){
        Set<String> windows = getDriver().getWindowHandles();
        List<String> windowList = new ArrayList<>(windows);
        HashMap<String,String> map = new HashMap<>();
        for (String st:windowList){
            getDriver().switchTo().window(st);
            String currTitle = getDriver().getTitle();
            System.out.println(currTitle);
            map.put(currTitle, st);
        }
        System.out.println(map);
        return map;
    }

    public void selectWindowIndex(int index){
        Set<String> windows = getDriver().getWindowHandles();
        List<String> windowList = new ArrayList<>(windows);
        getDriver().switchTo().window(windowList.get(index));
    }
    public void selectWindow(String title){
        Map<String,String> map = activeWindowsList();
        String selectedWindowID = null;
        String selectedWindowTitle = null;
        for (Map.Entry<String,String> it:map.entrySet()){
            selectedWindowTitle = it.getKey();
            selectedWindowID = it.getValue();
            if (selectedWindowTitle.contains(title)) {
                getDriver().switchTo().window(selectedWindowID);
                break;
            }
        }
        System.out.println(selectedWindowID);
    }

    public static byte[] getByteScreenshot() throws IOException
    {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        return FileUtils.readFileToByteArray(src);
    }


    @AfterSuite
    public static void tearDown(){
        getDriver().quit();
    }
}
