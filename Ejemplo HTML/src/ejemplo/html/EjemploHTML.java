/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.html;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Freddy
 */
public class EjemploHTML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String departamento = "Guatemala";
         String contenido = "<html>\n" +
                           "<head>\n" +
                           "<title>Mi primer archivo HTML generado desde Java</title>\n" +
                           "</head>\n" +
                           "<body>\n" +
                           "<h1>Bienvenidos al mundo de Java</h1>\n" +
                           "<h1>" + departamento + "</h1>\n"+
                           "</body>\n" +
                           "</html>";
        
        try {
            FileWriter archivo = new FileWriter("mi_archivo.html"); 
            archivo.write(contenido);
            archivo.close();
            System.out.println("El archivo HTML ha sido generado exitosamente.");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al generar el archivo HTML: " + e.getMessage());
        }
    }
    
}
