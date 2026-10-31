package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/t7n;", "Lp/uim0;", "Lp/w7n;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class t7n extends uim0 {
    public final cgg1 a;
    public final c8e1 b;
    public final r1c0 c;
    public final boolean d;
    public final boolean e;
    public final hyp0 f;
    public final x6e1 g;
    public final x180 h;
    public final lz20 i;

    public t7n(cgg1 cgg1Var, c8e1 c8e1Var, r1c0 r1c0Var, boolean z, boolean z2, hyp0 hyp0Var, x6e1 x6e1Var, x180 x180Var, lz20 lz20Var) {
        this.a = cgg1Var;
        this.b = c8e1Var;
        this.c = r1c0Var;
        this.d = z;
        this.e = z2;
        this.f = hyp0Var;
        this.g = x6e1Var;
        this.h = x180Var;
        this.i = lz20Var;
    }

    public final pim0 a() {
        w7n w7nVar = new w7n();
        w7nVar.Q0 = this.a;
        w7nVar.R0 = this.b;
        w7nVar.S0 = this.c;
        w7nVar.T0 = this.d;
        w7nVar.U0 = this.e;
        w7nVar.V0 = this.f;
        x6e1 x6e1Var = this.g;
        w7nVar.W0 = x6e1Var;
        w7nVar.X0 = this.h;
        w7nVar.Y0 = this.i;
        x6e1Var.f = new u7n(w7nVar, (byte) 4);
        return w7nVar;
    }

    public final void b(pim0 pim0Var) {
        w7n w7nVar = (w7n) pim0Var;
        boolean z = w7nVar.U0;
        boolean z2 = z && !w7nVar.T0;
        x180 x180Var = w7nVar.X0;
        x6e1 x6e1Var = w7nVar.W0;
        boolean z3 = this.d;
        boolean z4 = this.e;
        boolean z5 = z4 && !z3;
        w7nVar.Q0 = this.a;
        c8e1 c8e1Var = this.b;
        w7nVar.R0 = c8e1Var;
        w7nVar.S0 = this.c;
        w7nVar.T0 = z3;
        w7nVar.U0 = z4;
        w7nVar.V0 = this.f;
        x6e1 x6e1Var2 = this.g;
        w7nVar.W0 = x6e1Var2;
        x180 x180Var2 = this.h;
        w7nVar.X0 = x180Var2;
        w7nVar.Y0 = this.i;
        if (z4 != z || z5 != z2 || !u890.j(x180Var2, x180Var) || !nbe1.d(c8e1Var.b)) {
            nko1.C(w7nVar);
        }
        if (x6e1Var2 != x6e1Var) {
            x6e1Var2.f = new u7n(w7nVar, (byte) 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t7n) {
            t7n t7nVar = (t7n) obj;
            if (this.a.equals(t7nVar.a) && u890.j(this.b, t7nVar.b) && this.c == t7nVar.c && this.d == t7nVar.d && this.e == t7nVar.e && this.f.equals(t7nVar.f) && this.g == t7nVar.g && u890.j(this.h, t7nVar.h) && u890.j(this.i, t7nVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + xcg1.g(xcg1.g(xcg1.g((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, false)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.a + ", value=" + this.b + ", state=" + this.c + ", readOnly=" + this.d + ", enabled=" + this.e + ", isPassword=false, offsetMapping=" + this.f + ", manager=" + this.g + ", imeOptions=" + this.h + ", focusRequester=" + this.i + ")";
    }
}
