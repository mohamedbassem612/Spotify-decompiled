package p;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k5t0 extends pim0 implements mv40 {
    public View O0;
    public iac0 P0;
    public int Q0;
    public iu30 R0;
    public n511 T0;
    public ndo0 U0;
    public Offset V0;
    public yr80 W0;
    public Boolean X0;
    public final Rect S0 = new Rect();
    public final ek2 Y0 = new ek2(this, (byte) 16);

    public k5t0(View view, iac0 iac0Var, int i, iu30 iu30Var) {
        this.O0 = view;
        this.P0 = iac0Var;
        this.Q0 = i;
        this.R0 = iu30Var;
    }

    public final void A1() {
        I1();
        this.P0.getLifecycle().d(this.Y0);
        this.U0 = null;
        this.V0 = null;
        this.W0 = null;
        this.T0 = null;
        this.X0 = null;
    }

    public final void E(elb0 elb0Var) {
        ndo0 ndo0Var = (ndo0) elb0Var;
        this.U0 = ndo0Var;
        long jP = ndo0Var.p(0L);
        long j = ((q5t0) ndo0Var).c;
        Offset offset = this.V0;
        if (offset != null && jP == offset.a && yr80.a(j, this.W0)) {
            return;
        }
        this.V0 = new Offset(jP);
        this.W0 = new yr80(j);
        H1();
    }

    public final void H1() {
        n511 n511Var;
        elb0 elb0Var = this.U0;
        boolean z = false;
        if (elb0Var != null) {
            if (!elb0Var.f1().N0) {
                elb0Var = null;
            }
            if (elb0Var != null && this.P0.getLifecycle().b().a(w8c0.e) && (n511Var = this.T0) != null && n511Var.l(nho1.n(elb0Var, true))) {
                z = true;
            }
        }
        if (Boolean.valueOf(z).equals(this.X0)) {
            return;
        }
        this.X0 = Boolean.valueOf(z);
        this.R0.invoke(Boolean.valueOf(z));
    }

    public final void I1() {
        if (u890.j(this.X0, Boolean.TRUE)) {
            Boolean bool = Boolean.FALSE;
            this.X0 = bool;
            this.R0.invoke(bool);
        }
    }

    public final boolean w1() {
        return false;
    }

    public final void z1() {
        this.P0.getLifecycle().a(this.Y0);
        if (this.T0 == null && this.P0.getLifecycle().b().a(w8c0.e)) {
            View view = this.O0;
            Rect rect = this.S0;
            view.getWindowVisibleDisplayFrame(rect);
            this.T0 = l0p1.w(new Rect(rect.left, rect.top, rect.right, rect.bottom - this.Q0));
            H1();
        }
    }
}
