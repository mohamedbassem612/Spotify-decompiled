package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v6t0 {
    public final long a;
    public final float b;
    public final float c;
    public final float d;

    public v6t0(float f, float f2, float f3, long j) {
        this.a = j;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6t0)) {
            return false;
        }
        v6t0 v6t0Var = (v6t0) obj;
        long j = v6t0Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && p3v.c(this.b, v6t0Var.b) && p3v.c(this.c, v6t0Var.c) && p3v.c(this.d, v6t0Var.d);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Float.hashCode(this.d) + x0d.f(x0d.f(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
