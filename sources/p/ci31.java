package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ci31 implements ga80 {
    public final boolean a;
    public final float b;
    public final long c;

    public ci31(boolean z, float f, long j) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // p.ga80
    public final x4t a(idn0 idn0Var) {
        return new g6t(idn0Var, this.a, this.b, new f6t(this, (byte) 3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci31)) {
            return false;
        }
        ci31 ci31Var = (ci31) obj;
        if (this.a != ci31Var.a || !p3v.c(this.b, ci31Var.b)) {
            return false;
        }
        long j = ci31Var.c;
        int i = u7h.l;
        return z4h1.b(this.c, j);
    }

    @Override // p.ga80
    public final int hashCode() {
        int iF = x0d.f(Boolean.hashCode(this.a) * 31, 961, this.b);
        int i = u7h.l;
        return z4h1.c(this.c) + iF;
    }
}
