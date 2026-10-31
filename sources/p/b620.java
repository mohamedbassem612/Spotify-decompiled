package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/b620;", "Lp/uim0;", "Lp/c620;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b620 extends uim0 {
    public final pim0 a() {
        c620 c620Var = new c620();
        c620Var.O0 = 1.0f;
        return c620Var;
    }

    public final void b(pim0 pim0Var) {
        ((c620) pim0Var).O0 = 1.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        c620 c620Var = obj instanceof c620 ? (c620) obj : null;
        return c620Var != null && 1.0f == c620Var.O0;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) * 31;
    }
}
