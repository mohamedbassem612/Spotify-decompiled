package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/wzq0;", "Lp/uim0;", "Lp/xzq0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class wzq0 extends uim0 {
    public final vzq0 a;

    public wzq0(vzq0 vzq0Var) {
        this.a = vzq0Var;
    }

    public final pim0 a() {
        xzq0 xzq0Var = new xzq0();
        xzq0Var.Q0 = this.a;
        return xzq0Var;
    }

    public final void b(pim0 pim0Var) {
        xzq0 xzq0Var = (xzq0) pim0Var;
        vzq0 vzq0Var = xzq0Var.Q0;
        vzq0 vzq0Var2 = this.a;
        if (u890.j(vzq0Var2, vzq0Var)) {
            return;
        }
        xzq0Var.Q0 = vzq0Var2;
        xzq0Var.I1();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wzq0) {
            return u890.j(((wzq0) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
