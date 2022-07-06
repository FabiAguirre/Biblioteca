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
public class tematica {
    
    protected String infantil;
    protected String narrativa;
    protected String ensayo;
    protected String poesia;
    protected String aventura;
    protected String fantasia;
    protected String misterio;

    public tematica() {
    }

    public tematica(String infantil, String narrativa, String ensayo, String poesia, String aventura, String fantasia, String misterio) {
        this.infantil = infantil;
        this.narrativa = narrativa;
        this.ensayo = ensayo;
        this.poesia = poesia;
        this.aventura = aventura;
        this.fantasia = fantasia;
        this.misterio = misterio;
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
    
    
    
}
