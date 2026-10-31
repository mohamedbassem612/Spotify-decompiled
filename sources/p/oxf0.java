package p;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/oxf0;", "Lp/uim0;", "Lp/qxf0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class oxf0 extends uim0 {
    public final ki5 a;
    public final b7e1 b;
    public final wct0 c;

    public oxf0(ki5 ki5Var, b7e1 b7e1Var, wct0 wct0Var) {
        this.a = ki5Var;
        this.b = b7e1Var;
        this.c = wct0Var;
    }

    public final pim0 a() {
        return new qxf0(this.a, this.b, this.c);
    }

    public final void b(pim0 pim0Var) {
        qxf0 qxf0Var = (qxf0) pim0Var;
        float f = qxf0Var.Q0;
        long j = qxf0Var.S0;
        float f2 = qxf0Var.T0;
        boolean z = qxf0Var.R0;
        float f3 = qxf0Var.U0;
        boolean z2 = qxf0Var.V0;
        wct0 wct0Var = qxf0Var.W0;
        View view = qxf0Var.X0;
        wat watVar = qxf0Var.Y0;
        qxf0Var.O0 = this.a;
        qxf0Var.Q0 = Float.NaN;
        qxf0Var.R0 = true;
        qxf0Var.S0 = 9205357640488583168L;
        qxf0Var.T0 = Float.NaN;
        qxf0Var.U0 = Float.NaN;
        qxf0Var.V0 = true;
        qxf0Var.P0 = this.b;
        wct0 wct0Var2 = this.c;
        qxf0Var.W0 = wct0Var2;
        View viewE = pap1.E(qxf0Var);
        wat watVar2 = oap1.B(qxf0Var).Z0;
        if (qxf0Var.Z0 != null) {
            d261 d261Var = rxf0.a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(f)) && Float.NaN != f && !wct0Var2.c()) || 9205357640488583168L != j || !p3v.c(Float.NaN, f2) || !p3v.c(Float.NaN, f3) || true != z || true != z2 || !wct0Var2.equals(wct0Var) || !viewE.equals(view) || !u890.j(watVar2, watVar)) {
                qxf0Var.I1();
            }
        }
        qxf0Var.J1();
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + xcg1.g(x0d.f(x0d.f(cy30.f(xcg1.g(x0d.f(this.a.hashCode() * 961, 31, Float.NaN), 31, true), 9205357640488583168L, 31), 31, Float.NaN), 31, Float.NaN), 31, true)) * 31);
    }
}
