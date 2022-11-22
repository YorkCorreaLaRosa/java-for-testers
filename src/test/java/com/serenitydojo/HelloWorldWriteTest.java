package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriteTest {

    @Test
    public void shouldWirteHelloWorldToTheConsole() {
        HelloWorldWriter wirter = new HelloWorldWriter();
        wirter.wirteHelloWorld();
    }

    @Test
    public void dereclarinNumericalVatiables() {

        final int ageThisYear = 42;

        int ageNextYear = ageThisYear + 1;

        long starsInTheFalaxy = 10000000000L;

        double weight = 15.5;

        System.out.println("age = " + ageNextYear);
    }

    @Test
    public void workingWithStrings() {
        String firstName = "  Sarah-Jane  ";

        //String upperCaseFirstName = firstName.toLowerCase();
        String upperCaseFirstName = firstName.replace("Sarah", "Mary");


        System.out.println(firstName.trim());
        System.out.println(upperCaseFirstName.length());

    }
}
