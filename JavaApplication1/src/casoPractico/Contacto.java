/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casoPractico;

/**
 *
 * @author laboratorio
 */
public class Contacto {
    private String nombreApellido;
    private String sexo;
    private int edad;
    private String direccion;
    private char estadoCivil;
    private String empresaTrabajo;
    private String telefono;
    private String email;
    

    public Contacto() {
        
    }

    public Contacto(String nombreApellido, String sexo, int edad, String direccion, char estadoCivil, String empresaTrabajo, String telefono, String email) {
        this.nombreApellido = nombreApellido;
        this.sexo = sexo;
        this.edad = edad;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.empresaTrabajo = empresaTrabajo;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public char getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(char estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEmpresaTrabajo() {
        return empresaTrabajo;
    }

    public void setEmpresaTrabajo(String empresaTrabajo) {
        this.empresaTrabajo = empresaTrabajo;
    }

     public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        
        
        
        return "Nombre Y Apellido : "+this.nombreApellido+
                "\n Edad :"+ this.edad+
                "\n Sexo :"+this.sexo+
                "\n Estado Civil :"+this.estadoCivil+
                "\n Telefono :"+this.telefono+
                "\n Email :"+this.email+
                "\n Direccion :"+this.direccion+
                "\n Empresa donde Trabaja"+this.empresaTrabajo;
    }

   
     
}
