package ejercicio_practico3;

/**
 *
 * @author Darry OV
 */
public class DatosFeligeses {

    private String nombres;
    private int cedula;
    private double diezmo;

    public DatosFeligeses(String nombres, int cedula, double diezmo) {
        this.nombres = nombres;
        this.cedula = cedula;
        this.diezmo = diezmo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public double getDiezmo() {
        return diezmo;
    }

    public void setDiezmo(double diezmo) {
        this.diezmo = diezmo;
    }
    
}
