package hospitalxyz;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author UCF20403
 */
public class Paciente {
private String nombreCompleto;
private String numeroDocumento;
private String edad;
private String TipoSangre;
private String Alergias;
private String Correo;
private String Telefono;

    public Paciente(String nombreCompleto, String numeroDocumento, int edad) {
        this.nombreCompleto = nombreCompleto;
        this.numeroDocumento = numeroDocumento;
       
    }

    public String getTipoSangre() {
        return TipoSangre;
    }

    public void setTipoSangre(String TipoSangre) {
        this.TipoSangre = TipoSangre;
    }

    public String getAlergias() {
        return Alergias;
    }

    public void setAlergias(String Alergias) {
        this.Alergias = Alergias;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public Paciente(String TipoSangre, String Alergias, String Correo, String Telefono) {
        this.TipoSangre = TipoSangre;
        this.Alergias = Alergias;
        this.Correo = Correo;
        this.Telefono = Telefono;
    }

    public Paciente() {
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

}
