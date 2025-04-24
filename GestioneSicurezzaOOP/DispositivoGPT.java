package infordata;

public abstract class DispositivoGPT {

    protected String idDispositivo;
    protected static int contatore = 1;
    protected String stato; // Attivo o Inattivo
    protected int percentualeEnergia;

    public DispositivoGPT(String id) {

        this.idDispositivo = String.format("%06d", contatore++);
        this.stato = "Inattivo";
        this.percentualeEnergia = 0;
    }

    public String getIdDispositivo() {
        return idDispositivo;
    }

    public String getStato() {
        return stato;
    }

    public int getPercentualeEnergia() {
        return percentualeEnergia;
    }

    public void setIdDispositivo(String idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public void setPercentualeEnergia(int percentualeEnergia) {
        this.percentualeEnergia = percentualeEnergia;
    }

    public void attivaDispositivo() {
        if (percentualeEnergia >= 30) {
            this.stato = "Attivo";
        } else {
            this.stato = "Inattivo";
        }
    }

    public boolean controllaEnergia() {
        if (percentualeEnergia > 20) {
            return true;
        }
        return false;
    }

    public void ricaricaEnergia(int ricarica) {
        ricarica = Math.abs(ricarica);
        if (ricarica > 100) {
            percentualeEnergia = 100;
        } else if (percentualeEnergia + ricarica > 100) {
            percentualeEnergia = 100;
        } else {
            percentualeEnergia = percentualeEnergia + ricarica;
        }

    }

    @Override
    public String toString() {
        return "DispositivoGPT{" + "idDispositivo=" + idDispositivo + ", stato=" + stato + ", percentualeEnergia=" + percentualeEnergia + '}';
    }
    
    

}
