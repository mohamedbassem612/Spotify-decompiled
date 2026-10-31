package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/u7e1;", "Lp/uim0;", "Lp/v7e1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class u7e1 extends uim0 {
    public final lee1 a;

    public u7e1(lee1 lee1Var) {
        this.a = lee1Var;
    }

    public final pim0 a() {
        return new v7e1(this.a);
    }

    public final void b(pim0 pim0Var) {
        v7e1 v7e1Var = (v7e1) pim0Var;
        v7e1Var.getClass();
        lee1 lee1VarF = z6p1.F(this.a, oap1.B(v7e1Var).a1);
        v7e1Var.H1(lee1VarF, (f930) lcc.z(v7e1Var, t4k.k));
        my30 my30Var = v7e1Var.Q0;
        if (my30Var == null) {
            throw kaa0.g("Min size state is not set.");
        }
        my30.b(my30Var, (flb0) null, (wat) null, lee1VarF, 23);
        dio1.y(v7e1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7e1)) {
            return false;
        }
        return u890.j(this.a, ((u7e1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
