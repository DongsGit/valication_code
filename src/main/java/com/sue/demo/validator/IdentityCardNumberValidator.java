package com.sue.demo.validator;

import com.sue.demo.util.IdCardValidatorUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IdentityCardNumberValidator implements ConstraintValidator<IdentityCardNumber, Object> {

    @Override
    public void initialize(IdentityCardNumber identityCardNumber) {
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        return IdCardValidatorUtils.isValidate18Idcard(o.toString());
    }
}