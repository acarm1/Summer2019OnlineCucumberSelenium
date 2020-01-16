package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import io.cucumber.java.en.*;

public class TopMenuStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Then("user navigates to {string} and then to {string}")
    public void user_navigates_to_and_then_to(String module, String submodule) {

      loginPage.navigateTo(module,submodule);


    }

}
