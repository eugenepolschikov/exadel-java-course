package main.com.exadel.epolschikov.lection3.helpers;

/**
 * Created by ypolshchykau on 27.11.2014.
 * class containing validators for double value and for string value as well
 */
public class DataValidator {
//    public final static String NUMERIC_REGEXP = "[0-9]{1,13}(\\.[0-9]*)?";
//    public final static String NUMERIC_REGEXP="[-+]?[0-9]*\\.?[0-9]+";
    public final static String NUMERIC_REGEXP="[\\s0-9]+(\\.[0-9]*)?[\\s]*";
    public final static String OPERATION_REGEXP = "[\\sA-Za-z\\^\\+\\*\\-/\\(\\)]+[\\s]*";

//    this will be used to analyzed input like LOG, LN , etc...
    public final static String ALPHABETIC_REGEXP="[A-Za-z]+";



    public static boolean isNumericParsingAnalysis(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean isNumeric(String str) {
        return str.matches(NUMERIC_REGEXP);
    }

    public static boolean isOperation(String str) {

//        return str.matches(".*\\d+.*") && str.matches("[A-Za-z0-9]+");
        return str.matches(OPERATION_REGEXP);
    }

    public static boolean isNumericOrOperation(String str) {

        return (isNumeric(str) || isOperation(str));
    }


}
