package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a3i1 {
    public final z2i1 a = new z2i1();

    public final v5b1 a(x6b1 x6b1Var) {
        return this.a.a(x6b1Var, new LinkedHashMap(), 0);
    }

    public final void b(String str, s2i1 s2i1Var) {
        Object z2i1Var;
        z2i1 z2i1Var2 = this.a;
        for (String str2 : ihc1.P0(str, new char[]{'/'}, 6)) {
            if (ihc1.R0(str2, '{') && ihc1.n0(str2, '}')) {
                String string = ihc1.e1(ihc1.Z0(ihc1.L0(str2, "{", "}"), " as")).toString();
                LinkedHashMap linkedHashMap = z2i1Var2.b;
                z2i1Var = linkedHashMap.get(string);
                if (z2i1Var == null) {
                    z2i1Var = new z2i1();
                    linkedHashMap.put(string, z2i1Var);
                }
            } else {
                LinkedHashMap linkedHashMap2 = z2i1Var2.a;
                z2i1Var = linkedHashMap2.get(str2);
                if (z2i1Var == null) {
                    z2i1Var = new z2i1();
                    linkedHashMap2.put(str2, z2i1Var);
                }
            }
            z2i1Var2 = (z2i1) z2i1Var;
        }
        z2i1Var2.c = s2i1Var;
    }
}
