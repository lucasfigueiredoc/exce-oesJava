public class IllegalArgumentExceptionAtvdd {

    public static void main(String[] args) {
        //IllegalArgumentException Ocorre no uso de um argumento
        // a um método  ou construto que não compete a logica dele tratar.
        // Exemplo um metodo que recebe idade, um numero inteiro positivo.
        // caso venha um valor negativo, será lançada a exceção especifica.
        
        Pessoa pessoa = new Pessoa();

        pessoa.setIdade(-1);


    }
}
