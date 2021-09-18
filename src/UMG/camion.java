package UMG;

public class camion extends Vehiculo implements Peaje{
    public int peso;

    public camion(String placa, int ejes, int peso) {
        super(placa, ejes);
        this.peso = peso;
    }

    public double calculoPeaje(){
        double tarifa=15;
        return tarifa+(peso*0.01);
    }
}
