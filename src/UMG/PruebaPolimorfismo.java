package UMG;

import javax.swing.*;
import java.util.ArrayList;

public class PruebaPolimorfismo {


    ArrayList<Vehiculo>Carro=new ArrayList<>();
    int opcion=0,exit=0;
//menu
    public static void main(String[] args) {
        PruebaPolimorfismo proyecto=new PruebaPolimorfismo();
        proyecto.menuGeneral();

    }

public void menuGeneral(){
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu \n\n 1. Ingreso de Sedan\n 2. Ingreso de Camion\n 3. Salir\n\nIngrese su opcion"));
            switch (opcion){
                case 1:
                    String nom;
                    int pla;
                    int cili;

                    nom=JOptionPane.showInputDialog("Ingrese su numero de placa: ");
                    pla= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ejes del Vehiculo: "));
                    cili=Integer.parseInt(JOptionPane.showInputDialog("Indique el Cilindraje de su Vehiculo: "));

                            Sedan=


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
