package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q1z extends emc0 {
    public final y1z e;
    public final ynb0 f;
    public final ynb0 g;
    public final ynb0 h;
    public final int i;

    public q1z(y1z y1zVar, ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, int i) {
        super(kn5.h);
        this.e = y1zVar;
        this.f = ynb0Var;
        this.g = ynb0Var2;
        this.h = ynb0Var3;
        this.i = i;
    }

    public final int g(int i) {
        dem1 dem1Var = ((iby) A(i)).e;
        if (dem1Var instanceof azy) {
            return 7;
        }
        if (dem1Var instanceof qyy) {
            return 1;
        }
        if (dem1Var instanceof syy) {
            return 2;
        }
        if (dem1Var instanceof xyy) {
            return 3;
        }
        if (dem1Var instanceof zyy) {
            return 6;
        }
        if (dem1Var instanceof yyy) {
            return 4;
        }
        if (dem1Var instanceof bzy) {
            return 8;
        }
        if ((dem1Var instanceof uyy) || (dem1Var instanceof vyy)) {
            return 9;
        }
        eg.o();
        return 0;
    }

    public final void n(int i, w611 w611Var) {
        iby ibyVar = (iby) A(i);
        tu31 tu31Var = (tu31) this.g.get();
        ibyVar.getClass();
        tu31Var.b(ibyVar);
        ((lda) w611Var).E(ibyVar);
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        FrameLayout frameLayout;
        int i2;
        uml1 uml1Var;
        r3x0 r3x0Var;
        int iC = l1d.C(this.i);
        if (iC == 0) {
            View viewL = eqq.l(viewGroup, 2131625119, (ViewGroup) null, false);
            if (m5n1.t(viewL, 2131429779) == null) {
                bhn0.i("Missing required view with ID: ".concat(viewL.getResources().getResourceName(2131429779)));
                return null;
            }
            frameLayout = (FrameLayout) viewL;
            i2 = 1;
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            View viewL2 = eqq.l(viewGroup, 2131625124, (ViewGroup) null, false);
            if (m5n1.t(viewL2, 2131430625) == null) {
                bhn0.i("Missing required view with ID: ".concat(viewL2.getResources().getResourceName(2131430625)));
                return null;
            }
            frameLayout = (FrameLayout) viewL2;
            i2 = 2;
        }
        frameLayout.getClass();
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        xfx xfxVar = this.e.a;
        ynb0 ynb0Var = this.f;
        if (i == 7) {
            wfx wfxVar = xfxVar.c;
            int iC2 = l1d.C(i2);
            if (iC2 == 0) {
                r3x0Var = bxf1.a;
            } else {
                if (iC2 != 1) {
                    eg.o();
                    return null;
                }
                r3x0Var = r3x0.U0;
            }
            return new szf1(frameLayout, new ngr(wfxVar.b, wfxVar.a, (cxf1) r3x0Var), this.h, ynb0Var);
        }
        wfx wfxVar2 = xfxVar.c;
        int iC3 = l1d.C(i2);
        if (iC3 == 0) {
            uml1Var = mh7.a;
        } else {
            if (iC3 != 1) {
                eg.o();
                return null;
            }
            uml1Var = uml1.h;
        }
        return new qh7(frameLayout, new ngr(wfxVar2.b, wfxVar2.a, (nh7) uml1Var), ynb0Var);
    }
}
