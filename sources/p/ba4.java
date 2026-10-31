package p;

import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ba4 extends pim0 implements f5c, t161, hpa0, zlb0, dpg1 {
    public final z94 O0 = new z94(this, 0);
    public final /* synthetic */ ha4 P0;

    public ba4(ha4 ha4Var) {
        this.P0 = ha4Var;
    }

    @Override // p.f5c
    public final Object C(ndo0 ndo0Var, og ogVar, onm onmVar) {
        long jB = nho1.B(ndo0Var);
        n511 n511Var = (n511) ogVar.invoke();
        n511 n511VarN = n511Var != null ? n511Var.n(jB) : null;
        if (n511VarN != null) {
            this.P0.requestRectangleOnScreen(l0p1.u(n511VarN), false);
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.hpa0
    public final boolean J0(KeyEvent keyEvent) throws NoWhenBranchMatchedException {
        yx20 yx20VarA;
        int[] iArr = uy20.a;
        long jR = ern1.r(keyEvent);
        int i = toa0.P;
        if (toa0.a(jR, qqn1.D())) {
            yx20VarA = yx20.a(2);
        } else if (toa0.a(jR, qqn1.C())) {
            yx20VarA = yx20.a(1);
        } else if (toa0.a(jR, qqn1.R())) {
            yx20VarA = yx20.a(ern1.w(keyEvent) ? 2 : 1);
        } else if (toa0.a(jR, qqn1.v())) {
            yx20VarA = yx20.a(4);
        } else if (toa0.a(jR, qqn1.u())) {
            yx20VarA = yx20.a(3);
        } else if (toa0.a(jR, qqn1.w()) || toa0.a(jR, qqn1.P())) {
            yx20VarA = yx20.a(5);
        } else if (toa0.a(jR, qqn1.t()) || toa0.a(jR, qqn1.O())) {
            yx20VarA = yx20.a(6);
        } else if (toa0.a(jR, qqn1.s()) || toa0.a(jR, qqn1.x()) || toa0.a(jR, qqn1.I())) {
            yx20VarA = yx20.a(7);
        } else {
            yx20VarA = (toa0.a(jR, qqn1.k()) || toa0.a(jR, qqn1.y())) ? yx20.a(8) : null;
        }
        if (yx20VarA != null && crn1.m(ern1.t(keyEvent), 2)) {
            ha4 ha4Var = this.P0;
            d030 d030VarH = ((dz20) ha4Var.getFocusOwner()).h();
            if (d030VarH != null && d030VarH.O0 && ha4Var.v(yx20VarA.d())) {
                ha4Var.getPlayNavigationSoundEffect$ui().invoke(yx20VarA, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                return true;
            }
            Boolean boolG = ((dz20) ha4Var.getFocusOwner()).g(yx20VarA.d(), ha4Var.getEmbeddedViewFocusRect(), new j6(yx20VarA, (byte) 5));
            if (boolG == null) {
                return true;
            }
            if (boolG.booleanValue()) {
                ha4Var.getPlayNavigationSoundEffect$ui().invoke(yx20VarA, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                return true;
            }
            if (g6p1.o(yx20VarA.d())) {
                Integer numC = uy20.c(yx20VarA.d());
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) ha4Var.getRootView(), ha4Var.getView(), numC != null ? numC.intValue() : 2);
                if (viewFindNextFocus == null || viewFindNextFocus.equals(ha4Var)) {
                    return ((dz20) ha4Var.getFocusOwner()).j(yx20VarA.d());
                }
            }
        }
        return false;
    }

    @Override // p.zlb0
    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        q5t0 q5t0VarH = afh0Var.H(j);
        return ifh0Var.B(q5t0VarH.a, q5t0VarH.b, b7x.a, this.O0, new aa4(q5t0VarH, (byte) 0));
    }

    @Override // p.dpg1
    public final Object n() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // p.hpa0
    public final boolean x0(KeyEvent keyEvent) {
        return false;
    }

    @Override // p.t161
    public final void g(e261 e261Var) {
    }
}
