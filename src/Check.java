import excemptions.WrongLoginException;
import excemptions.WrongPasswordException;

import java.util.regex.Pattern;

public class Check {

    private static void check(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (login.length() > 20) {
            throw new WrongLoginException("Логин слишком длинный");
        }

        Pattern p = Pattern.compile("^(\\d|[a-zA-Z_])*");
        if (!p.matcher(login).matches()) {
            throw new WrongLoginException("Логин содержит некорректные символы");
        }

        if (password.equals(confirmPassword)) {

        } else {
            throw new WrongPasswordException("Подтверждение пароля неверное") ;
        }
    }

    public static boolean validator(String login, String password, String confirmPassword)
//            throws WrongLoginException, WrongPasswordException
    {
        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException e) {
//            check(login, password, confirmPassword);
            return false;

        } catch (WrongPasswordException e) {
//            check(login, password, confirmPassword);
            return false;
//        } finally {
//            return false;
//        }
    }
        return true;

    }
}

