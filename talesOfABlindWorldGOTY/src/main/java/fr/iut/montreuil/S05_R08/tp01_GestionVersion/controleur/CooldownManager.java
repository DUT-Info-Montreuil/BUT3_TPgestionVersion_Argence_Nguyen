package fr.iut.montreuil.S05_R08.tp01_GestionVersion.controleur;

public class CooldownManager {

    private int cdShuriken;

    public CooldownManager(){
        cdShuriken=0;
    }

    public void incrementCD(){
        cdShuriken++;
    }

    public int getCdShuriken() {
        return cdShuriken;
    }

    public void setCdShuriken(int cdShuriken) {
        this.cdShuriken = cdShuriken;
    }
}
