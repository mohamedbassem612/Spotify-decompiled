package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tpz0 {
    public final long a;
    public final int b;
    public final xpz0 c;

    public tpz0(long j, int i, xpz0 xpz0Var) {
        this.a = j;
        this.b = i;
        this.c = xpz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpz0)) {
            return false;
        }
        tpz0 tpz0Var = (tpz0) obj;
        return this.a == tpz0Var.a && this.b == tpz0Var.b && u890.j(this.c, tpz0Var.c);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, Long.hashCode(this.a) * 31, 31);
        xpz0 xpz0Var = this.c;
        return iF + (xpz0Var == null ? 0 : xpz0Var.hashCode());
    }
}
