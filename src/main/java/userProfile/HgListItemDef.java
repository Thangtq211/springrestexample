//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.12 at 08:39:46 PM PDT 
//


package userProfile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for hgListItemDef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hgListItemDef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hgLineUri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="selfLineUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hgListItemDef", namespace = "urn:oma:xml:xdm:user-profile", propOrder = {
    "hgLineUri",
    "selfLineUri"
})
public class HgListItemDef {

    @XmlElement(namespace = "urn:oma:xml:xdm:user-profile", required = true)
    protected String hgLineUri;
    @XmlElement(namespace = "urn:oma:xml:xdm:user-profile")
    protected String selfLineUri;

    /**
     * Gets the value of the hgLineUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHgLineUri() {
        return hgLineUri;
    }

    /**
     * Sets the value of the hgLineUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHgLineUri(String value) {
        this.hgLineUri = value;
    }

    /**
     * Gets the value of the selfLineUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelfLineUri() {
        return selfLineUri;
    }

    /**
     * Sets the value of the selfLineUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelfLineUri(String value) {
        this.selfLineUri = value;
    }

}
