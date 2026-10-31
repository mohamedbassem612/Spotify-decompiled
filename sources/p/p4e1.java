package p;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/p4e1;", "Lp/uim0;", "Lp/z4e1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class p4e1 extends uim0 {
    public final sen0 X;
    public final ggg1 a;
    public final aae1 b;
    public final r7e1 c;
    public final dk80 d;
    public final boolean e;
    public final boolean f;
    public final kua0 g;
    public final yta0 h;
    public final boolean i;
    public final idn0 t;

    public p4e1(ggg1 ggg1Var, aae1 aae1Var, r7e1 r7e1Var, dk80 dk80Var, boolean z, boolean z2, kua0 kua0Var, yta0 yta0Var, boolean z3, idn0 idn0Var, sen0 sen0Var) {
        this.a = ggg1Var;
        this.b = aae1Var;
        this.c = r7e1Var;
        this.d = dk80Var;
        this.e = z;
        this.f = z2;
        this.g = kua0Var;
        this.h = yta0Var;
        this.i = z3;
        this.t = idn0Var;
        this.X = sen0Var;
    }

    public final pim0 a() {
        return new z4e1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X);
    }

    public final void b(pim0 pim0Var) {
        xab1 xab1Var;
        z4e1 z4e1Var = (z4e1) pim0Var;
        j8d1 j8d1Var = z4e1Var.c1;
        l030 l030Var = z4e1Var.b1;
        boolean z = z4e1Var.U0;
        boolean z2 = z && !z4e1Var.V0;
        ggg1 ggg1Var = z4e1Var.Q0;
        kua0 kua0Var = z4e1Var.W0;
        r7e1 r7e1Var = z4e1Var.S0;
        idn0 idn0Var = z4e1Var.Z0;
        sen0 sen0Var = z4e1Var.a1;
        boolean z3 = this.e;
        boolean z4 = this.f;
        boolean z5 = z3 && !z4;
        ggg1 ggg1Var2 = this.a;
        z4e1Var.Q0 = ggg1Var2;
        z4e1Var.R0 = this.b;
        r7e1 r7e1Var2 = this.c;
        z4e1Var.S0 = r7e1Var2;
        z4e1Var.T0 = this.d;
        z4e1Var.U0 = z3;
        z4e1Var.V0 = z4;
        kua0 kua0Var2 = this.g;
        z4e1Var.W0 = kua0Var2;
        z4e1Var.X0 = this.h;
        z4e1Var.Y0 = this.i;
        idn0 idn0Var2 = this.t;
        z4e1Var.Z0 = idn0Var2;
        sen0 sen0Var2 = this.X;
        z4e1Var.a1 = sen0Var2;
        if (z5 != z2 || !u890.j(ggg1Var2, ggg1Var) || !kua0Var2.equals(kua0Var) || !u890.j(sen0Var2, sen0Var)) {
            if (z5 && (z4e1Var.M1() || z4e1Var.j1 != null)) {
                z4e1Var.P1(false);
            } else if (!z5) {
                z4e1Var.K1();
            }
        }
        if (z3 != z || z5 != z2 || kua0Var2.c() != kua0Var.c()) {
            nko1.C(z4e1Var);
        }
        if (r7e1Var2 != r7e1Var) {
            j8d1Var.J1();
            if (((pim0) z4e1Var).N0) {
                r7e1Var2.n = z4e1Var.k1;
                if (z4e1Var.M1() && (xab1Var = z4e1Var.g1) != null) {
                    xab1Var.d((CancellationException) null);
                    z4e1Var.g1 = fn31.T(z4e1Var.v1(), null, 0, new y4e1(r7e1Var2, null, (byte) 0), 3);
                }
            }
            r7e1Var2.m = new s4e1(z4e1Var, (byte) 2);
        }
        if (!u890.j(idn0Var2, idn0Var)) {
            j8d1Var.J1();
            if (((pim0) l030Var).N0) {
                l030Var.L1(idn0Var2);
            }
        }
        if (z3 != z) {
            if (!z3) {
                z4e1Var.I1(l030Var);
            } else {
                z4e1Var.H1(l030Var);
                l030Var.L1(idn0Var2);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p4e1) {
            p4e1 p4e1Var = (p4e1) obj;
            if (u890.j(this.a, p4e1Var.a) && u890.j(this.b, p4e1Var.b) && this.c == p4e1Var.c && u890.j(this.d, p4e1Var.d) && this.e == p4e1Var.e && this.f == p4e1Var.f && this.g.equals(p4e1Var.g) && u890.j(this.h, p4e1Var.h) && this.i == p4e1Var.i && u890.j(this.t, p4e1Var.t) && u890.j(this.X, p4e1Var.X)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        dk80 dk80Var = this.d;
        int iHashCode2 = (this.g.hashCode() + xcg1.g(xcg1.g((iHashCode + (dk80Var == null ? 0 : dk80Var.hashCode())) * 31, 31, this.e), 31, this.f)) * 31;
        yta0 yta0Var = this.h;
        int iG = xcg1.g((this.t.hashCode() + xcg1.g((iHashCode2 + (yta0Var == null ? 0 : yta0Var.hashCode())) * 31, 31, this.i)) * 31, 31, false);
        sen0 sen0Var = this.X;
        return iG + (sen0Var != null ? sen0Var.hashCode() : 0);
    }

    public final String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.a + ", textLayoutState=" + this.b + ", textFieldSelectionState=" + this.c + ", filter=" + this.d + ", enabled=" + this.e + ", readOnly=" + this.f + ", keyboardOptions=" + this.g + ", keyboardActionHandler=" + this.h + ", singleLine=" + this.i + ", interactionSource=" + this.t + ", isPassword=false, stylusHandwritingTrigger=" + this.X + ")";
    }
}
