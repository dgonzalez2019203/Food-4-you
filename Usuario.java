public class Usuario {
    private String name;
    private String username; 
    private String password;
    private String telefono;
    private Rol rol;

    public Usuario() {
    }



    public Usuario(String name, String username, String password, String telefono, Rol rol) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.telefono = telefono;
        this.rol = rol;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Rol getRol() {
        return this.rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", username='" + getUsername() + "'" +
            ", password='" + getPassword() + "'" +
            ", telefono='" + getTelefono() + "'" +
            ", rol='" + getRol() + "'" +
            "}";
    }

}
