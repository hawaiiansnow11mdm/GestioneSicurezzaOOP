/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infordata;

/**
 *
 * @author Faima
 */
public class Telecamera extends DispositivoGPT{
    
    private String risoluzione;
    
    public Telecamera(String id, String risoluzione) {
        super(id);
        
        this.risoluzione= risoluzione;
    }

    public String getRisoluzione() {
        return risoluzione;
    }

    public void setRisoluzione(String risoluzione) {
        this.risoluzione = risoluzione;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null || (!(o instanceof Telecamera))) {
            return false;
        }
        Telecamera oTelecamera = (Telecamera) o;
        return this.idDispositivo.equals(oTelecamera.idDispositivo);
    }
    
}
