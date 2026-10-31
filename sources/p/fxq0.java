package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fxq0 {
    public final long a;
    public final zzq0 b;

    public fxq0() {
        long jG = z4p1.g(4284900966L);
        zzq0 zzq0VarH = uyn1.h(3, 0.0f, 0.0f);
        this.a = jG;
        this.b = zzq0VarH;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!fxq0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        fxq0 fxq0Var = (fxq0) obj;
        long j = fxq0Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && this.b.equals(fxq0Var.b);
    }

    public final int hashCode() {
        int i = u7h.l;
        return this.b.hashCode() + (z4h1.c(this.a) * 31);
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + u7h.h(this.a) + ", drawPadding=" + this.b + ")";
    }
}
