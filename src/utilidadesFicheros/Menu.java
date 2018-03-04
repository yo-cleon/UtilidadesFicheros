/*
 * Clase que gestiona el menú de la aplicción.
 * 
 */
package utilidadesFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author equipados
 */
public class Menu {
    
    private Scanner sc;
    private String[] directorios;
    private String opc;
    private Ficheros f = new Ficheros();
    
    public void crearMenu(){
        sc = new Scanner(System.in);
        while(true){
            verMenu();
            int opc = sc.nextInt();
            if(opc == 0){
                return;
            } else if (opc == 1) {
                listarDirectorio();
            } else {
                System.out.println("Opción incorrecta. Vuelve a intentarlo.");
            }
        }
    }
    
    public void verMenu(){
        System.out.println("Indica la opción deseada: \n"
                + "1. Mostrar ficheros del directorio.\n"
                + "2. Copiar Fichero.\n"
                + "0. Salir.");
    }
    
    public void listarDirectorio(){
        sc = new Scanner(System.in);
        //File dir = new File(System.getProperty("user.dir"));
        File dir = new File("C:/");
        File[] listadoDir = dir.listFiles();
        if (listadoDir == null){
            System.out.println("El directorio está vacío");
        } else {
            System.out.print("¿Deseas ver los archivos ocultos? (S/N) ");
            opc = sc.nextLine();
            
            if (opc.equalsIgnoreCase("N")){
                for (int i = 0; i<listadoDir.length;i++){
                if(!listadoDir[i].isHidden()){
                    System.out.println(listadoDir[i].getAbsolutePath());
                }
                guardarEnDisco(listadoDir);
                }
            } else if (opc.equalsIgnoreCase("S")){
                for (int i = 0; i<listadoDir.length;i++){
                    System.out.println(listadoDir[i].getAbsolutePath());
                }
            }
        }
    }
    
    public void guardarEnDisco(File[] listadoDir){
        System.out.println("¿Deseas exportar el listado a un fichero (S/N) ?");
        
        while (true){
            opc = sc.nextLine();
            if (opc.equalsIgnoreCase("S")){
                if(f.guardarEnFichero(listadoDir))
                    System.out.println("datos guardados");
            } else if (opc.equalsIgnoreCase("N")){
                return;
            } else {
                System.out.println("opción no contemplada. Vuelve a intentarlo");
            }
        }
    }
    
    public void copiarFichero(){
        System.out.print("Indica el fichero a copiar");
    }
}
