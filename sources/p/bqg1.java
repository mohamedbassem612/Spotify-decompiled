package p;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/bqg1;", "Lp/uim0;", "Lp/cqg1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class bqg1 extends uim0 {
    public final rze1 a;
    public final idn0 b;
    public final ga80 c;
    public final boolean d;
    public final pm31 e;
    public final Function0 f;

    public bqg1(rze1 rze1Var, idn0 idn0Var, ga80 ga80Var, boolean z, pm31 pm31Var, Function0 function0) {
        this.a = rze1Var;
        this.b = idn0Var;
        this.c = ga80Var;
        this.d = z;
        this.e = pm31Var;
        this.f = function0;
    }

    public final pim0 a() {
        cqg1 cqg1Var = new cqg1(this.b, this.c, false, this.d, null, this.e, this.f);
        cqg1Var.m1 = this.a;
        return cqg1Var;
    }

    public final void b(pim0 pim0Var) {
        cqg1 cqg1Var = (cqg1) pim0Var;
        rze1 rze1Var = cqg1Var.m1;
        rze1 rze1Var2 = this.a;
        if (rze1Var != rze1Var2) {
            cqg1Var.m1 = rze1Var2;
            nko1.C(cqg1Var);
        }
        cqg1Var.X1(this.b, this.c, false, this.d, (String) null, this.e, this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bqg1.class != obj.getClass()) {
            return false;
        }
        bqg1 bqg1Var = (bqg1) obj;
        return this.a == bqg1Var.a && u890.j(this.b, bqg1Var.b) && u890.j(this.c, bqg1Var.c) && this.d == bqg1Var.d && this.e.equals(bqg1Var.e) && this.f == bqg1Var.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        idn0 idn0Var = this.b;
        int iHashCode2 = (iHashCode + (idn0Var != null ? idn0Var.hashCode() : 0)) * 31;
        ga80 ga80Var = this.c;
        return this.f.hashCode() + kaa0.f(this.e.a, xcg1.g(xcg1.g((iHashCode2 + (ga80Var != null ? ga80Var.hashCode() : 0)) * 31, 31, false), 31, this.d), 31);
    }
}
