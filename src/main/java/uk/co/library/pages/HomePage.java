package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void acceptCookiesandSwitchToIframe() throws InterruptedException {
        driver.switchTo().frame("gdpr-consent-notice");
        Thread.sleep(100);
        WebElement acceptCookies = driver.findElement(By.xpath("//span[text()='Accept All']"));
        acceptCookies.click();
    }

    @CacheLookup
    @FindBy(xpath ="//input[@id='keywords']" )
    WebElement JobTitle;

    @FindBy(xpath ="//input[@id='location']")
    WebElement Location;

    @FindBy(xpath ="//select[@id='distance']" )
    WebElement Distance;

    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement Moresearchoptions;

    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement SalaryMin;

    @FindBy(xpath = "//input[@id='salarymax']" )
    WebElement SalaryMax;

    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement SalaryType;

    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement Jobtype;

    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement Findjobbutton;

    @FindBy(xpath = "//div[@class='search-header']//h1")
    WebElement verifytext;


    public String verifytextmethod(String mess){
        return getTextFromElement(verifytext);
    }
    public void enterJobTitle(String jobTitle){
        sendTextToElement(JobTitle, jobTitle);
    }

    public void enterLocation(String location){
        sendTextToElement(Location,location);
    }
    public void selectDistance(String distance){
        selectByVisibleTextFromDropDown(Distance,distance);
    }
    public void clickOnMoreSearchOptionLink(){
        clickOnElement(Moresearchoptions);
        log.info("Click on more search option"+Moresearchoptions.toString());
    }
    public void enterMinSalary(String minSalary){
        sendTextToElement(SalaryMin,minSalary);
        log.info("Enter minimum salary"+SalaryMin.toString());
    }
    public void enterMaxSalary(String maxSalary){
        sendTextToElement(SalaryMax,maxSalary);
        log.info("Enter maximum salary"+maxSalary.toString());
    }

    public void selectSalaryType(String sType){
        selectByVisibleTextFromDropDown(SalaryType,sType);

    }
    public void selectJobType(String jobType){
        selectByVisibleTextFromDropDown(Jobtype,jobType);

    }
    public void clickOnFindJobsButton(){
        clickOnElement(Findjobbutton);
    }

}