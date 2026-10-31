package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/vaq0;", "Lp/uim0;", "Lp/xaq0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class vaq0 extends uim0 {
    public final iu30 a;

    public vaq0(iu30 iu30Var) {
        this.a = iu30Var;
    }

    public final pim0 a() {
        return new xaq0(this.a);
    }

    public final void b(pim0 pim0Var) {
        xaq0 xaq0Var = (xaq0) pim0Var;
        xaq0Var.getClass();
        xaq0Var.O0 = this.a;
        ho11 ho11Var = xaq0Var.T0;
        if (ho11Var != null) {
            xaq0Var.H1(ho11Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && vaq0.class == obj.getClass() && this.a == ((vaq0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode() + x0d.f(Long.hashCode(0L) * 31, 961, 1.0f);
    }
}
