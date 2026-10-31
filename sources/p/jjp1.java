package p;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class jjp1 {
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
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            ahp1 ahp1Var = ahp1.c;
            sb.append(q0o1.q(new ahp1(((String) obj).getBytes(mip1.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof ahp1) {
            sb.append(": \"");
            sb.append(q0o1.q((ahp1) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof cip1) {
            sb.append(" {");
            b((cip1) obj, sb, i + 2);
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
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb, i3, "key", entry.getKey());
        a(sb, i3, "value", entry.getValue());
        sb.append("\n");
        c(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fc  */
    public static void b(cip1 cip1Var, StringBuilder sb, int i) {
        int i2;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = cip1Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
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
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                a(sb, i, strSubstring.substring(0, strSubstring.length() - 4), cip1.i(method2, cip1Var, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i, strSubstring.substring(0, strSubstring.length() - 3), cip1.i(method, cip1Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objI = cip1.i(method4, cip1Var, new Object[0]);
                    if (method5 == null) {
                        if (objI instanceof Boolean) {
                            if (((Boolean) objI).booleanValue()) {
                                a(sb, i, strSubstring, objI);
                            }
                        } else if (objI instanceof Integer) {
                            if (((Integer) objI).intValue() != 0) {
                                a(sb, i, strSubstring, objI);
                            }
                        } else if (objI instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objI).floatValue()) != 0) {
                                a(sb, i, strSubstring, objI);
                            }
                        } else if (!(objI instanceof Double)) {
                            if (objI instanceof String) {
                                zEquals = objI.equals("");
                            } else if (objI instanceof ahp1) {
                                zEquals = objI.equals(ahp1.c);
                            } else if (objI instanceof qgp1) {
                                if (objI != ((cip1) ((cip1) ((qgp1) objI)).j(6, null))) {
                                    a(sb, i, strSubstring, objI);
                                }
                            } else if (!(objI instanceof Enum) || ((Enum) objI).ordinal() != 0) {
                                a(sb, i, strSubstring, objI);
                            }
                            if (!zEquals) {
                                a(sb, i, strSubstring, objI);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objI).doubleValue()) != 0) {
                            a(sb, i, strSubstring, objI);
                        }
                    } else if (((Boolean) cip1.i(method5, cip1Var, new Object[0])).booleanValue()) {
                        a(sb, i, strSubstring, objI);
                    }
                }
            }
            i2 = 3;
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
