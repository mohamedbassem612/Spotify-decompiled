package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/qfg1;", "Lp/uim0;", "Lp/sfg1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class qfg1 extends uim0 {
    public final vxs a;
    public final p5e1 b;

    public qfg1(vxs vxsVar, p5e1 p5e1Var) {
        this.a = vxsVar;
        this.b = p5e1Var;
    }

    public final pim0 a() {
        return new sfg1(this.a, this.b);
    }

    public final void b(pim0 pim0Var) {
        sfg1 sfg1Var = (sfg1) pim0Var;
        sfg1Var.R0 = this.b;
        vxs vxsVar = sfg1Var.Q0;
        vxs vxsVar2 = this.a;
        if (u890.j(vxsVar, vxsVar2) && sfg1Var.S0) {
            return;
        }
        sfg1Var.Q0 = vxsVar2;
        sfg1Var.S0 = true;
        sfg1Var.W0.J1();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qfg1.class != obj.getClass()) {
            return false;
        }
        qfg1 qfg1Var = (qfg1) obj;
        return u890.j(this.a, qfg1Var.a) && this.b == qfg1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, false);
    }
}
