package p;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/f5q0;", "Lp/uim0;", "Lp/g5q0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class f5q0 extends uim0 {
    public final Function0 a;

    public f5q0(Function0 function0) {
        this.a = function0;
    }

    public final pim0 a() {
        return new g5q0(this.a);
    }

    public final void b(pim0 pim0Var) {
        g5q0 g5q0Var = (g5q0) pim0Var;
        g5q0Var.getClass();
        g5q0Var.O0 = this.a;
        ho11 ho11Var = g5q0Var.S0;
        if (ho11Var != null) {
            g5q0Var.H1(ho11Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && f5q0.class == obj.getClass() && this.a == ((f5q0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode() + x0d.f(Long.hashCode(0L) * 31, 961, 1.0f);
    }
}
