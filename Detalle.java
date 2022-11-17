public class Detalle {
    private String alimento;
    private int cantidad;
    private String fecha;




    public Detalle() {
    }




    public Detalle(String alimento, int cantidad, String fecha) {
        this.alimento = alimento;
        this.cantidad = cantidad;
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

    public String getFecha() {
        return fecha;
    }




    public void setFecha(String fecha) {
        this.fecha = fecha;
    } 

    

}

