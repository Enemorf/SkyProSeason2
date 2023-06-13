package SkyProHomeworks.part4;

import SkyProHomeworks.part4.exceptions.WrongLoginException;
import SkyProHomeworks.part4.exceptions.WrongPasswordException;

public class Main
{
    public static void main(String[] args)
    {
        String login = "java_skypro_go";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";

        try{
            CheckLoginPassword(login,password,confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Логин длиннее 20 символов или содержит в себе недопустимые символы.");
        } catch (WrongPasswordException e) {
            System.out.println("Пароль длиннее 20 символов или содержит в себе недопустимые символы " +
                    "ИЛИ пароли не совпадают.");
        }
    }

    static void CheckLoginPassword (String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException
    {
        String regex = "[a-zA-Z0-9_]{1,20}";

        if(!login.matches(regex))
            throw new WrongLoginException();
        if(!password.matches(regex) || !password.equals(confirmPassword))
            throw new WrongPasswordException();
    }
}
