package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xv90 {
    public final sw90 a;
    public final t0a0 b;
    public final j5a1 c;
    public final gz90 d;
    public final e831 e;
    public final lzn0 f;
    public final c9c0 g;
    public final b0a0 h;
    public final ser i;

    public xv90(sw90 sw90Var, t0a0 t0a0Var, j5a1 j5a1Var, gz90 gz90Var, e831 e831Var, lzn0 lzn0Var, c9c0 c9c0Var, b0a0 b0a0Var, ser serVar) {
        this.a = sw90Var;
        this.b = t0a0Var;
        this.c = j5a1Var;
        this.d = gz90Var;
        this.e = e831Var;
        this.f = lzn0Var;
        this.g = c9c0Var;
        this.h = b0a0Var;
        this.i = serVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xv90) {
            xv90 xv90Var = (xv90) obj;
            return this.a == xv90Var.a && this.b == xv90Var.b && this.c == xv90Var.c && this.d == xv90Var.d && this.e == xv90Var.e && this.f.equals(xv90Var.f) && this.g == xv90Var.g && this.h == xv90Var.h && this.i == xv90Var.i;
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
