package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dx1 {
    public final tu1 a;
    public final ju1 b;
    public final gy1 c;
    public final boolean d;
    public final boolean e;
    public final cqs0 f;
    public final qng g;
    public final n2 h;
    public final t7o0 i;

    public dx1(tu1 tu1Var, ju1 ju1Var, gy1 gy1Var, boolean z, boolean z2, cqs0 cqs0Var, qng qngVar, n2 n2Var, t7o0 t7o0Var) {
        this.a = tu1Var;
        this.b = ju1Var;
        this.c = gy1Var;
        this.d = z;
        this.e = z2;
        this.f = cqs0Var;
        this.g = qngVar;
        this.h = n2Var;
        this.i = t7o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dx1) {
            dx1 dx1Var = (dx1) obj;
            return this.a.equals(dx1Var.a) && u890.j(this.b, dx1Var.b) && u890.j(this.c, dx1Var.c) && this.d == dx1Var.d && this.e == dx1Var.e && u890.j(this.f, dx1Var.f) && u890.j(this.g, dx1Var.g) && this.h == dx1Var.h && this.i == dx1Var.i;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + xcg1.g(xcg1.g(xcg1.g((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, true), 31, this.d), 31, this.e)) * 31;
        qng qngVar = this.g;
        return Integer.hashCode(250) + ((this.i.hashCode() + ((this.h.hashCode() + ((iHashCode + (qngVar == null ? 0 : qngVar.hashCode())) * 31)) * 31)) * 31);
    }
}
