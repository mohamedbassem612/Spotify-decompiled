package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/nih1;", "Lp/uim0;", "Lp/oih1;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class nih1 extends uim0 {
    public final erl1 a;

    public nih1(erl1 erl1Var) {
        this.a = erl1Var;
    }

    public final pim0 a() {
        oih1 oih1Var = new oih1();
        oih1Var.Q0 = this.a;
        return oih1Var;
    }

    public final void b(pim0 pim0Var) {
        oih1 oih1Var = (oih1) pim0Var;
        erl1 erl1Var = oih1Var.Q0;
        erl1 erl1Var2 = this.a;
        if (u890.j(erl1Var2, erl1Var)) {
            return;
        }
        oih1Var.Q0 = erl1Var2;
        oih1Var.I1();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nih1) {
            return u890.j(((nih1) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
