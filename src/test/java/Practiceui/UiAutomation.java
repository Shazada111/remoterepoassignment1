package Practiceui;

import org.testng.annotations.Test;
import ui.Trello;

import static ui.Automations.*;

public class UiAutomation {

    @Test
    public void demo() {

        //test data
        String email = data().internet().emailAddress();
        String pass = data().internet().password();
        String expected = "There isn`t an account for this email";

        // test script
        openBrowser();
        visit(Trello.url_home);
        sleep(1);
        String homeBanner = getText(Trello.home_page_banner);
        lit(Trello.home_page_banner);
        sleep(3);
        click(Trello.login_link);
        sleep(1);
        type(Trello.enter_email, email);
        type(Trello.enter_password, pass);
        click(Trello.btn_login);
        sleep(3);
        String extract = getText(Trello.error_message);
        closeBrowser();

        // Assertions & Decision
        boolean result = expected.equals(extract);
        if (result) {
            System.out.println("Test passed");
            System.out.println("no need to save the recording");
        }
        System.out.println("Verficationfailed");
        System.out.println("take a screenshot for bugs");
        System.out.println("Save the recording");
    }
}

