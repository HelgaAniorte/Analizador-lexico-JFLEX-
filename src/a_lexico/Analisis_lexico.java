package a_lexico;

import java.io.File;

/**
 *
 * @author Leonardo
 */
public class Analisis_lexico {

    public static void main(String[] args) {
        String path = "C:/Users/Leonardo/Documents/ESIME 4/analisis numerico/JavaApplication29/src/a_lexico/Lexer.flex";
        generarLexer(path);
    }
    
    public static void generarLexer(String path){
        File file = new File(path);
        jflex.Main.generate(file);
        
        Interfaz in = new Interfaz();
        in.setVisible(true);
        in.setTitle("Analizador Lexico");
        in.setResizable(false);
    }
    
}