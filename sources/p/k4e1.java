package p;

import androidx.compose.ui.graphics.Brush;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/k4e1;", "Lp/uim0;", "Lp/n4e1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class k4e1 extends uim0 {
    public final k3f1 X;
    public final hdt0 Y;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final aae1 d;
    public final ggg1 e;
    public final r7e1 f;
    public final Brush g;
    public final boolean h;
    public final es41 i;
    public final qqq0 t;

    public k4e1(boolean z, boolean z2, boolean z3, aae1 aae1Var, ggg1 ggg1Var, r7e1 r7e1Var, Brush brush, boolean z4, es41 es41Var, qqq0 qqq0Var, k3f1 k3f1Var, hdt0 hdt0Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = aae1Var;
        this.e = ggg1Var;
        this.f = r7e1Var;
        this.g = brush;
        this.h = z4;
        this.i = es41Var;
        this.t = qqq0Var;
        this.X = k3f1Var;
        this.Y = hdt0Var;
    }

    public final pim0 a() {
        return new n4e1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y);
    }

    public final void b(pim0 pim0Var) {
        faa0 faa0Var;
        n4e1 n4e1Var = (n4e1) pim0Var;
        boolean zK1 = n4e1Var.K1();
        boolean z = n4e1Var.Q0;
        ggg1 ggg1Var = n4e1Var.T0;
        aae1 aae1Var = n4e1Var.S0;
        r7e1 r7e1Var = n4e1Var.U0;
        es41 es41Var = n4e1Var.X0;
        boolean z2 = this.a;
        n4e1Var.Q0 = z2;
        r7e1 r7e1Var2 = this.f;
        r7e1Var2.h = z2;
        boolean z3 = this.b;
        n4e1Var.R0 = z3;
        aae1 aae1Var2 = this.d;
        n4e1Var.S0 = aae1Var2;
        ggg1 ggg1Var2 = this.e;
        n4e1Var.T0 = ggg1Var2;
        n4e1Var.U0 = r7e1Var2;
        n4e1Var.V0 = this.g;
        n4e1Var.W0 = this.h;
        es41 es41Var2 = this.i;
        n4e1Var.X0 = es41Var2;
        n4e1Var.Y0 = this.t;
        k3f1 k3f1Var = this.X;
        n4e1Var.Z0 = k3f1Var;
        n4e1Var.a1 = this.Y;
        n4e1Var.h1.K1(ggg1Var2, r7e1Var2, aae1Var2, z2 || z3 || this.c);
        u3e1 u3e1Var = n4e1Var.i1;
        u3e1Var.Q0.a = null;
        u3e1Var.Q0 = k3f1Var;
        k3f1Var.a = u3e1Var;
        k3f1Var.b = ((pim0) u3e1Var).N0 ? 3 : 2;
        if (!n4e1Var.K1()) {
            xab1 xab1Var = n4e1Var.c1;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            n4e1Var.c1 = null;
            qoo qooVar = n4e1Var.b1;
            if (qooVar != null && (faa0Var = (faa0) qooVar.b.getAndSet(null)) != null) {
                faa0Var.d((CancellationException) null);
            }
        } else if (!z || !u890.j(ggg1Var, ggg1Var2) || !zK1) {
            n4e1Var.L1();
        }
        if (u890.j(ggg1Var, ggg1Var2) && u890.j(aae1Var, aae1Var2) && u890.j(r7e1Var, r7e1Var2) && u890.j(es41Var, es41Var2)) {
            return;
        }
        dio1.y(n4e1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k4e1) {
            k4e1 k4e1Var = (k4e1) obj;
            if (this.a == k4e1Var.a && this.b == k4e1Var.b && this.c == k4e1Var.c && u890.j(this.d, k4e1Var.d) && u890.j(this.e, k4e1Var.e) && this.f == k4e1Var.f && u890.j(this.g, k4e1Var.g) && this.h == k4e1Var.h && u890.j(this.i, k4e1Var.i) && this.t == k4e1Var.t && u890.j(this.X, k4e1Var.X) && u890.j(this.Y, k4e1Var.Y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.X.hashCode() + ((this.t.hashCode() + ((this.i.hashCode() + xcg1.g((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31)) * 31, 31, this.h)) * 31)) * 31)) * 31;
        hdt0 hdt0Var = this.Y;
        return iHashCode + (hdt0Var == null ? 0 : hdt0Var.hashCode());
    }

    public final String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.a + ", isDragHovered=" + this.b + ", isTouchDragInProgress=" + this.c + ", textLayoutState=" + this.d + ", textFieldState=" + this.e + ", textFieldSelectionState=" + this.f + ", cursorBrush=" + this.g + ", writeable=" + this.h + ", scrollState=" + this.i + ", orientation=" + this.t + ", toolbarRequester=" + this.X + ", platformSelectionBehaviors=" + this.Y + ")";
    }
}
