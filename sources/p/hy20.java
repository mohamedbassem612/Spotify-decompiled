package p;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hy20 extends pim0 implements iz20, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View O0;
    public ViewTreeObserver P0;
    public final gy20 Q0 = new gy20(this, (byte) 0);
    public final gy20 R0 = new gy20(this, (byte) 1);

    @Override // p.pim0
    public final void A1() {
        ViewTreeObserver viewTreeObserver = this.P0;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.P0 = null;
        pap1.E(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.O0 = null;
    }

    public final d030 H1() {
        boolean z;
        if (!this.a.N0) {
            qf80.c("visitLocalDescendants called on an unattached node");
        }
        pim0 pim0Var = this.a;
        if ((pim0Var.d & 1024) != 0) {
            boolean z2 = false;
            for (pim0 pim0Var2 = pim0Var.f; pim0Var2 != null; pim0Var2 = pim0Var2.f) {
                if ((pim0Var2.c & 1024) != 0) {
                    pim0 pim0VarE = pim0Var2;
                    bfn0 bfn0Var = null;
                    while (pim0VarE != null) {
                        if (pim0VarE instanceof d030) {
                            d030 d030Var = (d030) pim0VarE;
                            if (z2) {
                                return d030Var;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (pim0VarE.c & 1024) != 0 && (pim0VarE instanceof l5t)) {
                            int i = 0;
                            for (pim0 pim0Var3 = ((l5t) pim0VarE).P0; pim0Var3 != null; pim0Var3 = pim0Var3.f) {
                                if ((pim0Var3.c & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        pim0VarE = pim0Var3;
                                    } else {
                                        if (bfn0Var == null) {
                                            bfn0Var = new bfn0(0, new pim0[16]);
                                        }
                                        if (pim0VarE != null) {
                                            bfn0Var.b(pim0VarE);
                                            pim0VarE = null;
                                        }
                                        bfn0Var.b(pim0Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        pim0VarE = oap1.e(bfn0Var);
                    }
                }
            }
        }
        eg.m("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // p.iz20
    public final void T0(ez20 ez20Var) {
        ez20Var.c(false);
        ez20Var.b(this.Q0);
        ez20Var.d(this.R0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) throws NoWhenBranchMatchedException {
        if (oap1.B(this).O0 == null) {
            return;
        }
        View viewO = y7y0.o(this);
        az20 focusOwner = ((ha4) oap1.C(this)).getFocusOwner();
        oxq0 oxq0VarC = oap1.C(this);
        boolean z = (view == null || view.equals(oxq0VarC) || !y7y0.n(viewO, view)) ? false : true;
        boolean z2 = (view2 == null || view2.equals(oxq0VarC) || !y7y0.n(viewO, view2)) ? false : true;
        if (z && z2) {
            this.O0 = view2;
            return;
        }
        if (z2) {
            this.O0 = view2;
            d030 d030VarH1 = H1();
            if (d030VarH1.L1().a()) {
                return;
            }
            m6p1.y(d030VarH1);
            return;
        }
        if (!z) {
            this.O0 = null;
            return;
        }
        this.O0 = null;
        if (H1().L1().b()) {
            ((dz20) focusOwner).d(8, false, false);
        }
    }

    @Override // p.pim0
    public final void z1() {
        ViewTreeObserver viewTreeObserver = pap1.E(this).getViewTreeObserver();
        this.P0 = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }
}
