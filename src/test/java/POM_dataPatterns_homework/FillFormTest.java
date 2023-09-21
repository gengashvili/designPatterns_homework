package POM_dataPatterns_homework;

import POM_dataPatterns_homework.data.FormData;

import POM_dataPatterns_homework.steps.FormsSteps;
import POM_dataPatterns_homework.steps.HomeSteps;
import POM_dataPatterns_homework.steps.RegistrationSteps;
import POM_dataPatterns_homework.steps.ResultSteps;

import org.testng.Assert;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.*;

public class FillFormTest extends TestConfig {
    HomeSteps homeSteps = new HomeSteps();
    FormsSteps formsSteps = new FormsSteps();
    RegistrationSteps registrationSteps = new RegistrationSteps();
    ResultSteps resultSteps = new ResultSteps();
    FormData formData = new FormData();


    @Test
    public void fillForm() {
        open("https://demoqa.com/");

        homeSteps.navigateToForms();
        formsSteps.navigateToPractiseForm();

        registrationSteps
                .setFirstName()
                .setLastName()
                .setGender()
                .setMobileNumber()
                .submitForm();

        resultSteps.checkThanksMessageVisibility();

        String actualStudentName = resultSteps.getStudentName();
        String actualGender = resultSteps.getGender();
        String actualMobileNumber = resultSteps.getMobileNumber();

        String expectedStudentName = formData.firstName + " " + formData.lastName;
        String expectedGender = formData.gender;
        String expectedMobileNumber = formData.mobileNumber;

        Assert.assertEquals(actualStudentName, expectedStudentName);
        Assert.assertEquals(actualGender, expectedGender);
        Assert.assertEquals(actualMobileNumber, expectedMobileNumber);

    }

}
