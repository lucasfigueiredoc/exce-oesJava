public class ClassCastExceptionAtvdd {
    public static void main(String[] args) {
        Gato gato = new Gato();

        //ClassCastException é a exceção que ocorre quando
        // se tenta fazer casting de objetos com tipos incompativeis

        try {
            // Tentando fazer o casting do gato para um objeto Animal
            Animal animal = (Animal) gato;
            // Usando o método fazerBarulho da instância do animal
            //animal.fazerBarulho();
        } catch (ClassCastException e) {
            throw new ClassCastException("Class Exception");
        }

    }

}
