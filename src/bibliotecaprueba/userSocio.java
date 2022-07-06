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
public class userSocio extends prestamo{
    
    protected int idS;
    protected String nombreS;
    protected String dirPostal;
    public boolean estado;

    public userSocio() {
    }

    public userSocio(int idS, String nombreS, String dirPostal, boolean estado) {
        this.idS = idS;
        this.nombreS = nombreS;
        this.dirPostal = dirPostal;
        this.estado = estado;
    }

    public int getIdS() {
        return idS;
    }

    public void setIdS(int idS) {
        this.idS = idS;
    }

    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public String getDirPostal() {
        return dirPostal;
    }

    public void setDirPostal(String dirPostal) {
        this.dirPostal = dirPostal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    
    public void estado() {
    }
    
    public void librosPrestados() {
    }
    
    public void Penalizacion() {
    }
    
}
