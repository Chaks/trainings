
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SDN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SDN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UniqueRecord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameOfSDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeOfSDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SanctionsProgramName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TitleOfAnIndividual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VesselCallSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VesselType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VesselTonnage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GrossRegisteredTonnage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VesselFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VesselOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemarksOnSDN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemarksOnAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeOfAlternateIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlternateIdentityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemarksOnAlternative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SDN", propOrder = {
    "uniqueRecord",
    "nameOfSDN",
    "typeOfSDN",
    "sanctionsProgramName",
    "titleOfAnIndividual",
    "vesselCallSign",
    "vesselType",
    "vesselTonnage",
    "grossRegisteredTonnage",
    "vesselFlag",
    "vesselOwner",
    "remarksOnSDN",
    "streetAddress",
    "city",
    "country",
    "remarksOnAddress",
    "typeOfAlternateIdentity",
    "alternateIdentityName",
    "remarksOnAlternative"
})
public class SDN {

    @XmlElement(name = "UniqueRecord")
    protected String uniqueRecord;
    @XmlElement(name = "NameOfSDN")
    protected String nameOfSDN;
    @XmlElement(name = "TypeOfSDN")
    protected String typeOfSDN;
    @XmlElement(name = "SanctionsProgramName")
    protected String sanctionsProgramName;
    @XmlElement(name = "TitleOfAnIndividual")
    protected String titleOfAnIndividual;
    @XmlElement(name = "VesselCallSign")
    protected String vesselCallSign;
    @XmlElement(name = "VesselType")
    protected String vesselType;
    @XmlElement(name = "VesselTonnage")
    protected String vesselTonnage;
    @XmlElement(name = "GrossRegisteredTonnage")
    protected String grossRegisteredTonnage;
    @XmlElement(name = "VesselFlag")
    protected String vesselFlag;
    @XmlElement(name = "VesselOwner")
    protected String vesselOwner;
    @XmlElement(name = "RemarksOnSDN")
    protected String remarksOnSDN;
    @XmlElement(name = "StreetAddress")
    protected String streetAddress;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "RemarksOnAddress")
    protected String remarksOnAddress;
    @XmlElement(name = "TypeOfAlternateIdentity")
    protected String typeOfAlternateIdentity;
    @XmlElement(name = "AlternateIdentityName")
    protected String alternateIdentityName;
    @XmlElement(name = "RemarksOnAlternative")
    protected String remarksOnAlternative;

    /**
     * Gets the value of the uniqueRecord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueRecord() {
        return uniqueRecord;
    }

    /**
     * Sets the value of the uniqueRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueRecord(String value) {
        this.uniqueRecord = value;
    }

    /**
     * Gets the value of the nameOfSDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfSDN() {
        return nameOfSDN;
    }

    /**
     * Sets the value of the nameOfSDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfSDN(String value) {
        this.nameOfSDN = value;
    }

    /**
     * Gets the value of the typeOfSDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfSDN() {
        return typeOfSDN;
    }

    /**
     * Sets the value of the typeOfSDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfSDN(String value) {
        this.typeOfSDN = value;
    }

    /**
     * Gets the value of the sanctionsProgramName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanctionsProgramName() {
        return sanctionsProgramName;
    }

    /**
     * Sets the value of the sanctionsProgramName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanctionsProgramName(String value) {
        this.sanctionsProgramName = value;
    }

    /**
     * Gets the value of the titleOfAnIndividual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleOfAnIndividual() {
        return titleOfAnIndividual;
    }

    /**
     * Sets the value of the titleOfAnIndividual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleOfAnIndividual(String value) {
        this.titleOfAnIndividual = value;
    }

    /**
     * Gets the value of the vesselCallSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVesselCallSign() {
        return vesselCallSign;
    }

    /**
     * Sets the value of the vesselCallSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVesselCallSign(String value) {
        this.vesselCallSign = value;
    }

    /**
     * Gets the value of the vesselType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVesselType() {
        return vesselType;
    }

    /**
     * Sets the value of the vesselType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVesselType(String value) {
        this.vesselType = value;
    }

    /**
     * Gets the value of the vesselTonnage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVesselTonnage() {
        return vesselTonnage;
    }

    /**
     * Sets the value of the vesselTonnage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVesselTonnage(String value) {
        this.vesselTonnage = value;
    }

    /**
     * Gets the value of the grossRegisteredTonnage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrossRegisteredTonnage() {
        return grossRegisteredTonnage;
    }

    /**
     * Sets the value of the grossRegisteredTonnage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrossRegisteredTonnage(String value) {
        this.grossRegisteredTonnage = value;
    }

    /**
     * Gets the value of the vesselFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVesselFlag() {
        return vesselFlag;
    }

    /**
     * Sets the value of the vesselFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVesselFlag(String value) {
        this.vesselFlag = value;
    }

    /**
     * Gets the value of the vesselOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVesselOwner() {
        return vesselOwner;
    }

    /**
     * Sets the value of the vesselOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVesselOwner(String value) {
        this.vesselOwner = value;
    }

    /**
     * Gets the value of the remarksOnSDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarksOnSDN() {
        return remarksOnSDN;
    }

    /**
     * Sets the value of the remarksOnSDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarksOnSDN(String value) {
        this.remarksOnSDN = value;
    }

    /**
     * Gets the value of the streetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * Sets the value of the streetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetAddress(String value) {
        this.streetAddress = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the remarksOnAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarksOnAddress() {
        return remarksOnAddress;
    }

    /**
     * Sets the value of the remarksOnAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarksOnAddress(String value) {
        this.remarksOnAddress = value;
    }

    /**
     * Gets the value of the typeOfAlternateIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfAlternateIdentity() {
        return typeOfAlternateIdentity;
    }

    /**
     * Sets the value of the typeOfAlternateIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfAlternateIdentity(String value) {
        this.typeOfAlternateIdentity = value;
    }

    /**
     * Gets the value of the alternateIdentityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateIdentityName() {
        return alternateIdentityName;
    }

    /**
     * Sets the value of the alternateIdentityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateIdentityName(String value) {
        this.alternateIdentityName = value;
    }

    /**
     * Gets the value of the remarksOnAlternative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarksOnAlternative() {
        return remarksOnAlternative;
    }

    /**
     * Sets the value of the remarksOnAlternative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarksOnAlternative(String value) {
        this.remarksOnAlternative = value;
    }

}
