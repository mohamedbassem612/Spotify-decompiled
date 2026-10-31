package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y2r {
    public final boolean a;
    public final Boolean b;
    public final boolean c;
    public final prc0 d;
    public final boolean e;
    public final x2r f;
    public final Set g;

    public y2r(boolean z, Boolean bool, boolean z2, prc0 prc0Var, boolean z3, x2r x2rVar, Set set) {
        this.a = z;
        this.b = bool;
        this.c = z2;
        this.d = prc0Var;
        this.e = z3;
        this.f = x2rVar;
        this.g = set;
    }

    public static y2r a(y2r y2rVar, x2r x2rVar, Set set, int i) {
        Boolean bool = Boolean.FALSE;
        boolean z = y2rVar.a;
        if ((i & 2) != 0) {
            bool = y2rVar.b;
        }
        Boolean bool2 = bool;
        boolean z2 = (i & 4) != 0 ? y2rVar.c : true;
        prc0 prc0Var = (i & 8) != 0 ? y2rVar.d : prc0.a;
        boolean z3 = (i & 16) != 0 ? y2rVar.e : false;
        if ((i & 32) != 0) {
            x2rVar = y2rVar.f;
        }
        x2r x2rVar2 = x2rVar;
        if ((i & 64) != 0) {
            set = y2rVar.g;
        }
        y2rVar.getClass();
        return new y2r(z, bool2, z2, prc0Var, z3, x2rVar2, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2r)) {
            return false;
        }
        y2r y2rVar = (y2r) obj;
        return this.a == y2rVar.a && u890.j(this.b, y2rVar.b) && this.c == y2rVar.c && this.d == y2rVar.d && this.e == y2rVar.e && u890.j(this.f, y2rVar.f) && u890.j(this.g, y2rVar.g);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        Boolean bool = this.b;
        int iG = xcg1.g((this.d.hashCode() + xcg1.g((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.c)) * 31, 31, this.e);
        x2r x2rVar = this.f;
        return this.g.hashCode() + ((iG + (x2rVar != null ? x2rVar.hashCode() : 0)) * 31);
    }
}
