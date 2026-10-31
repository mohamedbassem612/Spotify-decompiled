package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/q7v;", "Lp/uim0;", "Lp/r7v;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class q7v extends uim0 {
    public final iu30 a;

    public q7v(iu30 iu30Var) {
        this.a = iu30Var;
    }

    public final pim0 a() {
        r7v r7vVar = new r7v();
        r7vVar.O0 = this.a;
        return r7vVar;
    }

    public final void b(pim0 pim0Var) {
        ((r7v) pim0Var).O0 = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q7v) {
            return this.a == ((q7v) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
