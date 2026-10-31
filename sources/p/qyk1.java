package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qyk1 implements syk1 {
    public final String a;
    public final String b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final String g;
    public final boolean h;
    public final String i;
    public final pyk1 j;
    public final boolean k;

    public qyk1(String str, String str2, List list, int i, boolean z, int i2, String str3, boolean z2, String str4, pyk1 pyk1Var, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = str3;
        this.h = z2;
        this.i = str4;
        this.j = pyk1Var;
        this.k = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyk1)) {
            return false;
        }
        qyk1 qyk1Var = (qyk1) obj;
        return this.a.equals(qyk1Var.a) && this.b.equals(qyk1Var.b) && this.c.equals(qyk1Var.c) && this.d == qyk1Var.d && this.e == qyk1Var.e && this.f == qyk1Var.f && this.g.equals(qyk1Var.g) && this.h == qyk1Var.h && this.i.equals(qyk1Var.i) && u890.j(this.j, qyk1Var.j) && this.k == qyk1Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + ((this.j.hashCode() + cy30.d(xcg1.g(cy30.d(ab80.k(this.f, xcg1.g(kaa0.f(this.d, f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i)) * 31);
    }
}
