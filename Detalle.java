public class Detalle {
    private String alimento;
    private int cantidad;
    private Double subtotal;
    private String fecha;




    public Detalle() {
    }




    public Detalle(String alimento, int cantidad, Double subtotal, String fecha) {
        this.alimento = alimento;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.fecha = fecha;
    }




    public String getAlimento() {
        return alimento;
    }




    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }




    public int getCantidad() {
        return cantidad;
    }




    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }




    public Double getSubtotal() {
        return subtotal;
    }




    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }




    public String getFecha() {
        return fecha;
    }




    public void setFecha(String fecha) {
        this.fecha = fecha;
    } 

    

}

