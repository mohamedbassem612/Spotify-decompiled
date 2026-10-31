package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/y4t;", "Lp/uim0;", "Lp/z4t;", "glimmer"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y4t extends uim0 {
    public final j6 a;

    public y4t(j6 j6Var) {
        this.a = j6Var;
    }

    public final pim0 a() {
        z4t z4tVar = new z4t();
        z4tVar.O0 = this.a;
        return z4tVar;
    }

    public final void b(pim0 pim0Var) {
        z4t z4tVar = (z4t) pim0Var;
        j6 j6Var = this.a;
        z4tVar.O0 = j6Var;
        j6Var.invoke(z4tVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y4t) {
            return this.a == ((y4t) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
