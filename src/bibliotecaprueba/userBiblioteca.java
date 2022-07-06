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
public class userBiblioteca {
    
    private int idB;
    private String nombreB;

    public userBiblioteca() {
    }

    public userBiblioteca(int idB, String nombreB) {
        this.idB = idB;
        this.nombreB = nombreB;
    }

    public int getIdB() {
        return idB;
    }

    public void setIdB(int idB) {
        this.idB = idB;
    }

    public String getNombreB() {
        return nombreB;
    }

    public void setNombreB(String nombreB) {
        this.nombreB = nombreB;
    }
    
    
    public void registrarSocio() {
    }
    
    public void registrarLibro() {
    }
    
}
