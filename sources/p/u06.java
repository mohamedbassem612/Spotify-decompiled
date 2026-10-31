package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/u06;", "Lp/uim0;", "Lp/w06;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class u06 extends uim0 {
    public final xu30 a;
    public final iu30 b;

    public u06(xu30 xu30Var, iu30 iu30Var) {
        this.a = xu30Var;
        this.b = iu30Var;
    }

    public final pim0 a() {
        w06 w06Var = new w06();
        w06Var.O0 = this.a;
        w06Var.P0 = this.b;
        w06Var.Q0 = ton1.a;
        return w06Var;
    }

    public final void b(pim0 pim0Var) {
        w06 w06Var = (w06) pim0Var;
        w06Var.O0 = this.a;
        w06Var.P0 = this.b;
        w06Var.Q0 = ton1.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u06)) {
            return false;
        }
        u06 u06Var = (u06) obj;
        return this.a == u06Var.a && this.b == u06Var.b;
    }

    public final int hashCode() {
        return ton1.a.hashCode() + ktd.g(this.b, this.a.hashCode() * 31, 31);
    }
}
