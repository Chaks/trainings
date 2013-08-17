
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsSDNAndBlockedPersonsResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SDNLists" type="{http://www.webservicex.net/}SDNList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isSDNAndBlockedPersonsResult",
    "sdnLists"
})
@XmlRootElement(name = "IsSDNAndBlockedPersonsResponse")
public class IsSDNAndBlockedPersonsResponse {

    @XmlElement(name = "IsSDNAndBlockedPersonsResult")
    protected boolean isSDNAndBlockedPersonsResult;
    @XmlElement(name = "SDNLists", required = true)
    protected SDNList sdnLists;

    /**
     * Gets the value of the isSDNAndBlockedPersonsResult property.
     * 
     */
    public boolean isIsSDNAndBlockedPersonsResult() {
        return isSDNAndBlockedPersonsResult;
    }

    /**
     * Sets the value of the isSDNAndBlockedPersonsResult property.
     * 
     */
    public void setIsSDNAndBlockedPersonsResult(boolean value) {
        this.isSDNAndBlockedPersonsResult = value;
    }

    /**
     * Gets the value of the sdnLists property.
     * 
     * @return
     *     possible object is
     *     {@link SDNList }
     *     
     */
    public SDNList getSDNLists() {
        return sdnLists;
    }

    /**
     * Sets the value of the sdnLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link SDNList }
     *     
     */
    public void setSDNLists(SDNList value) {
        this.sdnLists = value;
    }

}
