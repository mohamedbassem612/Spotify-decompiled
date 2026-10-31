package p;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/iv51;", "Lp/uim0;", "Lp/rv51;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class iv51 extends uim0 {
    public final boolean a;
    public final idn0 b;
    public final ga80 c;
    public final boolean d;
    public final boolean e;
    public final pm31 f;
    public final Function0 g;

    public iv51(boolean z, idn0 idn0Var, ga80 ga80Var, boolean z2, boolean z3, pm31 pm31Var, Function0 function0) {
        this.a = z;
        this.b = idn0Var;
        this.c = ga80Var;
        this.d = z2;
        this.e = z3;
        this.f = pm31Var;
        this.g = function0;
    }

    public final pim0 a() {
        rv51 rv51Var = new rv51(this.b, this.c, this.d, this.e, null, this.f, this.g);
        rv51Var.m1 = this.a;
        return rv51Var;
    }

    public final void b(pim0 pim0Var) {
        rv51 rv51Var = (rv51) pim0Var;
        boolean z = rv51Var.m1;
        boolean z2 = this.a;
        if (z != z2) {
            rv51Var.m1 = z2;
            nko1.C(rv51Var);
        }
        rv51Var.X1(this.b, this.c, this.d, this.e, (String) null, this.f, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iv51.class != obj.getClass()) {
            return false;
        }
        iv51 iv51Var = (iv51) obj;
        return this.a == iv51Var.a && u890.j(this.b, iv51Var.b) && u890.j(this.c, iv51Var.c) && this.d == iv51Var.d && this.e == iv51Var.e && this.f.equals(iv51Var.f) && this.g == iv51Var.g;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        idn0 idn0Var = this.b;
        int iHashCode2 = (iHashCode + (idn0Var != null ? idn0Var.hashCode() : 0)) * 31;
        ga80 ga80Var = this.c;
        return this.g.hashCode() + kaa0.f(this.f.a, xcg1.g(xcg1.g((iHashCode2 + (ga80Var != null ? ga80Var.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31);
    }
}
