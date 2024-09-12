package org.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.choucair.userInterfaces.RecruitmentPage;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class AddCandidate implements Task {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String email;
    private final String contactNumber;
    private final String keywords;
    private final String notes;

    public AddCandidate(String firstName, String middleName, String lastName, String vacancy,
                        String email, String contactNumber, String keywords, String notes) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.contactNumber = contactNumber;
        this.keywords = keywords;
        this.notes = notes;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RecruitmentPage.ADD_BUTTON),
                WaitUntil.the(RecruitmentPage.FIRST_NAME_INPUT, isVisible()).forNoMoreThan(10).seconds(),
                SendKeys.of(firstName).into(RecruitmentPage.FIRST_NAME_INPUT),
                SendKeys.of(middleName).into(RecruitmentPage.MIDDLE_NAME_INPUT),
                SendKeys.of(lastName).into(RecruitmentPage.LAST_NAME_INPUT),
                Click.on(RecruitmentPage.VACANCY_LIST),
                Click.on(RecruitmentPage.VACANCY_OPTION),
                WaitUntil.the(RecruitmentPage.EMAIL_INPUT, isVisible()).forNoMoreThan(10).seconds(),
                SendKeys.of(email).into(RecruitmentPage.EMAIL_INPUT),
                SendKeys.of(contactNumber).into(RecruitmentPage.NUMBER_INPUT),
                SendKeys.of(keywords).into(RecruitmentPage.KEYWORDS_INPUT),
                SendKeys.of(notes).into(RecruitmentPage.TEXT_AREA_NOTES),
                Click.on(RecruitmentPage.CHECK_BOX_CONSENT),
                Click.on(RecruitmentPage.SAVE_BUTTON)
        );
    }

    public static AddCandidate withDetails(String firstName, String middleName, String lastName, String vacancy,
                                           String email, String contactNumber, String keywords, String notes) {
        return new AddCandidate(firstName, middleName, lastName, vacancy, email, contactNumber, keywords, notes);
    }
}


