package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/tq60;", "Lp/uim0;", "Lp/uq60;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class tq60 extends uim0 {
    public final era a;

    public tq60(era eraVar) {
        this.a = eraVar;
    }

    public final pim0 a() {
        uq60 uq60Var = new uq60();
        uq60Var.O0 = this.a;
        return uq60Var;
    }

    public final void b(pim0 pim0Var) {
        ((uq60) pim0Var).O0 = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        tq60 tq60Var = obj instanceof tq60 ? (tq60) obj : null;
        if (tq60Var == null) {
            return false;
        }
        return this.a.equals(tq60Var.a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a);
    }
}
