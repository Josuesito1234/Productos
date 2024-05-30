public class Producto {
private int id;
private String Nombre;
private String Marca;
private double Precio;

    public Producto() {
    }

    public Producto(int id, String pNombre, String pMarca, double pPrecio) {
        this.id = id;
        Nombre = pNombre;
        Marca = pMarca;
        this.Precio = pPrecio;
    }

    @Override
    public String toString() {
        return "Producto: " + id + " " + Nombre + " " + Marca + " " + Precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String pMarca) {
        Marca = pMarca;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double pPrecio) {
        this.Precio = pPrecio;
    }
}
