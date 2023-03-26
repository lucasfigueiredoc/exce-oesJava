import java.util.Scanner;

public class aritmetcexception{
    public static void main(String[] args) {
        /* AritmetcException se trata do erro com operações aritméticas, 
         * o mais conhecido é a divisão de um inteiro por 0
         */
        Scanner input = new Scanner(System.in);

        float result = 0;
        int a = input.nextInt();
        int b = input.nextInt();  // <- se o divisor for 0, ocorrerá a exceção.
        input.close();
        // Para tratar adicionamos o bloco de código try catch, por se tratar
        // de um calculo matemático e para tratar especificamente do ArithmeticException
        // o adiciono onde o catch captura o erro
        try{
            result = a/b;
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println(result);
    }
}


