/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infordata;

/**
 *
 * @author Faima
 */
public class SistemaDiAllarme extends DispositivoGPT {

    private String livelloAllarme;
    private boolean allarmeAttivo;

    public SistemaDiAllarme(String id, String livelloAllarme) {
        super(id);
        this.livelloAllarme = livelloAllarme;
    }

    public void attivaAllarme() {
        if (stato.equalsIgnoreCase("Attivo") && percentualeEnergia > 50) {
            allarmeAttivo = true;
            System.out.println("Allarme attivato! Energia sopra il 50% con dispositivo attivo.");

        } else {
            allarmeAttivo = false;
        }
    }

    public String getLivelloAllarme() {
        return livelloAllarme;
    }

    public void setLivelloAllarme(String livelloAllarme) {
        this.livelloAllarme = livelloAllarme;
    }

    public boolean isAllarmeAttivo() {
        return allarmeAttivo;
    }

    public void setAllarmeAttivo(boolean allarmeAttivo) {
        this.allarmeAttivo = allarmeAttivo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || (!(o instanceof SistemaDiAllarme))) {
            return false;
        }
        SistemaDiAllarme oSistemaDiAllarme = (SistemaDiAllarme) o;
        return this.idDispositivo.equals(oSistemaDiAllarme.idDispositivo);
    }

}
