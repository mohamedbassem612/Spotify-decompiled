package p;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z2i1 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public s2i1 c;

    public final v5b1 a(x6b1 x6b1Var, LinkedHashMap linkedHashMap, int i) {
        v5b1 v5b1VarA;
        List list = x6b1Var.b;
        if (i == list.size()) {
            s2i1 s2i1Var = this.c;
            if (s2i1Var != null) {
                return s2i1Var.i(x6b1Var.a, linkedHashMap, x6b1Var.c, x6b1Var.d);
            }
            return null;
        }
        String str = (String) list.get(i);
        z2i1 z2i1Var = (z2i1) this.a.get(str);
        if (z2i1Var != null && (v5b1VarA = z2i1Var.a(x6b1Var, linkedHashMap, i + 1)) != null) {
            return v5b1VarA;
        }
        for (Map.Entry entry : this.b.entrySet()) {
            String str2 = (String) entry.getKey();
            z2i1 z2i1Var2 = (z2i1) entry.getValue();
            String str3 = (String) linkedHashMap.get(str2);
            linkedHashMap.put(str2, str);
            v5b1 v5b1VarA2 = z2i1Var2.a(x6b1Var, linkedHashMap, i + 1);
            if (v5b1VarA2 != null) {
                return v5b1VarA2;
            }
            if (str3 != null) {
                linkedHashMap.put(str2, str3);
            } else {
                linkedHashMap.remove(str2);
            }
        }
        return null;
    }
}
