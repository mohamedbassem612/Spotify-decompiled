package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/t3e1;", "Lp/uim0;", "Lp/u3e1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class t3e1 extends uim0 {
    public final k3f1 a;
    public final rv3 b;
    public final s6e1 c;
    public final p7n d;

    public t3e1(k3f1 k3f1Var, rv3 rv3Var, s6e1 s6e1Var, p7n p7nVar) {
        this.a = k3f1Var;
        this.b = rv3Var;
        this.c = s6e1Var;
        this.d = p7nVar;
    }

    public final pim0 a() {
        return new u3e1(this.a, this.b, this.c, this.d);
    }

    public final void b(pim0 pim0Var) {
        u3e1 u3e1Var = (u3e1) pim0Var;
        u3e1Var.Q0.a = null;
        k3f1 k3f1Var = this.a;
        u3e1Var.Q0 = k3f1Var;
        k3f1Var.a = u3e1Var;
        k3f1Var.b = ((pim0) u3e1Var).N0 ? 3 : 2;
        u3e1Var.R0 = this.b;
        u3e1Var.S0 = this.c;
        u3e1Var.T0 = this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3e1)) {
            return false;
        }
        t3e1 t3e1Var = (t3e1) obj;
        return this.a == t3e1Var.a && this.b == t3e1Var.b && this.c == t3e1Var.c && this.d == t3e1Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
