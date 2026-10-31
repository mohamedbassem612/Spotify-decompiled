package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/i5j1;", "Lp/uim0;", "Lp/j5j1;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i5j1 extends uim0 {
    public final fra a;

    public i5j1(fra fraVar) {
        this.a = fraVar;
    }

    public final pim0 a() {
        j5j1 j5j1Var = new j5j1();
        j5j1Var.O0 = this.a;
        return j5j1Var;
    }

    public final void b(pim0 pim0Var) {
        ((j5j1) pim0Var).O0 = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        i5j1 i5j1Var = obj instanceof i5j1 ? (i5j1) obj : null;
        if (i5j1Var == null) {
            return false;
        }
        return this.a.equals(i5j1Var.a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a);
    }
}
