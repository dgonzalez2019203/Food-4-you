public class Alimento {
    private String nombre;
    private String valNutricional;
    private Categoria categoria;
    private int cantidad;
    private Supermercado supermercado;
    

    public Alimento() {
    }


    public Alimento(String nombre, String valNutricional, Categoria categoria, int cantidad, Supermercado supermercado) {
        this.nombre = nombre;
        this.valNutricional = valNutricional;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.supermercado = supermercado;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValNutricional() {
        return this.valNutricional;
    }

    public void setValNutricional(String valNutricional) {
        this.valNutricional = valNutricional;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Supermercado getSupermercado() {
        return this.supermercado;
    }

    public void setSupermercado(Supermercado supermercado) {
        this.supermercado = supermercado;
    }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", valNutricional='" + getValNutricional() + "'" +
            ", categoria='" + getCategoria() + "'" +
            ", cantidad='" + getCantidad() + "'" +
            ", supermercado='" + getSupermercado() + "'" +
            "}";
    }


}
