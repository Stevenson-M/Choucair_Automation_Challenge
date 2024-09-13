package org.choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.choucair.userInterfaces.DashboardPage;
import org.choucair.userInterfaces.RecruitmentPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CandidateDetails implements Question<Boolean> {

    private final String expectedName;
    private final String expectedVacancy;
    private final String expectedStatus;

    public CandidateDetails(String name, String vacancy, String status) {
        this.expectedName = name;
        this.expectedVacancy = vacancy;
        this.expectedStatus = status;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        WaitUntil.the(DashboardPage.RECRUITMENT_OPTION, isVisible()).forNoMoreThan(30).seconds().performAs(actor);

        actor.attemptsTo(WaitUntil.the(RecruitmentPage.EMPLOYEE_LIST, isVisible()).forNoMoreThan(30).seconds());


        WebElementFacade nameElement = RecruitmentPage.CANDIDATE_NAME.resolveFor(actor);
        WebElementFacade vacancyElement = RecruitmentPage.CANDIDATE_VACANCY.resolveFor(actor);
        WebElementFacade statusElement = RecruitmentPage.CANDIDATE_STATUS.resolveFor(actor);

        String actualName = nameElement.getText();
        String actualVacancy = vacancyElement.getText();
        String actualStatus = statusElement.getText();

        System.out.println("Expected Name: " + expectedName);
        System.out.println("Actual Name: " + actualName);
        System.out.println("Expected Vacancy: " + expectedVacancy);
        System.out.println("Actual Vacancy: " + actualVacancy);
        System.out.println("Expected Status: " + expectedStatus);
        System.out.println("Actual Status: " + actualStatus);

        boolean nameMatch = actualName.equals(expectedName);
        boolean vacancyMatch = actualVacancy.equals(expectedVacancy);
        boolean statusMatch = actualStatus.equals(expectedStatus);

        System.out.println("Name Match: " + nameMatch);
        System.out.println("Vacancy Match: " + vacancyMatch);
        System.out.println("Status Match: " + statusMatch);

        return nameMatch && vacancyMatch && statusMatch;
    }

    public static Question<Boolean> areCorrect(String name, String vacancy, String status) {
        return new CandidateDetails(name, vacancy, status);
    }
}
