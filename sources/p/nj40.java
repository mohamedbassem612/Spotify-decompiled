package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nj40 extends pim0 implements wjh1, View.OnAttachStateChangeListener, iu30 {
    public nml O0;
    public iu30 P0;
    public iu30 Q0;
    public boolean R0;
    public m511 S0;
    public boolean T0;
    public int U0;
    public bhe1 V0;
    public View W0;

    public final void A1() {
        H1(null, 0);
        View view = this.W0;
        if (view != null) {
            view.removeOnAttachStateChangeListener(this);
        }
        this.W0 = null;
        bhe1 bhe1Var = this.V0;
        if (bhe1Var != null) {
            bhe1Var.b();
        }
        this.V0 = null;
    }

    public final void H1(m511 m511Var, int i) {
        if (!this.R0 || !u890.j(this.S0, m511Var)) {
            this.R0 = true;
            this.S0 = m511Var;
            this.P0.invoke(m511Var);
        }
        if (this.T0 && this.U0 == i) {
            return;
        }
        this.T0 = true;
        this.U0 = i;
        this.Q0.invoke(Integer.valueOf(i));
    }

    public final Object invoke(Object obj) {
        ur80 ur80VarA = ((ho11) obj).a();
        float f = ur80VarA.a;
        float f2 = ur80VarA.b;
        float f3 = ur80VarA.c;
        float f4 = ur80VarA.d;
        View view = this.W0;
        if (view != null && view.isAttachedToWindow()) {
            m511 m511Var = new m511(f, f2, f3, f4);
            H1(m511Var, m511Var.b(this.O0.a()));
        }
        return rih1.a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.V0 == null) {
            this.V0 = grn1.t(this, 16L, 0L, this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        bhe1 bhe1Var = this.V0;
        if (bhe1Var != null) {
            bhe1Var.b();
        }
        this.V0 = null;
        H1(null, 0);
    }

    @Override // p.wjh1
    public final void u1() {
        H1(null, 0);
    }

    public final boolean w1() {
        return false;
    }

    public final void z1() {
        this.R0 = false;
        this.S0 = null;
        this.T0 = false;
        this.U0 = 0;
        View viewE = pap1.E(this);
        viewE.addOnAttachStateChangeListener(this);
        this.W0 = viewE;
        if (viewE.isAttachedToWindow() && this.V0 == null) {
            this.V0 = grn1.t(this, 16L, 0L, this);
        }
    }
}
