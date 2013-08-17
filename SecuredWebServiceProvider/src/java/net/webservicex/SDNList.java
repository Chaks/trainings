
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SDNList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SDNList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalRecords" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SDNLists" type="{http://www.webservicex.net/}ArrayOfSDN" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SDNList", propOrder = {
    "totalRecords",
    "sdnLists"
})
public class SDNList {

    @XmlElement(name = "TotalRecords")
    protected int totalRecords;
    @XmlElement(name = "SDNLists")
    protected ArrayOfSDN sdnLists;

    /**
     * Gets the value of the totalRecords property.
     * 
     */
    public int getTotalRecords() {
        return totalRecords;
    }

    /**
     * Sets the value of the totalRecords property.
     * 
     */
    public void setTotalRecords(int value) {
        this.totalRecords = value;
    }

    /**
     * Gets the value of the sdnLists property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSDN }
     *     
     */
    public ArrayOfSDN getSDNLists() {
        return sdnLists;
    }

    /**
     * Sets the value of the sdnLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSDN }
     *     
     */
    public void setSDNLists(ArrayOfSDN value) {
        this.sdnLists = value;
    }

}
