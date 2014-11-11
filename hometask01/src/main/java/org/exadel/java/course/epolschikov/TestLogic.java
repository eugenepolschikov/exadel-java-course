package org.exadel.java.course.epolschikov;

/**
 * this class is    user action sequence for setting the password
 */
public class TestLogic {
    public static void main(String[] args) {

        UserLoginMethods passAnalysis = new UserLoginMethods();

        boolean passwordValid = false;
        while (!passwordValid) {

            passAnalysis.passwordsInput();

            //       verification that pass are of the same length;
            boolean lengthEqualityIndicator = passAnalysis.lengthComparison();
            if (!lengthEqualityIndicator) {
                System.out.println("your password and confirmation have different length. Please, repeat your input.");
                continue;
            }

//            verification that  pass  and confirmation are the same
            boolean equalityIndicator = passAnalysis.isPassEqualToConfirmation();
            if (!equalityIndicator) {
                System.out.println("your password and confirmation are not the same. Please, repeat your input");
                continue;
            }

//            verification that pass length is between 8 and 16 symbols
            boolean lengthIndicator = passAnalysis.isPasswordLengthExpected();
            if (!lengthIndicator) {
                System.out.println("your password either is less than 9 symbols or greater that 15. Please, repeat your input");
                continue;
            }

//            whether has upper case
            boolean hasUpperCase = passAnalysis.hasUpperCase();
            if (!hasUpperCase) {
                System.out.println("your pass does not have any upper case letters. Please, repeat your input");
                continue;
            }

            boolean hasLowerCase = passAnalysis.hasLowerCase();
            if (!hasLowerCase) {
                System.out.println("your pass does not have any lower case letters. Please, repeat your input");
                continue;
            }


            passwordValid = lengthEqualityIndicator && equalityIndicator && lengthIndicator && hasUpperCase;
            System.out.println("your password have been successfully set");

        }


    }
}
