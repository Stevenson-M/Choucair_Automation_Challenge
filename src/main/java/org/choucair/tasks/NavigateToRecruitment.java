package org.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.choucair.userInterfaces.DashboardPage;

public class NavigateToRecruitment implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DashboardPage.RECRUITMENT_OPTION)
        );
    }

    public static NavigateToRecruitment option() {
        return new NavigateToRecruitment();
    }
}