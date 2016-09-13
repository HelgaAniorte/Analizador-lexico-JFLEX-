package a_lexico;

import java.io.File;

/**
 *
 * @author Leonardo
 */
public class Analisis_lexico {

    public static void main(String[] args) {
        String path = "C:/Users/Leonardo/Documents/esime 5/compiladores/JavaApplication29/src/a_lexico/Lexer.flex";
        generarLexer(path);
        Interfaz in = new Interfaz();
        in.setVisible(true);
        in.setTitle("Analizador Lexico");
        in.setResizable(false);
    }
    
    public static void generarLexer(String path){
        File file = new File(path);
        jflex.Main.generate(file);
    }
    
}
