//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2025.10.28 时间 09:00:39 PM CST 
//


package nz.ac.massey.cs.sdc.parsers;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SkipDay的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SkipDay"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Monday"/&gt;
 *     &lt;enumeration value="Tuesday"/&gt;
 *     &lt;enumeration value="Wednesday"/&gt;
 *     &lt;enumeration value="Thursday"/&gt;
 *     &lt;enumeration value="Friday"/&gt;
 *     &lt;enumeration value="Saturday"/&gt;
 *     &lt;enumeration value="Sunday"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SkipDay")
@XmlEnum
public enum SkipDay {

    @XmlEnumValue("Monday")
    MONDAY("Monday"),
    @XmlEnumValue("Tuesday")
    TUESDAY("Tuesday"),
    @XmlEnumValue("Wednesday")
    WEDNESDAY("Wednesday"),
    @XmlEnumValue("Thursday")
    THURSDAY("Thursday"),
    @XmlEnumValue("Friday")
    FRIDAY("Friday"),
    @XmlEnumValue("Saturday")
    SATURDAY("Saturday"),
    @XmlEnumValue("Sunday")
    SUNDAY("Sunday");
    private final String value;

    SkipDay(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SkipDay fromValue(String v) {
        for (SkipDay c: SkipDay.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
