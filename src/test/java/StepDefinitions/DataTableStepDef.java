package StepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableStepDef {

	@Given("^User knows which fruits to be printed$")
	public void user_knows_which_fruits_to_be_printed() throws Throwable {
		System.out.println("user_knows_which_fruits_to_be_printed");
	}

	@When("^User starts printing$")
	public void user_starts_printing(DataTable fruits) {
		List<String> asListExample = fruits.asList();
		List<List<String>> asListsPlural = fruits.asLists();
		System.out.println("user_starts_printing");
		for (String fruit : asListExample) {
			//System.out.println(fruit);
		}
		
		for (List<String> list : asListsPlural) {
			System.out.println(list);
		}
	}

	@Then("^Fruits should be displayed$")
	public void fruits_should_be_displayed() throws Throwable {
		System.out.println("fruits_should_be_displayed");
	}

	@And("^user should be happy$")
	public void user_should_be_happy() throws Throwable {
		System.out.println("user_should_be_happy");
	}
}
