package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/gk1;", "Lp/uim0;", "Lp/hk1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class gk1 extends uim0 {
    public final vu30 a;

    public gk1(vu30 vu30Var) {
        this.a = vu30Var;
    }

    public final pim0 a() {
        hk1 hk1Var = new hk1();
        hk1Var.Q0 = this.a;
        j6 j6Var = new j6(hk1Var, (byte) 3);
        fk1 fk1Var = new fk1();
        fk1Var.O0 = j6Var;
        hk1Var.H1(fk1Var);
        return hk1Var;
    }

    public final void b(pim0 pim0Var) {
        ((hk1) pim0Var).Q0 = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gk1) {
            return this.a == ((gk1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
