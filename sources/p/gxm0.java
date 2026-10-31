package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gxm0 {
    public final hh5 a;
    public final boolean b;
    public final boolean c;
    public final fxm0 d;

    public gxm0(hh5 hh5Var, boolean z, boolean z2, fxm0 fxm0Var) {
        this.a = hh5Var;
        this.b = z;
        this.c = z2;
        this.d = fxm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxm0)) {
            return false;
        }
        gxm0 gxm0Var = (gxm0) obj;
        return u890.j(this.a, gxm0Var.a) && this.b == gxm0Var.b && this.c == gxm0Var.c && this.d.equals(gxm0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
