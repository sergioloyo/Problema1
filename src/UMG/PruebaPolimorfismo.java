package UMG;

import javax.swing.*;

public class PruebaPolimorfismo {
    int opcion=0,exit=0;

    public static void main(String[] args) {
        PruebaPolimorfismo proyecto=new PruebaPolimorfismo();
        proyecto.menuGeneral();

    }

public void menuGeneral(){
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu \n\n 1. Ingreso de Sedan\n 2. Ingreso de Camion\n 3. Salir\n\nIngrese su opcion"));
            switch (opcion){
                case 1:
                break;
                case 2:
                    break;
                case 3:
                    exit=3;
                    break;

            }
        }while (exit!=3);


}

}
