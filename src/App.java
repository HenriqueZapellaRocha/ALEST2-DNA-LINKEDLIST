import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class App {
    public static void main(String[] args) {

        String filePath = "/Users/henriquezapellarocha/Documents/ALEST2-DNA-LINKEDLIST-main/casos-cohen/caso10000k.txt";
        StringBuilder cadeia = new StringBuilder();

        try{
            BufferedReader leitor = new BufferedReader(new FileReader(filePath));
            String linha;
            
            while ((linha = leitor.readLine()) != null) {
                cadeia.append(linha);
            }

            leitor.close();
        } catch (IOException e) {
            System.err.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }


        LinkedList lista = new LinkedList();

        long startTime = System.nanoTime();

    
        for(int i = 0; i < cadeia.length(); i++) {
       
            lista.adicionar(cadeia.charAt(i));
        }

        System.out.println(Runtime.getRuntime().totalMemory());

        System.out.println();

        int tam = lista.nElementos();
        for(int i =0; i < tam -1; i++) {
            lista.buscador(lista.getPrimeiroElemento().getProximoNodo(), lista.getPrimeiroElemento());
        }

        System.out.println(lista.escritor());
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in seconds: " + timeElapsed / 1000000000);
        


    }

}
