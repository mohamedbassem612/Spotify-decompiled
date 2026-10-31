package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import p.ihc;
import p.k4p1;
import p.n290;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class f {
    public static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    public static final void b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            ihc ihcVar = ihc.c;
            sb.append(k4p1.t(new ihc(((String) obj).getBytes(n290.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof ihc) {
            sb.append(": \"");
            sb.append(k4p1.t((ihc) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof e) {
            sb.append(" {");
            c((e) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i4 = i + 2;
        b(sb, i4, "key", entry.getKey());
        b(sb, i4, "value", entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a9  */
    public static void c(e eVar, StringBuilder sb, int i) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : eVar.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strReplaceFirst = str.replaceFirst("get", "");
            boolean zBooleanValue = true;
            if (strReplaceFirst.endsWith("List") && !strReplaceFirst.endsWith("OrBuilderList") && !strReplaceFirst.equals("List")) {
                String str2 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 4);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    b(sb, i, a(str2), e.f(method2, eVar, new Object[0]));
                }
            }
            if (strReplaceFirst.endsWith("Map") && !strReplaceFirst.equals("Map")) {
                String str3 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb, i, a(str3), e.f(method3, eVar, new Object[0]));
                }
            }
            if (((Method) map2.get("set".concat(strReplaceFirst))) != null && (!strReplaceFirst.endsWith("Bytes") || !map.containsKey("get".concat(strReplaceFirst.substring(0, strReplaceFirst.length() - 5))))) {
                String str4 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1);
                Method method4 = (Method) map.get("get".concat(strReplaceFirst));
                Method method5 = (Method) map.get("has".concat(strReplaceFirst));
                if (method4 != null) {
                    Object objF = e.f(method4, eVar, new Object[0]);
                    if (method5 == null) {
                        if (objF instanceof Boolean) {
                            zEquals = !((Boolean) objF).booleanValue();
                        } else if (objF instanceof Integer) {
                            if (((Integer) objF).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objF instanceof Float) {
                            if (((Float) objF).floatValue() == 0.0f) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objF instanceof Double) {
                            if (((Double) objF).doubleValue() == 0.0d) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objF instanceof String) {
                            zEquals = objF.equals("");
                        } else if (objF instanceof ihc) {
                            zEquals = objF.equals(ihc.c);
                        } else if (!(objF instanceof a) ? !((objF instanceof Enum) && ((Enum) objF).ordinal() == 0) : objF != ((e) ((a) objF).d(6))) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) e.f(method5, eVar, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        b(sb, i, a(str4), objF);
                    }
                }
            }
        }
        k kVar = eVar.unknownFields;
        if (kVar != null) {
            for (int i2 = 0; i2 < kVar.a; i2++) {
                b(sb, i, String.valueOf(kVar.b[i2] >>> 3), kVar.c[i2]);
            }
        }
    }

    public static String d(e eVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        c(eVar, sb, 0);
        return sb.toString();
    }
}
