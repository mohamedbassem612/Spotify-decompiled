package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/c660;", "Lp/uim0;", "Lp/e660;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class c660 extends uim0 {
    public final lee1 a;
    public final int b;
    public final int c;

    public c660(lee1 lee1Var, int i, int i2) {
        this.a = lee1Var;
        this.b = i;
        this.c = i2;
    }

    public final pim0 a() {
        e660 e660Var = new e660();
        e660Var.O0 = this.a;
        e660Var.P0 = this.b;
        e660Var.Q0 = this.c;
        e660Var.S0 = -1;
        e660Var.T0 = -1;
        return e660Var;
    }

    public final void b(pim0 pim0Var) {
        e660 e660Var = (e660) pim0Var;
        lee1 lee1Var = e660Var.O0;
        lee1 lee1Var2 = this.a;
        boolean zJ = u890.j(lee1Var, lee1Var2);
        int i = this.b;
        int i2 = this.c;
        if (zJ && e660Var.P0 == i && e660Var.Q0 == i2) {
            return;
        }
        e660Var.O0 = lee1Var2;
        e660Var.P0 = i;
        e660Var.Q0 = i2;
        e660Var.U0 = z6p1.F(lee1Var2, oap1.B(e660Var).a1);
        e660Var.R0 = true;
        dio1.y(e660Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c660)) {
            return false;
        }
        c660 c660Var = (c660) obj;
        return u890.j(this.a, c660Var.a) && this.b == c660Var.b && this.c == c660Var.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }
}
