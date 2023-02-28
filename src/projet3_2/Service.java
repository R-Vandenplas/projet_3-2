package projet3_2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * classe service
 * @author Romain Vandenplas
 * @version 1.0
 * @see Employe
 */
public class Service {
    /**
     * identifiant du service
     */
    private int id;

    /**
     * nom du serice
     */
    private String nom;

    /**
     * budget du service
     */
    private DecimalFormat budget;

    /**
     * liste des employes travaillant dans le service
     */
    private List<Employe>employes=new ArrayList<>();

    /**
     * constructeur paramétré
     * @param id identifiant du service
     * @param nom nom du serice
     * @param budget budget du service
     */
    public Service(int id, String nom, DecimalFormat budget) {
        this.id = id;
        this.nom = nom;
        this.budget = budget;
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
     * getter budget
     * @return budget
     */
    public DecimalFormat getBudget() {
        return budget;
    }

    /**
     * setter budget
     * @param budget budget
     */
    public void setBudget(DecimalFormat budget) {
        this.budget = budget;
    }

    /**
     *  getter liste des employes
     * @return liste des employes
     */
    public List<Employe> getEmployes() {
        return employes;
    }

    /**
     * setter liste des employes
     * @param employes liste des employes
     */
    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }

    /**
     * test d'égalité basé sur l'id
     * @param o autre service
     * @return égalité ou pas
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return id == service.id;
    }

    /**
     * hashcode basé sur l'id
     * @return hashcode du service
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
