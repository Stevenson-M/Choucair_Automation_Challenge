package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import org.choucair.questions.CandidateDetails;
import org.choucair.tasks.*;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class StepDefinitions {

    @Given("I am on the OrangeHRM login page")
    public void iAmOnTheOrangeHRMLoginPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenWebsite.at("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
    }

    @When("I log in with the following credentials:")
    public void iLogInWithCredentials(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps();
        String username = data.get(0).get("Username");
        String password = data.get(0).get("Password");
        OnStage.theActorInTheSpotlight().attemptsTo(Login.withCredentials(username, password));
    }

    @And("I navigate to the Recruitment menu")
    public void iNavigateToTheRecruitmentMenu() {
        OnStage.theActorInTheSpotlight().attemptsTo(NavigateToRecruitment.option());
    }

    @And("I add a new candidate with the following details:")
    public void iAddANewCandidateWithTheFollowingDetails(DataTable dataTable) {
        // Convert the DataTable into a list of maps
        List<Map<String, String>> candidates = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> candidate : candidates) {
            // Extract values from the map using the exact column names
            String firstName = candidate.get("Full Name");
            String middleName = candidate.get("Middle Name");
            String lastName = candidate.get("Last Name");
            String email = candidate.get("Email");
            String contactNumber = candidate.get("Contact Number");
            String keywords = candidate.get("Keywords");
            String notes = candidate.get("Notes");

            Actor actor = OnStage.theActorInTheSpotlight();
            actor.attemptsTo(
                    AddCandidate.withDetails(
                            firstName,
                            middleName,
                            lastName,
                            "", // Vacancy is handled by clicking elements in the code
                            email,
                            contactNumber,
                            keywords,
                            notes
                    )
            );
        }
    }

    @And("I finish the complete the hiring process using the following details:")
    public void iFinishTheCompleteHiringProcessUsingTheFollowingDetails(DataTable dataTable) {
        // Convert the DataTable into a list of maps to extract the interview details
        List<Map<String, String>> interviewDetails = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> interview : interviewDetails) {
            String interviewTitle = interview.get("Interview Title");
            String interviewer = interview.get("Interviewer");
            String interviewDate = interview.get("Date");

            Actor actor = OnStage.theActorInTheSpotlight();
            actor.attemptsTo(
                    CompleteRecruitment.withDetails(interviewTitle, interviewer, interviewDate)
            );
        }
    }

    @Then("I should see the candidate details as follows:")
    public void iShouldSeeTheCandidateDetailsAsFollows(DataTable dataTable) {

        OnStage.theActorInTheSpotlight().attemptsTo(NavigateToRecruitment.option());

        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        String expectedName = data.get(0).get("Name");
        String expectedVacancy = data.get(0).get("Vacancy");
        String expectedStatus = data.get(0).get("Status");

        OnStage.theActorInTheSpotlight().should(
                seeThat("the candidate details are correct",
                        CandidateDetails.areCorrect(expectedName, expectedVacancy, expectedStatus))
        );
    }
}





