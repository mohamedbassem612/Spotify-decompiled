package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/aed1;", "Lp/uim0;", "Lp/bed1;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class aed1 extends uim0 {
    public final iu30 a;

    public aed1(iu30 iu30Var) {
        this.a = iu30Var;
    }

    public final pim0 a() {
        bed1 bed1Var = new bed1(poo1.a);
        bed1Var.R0 = this.a;
        return bed1Var;
    }

    public final void b(pim0 pim0Var) {
        bed1 bed1Var = (bed1) pim0Var;
        iu30 iu30Var = bed1Var.R0;
        iu30 iu30Var2 = this.a;
        if (iu30Var != iu30Var2) {
            bed1Var.R0 = iu30Var2;
            osl1 osl1Var = bed1Var.S0;
            if (osl1Var != null) {
                erl1 erl1Var = (erl1) iu30Var2.invoke(osl1Var);
                if (u890.j(erl1Var, ((uk80) bed1Var).Q0)) {
                    return;
                }
                ((uk80) bed1Var).Q0 = erl1Var;
                bed1Var.I1();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aed1) {
            return this.a == ((aed1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
