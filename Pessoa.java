public class Pessoa {
    int idade;

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Age must be greater than zero");
        } else {
            this.idade = idade;
        }
    }
}