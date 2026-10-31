package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/ohe1;", "Lp/uim0;", "Lp/qhe1;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class ohe1 extends uim0 {
    public final idn0 a;
    public final boolean b;
    public final n8b1 c;

    public ohe1(idn0 idn0Var, boolean z, n8b1 n8b1Var) {
        this.a = idn0Var;
        this.b = z;
        this.c = n8b1Var;
    }

    public final pim0 a() {
        qhe1 qhe1Var = new qhe1();
        qhe1Var.O0 = this.a;
        qhe1Var.P0 = this.b;
        qhe1Var.Q0 = this.c;
        qhe1Var.U0 = Float.NaN;
        qhe1Var.V0 = Float.NaN;
        return qhe1Var;
    }

    public final void b(pim0 pim0Var) {
        qhe1 qhe1Var = (qhe1) pim0Var;
        qhe1Var.O0 = this.a;
        boolean z = qhe1Var.P0;
        boolean z2 = this.b;
        if (z != z2) {
            dio1.y(qhe1Var);
        }
        qhe1Var.P0 = z2;
        qhe1Var.Q0 = this.c;
        if (qhe1Var.T0 == null && !Float.isNaN(qhe1Var.V0)) {
            qhe1Var.T0 = c97.b(qhe1Var.V0);
        }
        if (qhe1Var.S0 != null || Float.isNaN(qhe1Var.U0)) {
            return;
        }
        qhe1Var.S0 = c97.b(qhe1Var.U0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohe1)) {
            return false;
        }
        ohe1 ohe1Var = (ohe1) obj;
        return u890.j(this.a, ohe1Var.a) && this.b == ohe1Var.b && this.c.equals(ohe1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.a + ", checked=" + this.b + ", animationSpec=" + this.c + ')';
    }
}
