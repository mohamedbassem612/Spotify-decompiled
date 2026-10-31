package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tle1 {
    public final int a;
    public final long b;
    public final long c;
    public final Long d;
    public final String e;
    public final int f;

    public tle1(int i, long j, long j2, Long l, String str, int i2) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = l;
        this.e = str;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tle1)) {
            return false;
        }
        tle1 tle1Var = (tle1) obj;
        return this.a == tle1Var.a && this.b == tle1Var.b && this.c == tle1Var.c && u890.j(this.d, tle1Var.d) && this.e.equals(tle1Var.e) && this.f == tle1Var.f;
    }

    public final int hashCode() {
        int iF = cy30.f(cy30.f(l1d.C(this.a) * 31, this.b, 31), this.c, 31);
        Long l = this.d;
        return Integer.hashCode(this.f) + cy30.d((iF + (l == null ? 0 : l.hashCode())) * 31, 31, this.e);
    }
}
