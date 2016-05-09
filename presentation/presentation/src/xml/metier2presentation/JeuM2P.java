//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2016.05.09 � 12:48:15 AM CEST 
//


package xml.metier2presentation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour JeuM2P complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="JeuM2P">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listeJoueurs" type="{http://pds.m1.upec.fr/xml/metier2presentation}ListeJoueursM2P"/>
 *         &lt;element name="partie" type="{http://pds.m1.upec.fr/xml/metier2presentation}PartieM2P"/>
 *         &lt;element name="listeDes" type="{http://pds.m1.upec.fr/xml/metier2presentation}ListeDesM2P"/>
 *       &lt;/sequence>
 *       &lt;attribute name="messageErreur" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JeuM2P", propOrder = {
    "listeJoueurs",
    "partie",
    "listeDes"
})
public class JeuM2P {

    @XmlElement(required = true)
    protected ListeJoueursM2P listeJoueurs;
    @XmlElement(required = true)
    protected PartieM2P partie;
    @XmlElement(required = true)
    protected ListeDesM2P listeDes;
    @XmlAttribute(name = "messageErreur")
    protected String messageErreur;

    /**
     * Obtient la valeur de la propri�t� listeJoueurs.
     * 
     * @return
     *     possible object is
     *     {@link ListeJoueursM2P }
     *     
     */
    public ListeJoueursM2P getListeJoueurs() {
        return listeJoueurs;
    }

    /**
     * D�finit la valeur de la propri�t� listeJoueurs.
     * 
     * @param value
     *     allowed object is
     *     {@link ListeJoueursM2P }
     *     
     */
    public void setListeJoueurs(ListeJoueursM2P value) {
        this.listeJoueurs = value;
    }

    /**
     * Obtient la valeur de la propri�t� partie.
     * 
     * @return
     *     possible object is
     *     {@link PartieM2P }
     *     
     */
    public PartieM2P getPartie() {
        return partie;
    }

    /**
     * D�finit la valeur de la propri�t� partie.
     * 
     * @param value
     *     allowed object is
     *     {@link PartieM2P }
     *     
     */
    public void setPartie(PartieM2P value) {
        this.partie = value;
    }

    /**
     * Obtient la valeur de la propri�t� listeDes.
     * 
     * @return
     *     possible object is
     *     {@link ListeDesM2P }
     *     
     */
    public ListeDesM2P getListeDes() {
        return listeDes;
    }

    /**
     * D�finit la valeur de la propri�t� listeDes.
     * 
     * @param value
     *     allowed object is
     *     {@link ListeDesM2P }
     *     
     */
    public void setListeDes(ListeDesM2P value) {
        this.listeDes = value;
    }

    /**
     * Obtient la valeur de la propri�t� messageErreur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageErreur() {
        return messageErreur;
    }

    /**
     * D�finit la valeur de la propri�t� messageErreur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageErreur(String value) {
        this.messageErreur = value;
    }

}
