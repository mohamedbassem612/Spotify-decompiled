package p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pzt {
    public final Set a;
    public final h5u0 b;
    public final boolean c;
    public final Long d;
    public final Long e;
    public final Map f;
    public final boolean g;

    public pzt(Set set, h5u0 h5u0Var, boolean z, Long l, Long l2, Map map, boolean z2) {
        this.a = set;
        this.b = h5u0Var;
        this.c = z;
        this.d = l;
        this.e = l2;
        this.f = map;
        this.g = z2;
    }

    public static pzt a(pzt pztVar, Set set, h5u0 h5u0Var, boolean z, Long l, Long l2, Map map, boolean z2, int i) {
        if ((i & 1) != 0) {
            set = pztVar.a;
        }
        Set set2 = set;
        if ((i & 2) != 0) {
            h5u0Var = pztVar.b;
        }
        h5u0 h5u0Var2 = h5u0Var;
        if ((i & 4) != 0) {
            z = pztVar.c;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            l = pztVar.d;
        }
        Long l3 = l;
        if ((i & 16) != 0) {
            l2 = pztVar.e;
        }
        Long l4 = l2;
        if ((i & 32) != 0) {
            map = pztVar.f;
        }
        Map map2 = map;
        if ((i & 64) != 0) {
            z2 = pztVar.g;
        }
        pztVar.getClass();
        return new pzt(set2, h5u0Var2, z3, l3, l4, map2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzt)) {
            return false;
        }
        pzt pztVar = (pzt) obj;
        return u890.j(this.a, pztVar.a) && u890.j(this.b, pztVar.b) && this.c == pztVar.c && u890.j(this.d, pztVar.d) && u890.j(this.e, pztVar.e) && u890.j(this.f, pztVar.f) && this.g == pztVar.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        h5u0 h5u0Var = this.b;
        int iG = xcg1.g((iHashCode + (h5u0Var == null ? 0 : h5u0Var.hashCode())) * 31, 31, this.c);
        Long l = this.d;
        int iHashCode2 = (iG + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        return Boolean.hashCode(this.g) + cy30.e((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.f);
    }
}
