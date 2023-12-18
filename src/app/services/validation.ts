import { Validator, Validators } from "@angular/forms";

export class CustomValidation {

    static validFirstName = Validators.pattern('^[a-zA-Z]*$');

    static requiredValidFirstName = Validators.compose([Validators.required, CustomValidation.validFirstName]);

    static validLastName = Validators.pattern('^[a-zA-Z ]*$');

    static requiredValidLastName = Validators.compose([Validators.required, CustomValidation.validLastName]);

    static validEmail = Validators.pattern('[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,8})');

    static requiredValidEmail = Validators.compose([Validators.required, CustomValidation.validEmail]);

    static requiredDob = Validators.compose([Validators.required]);

    static requiredValidGender = Validators.compose([Validators.required]);

    static requiredValidSalary = Validators.compose([Validators.required]);

    static requiredValidExperience = Validators.compose([Validators.required]);

    static requiredValidEducation = Validators.compose([Validators.required]);

    static validCompany = Validators.pattern('^[a-zA-Z ]*$');

    static requiredValidCompany = Validators.compose([Validators.required, CustomValidation.validCompany]);
   
    

    
}
