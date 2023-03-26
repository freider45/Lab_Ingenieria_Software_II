package logica;

import java.util.Date;

/**
 *
 * @author fre90
 */
public class ViajeIndividual extends Viaje {
    // Constructor
    public ViajeIndividual(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }

    @Override
    public String descripcion() {
        return "Disfruta tu viaje individual";
    }
    //No se sobreescribe cualquierMetodo2()
    
}
