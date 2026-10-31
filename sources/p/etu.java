package p;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class etu {
    public final List a;
    public final boolean b;
    public final boolean c;
    public final Set d;
    public final p0v e;
    public final cbe f;

    public etu(List list, boolean z, boolean z2, Set set, p0v p0vVar, cbe cbeVar) {
        this.a = list;
        this.b = z;
        this.c = z2;
        this.d = set;
        this.e = p0vVar;
        this.f = cbeVar;
    }

    public static etu a(etu etuVar, List list, boolean z, LinkedHashSet linkedHashSet, p0v p0vVar, cbe cbeVar, int i) {
        if ((i & 1) != 0) {
            list = etuVar.a;
        }
        List list2 = list;
        boolean z2 = (i & 2) != 0 ? etuVar.b : true;
        if ((i & 4) != 0) {
            z = etuVar.c;
        }
        boolean z3 = z;
        Set set = linkedHashSet;
        if ((i & 8) != 0) {
            set = etuVar.d;
        }
        Set set2 = set;
        if ((i & 16) != 0) {
            p0vVar = etuVar.e;
        }
        p0v p0vVar2 = p0vVar;
        if ((i & 32) != 0) {
            cbeVar = etuVar.f;
        }
        return new etu(list2, z2, z3, set2, p0vVar2, cbeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etu)) {
            return false;
        }
        etu etuVar = (etu) obj;
        return u890.j(this.a, etuVar.a) && this.b == etuVar.b && this.c == etuVar.c && u890.j(this.d, etuVar.d) && u890.j(this.e, etuVar.e) && u890.j(this.f, etuVar.f);
    }

    public final int hashCode() {
        int iC = gvg.c(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        p0v p0vVar = this.e;
        int iHashCode = (iC + (p0vVar == null ? 0 : p0vVar.hashCode())) * 31;
        cbe cbeVar = this.f;
        return iHashCode + (cbeVar != null ? cbeVar.hashCode() : 0);
    }
}
