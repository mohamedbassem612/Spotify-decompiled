package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/g6b;", "Lp/uim0;", "Lp/h6b;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g6b extends uim0 {
    public final hw61 a;
    public final iu30 b;

    public g6b(hw61 hw61Var, iu30 iu30Var) {
        this.a = hw61Var;
        this.b = iu30Var;
    }

    public final pim0 a() {
        h6b h6bVar = new h6b();
        h6bVar.S0 = this.a;
        h6bVar.T0 = this.b;
        h6bVar.W0 = 0L;
        h6bVar.X0 = u7h.b;
        h6bVar.Z0 = 1.0f;
        h6bVar.a1 = 3;
        return h6bVar;
    }

    public final void b(pim0 pim0Var) {
        h6b h6bVar = (h6b) pim0Var;
        hw61 hw61Var = h6bVar.S0;
        hw61 hw61Var2 = this.a;
        if (!u890.j(hw61Var, hw61Var2)) {
            h6bVar.S0 = hw61Var2;
            h6bVar.H1();
        }
        iu30 iu30Var = h6bVar.T0;
        iu30 iu30Var2 = this.b;
        if (iu30Var != iu30Var2) {
            h6bVar.T0 = iu30Var2;
            h6bVar.R0 = false;
            ha71.x(h6bVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6b)) {
            return false;
        }
        g6b g6bVar = (g6b) obj;
        return u890.j(this.a, g6bVar.a) && this.b == g6bVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
