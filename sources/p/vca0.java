package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vca0 implements xca0 {
    public final String a;
    public final String b;
    public final hux c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public final List g;
    public final boolean h;

    public vca0(String str, String str2, hux huxVar, smc0 smc0Var, boolean z, boolean z2, List list, boolean z3) {
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
        if (!(obj instanceof vca0)) {
            return false;
        }
        vca0 vca0Var = (vca0) obj;
        return this.a.equals(vca0Var.a) && u890.j(this.b, vca0Var.b) && u890.j(this.c, vca0Var.c) && this.d.equals(vca0Var.d) && this.e == vca0Var.e && this.f == vca0Var.f && this.g.equals(vca0Var.g) && this.h == vca0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + f4i1.b(xcg1.g(xcg1.g(f4i1.b(eqq.k(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
