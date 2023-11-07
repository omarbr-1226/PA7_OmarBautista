import java.util.Scanner;

/*4. Hacer un programa que almacene en una matriz M (30,5) la información sobre las calificaciones de
las 3 unidades de la materia de PROGRAMACIÓN. El programa debe imprimir:
a) Cantidad de alumnos que aprobaron la materia (70 es la calificación mínima aprobatoria).
b) Cantidad de alumnos que tienen derecho a segunda oportunidad (quien tenga 2 o más unidades
reprobadas NO tiene derecho a segunda oportunidad).
c) El número o números de lista de estudiante o estudiantes que hayan obtenido el máximo
promedio.

Autor:Omar Bautista
Elaborado:*/
public class EJERCICIO_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tablaProm[][]= new int[30][5];
        int ren, col,lista,apro=0,segOpo=0;

        for (ren=0; ren<tablaProm.length; ren++){
            for (col=0; col<tablaProm.length; col++){
                tablaProm[ren][col]=0;
            }
        }

        for (ren=0; ren<tablaProm.length; ren++){
            for (col=0; col<tablaProm.length; col++){
                System.out.println("Ingresa un valor para ["+(ren+1)+","+(col+1)+"]:");
                tablaProm[ren][col]= sc.nextInt();
            }
        }



    }
}
