/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaprueba;

/**
 *
 * @author lab16
 */
public class prestamo extends libro{
    // no me acordaba como usar el interface/implements porque tiene herencia
    // multiple con libro y userSocio.
    
    protected String fechaPrestamoP;

    public prestamo() {
    }

    public prestamo(String fechaPrestamoP) {
        this.fechaPrestamoP = fechaPrestamoP;
    }

    public prestamo(String fechaPrestamoP, int codigo, String titulo, String autor, String fechaPrestamo, String fechaEntrega, boolean disponibilidad, String localizacion, int numEjemplares, String infantil, String narrativa, String ensayo, String poesia, String aventura, String fantasia, String misterio) {
        super(codigo, titulo, autor, fechaPrestamo, fechaEntrega, disponibilidad, localizacion, numEjemplares, infantil, narrativa, ensayo, poesia, aventura, fantasia, misterio);
        this.fechaPrestamoP = fechaPrestamoP;
    }

   
    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFechaPrestamoP() {
        return fechaPrestamo;
    }

    public void setFechaPrestamoP(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    
    

}
