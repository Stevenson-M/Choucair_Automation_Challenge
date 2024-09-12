package org.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.choucair.userInterfaces.RecruitmentPage.*;

public class CompleteRecruitment implements Task {
    private final String interviewTitle;
    private final String interviewer;
    private final String interviewDate;

    public CompleteRecruitment(String interviewTitle, String interviewer, String interviewDate) {
        this.interviewTitle = interviewTitle;
        this.interviewer = interviewer;
        this.interviewDate = interviewDate;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                // Shortlist the candidate
                Click.on(SHORTLIST_BUTTON),
                Click.on(SHORTLIST_SAVE_BUTTON),

                // Schedule the interview
                Click.on(SCHEDULE_INTERVIEW_BUTTON),

                // Enter interview details
                Click.on(INTERVIEW_TITLE_FIELD),
                SendKeys.of(interviewTitle).into(INTERVIEW_TITLE_FIELD),
                Click.on(INTERVIEWER_FIELD),


                SendKeys.of(interviewer).into(INTERVIEWER_FIELD),
                Click.on(INTERVIEWER_FIELD_OPTION),

                // Set interview date
                Click.on(DATE_FIELD),
                SendKeys.of(interviewDate).into(DATE_FIELD),
                Click.on(SCHEDULE_INTERVIEW_SAVE_BUTTON),

                // Mark the interview as passed
                WaitUntil.the(MARK_INTERVIEW_PASSED_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(MARK_INTERVIEW_PASSED_BUTTON),
                WaitUntil.the(MARK_INTERVIEW_PASSED_SAVE_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(MARK_INTERVIEW_PASSED_SAVE_BUTTON),

                // Offer the job
                Click.on(OFFER_JOB_BUTTON),
                Click.on(OFFER_JOB_BUTTON_SAVE_BUTTON),

                // Hire the candidate
                Click.on(HIRE_BUTTON),
                Click.on(HIRE_BUTTON_SAVE_BUTTON)
        );
    }

    public static CompleteRecruitment withDetails(String interviewTitle, String interviewer, String interviewDate) {
        return new CompleteRecruitment(interviewTitle, interviewer, interviewDate);
    }
}


