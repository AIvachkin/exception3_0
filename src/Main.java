import excemptions.WrongLoginException;
import excemptions.WrongPasswordException;

public class Main {
    public static void main(String[] args)  {

        String login = "java_skypro_go1";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";

        System.out.println(Check.validator(login, password, confirmPassword));
    }
}