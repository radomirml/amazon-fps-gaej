
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
 *         &lt;element name="OutstandingPrepaidLiability" type="{http://fps.amazonaws.com/doc/2008-09-17/}OutstandingPrepaidLiability" minOccurs="0"/>
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
    "outstandingPrepaidLiability"
})
@XmlRootElement(name = "GetTotalPrepaidLiabilityResult")
public class GetTotalPrepaidLiabilityResult {

    @XmlElement(name = "OutstandingPrepaidLiability")
    protected OutstandingPrepaidLiability outstandingPrepaidLiability;

    /**
     * Default constructor
     * 
     */
    public GetTotalPrepaidLiabilityResult() {
        super();
    }

    /**
     * Value constructor
     * 
     */
    public GetTotalPrepaidLiabilityResult(final OutstandingPrepaidLiability outstandingPrepaidLiability) {
        this.outstandingPrepaidLiability = outstandingPrepaidLiability;
    }

    /**
     * Gets the value of the outstandingPrepaidLiability property.
     * 
     * @return
     *     possible object is
     *     {@link OutstandingPrepaidLiability }
     *     
     */
    public OutstandingPrepaidLiability getOutstandingPrepaidLiability() {
        return outstandingPrepaidLiability;
    }

    /**
     * Sets the value of the outstandingPrepaidLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutstandingPrepaidLiability }
     *     
     */
    public void setOutstandingPrepaidLiability(OutstandingPrepaidLiability value) {
        this.outstandingPrepaidLiability = value;
    }

    public boolean isSetOutstandingPrepaidLiability() {
        return (this.outstandingPrepaidLiability!= null);
    }

    /**
     * Sets the value of the OutstandingPrepaidLiability property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public GetTotalPrepaidLiabilityResult withOutstandingPrepaidLiability(OutstandingPrepaidLiability value) {
        setOutstandingPrepaidLiability(value);
        return this;
    }
    

    /**
     * 
     * XML fragment representation of this object
     * 
     * @return XML fragment for this object. Name for outer
     * tag expected to be set by calling method. This fragment
     * returns inner properties representation only
     */
    protected String toXMLFragment() {
        StringBuffer xml = new StringBuffer();
        if (isSetOutstandingPrepaidLiability()) {
            OutstandingPrepaidLiability  outstandingPrepaidLiability = getOutstandingPrepaidLiability();
            xml.append("<OutstandingPrepaidLiability>");
            xml.append(outstandingPrepaidLiability.toXMLFragment());
            xml.append("</OutstandingPrepaidLiability>");
        } 
        return xml.toString();
    }

    /**
     * 
     * Escape XML special characters
     */
    private String escapeXML(String string) {
        StringBuffer sb = new StringBuffer();
        int length = string.length();
        for (int i = 0; i < length; ++i) {
            char c = string.charAt(i);
            switch (c) {
            case '&':
                sb.append("&amp;");
                break;
            case '<':
                sb.append("&lt;");
                break;
            case '>':
                sb.append("&gt;");
                break;
            case '\'':
                sb.append("&#039;");
                break;
            case '"':
                sb.append("&quot;");
                break;
            default:
                sb.append(c);
            }
        }
        return sb.toString();
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
        if (isSetOutstandingPrepaidLiability()) {
            if (!first) json.append(", ");
            json.append("\"OutstandingPrepaidLiability\" : {");
            OutstandingPrepaidLiability  outstandingPrepaidLiability = getOutstandingPrepaidLiability();


            json.append(outstandingPrepaidLiability.toJSONFragment());
            json.append("}");
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
