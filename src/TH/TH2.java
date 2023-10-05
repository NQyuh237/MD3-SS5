package TH;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TH2 {
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
    private Pattern pattern;
    private Matcher matcher;
    public TH2() {
        pattern = Pattern.compile(ACCOUNT_REGEX);
    }
    public boolean validate(String account) {
        matcher = pattern.matcher(account);
        return matcher.matches();
    }
    public static void main(String[] args) {
        TH2 accountValidator = new TH2();
        String[] validAccounts = { "123abc_", "_abc123", "______", "123456", "abcdefgh" };
        String[] invalidAccounts = { ".@", "12345", "1234_", "abcde" };

        System.out.println("Valid Accounts:");
        for (String account : validAccounts) {
            boolean isValid = accountValidator.validate(account);
            System.out.println("Account is " + account + " is valid: " + isValid);
        }

        System.out.println("\nInvalid Accounts:");
        for (String account : invalidAccounts) {
            boolean isValid = accountValidator.validate(account);
            System.out.println("Account is " + account + " is valid: " + isValid);
        }
    }
}
