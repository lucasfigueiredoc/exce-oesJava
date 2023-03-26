public class NullPointerExceptionAtvdd {

        // NullPointerExceptionAtvdd, esta exceção ocorre
        // quando tentamos acessar o campo de uma instância nula
        // ou uma variavel receber outra de valor nulo, aceesar um tamanho 
        // de array nula, entre outros que envolve o tratamento de variáveis, 
        // metodos ou objetos nulos.
    public static void main(String[] args) {
        
        try{
            Integer x = null ;
            int z ;
            z = x;
        }
        catch(NullPointerException e){
            throw new NullPointerException("Valor nulo");
        }
    }
    
    

}
