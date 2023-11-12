import java.util.Scanner;

/*2. Escribe un programa que lea 15 números por teclado y que los almacene en un arreglo. Rota los
elementos de ese arreglo, es decir, el elemento de la posición 0 debe pasar a la posición 1, el de la
1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la posición 0.
Finalmente, mostrar el arreglo original y el arreglo rotado.

Autor:Omar Bautista
Elaborado: 3/11/23
*/
public class EJERCICIO_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []numeros = new int[15];
        int []numeroRotados = new int[16];
        int i;

        for (i=0; i<numeros.length; i++){
            numeros[i]=0;
            numeroRotados[i]=0;
        }
        for (i=0; i<numeros.length; i++){
            System.out.println("Ingresa los numeros para ["+(i+1)+"]:");
            numeros[i]= sc.nextInt();
        }
        System.out.println("Arreglo normal");
        for (i=0; i<15; i++){
            System.out.println(numeros[i]);
        }
        numeroRotados[0]=numeros[numeros.length-1];
        System.out.println("Arreglo con recorrido de una posición");
        for (i=0; i<15; i++){
            numeroRotados[i+1]=numeros[i];
            System.out.println(numeroRotados[i]);
        }
    }
}
