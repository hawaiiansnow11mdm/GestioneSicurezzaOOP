package infordata;

public class SensoreDiMovimento extends DispositivoGPT {

    private int sensibilita;

    public SensoreDiMovimento(String id, int sensibilita) {
        super(id);

        if (sensibilita < 0) {
            sensibilita = Math.abs(sensibilita);
        }
        this.sensibilita = Math.min(sensibilita, 10);
    }

    public int getSensibilita() {
        return sensibilita;
    }

    public void setSensibilita(int sensibilita) {
        this.sensibilita = sensibilita;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || (!(o instanceof SensoreDiMovimento))) {
            return false;
        }
        SensoreDiMovimento oSensoreDiMovimento = (SensoreDiMovimento) o;
        return this.idDispositivo.equals(oSensoreDiMovimento.idDispositivo);
    }

    public boolean rilevaMovimento() {
        if (stato.equalsIgnoreCase("Attivo") && sensibilita > 5) {
            return true;
        }
        return false;
    }

}
