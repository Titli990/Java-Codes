package Day1;

public class Assg9 {
    public static void main(String[] args) {
        String password1 = "Passw0rd123"; // Valid password
        String password2 = "WeakPass";    // Invalid password

        System.out.println("Password 1 is valid: " + isValidPassword(password1));
        System.out.println("Password 2 is valid: " + isValidPassword(password2));
    }
    public static boolean isValidPassword(String password) {
        if (password.length() < 10) {
            return false;
        }
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        int digitCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        if (digitCount < 2) {
            return false;
        }
        return true;
    }
}
