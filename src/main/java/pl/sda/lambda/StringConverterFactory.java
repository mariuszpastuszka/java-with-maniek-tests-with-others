package pl.sda.lambda;

import static java.util.Objects.requireNonNull;

public final class StringConverterFactory {

    private StringConverterFactory() {
        throw new UnsupportedOperationException("This class shouldn't be instantiated!!!");
    }

    public static StringMerger createStandardStringMerger() {
        return (s1, s2) -> {
            if (s1 == null) {
                return s2;
            } else if (s2 == null) {
                return s1;
            }
            return s1 + s2;
        };
    }

    public static StringMerger createStrictStringMerger() {
        return (s1, s2) -> {
            requireNonNull(s1, "First argument cannot be null!");
            requireNonNull(s2, "Second argument cannot be null!");

            return s1 + s2;
        };
    }
}
