package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/i3e1;", "Lp/uim0;", "Lp/k3e1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class i3e1 extends uim0 {
    public final vu30 a;

    public i3e1(vu30 vu30Var) {
        this.a = vu30Var;
    }

    public final pim0 a() {
        return new k3e1(this.a);
    }

    public final void b(pim0 pim0Var) {
        ((k3e1) pim0Var).Q0 = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i3e1) {
            return this.a == ((i3e1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        vu30 vu30Var = this.a;
        if (vu30Var != null) {
            return vu30Var.hashCode();
        }
        return 0;
    }
}
