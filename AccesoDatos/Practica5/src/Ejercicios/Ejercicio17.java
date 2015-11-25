package Ejercicios;

import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import Herramientas.Herramientas;

/**
 *
 * @author Daniel Marcos Lorrio
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        Document doc = null;

        try {
            doc = new SAXBuilder().build("C:\\petra\\universidad.xml");
        } catch (JDOMException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        // Nombre de las carreras que estudian los alumnos matriculados en la asignatura Tecnología de los Alimentos
        Herramientas.xpath(doc, "//carrera[@id=//alumno[.//asignatura[@codigo=//asignatura[nombre='Tecnología de los Alimentos']/@id]]//carrera/@codigo]/nombre");
    }
}
