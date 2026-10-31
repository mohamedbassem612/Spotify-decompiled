package com.google.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p.cy30;
import p.gf40;
import p.gvg;
import p.h4p1;
import p.phc;
import p.poz0;
import p.s2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class i {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }

    public static void b(StringBuilder sb, int i, String str, Object obj) {
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
        a(i, sb);
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
            sb.append(h4p1.k((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof phc) {
            sb.append(": \"");
            sb.append(h4p1.j((phc) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof h) {
            sb.append(" {");
            c((h) obj, sb, i + 2);
            sb.append("\n");
            a(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        b(sb, i3, "key", entry.getKey());
        b(sb, i3, "value", entry.getValue());
        sb.append("\n");
        a(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0188  */
    /* JADX WARN: Code duplicated, block: B:75:0x018a  */
    public static void c(h hVar, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = hVar.getClass().getDeclaredMethods();
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
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null || !method2.getReturnType().equals(List.class)) {
                if (!strSubstring.endsWith("Map") || strSubstring.equals("Map") || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                    i3 = 3;
                    if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                        Method method4 = (Method) entry.getValue();
                        Method method5 = (Method) map.get("has".concat(strSubstring));
                        if (method4 != null) {
                            Object objInvokeOrDie = h.invokeOrDie(method4, hVar, new Object[0]);
                            if (method5 == null) {
                                zBooleanValue = true;
                                if (objInvokeOrDie instanceof Boolean) {
                                    zEquals = !((Boolean) objInvokeOrDie).booleanValue();
                                } else if (objInvokeOrDie instanceof Integer) {
                                    if (((Integer) objInvokeOrDie).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objInvokeOrDie instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objInvokeOrDie).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objInvokeOrDie instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objInvokeOrDie).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objInvokeOrDie instanceof String) {
                                    zEquals = objInvokeOrDie.equals("");
                                } else if (objInvokeOrDie instanceof phc) {
                                    zEquals = objInvokeOrDie.equals(phc.b);
                                } else if (!(objInvokeOrDie instanceof s2j0) ? !((objInvokeOrDie instanceof Enum) && ((Enum) objInvokeOrDie).ordinal() == 0) : objInvokeOrDie != ((s2j0) objInvokeOrDie).getDefaultInstanceForType()) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) h.invokeOrDie(method5, hVar, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                b(sb, i, strSubstring, objInvokeOrDie);
                            }
                        }
                    }
                } else {
                    i3 = 3;
                    b(sb, i, cy30.h(3, 0, strSubstring), h.invokeOrDie(method, hVar, new Object[0]));
                }
                i2 = i3;
            } else {
                b(sb, i, cy30.h(4, 0, strSubstring), h.invokeOrDie(method2, hVar, new Object[0]));
                i2 = 3;
            }
        }
        if (hVar instanceof GeneratedMessageLite$ExtendableMessage) {
            Iterator itI = ((GeneratedMessageLite$ExtendableMessage) hVar).a.i();
            while (itI.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itI.next();
                b(sb, i, gvg.e(((gf40) entry2.getKey()).b, "[", "]"), entry2.getValue());
            }
        }
        n nVar = hVar.unknownFields;
        if (nVar != null) {
            for (int i5 = 0; i5 < nVar.a; i5++) {
                b(sb, i, String.valueOf(poz0.w(nVar.b[i5])), nVar.c[i5]);
            }
        }
    }
}
