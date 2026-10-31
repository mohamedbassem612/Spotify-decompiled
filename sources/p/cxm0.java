package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cxm0 {
    public final hh5 a;
    public final boolean b;
    public final boolean c;
    public final iu30 d;

    public cxm0(hh5 hh5Var, boolean z, boolean z2, iu30 iu30Var) {
        this.a = hh5Var;
        this.b = z;
        this.c = z2;
        this.d = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxm0)) {
            return false;
        }
        cxm0 cxm0Var = (cxm0) obj;
        return u890.j(this.a, cxm0Var.a) && this.b == cxm0Var.b && this.c == cxm0Var.c && u890.j(this.d, cxm0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
