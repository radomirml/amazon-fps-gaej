
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
 *         &lt;element name="DebtBalance" type="{http://fps.amazonaws.com/doc/2008-09-17/}DebtBalance" minOccurs="0"/>
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
    "debtBalance"
})
@XmlRootElement(name = "GetDebtBalanceResult")
public class GetDebtBalanceResult {

    @XmlElement(name = "DebtBalance")
    protected DebtBalance debtBalance;

    /**
     * Default constructor
     * 
     */
    public GetDebtBalanceResult() {
        super();
    }

    /**
     * Value constructor
     * 
     */
    public GetDebtBalanceResult(final DebtBalance debtBalance) {
        this.debtBalance = debtBalance;
    }

    /**
     * Gets the value of the debtBalance property.
     * 
     * @return
     *     possible object is
     *     {@link DebtBalance }
     *     
     */
    public DebtBalance getDebtBalance() {
        return debtBalance;
    }

    /**
     * Sets the value of the debtBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtBalance }
     *     
     */
    public void setDebtBalance(DebtBalance value) {
        this.debtBalance = value;
    }

    public boolean isSetDebtBalance() {
        return (this.debtBalance!= null);
    }

    /**
     * Sets the value of the DebtBalance property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public GetDebtBalanceResult withDebtBalance(DebtBalance value) {
        setDebtBalance(value);
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
        if (isSetDebtBalance()) {
            DebtBalance  debtBalance = getDebtBalance();
            xml.append("<DebtBalance>");
            xml.append(debtBalance.toXMLFragment());
            xml.append("</DebtBalance>");
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
        if (isSetDebtBalance()) {
            if (!first) json.append(", ");
            json.append("\"DebtBalance\" : {");
            DebtBalance  debtBalance = getDebtBalance();


            json.append(debtBalance.toJSONFragment());
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
