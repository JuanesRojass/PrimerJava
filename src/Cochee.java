import java.util.Scanner;

public class Cochee {
    public static void main(String[] args) throws Exception {
        Scanner r = new Scanner(System.in);
        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        System.out.println("Cantidad de puertas: " + miCoche.puertas);
    }
}
class Coche{
    public int puertas = 0;

    public void AgregarPuerta(){
        this.puertas++;
    }
}




