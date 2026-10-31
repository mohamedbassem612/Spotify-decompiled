package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class di31 implements ga80 {
    public final boolean a;
    public final long b;

    public di31(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    public final x4t a(idn0 idn0Var) {
        return new g6t(idn0Var, this.a, new f6t(this, (byte) 4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di31)) {
            return false;
        }
        di31 di31Var = (di31) obj;
        if (this.a != di31Var.a || !p3v.c(Float.NaN, Float.NaN)) {
            return false;
        }
        long j = di31Var.b;
        int i = u7h.l;
        return z4h1.b(this.b, j);
    }

    public final int hashCode() {
        int iF = x0d.f(Boolean.hashCode(this.a) * 31, 961, Float.NaN);
        int i = u7h.l;
        return Long.hashCode(this.b) + iF;
    }
}
