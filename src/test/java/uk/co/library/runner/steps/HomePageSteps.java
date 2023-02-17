package uk.co.library.runner.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import uk.co.library.pages.HomePage;

public class HomePageSteps {

    @Given("^user on HomePage$")
    public void userOnHomePage() {
    }

    @When("^User accept cookies$")
    public void userAcceptCookies() throws InterruptedException {
        new HomePage().acceptCookiesandSwitchToIframe();
    }

    @And("^User enter job title \"([^\"]*)\"$")
    public void userEnterJobTitle(String Jobt){
        new HomePage().enterJobTitle(Jobt);
    }

    @And("^User enter Location \"([^\"]*)\"$")
    public void userEnterLocation(String area)  {
        new HomePage().enterLocation(area);
    }

    @And("^user to select distance \"([^\"]*)\"$")
    public void userToSelectDistance(String dis) {
        new HomePage().selectDistance(dis);
    }

    @And("^user to click on moreSearchOptionsLink$")
    public void userToClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("^user to enter salaryMin \"([^\"]*)\"$")
    public void userToEnterSalaryMin(String minsalary) {
        new HomePage().enterMinSalary(minsalary);
    }

    @And("^user to enter salaryMax \"([^\"]*)\"$")
    public void userToEnterSalaryMax(String maxsalary)  {
        new HomePage().enterMaxSalary(maxsalary);
    }

    @And("^user to select salaryType \"([^\"]*)\"$")
    public void userToSelectSalaryType(String typesalary)  {
        new HomePage().selectSalaryType(typesalary);
    }

    @And("^user to select jobType \"([^\"]*)\"$")
    public void userToSelectJobType(String seljobtype)   {
        new HomePage().selectJobType(seljobtype);
    }

    @And("^user click on Find Jobs button$")
    public void userClickOnFindJobsButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("^User verify the result \"([^\"]*)\"$")
    public void userVerifyTheResult(String mess)  {
        Assert.assertEquals(mess,new HomePage().verifytextmethod(mess));


    }
}
