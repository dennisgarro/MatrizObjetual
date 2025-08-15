import java.util.Scanner;

public class metodos {
    public objCoche[][] LLenarMatriz(objCoche[][] m) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        System.out.println("como quiere llenar la matriz 1: constructor vacio, 2: constructor lleno");
        opt = sc.nextInt();
        if (opt == 1) {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m.length; j++) {
                    objCoche o = new objCoche();
                    System.out.println("Ingrese el color del vehículo");
                    o.setColor(sc.next());
                    System.out.println("Ingrese la marca del vehículo");
                    o.setMarca(sc.next());
                    System.out.println("Ingrese el cilindraje");
                    o.setCilindraje(sc.nextInt());
                    m[i][j] = o;
                }
            }

        } else {

            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m.length; j++) {
                    String Color;
                    String Marca;
                    int Cilindraje;
                    System.out.println("Ingrese el color del vehículo");
                    Color = sc.next();
                    System.out.println("Ingrese la marca del vehículo");
                    Marca = sc.next();
                    System.out.println("Ingrese el cilindraje");
                    Cilindraje = sc.nextInt();
                    objCoche o = new objCoche(Color, Marca, Cilindraje);
                    m[i][j] = o;
                }
            }
        }
        return m;
    }

    public void MostrarMatriz(objCoche[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Color :" + m[i][j].getColor());
                System.out.println("Marca :" + m[i][j].getMarca());
                System.out.println("Cilindraje :" + m[i][j].getCilindraje());
                System.out.println();
            }
            System.out.println();
        }

    }
}
