package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lsk {
    public final boolean a;
    public final ksk b;
    public final c8c0 c;
    public final boolean d;
    public final Map e;

    public lsk(boolean z, ksk kskVar, c8c0 c8c0Var, boolean z2, Map map) {
        this.a = z;
        this.b = kskVar;
        this.c = c8c0Var;
        this.d = z2;
        this.e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsk)) {
            return false;
        }
        lsk lskVar = (lsk) obj;
        return this.a == lskVar.a && u890.j(this.b, lskVar.b) && this.c == lskVar.c && this.d == lskVar.d && u890.j(this.e, lskVar.e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        ksk kskVar = this.b;
        int iHashCode2 = (iHashCode + (kskVar == null ? 0 : kskVar.hashCode())) * 31;
        c8c0 c8c0Var = this.c;
        return this.e.hashCode() + xcg1.g((iHashCode2 + (c8c0Var != null ? c8c0Var.hashCode() : 0)) * 31, 31, this.d);
    }
}
