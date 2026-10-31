package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z910 {
    public final boolean a;
    public final jno b;
    public final dlb c;
    public final long d;
    public final boolean e;
    public final p8g1 f;
    public final qpe1 g;

    /* JADX WARN: Illegal instructions before constructor call */
    public z910(boolean z, dlb dlbVar, int i) {
        dlbVar = (i & 4) != 0 ? null : dlbVar;
        this(z, hno.a, dlbVar, u7h.k, true, null, qpe1.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z910)) {
            return false;
        }
        z910 z910Var = (z910) obj;
        if (this.a != z910Var.a || !u890.j(this.b, z910Var.b) || !u890.j(this.c, z910Var.c)) {
            return false;
        }
        long j = z910Var.d;
        int i = u7h.l;
        return z4h1.b(this.d, j) && this.e == z910Var.e && u890.j(this.f, z910Var.f) && this.g == z910Var.g;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        dlb dlbVar = this.c;
        int iHashCode2 = (iHashCode + (dlbVar == null ? 0 : dlbVar.hashCode())) * 31;
        int i = u7h.l;
        int iG = xcg1.g(cy30.f(iHashCode2, this.d, 31), 31, this.e);
        p8g1 p8g1Var = this.f;
        return this.g.hashCode() + ((iG + (p8g1Var != null ? p8g1Var.hashCode() : 0)) * 31);
    }

    public z910(boolean z, jno jnoVar, dlb dlbVar, long j, boolean z2, p8g1 p8g1Var, qpe1 qpe1Var) {
        this.a = z;
        this.b = jnoVar;
        this.c = dlbVar;
        this.d = j;
        this.e = z2;
        this.f = p8g1Var;
        this.g = qpe1Var;
    }
}
