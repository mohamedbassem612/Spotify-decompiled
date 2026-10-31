package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/r890;", "Lp/uim0;", "Lp/s890;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class r890 extends uim0 {
    public final int a;

    public r890(int i) {
        this.a = i;
    }

    public final pim0 a() {
        s890 s890Var = new s890();
        s890Var.O0 = this.a;
        s890Var.P0 = true;
        return s890Var;
    }

    public final void b(pim0 pim0Var) {
        s890 s890Var = (s890) pim0Var;
        s890Var.O0 = this.a;
        s890Var.P0 = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        r890 r890Var = obj instanceof r890 ? (r890) obj : null;
        return r890Var != null && this.a == r890Var.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (l1d.C(this.a) * 31);
    }
}
