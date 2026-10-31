package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/tv71;", "Lp/uim0;", "Lp/uv71;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class tv71 extends uim0 {
    public final pv71 a;

    public tv71(pv71 pv71Var) {
        this.a = pv71Var;
    }

    public final pim0 a() {
        uv71 uv71Var = new uv71();
        uv71Var.O0 = this.a;
        return uv71Var;
    }

    public final void b(pim0 pim0Var) {
        uv71 uv71Var = (uv71) pim0Var;
        pv71 pv71Var = uv71Var.O0;
        pv71 pv71Var2 = this.a;
        if (!u890.j(pv71Var2, pv71Var)) {
            p9p1.z(uv71Var, pv71Var2.d);
        }
        uv71Var.O0 = pv71Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tv71) && u890.j(this.a, ((tv71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SharedTransitionScopeRootModifierElement(sharedTransitionScope=" + this.a + ")";
    }
}
