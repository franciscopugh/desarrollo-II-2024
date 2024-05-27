package desarrollo2;

//marca - color - modelo - patente - cantRuedas - cantPuertas 
public class Auto {

    private String marca;
    private String color;
    private String modelo;
    private String patente;
    private int cantRuedas;
    private int cantPuertas;

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return this.patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCantRuedas() {
        return this.cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public int getCantPuertas() {
        return this.cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String nuevaMarca) {
        this.marca = nuevaMarca;
    }

    public Auto(String marca, String modelo, String color, String patente, int cantPuertas, int cantRuedas) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.patente = patente;
        this.cantPuertas = cantPuertas;
        this.cantRuedas = cantRuedas;
    }
}
