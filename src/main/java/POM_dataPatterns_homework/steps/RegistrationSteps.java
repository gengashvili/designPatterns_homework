package POM_dataPatterns_homework.steps;

import POM_dataPatterns_homework.data.FormData;
import io.qameta.allure.Step;
import POM_dataPatterns_homework.pages.RegistrationPage;

public class RegistrationSteps {
    FormData formData = new FormData();
    RegistrationPage registrationPage = new RegistrationPage();

    @Step
    public RegistrationSteps setFirstName() {
        registrationPage.firstNameInput.setValue(formData.firstName);
        return this;
    }

    @Step
    public RegistrationSteps setLastName() {
        registrationPage.lastNameInput.setValue(formData.lastName);
        return this;
    }

    @Step
    public RegistrationSteps setGender() {
        registrationPage.genderInput(formData.gender).click();
        return this;
    }

    @Step
    public RegistrationSteps setMobileNumber() {
        registrationPage.mobileNumberInput.setValue(formData.mobileNumber);
        return this;
    }

    @Step
    public RegistrationSteps submitForm() {
        registrationPage.form.submit();
        return this;
    }
}
