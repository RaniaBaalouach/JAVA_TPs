package TP3;
import java.util.Date;

public class Marchandise {
    private String code;
    private String description;
    private Date dateAchat;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public Marchandise() {
        this.dateAchat = new Date();
    }

    public Marchandise(String code, String description) {
        this.code = code;
        this.description = description;
        this.dateAchat = new Date();
    }

    public Marchandise(String code) {
        this.code = code;
        this.description = "N/A";
        this.dateAchat = new Date();
    }

    public Marchandise(Marchandise other) {
        this.code = other.code;
        this.description = other.description;
        this.dateAchat = other.dateAchat;
    }

    public String toString() {
        return "Le produit \"" + code + "\" - \"" + description +
               "\" a été acheté le " + dateAchat;
    }
}
