/*
 * Aplicación con fines que pretende ofrecer una serie de utilidades de trabajo
 * con ficheros. La aplicación se ejecuta en modo comando
 * 
 */
package utilidadesFicheros;

/**
 *
 * @author CLR - 2018/02/17
 */
public class Main {
    
    public static void main (String[] args){
        //creamos y lanzamos el menú
        Menu menu = new Menu();
        menu.crearMenu();
    }
}
