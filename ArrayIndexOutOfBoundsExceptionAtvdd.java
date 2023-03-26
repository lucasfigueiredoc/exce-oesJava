public class ArrayIndexOutOfBoundsExceptionAtvdd {

    public static void main(String[] args) {
        // Quando se ultiliza arrays, precisa-se de alguns cuidados
        // com o tamanho domes, se não teremos problemas como o 
        // ArrayIndexOutOfBoundsException

        String[] string = new String[5]; // <-- String de tamanho 5


        try{    
            for(int i = 0; i<=5; i++){
                System.out.println(string[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            throw new ArrayIndexOutOfBoundsException("Indice inexistente ");
        }

    }
}
