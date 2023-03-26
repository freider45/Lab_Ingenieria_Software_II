package logica;

import java.util.Date;

/**
 *
 * @author fre90
 */
public class ViajeFamiliar extends Viaje {

    /**
     * Cantidad de integrantes de la familia
     */
    private int familia;
    
    //Constructor 

    public ViajeFamiliar(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, int familia) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.familia = familia;
    }
    

    @Override
    public String descripcion() {
        return "Viaje para disfrutar con toda tu familia";
    }

    @Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje familiar";
    }

    public int getFamilia() {
        return familia;
    }

    //getters and setters
    public void setFamilia(int familia) {
        this.familia = familia;
    }
    
    
}
