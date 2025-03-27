import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean bandera = true;

        int opt = 0;

        while (bandera) {

            String Mensaje = "Bienvenidos a Frater! \n" +
        "---- Seleccione nuestro menu --- \n" +
        "1. Hamburguesa \n" +
        "2. Perro Caliente \n" +
        "3. Salchipapas \n" +
        "4. Salir";

        System.out.println(Mensaje);

        while (!sc.hasNextInt()) {
            System.out.println("Entrada no valida, again");
            sc.next();
            
        }
            
        }

        

        opt = sc.nextInt();

        switch (opt) {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;        
            default:
                break;

        }
        


    }
    
}
