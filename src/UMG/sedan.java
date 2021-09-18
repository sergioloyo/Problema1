package UMG;

public class sedan extends Vehiculo implements Peaje {
public int cilindraje;

    public sedan(String placa, int ejes, int cilindraje) {
        super(placa, ejes);
        this.cilindraje = cilindraje;
    }

    public double calculoPeaje(){
            double tarifa=15;
        return tarifa+(cilindraje*0.01);
    }
}
