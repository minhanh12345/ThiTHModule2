import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static Scanner scanner = new Scanner(System.in);
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static final String PHONE_REGEX = "^[0]+[0-9]{9,10}$";

    public static String getString() {
        String str;
        while (true) {
            str = scanner.nextLine();
            if (str.equals("")) {
                System.out.println("Không được để trống");
            } else {
                break;
            }
        }
        return str;
    }

    public static boolean validateEmail(String regex) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean validatePhone(String regex) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static String getPhone() {
        String phone;
        while (true) {
            phone = scanner.nextLine();
            if (!validatePhone(phone)) {
                System.out.println("Số điện thoại bắt đầu từ 0 , 10-11 số");
            } else {
                break;
            }
        }
        return phone;
    }

    public static String getEmail() {
        String email;
        while (true) {
            email = scanner.nextLine();
            if (!validateEmail(email)) {
                System.out.println("sai cấu trúc .vd:codegym@gmail.com");
            } else {
                break;
            }
        }
        return email;
    }
}
