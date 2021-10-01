package StepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStepDef {

	@Given("I am on User registration page")
	public void i_am_on_user_registration_page() {
		System.out.println("Registraion Page is open");
	}

	@When("I enter below data")
	public void i_enter_below_data(DataTable dataTable) {
		List<String> listView = dataTable.asList();
		System.out.println("Printing using asList");
		for (String string : listView) {
			System.out.println(string);
		}
		System.out.println("Printing using asLists");
		List<List<String>> asListView = dataTable.asLists();
		for (List<String> list : asListView) {
			System.out.println(list);
		}
	}

	@When("Click on Submit")
	public void click_on_submit() {
		System.out.println("Clicking Submit");
	}

	@Then("user should be registered")
	public void user_should_be_registered() {
		System.out.println("user is registered");
	}
}
