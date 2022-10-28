package arquivos;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import javax.swing.JOptionPane;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class Arquivos {

    public static void main(String[] args) {

        //Precisamos do caminho do arquivo que vamos manipular
        String caminho = "C:\\Users\\22282167\\java\\teste.txt";

        //Abrir o arquivo em modo escrita 
        Path path = Paths.get(caminho);

        try {
            //Criar um buffer de escrita
            BufferedWriter bw = Files.newBufferedWriter(
                    path, StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            bw.write("Olá, conteúdo gravado");
            bw.newLine();
            bw.write("Olá, conteúdo gravado");
            bw.newLine();
            bw.close();

        } catch (IOException erro) {
            JOptionPane.showConfirmDialog(null, "O arquivo não existe");
        }

    }

}
