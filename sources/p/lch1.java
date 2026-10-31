package p;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lch1 {
    public final List a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final Set h;
    public final Map i;

    public lch1(List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Set set, Map map) {
        this.a = list;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = i;
        this.h = set;
        this.i = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lch1)) {
            return false;
        }
        lch1 lch1Var = (lch1) obj;
        return u890.j(this.a, lch1Var.a) && this.b == lch1Var.b && this.c == lch1Var.c && this.d == lch1Var.d && this.e == lch1Var.e && this.f == lch1Var.f && this.g == lch1Var.g && u890.j(this.h, lch1Var.h) && u890.j(this.i, lch1Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + gvg.c(kaa0.f(this.g, xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h);
    }
}
