import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionAtvdd {
    
    public static void main(String[] args) {
     // InputMismatchException se trata de erros quanto ao input usando a classe Scanner
     // a exemplo quando temos um input esperando valores inteiros mas
     // recebe caracteres, string, booleano

     Scanner input = new Scanner(System.in);

     try{
        int a = input.nextInt();
        int b = input.nextInt();
        int c = a + b;
     }
     catch(InputMismatchException  e){
        throw new InputMismatchException("Input Erro");
     }

    }
}
