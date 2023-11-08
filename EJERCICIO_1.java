import java.util.Scanner;

/*1. Escribe un programa que almacene 20 números enteros en un arreglo. El programa debe ser capaz
de pasar todos los números pares a las primeras posiciones del arreglo (del 0 en adelante) y todos
los números impares a las celdas restantes. Utiliza arreglos auxiliares si es necesario.

Autor:Omar Bautista
Elaborado: 4/ 11/23*/
public class EJERCICIO_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []nums= new int[20];
        int []numerosPa=new int[20];
        int []numerosIn=new int[20];

        int i,par,impar;

        for (i=0; i<nums.length; i++){
            nums[i]=0;
            numerosPa[i]=0;
            numerosIn[i]=0;
        }

        for (i=0; i< nums.length; i++){
            System.out.println("Ingresa los valores para ["+(i+1)+"] :");
            nums[i]= sc.nextInt();
            }
        par=0;
        impar=0;
        for (i=0; i< nums.length; i++){
            if (nums[i]%2==0){
                    numerosPa[par]=nums[i];
            }else{
                numerosIn[impar]=nums[i];
            }
        }
        System.out.println(numerosPa[par]);
        System.out.println(numerosIn[impar]);


    }
}
