//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2016.05.09 � 12:01:37 AM CEST 
//


package xml.presentation2metier;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ListeJoueursP2M complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ListeJoueursP2M">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listeJoueurs" type="{http://pds.m1.upec.fr/xml/presentation2metier}JoueurP2M" maxOccurs="7" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListeJoueursP2M", propOrder = {
    "listeJoueurs"
})
public class ListeJoueursP2M {

    protected List<JoueurP2M> listeJoueurs;

    /**
     * Gets the value of the listeJoueurs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listeJoueurs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListeJoueurs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JoueurP2M }
     * 
     * 
     */
    public List<JoueurP2M> getListeJoueurs() {
        if (listeJoueurs == null) {
            listeJoueurs = new ArrayList<JoueurP2M>();
        }
        return this.listeJoueurs;
    }

}
