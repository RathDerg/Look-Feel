public class Chaqueta {
    private String tipo;
    private String talla;
    private int cantidad;
    private double precio;
    private String color;


    public Chaqueta() {
    }

    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getTalla() {
        return talla;
    }


    public void setTalla(String talla) {
        this.talla = talla;
    }


    public int getCantidad() {
        return cantidad;
    }


    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public String imprimirDetalles () {

        return "La chaqueta es de tipo " + tipo + ", de la talla: " + talla + ", del color: " + color + ", existe un stock de: " +  cantidad + ", con un precio de: " + precio + " euros";

    }

    
    
}
