package pl.sda.lambda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StrictStringMergerTest {

    private StringMerger stringMerger;

    @BeforeEach
    public void init() {
        stringMerger = StringConverterFactory.createStrictStringMerger();
    }

    // Red -> Green -> Refactor -> TDD
    @Test
    public void shouldCreateStrictInstance() {
        assertNotNull(stringMerger);
    }

    @Test
    public void shouldPassedPositivePath() {
        assertEquals("Ala ma kota", stringMerger.mergeStrings("Ala ma", " kota"));
    }

    /*
        assertEquals("", merger.mergeStrings(null, "")); -> NullPointerException
        assertEquals("", merger.mergeStrings("", null)); -> Null.....
        assertNull(merger.mergeStrings(null, null)); -> Null.....
     */

    @Test
    public void shouldThrowExceptionIfFirstArgumentIsNull() {
        try {
            stringMerger.mergeStrings(null, "not null:)");
        } catch (NullPointerException exc) {
            // check message - TODO
            assertEquals("First argument cannot be null!", exc.getMessage());
            return;
        }
        fail("method should throw exception");
    }
}
