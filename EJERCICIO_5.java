import java.util.Scanner;
/*5. Hacer un programa con matriz que resuelva el siguiente planteamiento. El departamento de policía
de la ciudad de ha acumulado información referente a las infracciones de los límites de velocidad
durante un determinado periodo de tiempo. El departamento ha dividido la ciudad en cuatro
cuadrantes y desea realizar una estadística de las infracciones a los límites de velocidad en cada
uno de ellos. Para cada infracción se ha preparado una tarjeta que contiene la siguiente información:
a) número de registro del vehículo;
b) cuadrante en el que se produjo la infracción
c) límite de velocidad en kilómetros por hora (kph)
Diseñe un programa para producir el siguiente informe:
Una lista de la multa de velocidad recolectadas, donde la multa se calcula como la suma del costo:
$1,000.00, más $ 250.00 por cada kph que exceda la velocidad lí/mite. Prepare una tabla con los
siguientes resultados:

Autor:Omar Bautista
Elaborado:14/11/2023*/
public class EJERCICIO_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]lista=new int[5][6];
        int []cuadrantes = new int[5];
        int []registro= new int[5];
        int []veloRegis= new int[5];
        int []veloLimit= new int[5];
        int multa;
        //int posi=-1;
        for (int i = 0; i <5; i++) {
            registro[i]=0;
            veloRegis[i]=0;
            veloLimit[i]=0;
            cuadrantes[i]=0;
        }
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <6; j++) {
                lista[i][j]=0;
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa el numero de registro del vehiculo: ");
            registro[i]= sc.nextInt();
            System.out.println("Ingresa el cuadrante donde ocurrío la infracción");
            cuadrantes[i]= sc.nextInt();
            System.out.println("Ingresa la velocidad registrada el vehiculo: ");
            veloRegis[i]= sc.nextInt();
            System.out.println("Ingresa la velocidad limite del cuadrante ");
            veloLimit[i]= sc.nextInt();
            System.out.println("-----------------------------------------------------------------");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 1; j++) {
                lista[i][0]=registro[i];
                lista[i][1]=cuadrantes[i];
                lista[i][2]=veloRegis[i];
                lista[i][3]=veloLimit[i];
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 2; j <5 ; j++) {
                if (lista[i][2]<lista[i][3]){
                    lista[i][4]=0;
                }else{
                    lista[i][4]=lista[i][2]-lista[i][3];
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            multa=0;
            for (int j =4; j < 6; j++) {
                if (lista[i][4] != 0){
                    multa=lista[i][4]*250;
                    lista[i][5]= 1000 +multa;
                }
            }
        }
        System.out.println("--- Registro del vehiculo --- Velocidad registrada (kph) --- Velocidad limite --- Multa ---");
        for (int i = 0; i < 5; i++) {
            for (int j=0; j<1; j++) {
                System.out.println("----           " + lista[i][0] + "         ----             " + lista[i][2] + "            ----        " + lista[i][3] + "       ----  " + lista[i][5] + "  ----");
            }
        }


    }
}
