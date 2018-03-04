/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidadesFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author equipados
 */
public class Ficheros {
    
    public boolean guardarEnFichero(File[] dir){
        try {
            FileWriter fw = new FileWriter ("c:/directorio.txt");
            for (int i = 0; i<dir.length;i++){
                fw.write(dir[i].getAbsolutePath()+"\r\n");
            }
            fw.close();
            return true;
        } catch (FileNotFoundException fnfe) {
            System.out.println("Fichero no encontrado:\n"+fnfe.toString());
            return false;
        } catch (IOException ioe) {
            System.out.println("Ha habido un error con el fichero:\n"+ioe.toString());
            return false;
        }
    }
    
}
