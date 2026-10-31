package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ij71 {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final pj71 c;
    public final pj71 d;
    public final pj71 e;

    public ij71(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, pj71 pj71Var, pj71 pj71Var2, pj71 pj71Var3) {
        this.a = linkedHashMap;
        this.b = linkedHashMap2;
        this.c = pj71Var;
        this.d = pj71Var2;
        this.e = pj71Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij71)) {
            return false;
        }
        ij71 ij71Var = (ij71) obj;
        return this.a.equals(ij71Var.a) && this.b.equals(ij71Var.b) && this.c.equals(ij71Var.c) && u890.j(this.d, ij71Var.d) && u890.j(this.e, ij71Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        pj71 pj71Var = this.d;
        int iHashCode2 = (iHashCode + (pj71Var == null ? 0 : pj71Var.hashCode())) * 31;
        pj71 pj71Var2 = this.e;
        return iHashCode2 + (pj71Var2 != null ? pj71Var2.hashCode() : 0);
    }
}
