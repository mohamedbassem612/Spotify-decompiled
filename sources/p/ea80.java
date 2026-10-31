package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/ea80;", "Lp/uim0;", "Lp/fa80;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ea80 extends uim0 {
    public final idn0 a;
    public final ga80 b;

    public ea80(idn0 idn0Var, ga80 ga80Var) {
        this.a = idn0Var;
        this.b = ga80Var;
    }

    public final pim0 a() {
        x4t x4tVarA = this.b.a(this.a);
        fa80 fa80Var = new fa80();
        fa80Var.Q0 = x4tVarA;
        fa80Var.H1(x4tVarA);
        return fa80Var;
    }

    public final void b(pim0 pim0Var) {
        fa80 fa80Var = (fa80) pim0Var;
        x4t x4tVarA = this.b.a(this.a);
        fa80Var.I1(fa80Var.Q0);
        fa80Var.Q0 = x4tVarA;
        fa80Var.H1(x4tVarA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea80)) {
            return false;
        }
        ea80 ea80Var = (ea80) obj;
        return u890.j(this.a, ea80Var.a) && u890.j(this.b, ea80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
