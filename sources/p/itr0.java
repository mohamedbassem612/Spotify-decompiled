package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/itr0;", "Lp/uim0;", "Lp/htr0;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class itr0 extends uim0 {
    public final pg a;

    public itr0(pg pgVar) {
        this.a = pgVar;
    }

    public final pim0 a() {
        htr0 htr0Var = new htr0();
        htr0Var.O0 = this.a;
        return htr0Var;
    }

    public final void b(pim0 pim0Var) {
        htr0 htr0Var = (htr0) pim0Var;
        htr0Var.O0 = this.a;
        nko1.C(htr0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof itr0) {
            return this.a == ((itr0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
