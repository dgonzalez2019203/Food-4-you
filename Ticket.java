import java.util.ArrayList;

public class Ticket {
    private String  familia;
    private String fecha;
    private String usuario;
    private ArrayList<Detalle> listDetalle;

    public Ticket() {

        ArrayList<Detalle> listDetalle;
        listDetalle = new ArrayList<Detalle>();

    }

    public Ticket(Double subtotal, String familia, String fecha, String usuario) {
        this.familia = familia;
        this.fecha = fecha;
        this.usuario = usuario;
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


    public ArrayList<Detalle> getListDetalle() {
        return this.listDetalle;
    }

    public void setListDetalle(ArrayList<Detalle> listDetalle) {
        this.listDetalle = listDetalle;
    }
    
}