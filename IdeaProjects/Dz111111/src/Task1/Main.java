package Task1;

public class Main {
    public static void main(String[] args) {
        String login = "user123";
        String password = "password123";
        String confirmPassword = "password123";

        try {
            boolean result = isValidLoginAndPassword(login, password, confirmPassword);
            System.out.println("Результат валидации: " + result);
        } catch (WrongLoginException e){
            System.out.println("Ошибка валидации логина: "+ e.getMessage());
        } catch (WrongPasswordException e){
            System.out.println("Ошибка валидации пароля: "+e.getMessage());
        }

    }
    public static boolean isValidLoginAndPassword(String login, String password, String confirmPassword)
        throws WrongLoginException, WrongPasswordException{
        if (login.length() >= 20){
            throw new WrongLoginException("Максимальная длина логина не больше 20 симоволов");
        }

        if(password.length() >= 20){
            throw new WrongPasswordException("Максимальная длина пароля не больше 20 символов");
        }
        return true;

        }
}