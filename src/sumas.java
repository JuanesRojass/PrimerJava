public class sumas {
    public static void main(String[] args) throws Exception{
        int numero1 = 10, numero2 = 20, numero3 = 20;
        int resultado = Suma(numero1, numero2, numero3);
        System.out.println("La suma de los tres numeros es de: " + resultado);
    } 

    public static int Suma(int a, int b, int c){
        return a + b + c;
    }
}
