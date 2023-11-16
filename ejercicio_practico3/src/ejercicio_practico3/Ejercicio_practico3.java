package ejercicio_practico3;

import javax.swing.JOptionPane;

public class Ejercicio_practico3 {

    public static void main(String[] args) {

        // Ingresos de datos de la iglesia
        String iglesia = JOptionPane.showInputDialog("Ingrese el nombre de la iglesia");
        String pastor = JOptionPane.showInputDialog("Ingrese el nombre del pastor:");
        int cantFeligreses = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de feligreses:"));

        Datos dtIglesia = new Datos(iglesia, pastor, cantFeligreses);

        // Ingresos datos Feligreses
        String nombres = JOptionPane.showInputDialog("Ingrese el nombre de la iglesia");
        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cedula del feligres"));
        double diezmo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de feligreses:"));

        DatosFeligeses[] feligreses;
        int maxFeligres = 100;
        feligreses = new DatosFeligeses[maxFeligres];

        for (int i = 0; i < cantFeligreses; i++) {

            // crear objeto feligres
            DatosFeligeses feligres = new DatosFeligeses(nombres, cedula, diezmo);

            // guardar en matriz
            feligreses[i] = feligres;

        }

    }

}
