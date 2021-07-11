package pl.sda.lambda;

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
}
