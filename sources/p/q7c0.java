package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q7c0 {
    public final fab0 a;
    public final tr80 b;
    public final mml c;
    public final dia1 d;
    public final List e;
    public final boolean f;
    public final List g;
    public final boolean h;
    public final boolean i;

    public q7c0(fab0 fab0Var, tr80 tr80Var, mml mmlVar, dia1 dia1Var, List list, boolean z, List list2, boolean z2, boolean z3) {
        this.a = fab0Var;
        this.b = tr80Var;
        this.c = mmlVar;
        this.d = dia1Var;
        this.e = list;
        this.f = z;
        this.g = list2;
        this.h = z2;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7c0)) {
            return false;
        }
        q7c0 q7c0Var = (q7c0) obj;
        return u890.j(this.a, q7c0Var.a) && u890.j(this.b, q7c0Var.b) && u890.j(this.c, q7c0Var.c) && this.d == q7c0Var.d && u890.j(this.e, q7c0Var.e) && this.f == q7c0Var.f && u890.j(this.g, q7c0Var.g) && this.h == q7c0Var.h && this.i == q7c0Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + xcg1.g(f4i1.b(xcg1.g(f4i1.b((this.d.hashCode() + ((this.c.hashCode() + lf51.e(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }
}
