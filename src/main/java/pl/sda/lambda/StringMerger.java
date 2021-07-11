package pl.sda.lambda;

@FunctionalInterface
public interface StringMerger {

    // fields in interface are always implicitly public, static and final
    public static final String myConst = "";
    String mergeStrings(String first, String second);

    default String concatStrings(String first, String second, String third) {
        return first + second + third;
    }

    default String mergeStrings(String first, String second, String third, String fourth) {
        return concatStrings(first, second, third) + fourth;
    }

}
