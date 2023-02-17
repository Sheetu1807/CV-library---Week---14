import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.library.pages.HomePage;

public class MyStepdefs {

    @Given("^User is on Home Page$")
    public void userIsOnHomePage() {

    }

    @When("^I enter job title in \"([^\"]*)\" field$")
    public void iEnterJobTitleInField(String jobTitle) {
       new HomePage().enterJobTitle(jobTitle);
    }

    @And("^I enter location in \"([^\"]*)\" field$")
    public void iEnterLocationInField(String location) {
       new HomePage().enterlocation(location);
    }

    @And("^I select distance in \"([^\"]*)\" dropdown menu$")
    public void iSelectDistanceInDropdownMenu(String distance) {
        new HomePage().selectDistance(distance);
    }

    @And("^I click on more search option link$")
    public void iClickOnMoreSearchOptionLink() {
    }

    @And("^I enter salary minimum in \"([^\"]*)\" field$")
    public void iEnterSalaryMinimumInField(String salaryMin) {
       new HomePage().enterSalarymin(salaryMin);
    }

    @And("^I enter salary maximum in \"([^\"]*)\" field$")
    public void iEnterSalaryMaximumInField(String salaryMax) {
        new HomePage().enterSalarymax(salaryMax);
    }

    @And("^I select salary type \"([^\"]*)\" dropdown menu$")
    public void iSelectSalaryTypeDropdownMenu(String salaryType) {
        new HomePage().selectSalaryType(salaryType);
    }

    @And("^I select job type \"([^\"]*)\" dropdown menu$")
    public void iSelectJobTypeDropdownMenu(String jobType) {
        new HomePage().selectJobTypeDropdown(jobType);
    }

    @And("^I click on field jobs button$")
    public void iClickOnFieldJobsButton() {
    }

    @Then("^I can see the \"([^\"]*)\" and user is on result page$")
    public void iCanSeeTheAndUserIsOnResultPage(String result) {
        new HomePage().verifyResult();
    }
}
