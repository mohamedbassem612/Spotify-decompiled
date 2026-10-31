package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/kyp0;", "Lp/uim0;", "Lp/lyp0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class kyp0 extends uim0 {
    public final iu30 a;
    public final boolean b;

    public kyp0(iu30 iu30Var, boolean z) {
        this.a = iu30Var;
        this.b = z;
    }

    public final pim0 a() {
        lyp0 lyp0Var = new lyp0();
        lyp0Var.O0 = this.a;
        lyp0Var.P0 = this.b;
        return lyp0Var;
    }

    public final void b(pim0 pim0Var) {
        lyp0 lyp0Var = (lyp0) pim0Var;
        iu30 iu30Var = lyp0Var.O0;
        iu30 iu30Var2 = this.a;
        boolean z = this.b;
        if (iu30Var != iu30Var2 || lyp0Var.P0 != z) {
            dio1.z(lyp0Var);
        }
        lyp0Var.O0 = iu30Var2;
        lyp0Var.P0 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        kyp0 kyp0Var = obj instanceof kyp0 ? (kyp0) obj : null;
        return kyp0Var != null && this.a == kyp0Var.a && this.b == kyp0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.a + ", rtlAware=" + this.b + ")";
    }
}
