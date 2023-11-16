import java.util.Scanner;
/*4. Hacer un programa que almacene en una matriz M (30,5) la información sobre las calificaciones de
las 3 unidades de la materia de PROGRAMACIÓN. El programa debe imprimir:
a) Cantidad de alumnos que aprobaron la materia (70 es la calificación mínima aprobatoria).
b) Cantidad de alumnos que tienen derecho a segunda oportunidad (quien tenga 2 o más unidades
reprobadas NO tiene derecho a segunda oportunidad).
c) El número o números de lista de estudíante o estudiantes que hayan obtenido el máximo
promedio.
Autor:Omar Bautista
Elaborado:*/
public class EJERCICIO_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]tabla= new int[30][6];
        int aprobado=0,segOp=0,numLista,calif=0;
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 5; j++) {
                tabla[i][j]=0;
            }
        }

        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingresa la calificación de la unidad "+(j+1)+" con el numero de lista "+(i+1));
                tabla[i][j]= sc.nextInt();
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 3; j++) {
                calif=tabla[i][0]+tabla[i][1]+tabla[i][2];
                tabla[i][3]=calif/3;
            }
        }
        for (int i = 0; i < 30; i++) {
            for (int j = 3; j < 4; j++) {
                if (tabla[i][3]>=70){
                    aprobado++;
                }
            }
        }
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 6; j++) {
                if (tabla[i][5]==1){
                    segOp++;
                }
            }
        }
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabla[i][j]<70){
                    tabla[i][5]++;
                }
            }
        }
        for (int i = 0; i < 30 ; i++) {
            numLista=0;
            for (int j = 0; j < 5; j++) {
                if (tabla[i][3]==100){
                    numLista=i+1;
                    tabla[i][4]=numLista;
                }
            }
        }

        System.out.println("Los alumnos aprobados son: " + aprobado);
        System.out.println("//////////////////////////////////////////////");
        System.out.println("Numeros de alumnos con derecho a segunda oportunidad: " + segOp);
        System.out.println("//////////////////////////////////////////////");
        System.out.println("Numeros de lista que sacaron el maximo de calificacion: ");
        for (int i=0; i<30; i++){
            System.out.println(" ");
            for (int j=4; j<5; j++){
                if (tabla[i][4]!=0){
                    System.out.println("El numero de lista #" + tabla[i][4] + ", saco el maximo de caificacion");
                }
            }
        }









    }
}
