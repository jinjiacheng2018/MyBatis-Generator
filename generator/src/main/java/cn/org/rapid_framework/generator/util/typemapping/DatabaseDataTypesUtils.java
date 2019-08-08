package cn.org.rapid_framework.generator.util.typemapping;


import java.sql.Types;
import java.util.HashMap;

/**
 * @author badqiu
 * @email badqiu(a)gmail.com
 */
public class DatabaseDataTypesUtils {

    private final static IntStringMap _preferredJavaTypeForSqlType = new IntStringMap();

    public static boolean isFloatNumber(String javaType) {
        if (javaType.endsWith("Float") || javaType.endsWith("Double") || javaType.endsWith("BigDecimal") || javaType.endsWith("BigInteger")) {
            return true;
        }
        if (javaType.endsWith("float") || javaType.endsWith("double") || javaType.endsWith("BigDecimal") || javaType.endsWith("BigInteger")) {
            return true;
        }
        return false;
    }

    public static boolean isIntegerNumber(String javaType) {
        if (javaType.endsWith("Long") || javaType.endsWith("Integer") || javaType.endsWith("Short") || javaType.endsWith("Byte")) {
            return true;
        }
        if (javaType.endsWith("long") || javaType.endsWith("int") || javaType.endsWith("short") || javaType.endsWith("byte")) {
            return true;
        }
        return false;
    }

    public static boolean isDate(String javaType) {
        if (javaType.endsWith("Date") || javaType.endsWith("Timestamp") || javaType.endsWith("Time")) {
            return true;
        }
        return false;
    }

    public static boolean isString(String javaType) {
        if (javaType.endsWith("String")) {
            return true;
        }
        return false;
    }

    public static String getPreferredJavaType(int sqlType, int size,
                                              int decimalDigits) {
        if ((sqlType == Types.DECIMAL || sqlType == Types.NUMERIC)) {
            if (decimalDigits == 0) {
//                if (size == 1) {
//                    // https://sourceforge.net/tracker/?func=detail&atid=415993&aid=662953&group_id=36044
//                    return "Boolean"; //java.lang.
//                } else if (size < 3) {
//                    return "Byte"; //java.lang.
//                } else if (size < 5) {
//                    return "Short"; //java.lang.
//                } else if (size < 10) {
                if (size < 10) {
                    return "Integer"; //java.lang.
                } else if (size < 19) {
                    return "Long"; //java.lang.
                } else {
                    return "BigDecimal"; //java.math.
                }
            } else {
                return "Double";
            }
        }

        String result = _preferredJavaTypeForSqlType.getString(sqlType);
        if (result == null) {
            result = "java.lang.Object";
        }
        return result;
    }

    static {
        _preferredJavaTypeForSqlType.put(Types.TINYINT, "Byte"); //java.lang.
        _preferredJavaTypeForSqlType.put(Types.SMALLINT, "Short"); //java.lang.
        _preferredJavaTypeForSqlType.put(Types.INTEGER, "Integer"); //java.lang.
        _preferredJavaTypeForSqlType.put(Types.BIGINT, "Long"); //java.lang.
        _preferredJavaTypeForSqlType.put(Types.REAL, "Float"); //java.lang.
        _preferredJavaTypeForSqlType.put(Types.FLOAT, "Double"); //java.lang.
        _preferredJavaTypeForSqlType.put(Types.DOUBLE, "Double"); //java.lang.
        _preferredJavaTypeForSqlType.put(Types.DECIMAL, "BigDecimal"); //java.math.
        _preferredJavaTypeForSqlType.put(Types.NUMERIC, "BigDecimal"); //java.math.
        _preferredJavaTypeForSqlType.put(Types.BIT, "Boolean"); //java.lang.
        _preferredJavaTypeForSqlType.put(Types.BOOLEAN, "Boolean"); //java.lang.
        _preferredJavaTypeForSqlType.put(Types.CHAR, "String"); //java.lang.
        _preferredJavaTypeForSqlType.put(Types.VARCHAR, "String"); //java.lang.
        // according to resultset.gif, we should use java.io.Reader, but String is more convenient for EJB
        _preferredJavaTypeForSqlType.put(Types.LONGVARCHAR, "String"); //java.lang.
        _preferredJavaTypeForSqlType.put(Types.BINARY, "byte[]");
        _preferredJavaTypeForSqlType.put(Types.VARBINARY, "byte[]");
        _preferredJavaTypeForSqlType.put(Types.LONGVARBINARY, "byte[]");
        _preferredJavaTypeForSqlType.put(Types.DATE, "Date"); //java.sql.
        _preferredJavaTypeForSqlType.put(Types.TIME, "Time"); //java.sql.
        _preferredJavaTypeForSqlType.put(Types.TIMESTAMP, "Timestamp"); //java.sql.
        _preferredJavaTypeForSqlType.put(Types.CLOB, "Clob"); //java.sql.
        _preferredJavaTypeForSqlType.put(Types.BLOB, "Blob"); //java.sql.
        _preferredJavaTypeForSqlType.put(Types.ARRAY, "Array"); //java.sql.
        _preferredJavaTypeForSqlType.put(Types.REF, "Ref"); //java.sql.
        _preferredJavaTypeForSqlType.put(Types.STRUCT, "Object"); //java.lang.
        _preferredJavaTypeForSqlType.put(Types.JAVA_OBJECT, "Object"); //java.lang.
    }

    private static class IntStringMap extends HashMap {

        public String getString(int i) {
            return (String) get(new Integer(i));
        }

        public String[] getStrings(int i) {
            return (String[]) get(new Integer(i));
        }

        public void put(int i, String s) {
            put(new Integer(i), s);
        }

        public void put(int i, String[] sa) {
            put(new Integer(i), sa);
        }
    }

}
