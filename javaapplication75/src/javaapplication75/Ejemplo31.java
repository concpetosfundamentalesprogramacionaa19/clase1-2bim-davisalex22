package javaapplication75;

import java.util.Scanner;

/**
 * @author davisalex22
 */
public class Ejemplo31 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        // Declaración de variables
        double nota = 0;
        int opcion = 0;
        boolean bandera = true;
        int contador = 1;
        String[] rangos = {"0-8", "8.1-12", "12.1-16", "16.1-19", "19.1-20",
            "20.1-adelante"};
        double[] datos = new double[6];
        // Uso de While para controlar el ingreso de notas conforme usuario
        while (bandera == true) {
            System.out.printf("Ingrese nota %d: ",
                    contador);
            nota = entrada.nextDouble();
            contador = contador + 1;
            // Evaluacion de la continuidad de ingreso de notas
            System.out.println("Seleccione (1) Si desea seguir agregando o (2)"
                    + " si desea terminar\n");
            opcion = entrada.nextInt();
            if (opcion != 1) {
                bandera = false;
            }
            // Rangos a clasificar usando condicional If
            if (nota <= 8) {
                datos[0] = datos[0] + 1;
            } else {
                if (nota >= 8.1 && nota <= 12) {
                    datos[1] = datos[1] + 1;
                } else {
                    if (nota >= 12.1 && nota <= 16) {
                        datos[2] = datos[2] + 1;
                    } else {
                        if (nota >= 16.1 && nota <= 19) {
                            datos[3] = datos[3] + 1;
                        } else {
                            if (nota >= 19.1 && nota <= 20) {
                                datos[4] = datos[4] + 1;
                            } else {
                                datos[5] = datos[5] + 1;
                            }
                        }
                    }
                }
            }
        }
        // Muestra en pantalla de resultados
        System.out.println("Resultados");
        for (int i = 0; i < datos.length; i++) {
            System.out.printf("Notas entre %s - %.0f\n", rangos[i], datos[i]);
        }
// Fin de programa
    }
}
