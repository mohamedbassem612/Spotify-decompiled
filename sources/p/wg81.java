package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wg81 {
    public final List a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final ho41 e;

    public wg81(List list, boolean z, boolean z2, boolean z3, ho41 ho41Var) {
        this.a = list;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = ho41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wg81) {
            wg81 wg81Var = (wg81) obj;
            return u890.j(this.a, wg81Var.a) && this.b == wg81Var.b && this.c == wg81Var.c && this.d == wg81Var.d && this.e == wg81Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
