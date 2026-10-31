package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/uul1;", "Lp/uim0;", "Lp/qf81;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class uul1 extends uim0 {
    public final mi31 a;

    public uul1(mi31 mi31Var) {
        this.a = mi31Var;
    }

    public final pim0 a() {
        qf81 qf81Var = new qf81();
        qf81Var.O0 = this.a;
        return qf81Var;
    }

    public final void b(pim0 pim0Var) {
        ((qf81) pim0Var).O0 = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        uul1 uul1Var = obj instanceof uul1 ? (uul1) obj : null;
        return uul1Var != null && this.a == uul1Var.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
