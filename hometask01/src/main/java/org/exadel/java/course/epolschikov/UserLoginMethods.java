package org.exadel.java.course.epolschikov;

import java.util.Scanner;

/**
 * Created by ypolshchykau on 11.11.2014.
 * this class represents methods that are implemented for password analysis
 */
public class UserLoginMethods {
    final int EXPECTED_MINIMUM = 8;
    final int EXPECTED_MAXIMUM = 16;

    public String getPass1() {
        return pass1;
    }


    public String getPass2() {
        return pass2;
    }


    public void passwordsInput() {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Password");
        pass1 = in.nextLine();
        System.out.println("Confirm Password:");
        pass2 = in.nextLine();

    }

    public boolean lengthComparison() {
        return (pass1.length() == pass2.length());
    }

    public boolean isPassEqualToConfirmation() {
        return pass1.equals(pass2);
    }

    public boolean isPasswordLengthExpected() {
        return (pass1.length() > EXPECTED_MINIMUM && pass1.length() < EXPECTED_MAXIMUM);
    }

    public boolean hasUpperCase() {
        return !pass1.equals(pass1.toLowerCase());

    }


    public boolean hasLowerCase() {
        return !pass1.equals(pass1.toUpperCase());
    }

    private String pass1;
    private String pass2;

}
