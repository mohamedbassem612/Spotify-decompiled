package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qvm1 {
    public final mml a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final q160 e;
    public final i4d0 f;
    public final List g;
    public final int h;
    public final boolean i;

    public qvm1(mml mmlVar, int i, boolean z, boolean z2, q160 q160Var, i4d0 i4d0Var, List list, int i2, boolean z3) {
        this.a = mmlVar;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = q160Var;
        this.f = i4d0Var;
        this.g = list;
        this.h = i2;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvm1)) {
            return false;
        }
        qvm1 qvm1Var = (qvm1) obj;
        return u890.j(this.a, qvm1Var.a) && this.b == qvm1Var.b && this.c == qvm1Var.c && this.d == qvm1Var.d && this.e.equals(qvm1Var.e) && this.f.equals(qvm1Var.f) && this.g.equals(qvm1Var.g) && this.h == qvm1Var.h && this.i == qvm1Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ab80.k(this.h, f4i1.b((this.f.hashCode() + ((this.e.hashCode() + xcg1.g(xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g), 31);
    }
}
