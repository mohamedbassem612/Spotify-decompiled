package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rry {
    public final int a;
    public final int b;
    public final long c;
    public final boolean d;
    public final Long e;

    public rry(int i, int i2, long j, boolean z, Long l) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = z;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rry)) {
            return false;
        }
        rry rryVar = (rry) obj;
        return this.a == rryVar.a && this.b == rryVar.b && this.c == rryVar.c && this.d == rryVar.d && u890.j(this.e, rryVar.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.f(ab80.k(this.b, l1d.C(this.a) * 31, 31), this.c, 31), 31, this.d);
        Long l = this.e;
        return iG + (l == null ? 0 : l.hashCode());
    }
}
