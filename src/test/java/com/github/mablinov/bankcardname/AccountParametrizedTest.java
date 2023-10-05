package com.github.mablinov.bankcardname;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountParametrizedTest {
    private final String cardHolderName;
    private final Boolean expectedResult;

    public AccountParametrizedTest(String cardHolderName, Boolean expectedResult) {
        this.cardHolderName = cardHolderName;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Павел Иванов", true},
                {"ПИ", false},
                {" Павел Иванов ", false},
                {"Павел  Иванов", false},
                {"Самуэль Габриелльсон", false}

        };
    }

    @Test
    public void shouldVerifyName() throws Exception {
        Account account = new Account(cardHolderName);
        assertEquals(expectedResult,  account.checkNameToEmboss());
    }
}

