package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xrh0 implements fsh0 {
    public final List a;
    public final boolean b;
    public final int c;
    public final p8i0 d;

    public xrh0(List list, boolean z, int i, p8i0 p8i0Var) {
        this.a = list;
        this.b = z;
        this.c = i;
        this.d = p8i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrh0)) {
            return false;
        }
        xrh0 xrh0Var = (xrh0) obj;
        return this.a.equals(xrh0Var.a) && this.b == xrh0Var.b && this.c == xrh0Var.c && this.d == xrh0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
