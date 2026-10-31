package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xr21 implements zr21 {
    public final long a;
    public final int b;
    public final String c;

    public xr21(long j, int i, String str) {
        this.a = j;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr21)) {
            return false;
        }
        xr21 xr21Var = (xr21) obj;
        return this.a == xr21Var.a && this.b == xr21Var.b && this.c.equals(xr21Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, Long.hashCode(this.a) * 31, 31);
    }
}
