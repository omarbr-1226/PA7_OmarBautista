import java.util.Scanner;
/*3. Hacer un programa que gestione las calificaciones de los estudiantes de Secundaria en la materia
de Matemáticas. Almacenar en vectores el Número de lista, Nombre del estudiante, calificación de
la unidad 1, calificación de la unidad 2, calificación de la unidad 3, y Promedio final (calculado). La
calificación en cada unidad debe ser entre 0 y 10, el promedio mínimo aprobatorio es 6. El programa
debe controlar que el usuario ingrese una calificación válida (entre 0 y 10). Determinar:
a) Cuántos estudiantes Reprobaron.
b) Cuántos estudiantes Aprobaron.
c) El número de lista, nombre y promedio del estudiante que obtuvo el promedio más Bajo
d) El número de lista, nombre y promedio del estudiante que obtuvo el promedio más Alto

Autor: Omar Bautista
Elaborado: 3/11/23*/
public class EJERCICIO_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T, i,repro=0,apro=0;
        System.out.println("Cuantos alumnos hay en el grupo?");
        T = sc.nextInt();
        String nombre[] = new String[T];
        int lista[] = new int[T];
        int unidadUno[] = new int[T];
        int unidadDos[] = new int[T];
        int unidadTres[] = new int[T];
        int promedio[] = new int[T];

        /*Aqui se limpian los vectores*/
        for (i = 0; i < T; i++) {
            lista[i] = 0;
            unidadUno[i] = 0;
            unidadDos[i] = 0;
            unidadTres[i] = 0;
            promedio[i] = 0;
        }

        /*Pedir datos de nombre al usuario*/
        for (i = 0; i < T; i++) {
            System.out.println("Ingresa tu nombre Completo");
            for (i=0; i<T; i++) {
                nombre[i] = sc.next();
                /*Pedir datos de de numero de lista al usuario*/
                do {

                    for (i = 0; i < T; i++) {
                        System.out.println("Ingresa tu numero de lista: ");
                        lista[i] = sc.nextInt();
                        if (lista[i]>T || lista[i]==0){
                            System.out.println("Numero de lista no valido");
                        }else
                            break;
                    }
                }while (lista[i]>T);

                /*Calificaciones pedidas al usuario*/
                do {
                    for (i = 0; i < T; i++) {
                        System.out.println("Ingresa la calificacion de la unidad uno:");
                        unidadUno[i] = sc.nextInt();
                        if (unidadUno[i]>10){
                            System.out.println("Calificacion no valida");
                        }else
                            break;
                    }
                    for (i = 0; i < T; i++) {
                        System.out.println("Ingresa la calificacion de la unidad dos:");
                        unidadDos[i] = sc.nextInt();
                        if (unidadUno[i]>10){
                            System.out.println("Calificacion no valida");
                        }else
                            break;
                    }
                    for (i = 0; i < T; i++) {
                        System.out.println("Ingresa la calificacion de la unidad tres:");
                        unidadTres[i] = sc.nextInt();
                        if (unidadUno[i]>10){
                            System.out.println("Calificacion no valida");
                        }else
                            break;
                    }
                }while (unidadUno[i]>10 || unidadDos[i]>10 || unidadTres[i]>10);
            }
        }





        /*Promedio*/
        for (i=0; i<T; i++){
            promedio[i]=unidadUno[i]+unidadDos[i]+unidadTres[i];
        }
        for ( i = 0; i < T; i++) {
            System.out.println(nombre[i].toString());
        }
        if (promedio[i]>=6){
            apro++;
        }else
            repro++;






    }
}
