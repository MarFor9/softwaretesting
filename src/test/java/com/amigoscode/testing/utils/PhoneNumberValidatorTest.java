package com.amigoscode.testing.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PhoneNumberValidatorTest {

    private PhoneNumberValidator underTest;

    @BeforeEach
    void setUp() {
        underTest = new PhoneNumberValidator();
    }

    @ParameterizedTest()
    @CsvSource({
            "+447000000000, true",
            "+4470000000000, false",
            "4470000000000, false"

    })
    void itShouldValidatePhoneNumber(String phoneNumber, boolean expected) {
        //When
        boolean isValid = underTest.test(phoneNumber);
        //Then
        assertThat(isValid).isEqualTo(expected);
    }
}
