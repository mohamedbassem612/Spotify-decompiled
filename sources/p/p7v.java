package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/p7v;", "Lp/uim0;", "Lp/cqc;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class p7v extends uim0 {
    public final iu30 a;

    public p7v(iu30 iu30Var) {
        this.a = iu30Var;
    }

    public final pim0 a() {
        return new cqc(new eqc(), this.a);
    }

    public final void b(pim0 pim0Var) {
        cqc cqcVar = (cqc) pim0Var;
        cqcVar.R0 = this.a;
        cqcVar.H1();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p7v) {
            return this.a == ((p7v) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
