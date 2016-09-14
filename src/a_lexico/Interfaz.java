package a_lexico;

import com.sun.glass.events.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo
 */
public class Interfaz extends javax.swing.JFrame {
    public Interfaz() {
        initComponents();
        jButton1.setMnemonic(KeyEvent.VK_A);
        jMenuItem1.setMnemonic(KeyEvent.VK_N);
    }
    JFileChooser buscador = new JFileChooser();
    String path = "fichero.txt";
    File fichero; 
    Reader reader;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setText("Ingresar Texto");

        jLabel2.setText("Resultados");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\esime 5\\compiladores\\JavaApplication29\\imagenes\\boton-de-reproducir.png")); // NOI18N
        jButton1.setText("Analizar");
        jButton1.setToolTipText("Analizar el texto ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jMenu1.setText("File");

        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\esime 5\\compiladores\\JavaApplication29\\imagenes\\web.png")); // NOI18N
        jMenuItem1.setText("Abrir ALT+N");
        jMenuItem1.setToolTipText("Abrir un archivo de texto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\esime 5\\compiladores\\JavaApplication29\\imagenes\\boton-de-reproducir.png")); // NOI18N
        jMenuItem2.setText("Analizar  ALT+A");
        jMenuItem2.setToolTipText("Analizar el texto");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            probarLexerFile();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       buscador.showOpenDialog(buscador);
        try{
           path = buscador.getSelectedFile().getAbsolutePath();
           fichero = new File(path);
           BufferedReader leer = new BufferedReader(new FileReader(path));
           String texto = leer.readLine();
           jTextArea2.setText("");
           while(texto != null){
               jTextArea2.append(texto + "\n");
               texto = leer.readLine();
           }
       }catch(Exception e){
          JOptionPane a = new JOptionPane("No se pudo abrir el archvo" + e.getMessage());
       }
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try{
            probarLexerFile();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    
    public void probarLexerFile() throws IOException{
        fichero  = new File(path);
        PrintWriter writer;
        
        try{
            writer = new PrintWriter(fichero);
            writer.printf(jTextArea2.getText());
            writer.close();
        }catch(FileNotFoundException e){
            
        }
        
        reader = new BufferedReader(new FileReader(path));
        Lexer lexer = new Lexer(reader);
        
        String resultado = "";
        while(true){
            Token token = lexer.yylex();
            if(token == null){
                resultado = resultado + "END OF FILE";
                jTextArea1.setText(resultado);
                return;
            }
            switch(token){
                case ERROR:
                    resultado = resultado + "Error, simbolo no reconocido\n";
                    break;
                case ID: case INT:
                    resultado = resultado + "Token " + token + " " + lexer.lexeme + "\n"; 
                    break;
                default:
                    resultado = resultado + "Token " + token + "\n";
            }      
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
