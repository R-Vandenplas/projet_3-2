package projet3_2;

import java.util.Date;
import java.util.Objects;

/**
 * classe métier de gestion des informations des messages
 *
 * @author Romain Vandenplas
 * @version 1.0
 * @see Message
 * @see Employe
 */

public class Infos {
    /**
    * date de lecture du message
    */
    private Date dateLecture;

    /**
     * message envoyé
     */
    private Message msg;

    /**
     * employe qui recoit le message
     */
    private Employe recepteur;

    /**
     * constructeur paramétré
     * @param dateLecture date où le message a été lu
     * @param msg le message envoyé
     * @param recepteur employé qui recoit le message
     */
    public Infos(Date dateLecture, Message msg, Employe recepteur) {
        this.dateLecture = dateLecture;
        this.msg = msg;
        this.recepteur = recepteur;
    }

    /**
     * getter DateLecture
     * @return date de lecture du message
     */
    public Date getDateLecture() {
        return dateLecture;
    }

    /**
     * setter DateLecture
     * @param dateLecture date de lecture du message
     */
    public void setDateLecture(Date dateLecture) {
        this.dateLecture = dateLecture;
    }

    /**
     * getter message
     * @return message
     */
    public Message getMsg() {
        return msg;
    }

    /**
     * setter message
     * @param msg message
     */
    public void setMsg(Message msg) {
        this.msg = msg;
    }

    /**
     * getter recepteur
     * @return recepteur
     */
    public Employe getRecepteur() {
        return recepteur;
    }

    /**
     *  setter recepteur
     * @param recepteur recepteur
     */
    public void setRecepteur(Employe recepteur) {
        this.recepteur = recepteur;
    }

    /**
     * test d'égalité basé sur la date de lecture,le message et le recepteur
     * @param o autre objet info
     * @return égalité ou pas
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Infos infos = (Infos) o;
        return Objects.equals(dateLecture, infos.dateLecture) && Objects.equals(msg, infos.msg) && Objects.equals(recepteur, infos.recepteur);
    }

    /**
     * hashcode basé sur la date de lecture,le message et le recepteur
     * @return hashcode des informations
     */
    @Override
    public int hashCode() {
        return Objects.hash(dateLecture, msg, recepteur);
    }
}
