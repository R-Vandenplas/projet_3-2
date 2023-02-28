package projet3_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * classe employe
 * @author Romain Vandenplas
 * @version 1.0
 * @see Service
 * @see Message
 */
public class Employe {
    /**
     * identifiant de l'employé
     */
    private int id;

    /**
     * mail de l'employé
     */
    private String mail;

    /**
     * nom de l'employé
     */
    private String nom;

    /**
     * prenom de l'employé
     */
    private String prenom;

    /**
     * service de l'employé
     */
    private Service service;

    /**
     * liste des messages envoyés par l'employé
     */
    private List<Message>msg =new ArrayList<>();


    /**
     * constructeur paramétré
     * @param id identifiant de l'employé
     * @param mail mail de l'employé
     * @param nom nom de l'employé
     * @param prenom prenom de l'employé
     */
    public Employe(int id, String mail, String nom, String prenom) {
        this.id = id;
        this.mail = mail;
        this.nom = nom;
        this.prenom = prenom;
    }

    /**
     * getter id
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * setter id
     * @param id id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * getter mail
     * @return mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * setter mail
     * @param mail mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * getter nom
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * setter nom
     * @param nom nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * getter prenom
     * @return prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * setter prenom
     * @param prenom
     */

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * getter service
     * @return service
     */
    public Service getService() {
        return service;
    }

    /**
     * setter service
     * @param service service
     */
    public void setService(Service service) {
        this.service = service;
    }

    /**
     * getter liste message
     * @return liste message
     */
    public List<Message> getMsg() {
        return msg;
    }

    /**
     * setter liste message
     * @param msg liste message
     */
    public void setMsg(List<Message> msg) {
        this.msg = msg;
    }

    /**
     * test d'égalité basé sur l'id
     * @param o autre employe
     * @return égalité ou pas
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id == employe.id;
    }

    /**
     * hashcode basé sur l'id
     * @return hashcode de l'employé
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
