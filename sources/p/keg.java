package p;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class keg {
    public static final String a;
    public static final LinkedHashMap b;

    static {
        String str;
        String strY0 = o7h.y0(p7h.M(new Character[]{'k', 'o', 't', 'l', 'i', 'n'}), "", (String) null, (String) null, (iu30) null, 62);
        a = strY0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listM = p7h.M(new String[]{"Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D"});
        int iA = bmq0.A(0, listM.size() - 1, 2);
        if (iA >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                str = a;
                sb.append(str);
                sb.append('/');
                sb.append((String) listM.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), listM.get(i2));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(l1d.n((String) listM.get(i), "Array", sb2), "[" + ((String) listM.get(i2)));
                if (i == iA) {
                    break;
                } else {
                    i += 2;
                }
            }
            strY0 = str;
        }
        linkedHashMap.put(strY0 + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : p7h.M(new String[]{"String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum"})) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : p7h.M(new String[]{"Iterator", "Collection", "List", "Set", "Map", "ListIterator"})) {
            a(linkedHashMap, l1d.m("collections/", str3), "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            String strC = f4i1.c(i3, "Function");
            StringBuilder sb3 = new StringBuilder();
            String str4 = a;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i3);
            a(linkedHashMap, strC, sb3.toString());
            a(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        for (String str5 : p7h.M(new String[]{"Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum"})) {
            a(linkedHashMap, f4i1.e(str5, ".Companion"), rjx.o(new StringBuilder(), a, "/jvm/internal/", str5, "CompanionObject"));
        }
        b = linkedHashMap;
    }

    public static final void a(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(a + '/' + str, "L" + str2 + ';');
    }

    public static final String b(String str) {
        String str2 = (String) b.get(str);
        if (str2 != null) {
            return str2;
        }
        return "L" + str.replace('.', '$') + ';';
    }
}
