package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption(){

    var dropdownPage = homePage.clickDropdown();
    String option = "Option 1";
    dropdownPage.selectFormDropdown(option);
    var selectedOptions = dropdownPage.getSelectedOption();
    assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
    assertTrue(selectedOptions.contains(option), "Option not selected");

    }
}
