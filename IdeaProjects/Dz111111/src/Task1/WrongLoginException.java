package Task1;

public class WrongLoginException extends Exception{
    public WrongLoginException(){
        super("Не вверный логин!");
    }
    public WrongLoginException(String message){
        super(message);
    }
}
