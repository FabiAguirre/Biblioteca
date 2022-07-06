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
public class libro extends tematica{
    
    protected int codigo;
    protected String titulo;
    protected String autor;
    protected String fechaPrestamo;
    protected String fechaEntrega;
    public boolean disponibilidad;
    protected String localizacion;
    protected int numEjemplares;

    public libro() {
    }

    public libro(int codigo, String titulo, String autor, String fechaPrestamo, String fechaEntrega, boolean disponibilidad, String localizacion, int numEjemplares, String infantil, String narrativa, String ensayo, String poesia, String aventura, String fantasia, String misterio) {
        super(infantil, narrativa, ensayo, poesia, aventura, fantasia, misterio);
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.disponibilidad = disponibilidad;
        this.localizacion = localizacion;
        this.numEjemplares = numEjemplares;
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

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public String getInfantil() {
        return infantil;
    }

    public void setInfantil(String infantil) {
        this.infantil = infantil;
    }

    public String getNarrativa() {
        return narrativa;
    }

    public void setNarrativa(String narrativa) {
        this.narrativa = narrativa;
    }

    public String getEnsayo() {
        return ensayo;
    }

    public void setEnsayo(String ensayo) {
        this.ensayo = ensayo;
    }

    public String getPoesia() {
        return poesia;
    }

    public void setPoesia(String poesia) {
        this.poesia = poesia;
    }

    public String getAventura() {
        return aventura;
    }

    public void setAventura(String aventura) {
        this.aventura = aventura;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getMisterio() {
        return misterio;
    }

    public void setMisterio(String misterio) {
        this.misterio = misterio;
    }

        

    public void tematica () {
    }    
    
}
