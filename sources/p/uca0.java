package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uca0 {
    public final qo90 a;
    public final xea0 b;
    public final boolean c;
    public final String d;
    public final hux e;
    public final boolean f;
    public final Set g;

    public uca0(qo90 qo90Var, xea0 xea0Var, boolean z, String str, hux huxVar, boolean z2, Set set) {
        this.a = qo90Var;
        this.b = xea0Var;
        this.c = z;
        this.d = str;
        this.e = huxVar;
        this.f = z2;
        this.g = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uca0)) {
            return false;
        }
        uca0 uca0Var = (uca0) obj;
        return u890.j(this.a, uca0Var.a) && this.b == uca0Var.b && this.c == uca0Var.c && u890.j(this.d, uca0Var.d) && u890.j(this.e, uca0Var.e) && this.f == uca0Var.f && u890.j(this.g, uca0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + xcg1.g(eqq.k(cy30.d(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
