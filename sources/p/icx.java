package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class icx implements ixx {
    public final ixx a;
    public final ixx b;
    public final long c;
    public final long d;
    public final long e;

    public icx(ixx ixxVar, ixx ixxVar2, long j, long j2, long j3) {
        this.a = ixxVar;
        this.b = ixxVar2;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }

    @Override // p.ixx
    public final long a() {
        return this.c;
    }

    @Override // p.ixx
    public final long b() {
        return this.e;
    }

    @Override // p.ixx
    public final long c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icx)) {
            return false;
        }
        icx icxVar = (icx) obj;
        if (!this.a.equals(icxVar.a) || !this.b.equals(icxVar.b)) {
            return false;
        }
        long j = icxVar.c;
        int i = u7h.l;
        return z4h1.b(this.c, j) && z4h1.b(this.d, icxVar.d) && z4h1.b(this.e, icxVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = u7h.l;
        return z4h1.c(this.e) + c13.f(c13.f(iHashCode, this.c, 31), this.d, 31);
    }
}
