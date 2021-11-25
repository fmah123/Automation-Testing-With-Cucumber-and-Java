package Steps;

import Base.DriverFactory;
import Pages.GoogleSearchPage;
import Pages.HomePage;
import Pages.TeamPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {

    private HomePage homePage;
    private GoogleSearchPage googleSearchPage;
    private TeamPage teamPage;

    private DriverFactory driverFactory;

    public MyStepdefs(DriverFactory driverFactory){
        this.driverFactory = driverFactory;
    }

    @Given("^I navigate to google page$")
    public void iNavigateToGooglePage() {
        googleSearchPage = new GoogleSearchPage(driverFactory.driver);
        googleSearchPage.GoToGoogleHomePage();
    }

    @When("^I enter key term \"([^\"]*)\" in the google search$")
    public void iEnterKeyTermInTheGoogleSearch(String searchEntry) throws Throwable {
        googleSearchPage.ClickAndTypeInToSearchBox(searchEntry);
    }

    @Then("^I should see TruNarrative as the first result$")
    public void iShouldSeeTruNarrativeAsTheFirstResult() {
        googleSearchPage.VerifyTruNarrativeWebsiteAsFirstSearchResult("TruNarrative");
    }

    @And("^shows TruNarrative website link \"([^\"]*)\"$")
    public void showsTruNarrativeWebsiteLink(String linkText) throws Throwable {
        googleSearchPage.VerifyTruNarrativeWebsiteLink(linkText);
    }
}
