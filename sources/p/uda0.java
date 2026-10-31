package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uda0 implements wda0 {
    public final String a;
    public final String b;
    public final hux c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public final List g;
    public final boolean h;

    public uda0(String str, String str2, hux huxVar, smc0 smc0Var, boolean z, boolean z2, List list, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = huxVar;
        this.d = smc0Var;
        this.e = z;
        this.f = z2;
        this.g = list;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uda0)) {
            return false;
        }
        uda0 uda0Var = (uda0) obj;
        return this.a.equals(uda0Var.a) && u890.j(this.b, uda0Var.b) && u890.j(this.c, uda0Var.c) && this.d.equals(uda0Var.d) && this.e == uda0Var.e && this.f == uda0Var.f && this.g.equals(uda0Var.g) && this.h == uda0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + f4i1.b(xcg1.g(xcg1.g(f4i1.b(eqq.k(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
