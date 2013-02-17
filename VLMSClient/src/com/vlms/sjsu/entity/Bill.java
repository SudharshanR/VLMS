/**
 * Bill.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vlms.sjsu.entity;

public class Bill  implements java.io.Serializable {
    private java.lang.Float billAmount;

    private java.lang.String issuedDate;

    private int movieId;

    private java.lang.String returnedDate;

    private int userId;

    public Bill() {
    }

    public Bill(
           java.lang.Float billAmount,
           java.lang.String issuedDate,
           int movieId,
           java.lang.String returnedDate,
           int userId) {
           this.billAmount = billAmount;
           this.issuedDate = issuedDate;
           this.movieId = movieId;
           this.returnedDate = returnedDate;
           this.userId = userId;
    }


    /**
     * Gets the billAmount value for this Bill.
     * 
     * @return billAmount
     */
    public java.lang.Float getBillAmount() {
        return billAmount;
    }


    /**
     * Sets the billAmount value for this Bill.
     * 
     * @param billAmount
     */
    public void setBillAmount(java.lang.Float billAmount) {
        this.billAmount = billAmount;
    }


    /**
     * Gets the issuedDate value for this Bill.
     * 
     * @return issuedDate
     */
    public java.lang.String getIssuedDate() {
        return issuedDate;
    }


    /**
     * Sets the issuedDate value for this Bill.
     * 
     * @param issuedDate
     */
    public void setIssuedDate(java.lang.String issuedDate) {
        this.issuedDate = issuedDate;
    }


    /**
     * Gets the movieId value for this Bill.
     * 
     * @return movieId
     */
    public int getMovieId() {
        return movieId;
    }


    /**
     * Sets the movieId value for this Bill.
     * 
     * @param movieId
     */
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }


    /**
     * Gets the returnedDate value for this Bill.
     * 
     * @return returnedDate
     */
    public java.lang.String getReturnedDate() {
        return returnedDate;
    }


    /**
     * Sets the returnedDate value for this Bill.
     * 
     * @param returnedDate
     */
    public void setReturnedDate(java.lang.String returnedDate) {
        this.returnedDate = returnedDate;
    }


    /**
     * Gets the userId value for this Bill.
     * 
     * @return userId
     */
    public int getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this Bill.
     * 
     * @param userId
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Bill)) return false;
        Bill other = (Bill) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billAmount==null && other.getBillAmount()==null) || 
             (this.billAmount!=null &&
              this.billAmount.equals(other.getBillAmount()))) &&
            ((this.issuedDate==null && other.getIssuedDate()==null) || 
             (this.issuedDate!=null &&
              this.issuedDate.equals(other.getIssuedDate()))) &&
            this.movieId == other.getMovieId() &&
            ((this.returnedDate==null && other.getReturnedDate()==null) || 
             (this.returnedDate!=null &&
              this.returnedDate.equals(other.getReturnedDate()))) &&
            this.userId == other.getUserId();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBillAmount() != null) {
            _hashCode += getBillAmount().hashCode();
        }
        if (getIssuedDate() != null) {
            _hashCode += getIssuedDate().hashCode();
        }
        _hashCode += getMovieId();
        if (getReturnedDate() != null) {
            _hashCode += getReturnedDate().hashCode();
        }
        _hashCode += getUserId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Bill.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity.sjsu.vlms.com", "Bill"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity.sjsu.vlms.com", "billAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity.sjsu.vlms.com", "issuedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("movieId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity.sjsu.vlms.com", "movieId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity.sjsu.vlms.com", "returnedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity.sjsu.vlms.com", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
