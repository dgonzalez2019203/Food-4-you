public class Supermercado {
    private String nombre;
    private String descripción;
    private int nivel;
    

    public Supermercado() {
    }


    public Supermercado(String nombre, String descripción, int nivel) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.nivel = nivel;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return this.descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", descripción='" + getDescripción() + "'" +
            ", nivel='" + getNivel() + "'" +
            "}";
    }

}
