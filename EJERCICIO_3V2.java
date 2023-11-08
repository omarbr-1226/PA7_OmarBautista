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
public class EJERCICIO_3V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T,i, repro=0,apro=0;

        System.out.println("Cuantos alumnos cursan la materia?");
        T = sc.nextInt();
        String[] nombre = new String[T];
        int [] lista = new int[T];
        int []unidadUno = new int[T];
        int []unidadDos = new int[T];
        int []unidadTres = new int[T];
        int []promedio = new int[T];

        //Limpair vectores
        for (i=0; i<T; i++){
            unidadUno[i]=0;
            unidadDos[i]=0;
            unidadTres[i]=0;
            promedio[i]=0;
        }
        //pedir datos de nombre al usuario
        for (i=0; i<T; i++){
            //pedir nombre al alumno
            System.out.println("Ingresa tu nombre");
            nombre[i]=sc.next();
            //pedir datos de numero de lista, controlado por un do while
            do {
                System.out.println("Ingresa tu numero de lista");
                lista[i]= sc.nextInt();
                if (lista[i]>T || lista[i]==0){
                    System.out.println("Numero de lista no valido");
                }
            }while (lista[i]==0 || lista[i]>T);
            //ciclos controlados para las calificaciones
            //unidad uno
            do {
                System.out.println("Ingresa las calificaciones de la unidad uno: ");
                unidadUno[i]= sc.nextInt();
                if (unidadUno[i]>10 || unidadUno[i]<0){
                    System.out.println("La calificación ingresada no es una calificación valida");
                }
            }while (unidadUno[i]>10 || unidadUno[i]<0);
            //unidad dos
            do {
                System.out.println("Ingresa las calificaciones de la unidad dos: ");
                unidadDos[i]= sc.nextInt();
                if (unidadDos[i]>10 || unidadDos[i]<0){
                    System.out.println("La calificación ingresada no es una calificación valida");
                }
            }while (unidadDos[i]>10 || unidadDos[i]<0);
            //unidad tres
            do {
                System.out.println("Ingresa las calificaciones de la unidad tres: ");
                unidadTres[i]= sc.nextInt();
                if (unidadTres[i]>10 || unidadTres[i]<0){
                    System.out.println("La calificación ingresada no es una calificación valida");
                }
            }while (unidadTres[i]>10 || unidadTres[i]<0);


            System.out.println("Gracias por ingresar sus datos:");
            System.out.println("------------------------------------------------------------------------------------------");
        }




    }
}
