package ejercicio_practico3;

public class Datos {

    private String iglesia;
    private String pastor;
    public int cantFeligreses;

    public Datos(String iglesia, String pastor, int cantFeligreses) {
        this.iglesia = iglesia;
        this.pastor = pastor;
        this.cantFeligreses = cantFeligreses;
    }

    public String getIglesia() {
        return iglesia;
    }

    public void setIglesia(String iglesia) {
        this.iglesia = iglesia;
    }

    public String getPastor() {
        return pastor;
    }

    public void setPastor(String pastor) {
        this.pastor = pastor;
    }

    public int getCantFeligreses() {
        return cantFeligreses;
    }

    public void setCantFeligreses(int cantFeligreses) {
        this.cantFeligreses = cantFeligreses;
    }


    
}
