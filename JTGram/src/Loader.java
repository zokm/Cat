import org.javagram.TelegramApiBridge;
import org.javagram.response.AuthAuthorization;
import org.javagram.response.AuthCheckedPhone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loader {
    public static void main(String[] args) throws IOException {
        TelegramApiBridge telegramApiBridge = new TelegramApiBridge("149.154.167.50:443", 95316, "b4dbe9df8ed9ce0257c6c91254645da9");

        System.out.println("Please type phone number");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String phone = bufferedReader.readLine().trim();

        AuthCheckedPhone authCheckedPhone = telegramApiBridge.authCheckPhone(phone);

        if (authCheckedPhone.isRegistered()) {// проверяем номер телефона который введет полльзователь был зарегистрирован или нет
            telegramApiBridge.authSendCode(phone);// путем вызова метода для отправки проверочного кода верификации для указанногго номера телефона(логина)

            System.out.println("Please type confirm code");// просим этот номер указать
            String code = new BufferedReader(new InputStreamReader(System.in)).readLine();//для ввода кода через консоль

            AuthAuthorization authAuthorization = telegramApiBridge.authSignIn(code);// создаем переменную authAuthorization типа AuthAuthorization присваиваем ей вызов метода котрый проверяет код
            String name = authAuthorization.getUser().getFirstName() + " " + authAuthorization.getUser().getLastName();// создаем переменную name для ввода личных данных
            System.out.println("Authorized name: " + name.trim());// просим ввести Authorized name
        } else {
            System.out.println("Please type registered number");//иначе просим зарегистриваться
        }
    }
}
