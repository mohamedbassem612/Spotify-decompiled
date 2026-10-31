package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nj91 extends bk91 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final List d;
    public final int e;
    public final int f;
    public final tv80 g;

    public nj91(boolean z, boolean z2, String str, List list, int i, int i2, tv80 tv80Var) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = list;
        this.e = i;
        this.f = i2;
        this.g = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj91)) {
            return false;
        }
        nj91 nj91Var = (nj91) obj;
        return this.a == nj91Var.a && this.b == nj91Var.b && u890.j(this.c, nj91Var.c) && this.d.equals(nj91Var.d) && this.e == nj91Var.e && this.f == nj91Var.f && u890.j(this.g, nj91Var.g);
    }

    public final int hashCode() {
        int iK = ab80.k(this.f, ab80.k(this.e, f4i1.b(cy30.d(ab80.k(2, xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31, this.c), 31, this.d), 31), 31);
        tv80 tv80Var = this.g;
        return iK + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
