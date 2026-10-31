package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ldl1 {
    public final long a;
    public final float b;
    public final float c;
    public final float d;

    public ldl1(float f, float f2, float f3, long j) {
        this.a = j;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldl1)) {
            return false;
        }
        ldl1 ldl1Var = (ldl1) obj;
        long j = ldl1Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && p3v.c(this.b, ldl1Var.b) && p3v.c(this.c, ldl1Var.c) && p3v.c(this.d, ldl1Var.d);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Float.hashCode(this.d) + x0d.f(x0d.f(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
