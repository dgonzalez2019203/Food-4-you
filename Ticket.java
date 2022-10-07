public class Ticket {
    private Double subtotal;
    private String  familia;
    private String fecha;
    private String usuario;
    
    public Ticket() {
    }

    public Ticket(Double subtotal, String familia, String fecha, String usuario) {
        this.subtotal = subtotal;
        this.familia = familia;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
}