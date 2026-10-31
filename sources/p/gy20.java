package p;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class gy20 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hy20 b;

    public /* synthetic */ gy20(hy20 hy20Var, byte b) {
        this.a = b;
        this.b = hy20Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hy20 hy20Var = this.b;
        dgd dgdVar = (dgd) obj;
        switch (b) {
            case 0:
                View viewO = y7y0.o(hy20Var);
                if (!viewO.isFocused() && !viewO.hasFocus()) {
                    dz20 focusOwner = oap1.C(hy20Var).getFocusOwner();
                    View viewE = pap1.E(hy20Var);
                    Integer numC = uy20.c(dgdVar.a);
                    int[] iArr = new int[2];
                    viewE.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    viewO.getLocationOnScreen(iArr2);
                    d030 d030VarK = dm5.K(focusOwner.c);
                    Rect rect = null;
                    n511 n511VarL = d030VarK != null ? dm5.L(d030VarK) : null;
                    if (n511VarL != null) {
                        int i = (int) n511VarL.a;
                        int i2 = iArr[0];
                        int i3 = iArr2[0];
                        int i4 = (int) n511VarL.b;
                        int i5 = iArr[1];
                        int i6 = iArr2[1];
                        rect = new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) n511VarL.c) + i2) - i3, (((int) n511VarL.d) + i5) - i6);
                    }
                    if (!uy20.b(viewO, numC, rect)) {
                        dgdVar.b = true;
                    }
                }
                break;
            default:
                y7y0.o(hy20Var);
                break;
        }
        return rih1Var;
    }
}
