package p;

import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qh7 extends lda {
    public final qzh U0;
    public final ynb0 V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh7(FrameLayout frameLayout, qzh qzhVar, ynb0 ynb0Var) {
        super(frameLayout);
        frameLayout.addView(qzhVar.getView());
        this.U0 = qzhVar;
        this.V0 = ynb0Var;
    }

    @Override // p.lda
    public final void E(iby ibyVar) {
        ph7 ph7Var;
        k4m k4mVar;
        int i;
        String str = ibyVar.c;
        dem1 dem1Var = ibyVar.e;
        if (dem1Var instanceof qyy) {
            String str2 = ibyVar.d;
            qyy qyyVar = (qyy) dem1Var;
            String strY0 = o7h.y0(qyyVar.b, ", ", (String) null, (String) null, (iu30) null, 62);
            int iC = l1d.C(qyyVar.c);
            int i2 = 1;
            if (iC != 1) {
                i = 2;
                if (iC != 2) {
                }
                ph7Var = new ph7(str, str2, 3, strY0, null, i, 16);
            } else {
                i2 = 3;
            }
            i = i2;
            ph7Var = new ph7(str, str2, 3, strY0, null, i, 16);
        } else if (dem1Var instanceof syy) {
            ph7Var = new ph7(str, ibyVar.d, 1, null, null, 0, 56);
        } else if (dem1Var instanceof xyy) {
            String str3 = ibyVar.d;
            xyy xyyVar = (xyy) dem1Var;
            String str4 = xyyVar.b;
            if (xyyVar.d) {
                k4mVar = k4m.a;
            } else {
                k4mVar = xyyVar.c ? k4m.b : k4m.d;
            }
            ph7Var = new ph7(str, str3, 6, str4, k4mVar, 0, 32);
        } else if (dem1Var instanceof yyy) {
            ph7Var = new ph7(str, ibyVar.d, 4, ((yyy) dem1Var).b, null, 0, 48);
        } else if (dem1Var instanceof zyy) {
            ph7Var = new ph7(str, ibyVar.d, 5, ((zyy) dem1Var).b, null, 0, 48);
        } else if (dem1Var instanceof uyy) {
            ph7Var = new ph7(str, ibyVar.d, 7, ((uyy) dem1Var).b, null, 0, 48);
        } else if (dem1Var instanceof vyy) {
            vyy vyyVar = (vyy) dem1Var;
            ph7Var = new ph7(vyyVar.b, ibyVar.d, 7, vyyVar.d, null, 0, 48);
        } else {
            ph7Var = new ph7(str, ibyVar.d, 2, null, null, 0, 56);
        }
        qzh qzhVar = this.U0;
        qzhVar.f(ph7Var);
        qzhVar.n(new xg6(this, ibyVar, (byte) 23));
    }
}
