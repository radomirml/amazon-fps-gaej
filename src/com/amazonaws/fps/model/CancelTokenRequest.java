
package com.amazonaws.fps.model;

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
 *         &lt;element name="TokenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReasonText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * Generated by AWS Code Generator
 * <p/>
 * Tue Sep 29 03:25:23 PDT 2009
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tokenId",
    "reasonText"
})
@XmlRootElement(name = "CancelTokenRequest")
public class CancelTokenRequest {

    @XmlElement(name = "TokenId")
    protected String tokenId;
    @XmlElement(name = "ReasonText")
    protected String reasonText;

    /**
     * Default constructor
     * 
     */
    public CancelTokenRequest() {
        super();
    }

    /**
     * Value constructor
     * 
     */
    public CancelTokenRequest(final String tokenId, final String reasonText) {
        this.tokenId = tokenId;
        this.reasonText = reasonText;
    }

    /**
     * Gets the value of the tokenId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenId() {
        return tokenId;
    }

    /**
     * Sets the value of the tokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenId(String value) {
        this.tokenId = value;
    }

    public boolean isSetTokenId() {
        return (this.tokenId!= null);
    }

    /**
     * Gets the value of the reasonText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonText() {
        return reasonText;
    }

    /**
     * Sets the value of the reasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonText(String value) {
        this.reasonText = value;
    }

    public boolean isSetReasonText() {
        return (this.reasonText!= null);
    }

    /**
     * Sets the value of the TokenId property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public CancelTokenRequest withTokenId(String value) {
        setTokenId(value);
        return this;
    }

    /**
     * Sets the value of the ReasonText property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public CancelTokenRequest withReasonText(String value) {
        setReasonText(value);
        return this;
    }
    


    /**
     *
     * JSON fragment representation of this object
     *
     * @return JSON fragment for this object. Name for outer
     * object expected to be set by calling method. This fragment
     * returns inner properties representation only
     *
     */
    protected String toJSONFragment() {
        StringBuffer json = new StringBuffer();
        boolean first = true;
        if (isSetTokenId()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("TokenId"));
            json.append(" : ");
            json.append(quoteJSON(getTokenId()));
            first = false;
        }
        if (isSetReasonText()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("ReasonText"));
            json.append(" : ");
            json.append(quoteJSON(getReasonText()));
            first = false;
        }
        return json.toString();
    }

    /**
     *
     * Quote JSON string
     */
    private String quoteJSON(String string) {
        StringBuffer sb = new StringBuffer();
        sb.append("\"");
        int length = string.length();
        for (int i = 0; i < length; ++i) {
            char c = string.charAt(i);
            switch (c) {
            case '"':
                sb.append("\\\"");
                break;
            case '\\':
                sb.append("\\\\");
                break;
            case '/':
                sb.append("\\/");
                break;
            case '\b':
                sb.append("\\b");
                break;
            case '\f':
                sb.append("\\f");
                break;
            case '\n':
                sb.append("\\n");
                break;
            case '\r':
                sb.append("\\r");
                break;
            case '\t':
                sb.append("\\t");
                break;
            default:
                if (c <  ' ') {
                    sb.append("\\u" + String.format("%03x", Integer.valueOf(c)));
                } else {
                sb.append(c);
            }
        }
        }
        sb.append("\"");
        return sb.toString();
    }


}
