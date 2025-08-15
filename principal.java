import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos M = new metodos();
        int d = 0;
        System.out.println("Ingrese la dimension de la matriz");
        d = sc.nextInt();
        objCoche[][] m = new objCoche[d][d];
        m = M.LLenarMatriz(m);
        M.MostrarMatriz(m);
    }
}