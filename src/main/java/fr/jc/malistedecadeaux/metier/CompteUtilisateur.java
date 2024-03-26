package fr.jc.malistedecadeaux.metier;

public class CompteUtilisateur {
    private Integer idCompteUtilisateur;
    private String login;
    private String motDePasse;
    private Long dateCreationCompte;
    private String ipConnexion;
    private String navigateur;

    public CompteUtilisateur(int idCompteUtilisateur, String  login, String motDePasse, Long dateCreationCompte, String ipConnexion, String navigateur) {
        this.idCompteUtilisateur = idCompteUtilisateur;
        this.login = login;
        this.motDePasse = motDePasse;
        this.dateCreationCompte = dateCreationCompte;
        this.ipConnexion = ipConnexion;
        this.navigateur = navigateur;
    }

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
}
