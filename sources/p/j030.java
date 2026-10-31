package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/j030;", "Lp/uim0;", "Lp/l030;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class j030 extends uim0 {
    public final idn0 a;

    public j030(idn0 idn0Var) {
        this.a = idn0Var;
    }

    public final pim0 a() {
        return new l030(this.a, (t4e1) null, 6);
    }

    public final void b(pim0 pim0Var) {
        ((l030) pim0Var).L1(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j030) {
            return u890.j(this.a, ((j030) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        idn0 idn0Var = this.a;
        if (idn0Var != null) {
            return idn0Var.hashCode();
        }
        return 0;
    }
}
