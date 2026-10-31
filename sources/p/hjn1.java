package p;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class hjn1 {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(i, sb);
        int i2 = 0;
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i3 = 1; i3 < str.length(); i3++) {
                char cCharAt = str.charAt(i3);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (!(obj instanceof String)) {
            if (obj instanceof ain1) {
                sb.append(": \"");
                String[] strArr = yjn1.a;
                sb.append(yjn1.a(((ain1) obj).z()));
                sb.append('\"');
                return;
            }
            if (obj instanceof rin1) {
                sb.append(" {");
                b((rin1) obj, sb, i + 2);
                sb.append("\n");
                c(i, sb);
                sb.append("}");
                return;
            }
            if (!(obj instanceof Map.Entry)) {
                sb.append(": ");
                sb.append(obj);
                return;
            }
            int i4 = i + 2;
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            a(sb, i4, "key", entry.getKey());
            a(sb, i4, "value", entry.getValue());
            sb.append("\n");
            c(i, sb);
            sb.append("}");
            return;
        }
        sb.append(": \"");
        String string = (String) obj;
        String[] strArr2 = yjn1.a;
        int length = string.length();
        StringBuilder sb3 = null;
        int i5 = 0;
        while (i2 < length) {
            char cCharAt2 = string.charAt(i2);
            if (cCharAt2 > 127) {
                string = yjn1.a(string.getBytes(StandardCharsets.UTF_8));
                sb.append(string);
                sb.append('\"');
            }
            int i6 = i2 + 1;
            String str2 = yjn1.a[cCharAt2];
            if (str2 != null) {
                if (sb3 == null) {
                    sb3 = new StringBuilder(length + 16);
                }
                if (i5 < i2) {
                    sb3.append((CharSequence) string, i5, i2);
                }
                sb3.append(str2);
                i5 = i6;
            }
            i2 = i6;
        }
        if (sb3 != null) {
            if (i5 < length) {
                sb3.append((CharSequence) string, i5, length);
            }
            string = sb3.toString();
        }
        sb.append(string);
        sb.append('\"');
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:67:0x0180  */
    public static void b(rin1 rin1Var, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = rin1Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    a(sb, i, strSubstring.substring(0, strSubstring.length() - 4), rin1.n(method2, rin1Var, new Object[0]));
                }
                i2 = i3;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i, strSubstring.substring(0, strSubstring.length() - 3), rin1.n(method, rin1Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objN = rin1.n(method4, rin1Var, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) rin1.n(method5, rin1Var, new Object[0])).booleanValue();
                    } else if (objN instanceof Boolean) {
                        if (((Boolean) objN).booleanValue()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                    } else if (objN instanceof Integer) {
                        if (((Integer) objN).intValue() == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (objN instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) objN).floatValue()) == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (!(objN instanceof Double)) {
                        if (objN instanceof String) {
                            zEquals = objN.equals("");
                        } else if (objN instanceof ain1) {
                            zEquals = objN.equals(ain1.b);
                        } else if (!(objN instanceof nhn1) ? !((objN instanceof Enum) && ((Enum) objN).ordinal() == 0) : objN != ((rin1) ((rin1) ((nhn1) objN)).u(6))) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (Double.doubleToRawLongBits(((Double) objN).doubleValue()) == 0) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = true;
                    }
                    if (zBooleanValue) {
                        a(sb, i, strSubstring, objN);
                    }
                }
            }
            i2 = i3;
        }
        bkn1 bkn1Var = rin1Var.zzc;
        if (bkn1Var != null) {
            for (int i5 = 0; i5 < bkn1Var.a; i5++) {
                a(sb, i, String.valueOf(bkn1Var.b[i5] >>> 3), bkn1Var.c[i5]);
            }
        }
    }

    public static void c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }
}
