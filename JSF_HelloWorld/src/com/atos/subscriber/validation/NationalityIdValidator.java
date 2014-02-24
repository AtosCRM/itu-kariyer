package com.atos.subscriber.validation;

import java.math.BigDecimal;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("com.atos.subscriber.validation.NationalityIdValidator")
public class NationalityIdValidator implements Validator {

	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
			throws ValidatorException {
		if (arg2.toString().startsWith("0")) {
			throw new ValidatorException(new FacesMessage(
					"Gecerli bir TC kimlik Degil",
					"TC Kimlik numarasi 11 hane olmalidir"));
		}
	}
	


}
