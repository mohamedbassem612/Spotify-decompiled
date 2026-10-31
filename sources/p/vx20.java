package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/vx20;", "Lp/uim0;", "Lp/wx20;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class vx20 extends uim0 {
    public final iu30 a;

    public vx20(iu30 iu30Var) {
        this.a = iu30Var;
    }

    public final pim0 a() {
        wx20 wx20Var = new wx20();
        wx20Var.O0 = this.a;
        return wx20Var;
    }

    public final void b(pim0 pim0Var) {
        ((wx20) pim0Var).O0 = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vx20) {
            return this.a == ((vx20) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
