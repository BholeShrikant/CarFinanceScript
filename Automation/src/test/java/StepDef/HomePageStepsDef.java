package StepDef;

import PageClass.HomePage;
import Utilities.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class HomePageStepsDef {
	HomePage homePage = new HomePage(Base.baseMethod());
	@When("user clicks on apply now link")
	public void user_clicks_on_apply_now_link() {

		homePage.clickOnApplyLink();
		System.out.println("User clicks on Apply Now link on Home screen");
	}

	@And("user clicks on apply now under new car finance")
	public void user_clicks_on_apply_now_under() {
		homePage.clickOnApplybutton();
	}

	@And("user clicks on apply now link under new car finance")
	public void user_clicks_on_apply_now_link_under_new_car_finance() {
		homePage.clickOnApplyNowOnNewCarFinance();
	}

	@And("user clicks on click here link for a call back request")
	public void user_clicks_on_click_here_link_for_a_call_back_request() {
		homePage.clickHereLink();
	}

	@And("user enters required details on request a call back popup")
	public void user_enters_required_details_on_request_a_call_back_popup() {
		homePage.setDetailsOnRequestCallPopup();
	}
}
