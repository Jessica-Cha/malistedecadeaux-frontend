package fr.jc.malistedecadeaux.bean;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named("inscriptionBean")
@ViewScoped
public class InscriptionBean implements Serializable {

    private boolean inscriptionActive = false;

    // Autres attributs et méthodes
    public boolean isInscriptionActive() {
        return inscriptionActive;
    }
    public void setInscriptionActive(boolean inscriptionActive) {
        this.inscriptionActive = inscriptionActive;
    }

    @PostConstruct
    public void init() {
        // Initialise l'état de inscriptionActive lorsque la page est chargée
        this.inscriptionActive = true;
    }
}

