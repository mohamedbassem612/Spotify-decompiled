package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/nze1;", "Lp/uim0;", "Lp/qze1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class nze1 extends uim0 {
    public final boolean a;
    public final idn0 b;
    public final ga80 c;
    public final boolean d;
    public final boolean e;
    public final pm31 f;
    public final iu30 g;

    public nze1(boolean z, idn0 idn0Var, ga80 ga80Var, boolean z2, boolean z3, pm31 pm31Var, iu30 iu30Var) {
        this.a = z;
        this.b = idn0Var;
        this.c = ga80Var;
        this.d = z2;
        this.e = z3;
        this.f = pm31Var;
        this.g = iu30Var;
    }

    public final pim0 a() {
        return new qze1(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final void b(pim0 pim0Var) {
        qze1 qze1Var = (qze1) pim0Var;
        boolean z = qze1Var.m1;
        boolean z2 = this.a;
        if (z != z2) {
            qze1Var.m1 = z2;
            nko1.C(qze1Var);
        }
        qze1Var.n1 = this.g;
        qze1Var.X1(this.b, this.c, this.d, this.e, (String) null, this.f, qze1Var.o1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nze1.class != obj.getClass()) {
            return false;
        }
        nze1 nze1Var = (nze1) obj;
        return this.a == nze1Var.a && u890.j(this.b, nze1Var.b) && u890.j(this.c, nze1Var.c) && this.d == nze1Var.d && this.e == nze1Var.e && this.f.equals(nze1Var.f) && this.g == nze1Var.g;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        idn0 idn0Var = this.b;
        int iHashCode2 = (iHashCode + (idn0Var != null ? idn0Var.hashCode() : 0)) * 31;
        ga80 ga80Var = this.c;
        return this.g.hashCode() + kaa0.f(this.f.a, xcg1.g(xcg1.g((iHashCode2 + (ga80Var != null ? ga80Var.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31);
    }
}
