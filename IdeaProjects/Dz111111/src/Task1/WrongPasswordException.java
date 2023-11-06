package Task1;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(){
        super("Не вверный пароль!");
    }
    public WrongPasswordException(String message){
        super(message);
    }
}
