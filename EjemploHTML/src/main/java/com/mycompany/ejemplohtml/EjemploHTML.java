/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplohtml;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author freddymonterroso
 */
public class EjemploHTML {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        String departamento = "Guatemala";
        String parrafo = "Origen: Guatemala/Guatemala";
        String parrafo2 = "Destino: Guatemala/Solola";

        
         String contenido = "<html>\n" +
                           "<head>\n" +
                           "<title>Mi primer archivo HTML generado desde Java</title>\n" +
                           "</head>\n" +
                           "<body>\n" +
                            "<div style='border: 1px solid black; width: 20%; margin-left:10px; padding-left: 10px;'>" + 
                               "<p>" + parrafo +"</p>" +
                               "<p>" + parrafo2 +"</p>" +

                            "</div></br>\n" +
                            "<div> " + 
                                "<table style='border: 1px solid black'>" + 
                                    "<tr>" + 
                                        "<th style='border: 1px solid black'> Numero de paquetes </th>" +
                                        "<th style='border: 1px solid black'> Tamaño de paquetes </th>" +
                                    "</tr>" +
                                    "<tr>" + 
                                        "<td style='border: 1px solid black'> 5 </td>" +
                                        "<td style='border: 1px solid black'> 2 </td>" +
                                    "</tr>" +
                                "</table>" +
                            "<div>" +
                           "<h1>" + departamento + "</h1>\n"+
                           "<div>" +
                             "<img style='text-align=center; heigth: 30px; src='descarga.png'/>" +
                           "</div>" +
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
