package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/vul1;", "Lp/uim0;", "Lp/rf81;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class vul1 extends uim0 {
    public final ul3 a;

    public vul1(ul3 ul3Var) {
        this.a = ul3Var;
    }

    public final pim0 a() {
        rf81 rf81Var = new rf81();
        rf81Var.O0 = this.a;
        return rf81Var;
    }

    public final void b(pim0 pim0Var) {
        ((rf81) pim0Var).O0 = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        vul1 vul1Var = obj instanceof vul1 ? (vul1) obj : null;
        if (vul1Var == null) {
            return false;
        }
        return u890.j(this.a, vul1Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
