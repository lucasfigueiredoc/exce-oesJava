import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionAtvdd {

    public static void main(String[] args) {
        //IOException é um erro conhecido para tráfego de dados
        //exemplo na leitura de um arquivo, criação, ou na inesistencia do mesmo/
        //Aqui um exemplo de tratamento

        try {
            BufferedReader br = new BufferedReader(new FileReader("texto.txt"));
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
            br.close();
        } catch (IOException e) {
           // throw new IOException("Erro no tráfego de dados");
           System.out.println(e.getMessage());
        }
    }
}


