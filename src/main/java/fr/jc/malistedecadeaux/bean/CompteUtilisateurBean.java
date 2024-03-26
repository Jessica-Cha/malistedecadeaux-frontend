package fr.jc.malistedecadeaux.bean;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.io.Serializable;


@Named("compteUtilisateurBean")
@RequestScoped
public class CompteUtilisateurBean implements Serializable {

    private Integer idCompteUtilisateur;
    private String login;
    private String motDePasse;
    private Long dateCreationCompte;
    private String ipConnexion;
    private String navigateur;

    public Integer getIdCompteUtilisateur() {
        return idCompteUtilisateur;
    }

    public String getLogin() {
        return login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public Long getDateCreationCompte() {
        return dateCreationCompte;
    }

    public String getIpConnexion() {
        return ipConnexion;
    }

    public String getNavigateur() {
        return navigateur;
    }

    public void setIdCompteUtilisateur(Integer idCompteUtilisateur) {
        this.idCompteUtilisateur = idCompteUtilisateur;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public void setDateCreationCompte(Long dateCreationCompte) {
        this.dateCreationCompte = dateCreationCompte;
    }

    public void setIpConnexion(String ipConnexion) {
        this.ipConnexion = ipConnexion;
    }

    public void setNavigateur(String navigateur) {
        this.navigateur = navigateur;
    }

    public String returnAction() {
        return motDePasse.equals("123456") ? "Success" : "Failure";
    }
}
