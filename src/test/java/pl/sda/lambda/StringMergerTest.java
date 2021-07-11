package pl.sda.lambda;


import org.junit.jupiter.api.Test;

class StringMergerTest {

    @Test
    public void testLambdaMerging() {
        // mergeStrings - 3 cases
        StringMerger stringMerger1 = (String first, String second) -> {
            return first + second;
        };
        StringMerger stringMerger2 = (String first, String second) -> first + second; // first.+(second)
        StringMerger stringMerger3 = (first, second) -> first + second;
    }
}