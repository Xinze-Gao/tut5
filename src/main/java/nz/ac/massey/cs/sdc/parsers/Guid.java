//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2025.10.28 时间 09:00:39 PM CST 
//


package nz.ac.massey.cs.sdc.parsers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Guid complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Guid"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="isPermaLink" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Guid", propOrder = {
    "value"
})
public class Guid {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "isPermaLink")
    protected Boolean isPermaLink;

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取isPermaLink属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsPermaLink() {
        if (isPermaLink == null) {
            return true;
        } else {
            return isPermaLink;
        }
    }

    /**
     * 设置isPermaLink属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPermaLink(Boolean value) {
        this.isPermaLink = value;
    }

}
