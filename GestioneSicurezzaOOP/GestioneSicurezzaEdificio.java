
package infordata;

import java.util.ArrayList;


public class GestioneSicurezzaEdificio {
    
    private ArrayList<DispositivoGPT> elencoDispositivi;
    
    public GestioneSicurezzaEdificio(){
        
        elencoDispositivi = new ArrayList<DispositivoGPT>();
        
    }
    
    public boolean aggiungiDispositivo(DispositivoGPT dispositivo){
        for(DispositivoGPT tech : elencoDispositivi){
            if(tech.equals(dispositivo)){
                return false;
            }
        }
        elencoDispositivi.add(dispositivo);
        return true;
    }
    
    
    public void attivaTuttiDispositivi(){
        for(DispositivoGPT tech : elencoDispositivi){
            if(tech.getStato().equalsIgnoreCase("Inattivo") && tech.getPercentualeEnergia()>=30){
                tech.setStato("Attivo");
                System.out.print("Dispositivo " + tech.toString());
            }
        }
    }
    
    public ArrayList<DispositivoGPT> dispositiviAttivi(){
        ArrayList<DispositivoGPT> dispositiviAttivi = new ArrayList<DispositivoGPT>();
        for(DispositivoGPT tech : elencoDispositivi){
            if(tech.getStato().equalsIgnoreCase("Attivo")){
                dispositiviAttivi.add(tech);
            }
        }
        return dispositiviAttivi;
    }
    
    public ArrayList<DispositivoGPT> dispositiviEnergiaBassa(){
        ArrayList<DispositivoGPT> dispositiviEnergiaBassa = new ArrayList<DispositivoGPT>();
        for (DispositivoGPT tech : elencoDispositivi){
            if(tech.getPercentualeEnergia() < 30){
                dispositiviEnergiaBassa.add(tech);
            }
        }
        return dispositiviEnergiaBassa;
    }
    
    public boolean gestisciAllarmiCritici(){
        boolean allarmeAttivato = false;
        for(DispositivoGPT tech : elencoDispositivi){
            if(tech instanceof SistemaDiAllarme ){
                SistemaDiAllarme techSistemaDiAllarme =(SistemaDiAllarme) tech;
                if(techSistemaDiAllarme.getLivelloAllarme().equalsIgnoreCase("Alto") && tech.getPercentualeEnergia() > 50){
                    techSistemaDiAllarme.setAllarmeAttivo(true);
                    allarmeAttivato = true;
                  
                }
            }
        }
        return false;
    }
    
}
