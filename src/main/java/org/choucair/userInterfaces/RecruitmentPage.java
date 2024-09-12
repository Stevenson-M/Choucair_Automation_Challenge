package org.choucair.userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RecruitmentPage extends PageObject {

    /** --------------------------------------- Add Candidate Section ----------------------------------- */
    public static final Target ADD_BUTTON = Target.the("add button")
            .located(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
    public static final Target FIRST_NAME_INPUT = Target.the("first name input")
            .located(By.name("firstName"));
    public static final Target MIDDLE_NAME_INPUT = Target.the("middle name input")
            .located(By.name("middleName"));
    public static final Target LAST_NAME_INPUT = Target.the("last name input")
            .located(By.name("lastName"));
    public static final Target VACANCY_LIST = Target.the("list of vacancy")
            .locatedBy("//div[@class='oxd-select-text oxd-select-text--active']/div[@class='oxd-select-text--after']/i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']");
    public static final Target VACANCY_OPTION = Target.the("vacancy option")
            .located(By.xpath("/html/body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container orangehrm-save-candidate-page']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='oxd-form-row'][2]/div[@class='oxd-grid-3 orangehrm-full-width-grid']/div[@class='oxd-grid-item oxd-grid-item--gutters']/div[@class='oxd-input-group oxd-input-field-bottom-space']/div[2]/div[@class='oxd-select-wrapper']/div[@class='oxd-select-dropdown --positon-bottom']/div[@class='oxd-select-option'][8]"));
    public static final Target EMAIL_INPUT = Target.the("email input field")
          .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input"));
    public static final Target NUMBER_INPUT = Target.the("phone input field")
            .locatedBy("//div[@class='oxd-input-group oxd-input-field-bottom-space']/div[label[text()='Contact Number']]/following-sibling::div/input[@class='oxd-input oxd-input--active']");
    public static final Target KEYWORDS_INPUT = Target.the("keywords input field")
            .located(By.xpath("//input[@placeholder='Enter comma seperated words...']"));
    public static final Target TEXT_AREA_NOTES = Target.the("notes text area")
            .locatedBy("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']");
    public static final Target CHECK_BOX_CONSENT = Target.the("check box consent")
            .locatedBy("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']");
    public static final Target SAVE_BUTTON = Target.the("save button")
            .locatedBy("//button[@type='submit' and @class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    /** --------------------------------------- Add Candidate Section ----------------------------------- */


    /** --------------------------------------- Recruitment Process ----------------------------------- */
    public static final Target SHORTLIST_BUTTON = Target.the("Shortlist button")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[2]"));
    public static final Target SHORTLIST_SAVE_BUTTON = Target.the("Save button after Shortlist")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));

    public static final Target SCHEDULE_INTERVIEW_BUTTON = Target.the("Schedule Interview button")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[2]"));
    public static final Target INTERVIEW_TITLE_FIELD = Target.the("Interview Title field")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input"));
    public static final Target INTERVIEWER_FIELD = Target.the("Interviewer field")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div/div[2]/div/div/input"));
    public static final Target INTERVIEWER_FIELD_OPTION = Target.the("Interviewer field option")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[3]"));
    public static final Target DATE_FIELD = Target.the("Date field")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[3]/div/div[2]/div/div/input"));
    public static final Target SCHEDULE_INTERVIEW_SAVE_BUTTON = Target.the("Save button after scheduling interview")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));

    public static final Target MARK_INTERVIEW_PASSED_BUTTON = Target.the("Mark Interview Passed button")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]"));
    public static final Target MARK_INTERVIEW_PASSED_SAVE_BUTTON = Target.the("Save button after marking interview passed")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));

    public static final Target OFFER_JOB_BUTTON = Target.the("Offer Job button")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]"));
    public static final Target OFFER_JOB_BUTTON_SAVE_BUTTON = Target.the("Save button after offering job")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));

    public static final Target HIRE_BUTTON = Target.the("Hire button")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]"));
    public static final Target HIRE_BUTTON_SAVE_BUTTON = Target.the("Save button after hiring")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));
/** --------------------------------------- Recruitment Process ----------------------------------- */


/** --------------------------------------- Application Stage ----------------------------------- */
public static final Target EMPLOYEE_LIST = Target.the("Employee List")
        .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[3]"));
public static final Target CANDIDATE_NAME = Target.the("Candidate name")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[3]/div"));
public static final Target CANDIDATE_VACANCY = Target.the("Candidate vacancy")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[2]/div"));
public static final Target CANDIDATE_STATUS = Target.the("Candidate status")
            .located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[6]/div"));
/** --------------------------------------- Application Stage ----------------------------------- */

}

