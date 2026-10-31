package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/zt41;", "Lp/uim0;", "Lp/xr41;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class zt41 extends uim0 {
    public final es41 a;
    public final boolean b;

    public zt41(es41 es41Var, boolean z) {
        this.a = es41Var;
        this.b = z;
    }

    public final pim0 a() {
        xr41 xr41Var = new xr41();
        xr41Var.O0 = this.a;
        xr41Var.P0 = this.b;
        return xr41Var;
    }

    public final void b(pim0 pim0Var) {
        xr41 xr41Var = (xr41) pim0Var;
        xr41Var.O0 = this.a;
        xr41Var.P0 = this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zt41)) {
            return false;
        }
        zt41 zt41Var = (zt41) obj;
        return u890.j(this.a, zt41Var.a) && this.b == zt41Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + xcg1.g(this.a.hashCode() * 31, 31, false);
    }
}
