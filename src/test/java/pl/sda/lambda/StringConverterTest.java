package pl.sda.lambda;

import org.junit.jupiter.api.Test;


class StringConverterTest {

    @Test
    public void lambdaExample() {
        // int (String arg);
        StringConverter myStringConverter = (String myString) -> 5;
        StringConverter myStringConverter2 = myString -> {
            System.out.println("my converter is running");
            return myString.length();
        };
//        StringConverter wrongReturnType = myString -> "myString.length()";
        StringConverter myStringConverter3 = myString -> {
            return myString.length();
        };
        StringConverter myStringConverter4 = myString -> myString.length(); // very good:)
//        StringConverter myStringConverter5 = String::length;
    }
}