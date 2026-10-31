package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tda0 {
    public final qo90 a;
    public final xea0 b;
    public final boolean c;
    public final String d;
    public final String e;
    public final boolean f;
    public final hux g;
    public final Set h;

    public tda0(qo90 qo90Var, xea0 xea0Var, boolean z, String str, String str2, boolean z2, hux huxVar, Set set) {
        this.a = qo90Var;
        this.b = xea0Var;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = z2;
        this.g = huxVar;
        this.h = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tda0)) {
            return false;
        }
        tda0 tda0Var = (tda0) obj;
        return u890.j(this.a, tda0Var.a) && this.b == tda0Var.b && this.c == tda0Var.c && this.d.equals(tda0Var.d) && u890.j(this.e, tda0Var.e) && this.f == tda0Var.f && u890.j(this.g, tda0Var.g) && u890.j(this.h, tda0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + eqq.k(xcg1.g(cy30.d(cy30.d(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
