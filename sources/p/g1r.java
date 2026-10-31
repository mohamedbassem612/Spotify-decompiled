package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class g1r {
    public final long a;
    public final phc b;
    public final Long c;
    public final boolean d;
    public final int e;
    public final long f;
    public final boolean g;

    public g1r(long j, phc phcVar, Long l, boolean z, int i, long j2, boolean z2) {
        this.a = j;
        this.b = phcVar;
        this.c = l;
        this.d = z;
        this.e = i;
        this.f = j2;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1r)) {
            return false;
        }
        g1r g1rVar = (g1r) obj;
        return this.a == g1rVar.a && this.b.equals(g1rVar.b) && u890.j(this.c, g1rVar.c) && this.d == g1rVar.d && this.e == g1rVar.e && this.f == g1rVar.f && this.g == g1rVar.g;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        Long l = this.c;
        return Boolean.hashCode(this.g) + cy30.f(ab80.k(this.e, xcg1.g((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.d), 31), this.f, 31);
    }
}
