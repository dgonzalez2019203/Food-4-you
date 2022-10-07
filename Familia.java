public class Familia {
    private String apellido;
    private int totalMiembros;
    private int cantNiños;
    private int cantAdultos;
    private int situacionPobreza;
    

    public Familia() {
    }


    public Familia(String apellido, int totalMiembros, int cantNiños, int cantAdultos, int situacionPobreza) {
        this.apellido = apellido;
        this.totalMiembros = totalMiembros;
        this.cantNiños = cantNiños;
        this.cantAdultos = cantAdultos;
        this.situacionPobreza = situacionPobreza;
    }


    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTotalMiembros() {
        return this.totalMiembros;
    }

    public void setTotalMiembros(int totalMiembros) {
        this.totalMiembros = totalMiembros;
    }

    public int getCantNiños() {
        return this.cantNiños;
    }

    public void setCantNiños(int cantNiños) {
        this.cantNiños = cantNiños;
    }

    public int getCantAdultos() {
        return this.cantAdultos;
    }

    public void setCantAdultos(int cantAdultos) {
        this.cantAdultos = cantAdultos;
    }

    public int getSituacionPobreza() {
        return this.situacionPobreza;
    }

    public void setSituacionPobreza(int situacionPobreza) {
        this.situacionPobreza = situacionPobreza;
    }

}
