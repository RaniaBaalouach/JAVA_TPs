package TP3;

public class Utilisateur extends Personne {
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Utilisateur() {}

    public Utilisateur(int id, String nom, double salaire, String login, String password) {
        super(id, nom, salaire);
        this.login = login;
        this.password = password;
    }

    public Utilisateur(Utilisateur other) {
        super(other);
        this.login = other.login;
        this.password = other.password;
    }

    public void afficheUtilisateur() {
        super.affichePersonne();
        System.out.println("Login: " + login);
    }
}
