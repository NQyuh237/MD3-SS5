package TH;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TH1 {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)+$";
    public TH1() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }
    public boolean validate(String email) {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static void main(String[] args) {
        TH1 emailValidator = new TH1();
        String[] validEmails = { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
        String[] invalidEmails = { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

        System.out.println("Valid Emails:");
        for (String email : validEmails) {
            boolean isValid = emailValidator.validate(email);
            System.out.println("Email is " + email + " is valid: " + isValid);
        }

        System.out.println("\nInvalid Emails:");
        for (String email : invalidEmails) {
            boolean isValid = emailValidator.validate(email);
            System.out.println("Email is " + email + " is valid: " + isValid);
        }
    }
}
