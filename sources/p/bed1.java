package p;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bed1 extends uk80 {
    public iu30 R0;
    public osl1 S0;

    public final void A1() {
        View viewE = pap1.E(this);
        osl1 osl1Var = this.S0;
        if (osl1Var != null) {
            int i = osl1Var.v - 1;
            osl1Var.v = i;
            if (i == 0) {
                WeakHashMap weakHashMap = b8k1.a;
                r7k1.c(viewE, (k1q0) null);
                mrl1.e(viewE, null);
                viewE.removeOnAttachStateChangeListener(osl1Var.w);
            }
        }
        super/*p.pk80*/.A1();
    }

    public final void z1() {
        View viewE = pap1.E(this);
        WeakHashMap weakHashMap = osl1.x;
        osl1 osl1VarI = lhc.i(viewE);
        osl1VarI.a(viewE);
        erl1 erl1Var = (erl1) this.R0.invoke(osl1VarI);
        if (!u890.j(erl1Var, ((uk80) this).Q0)) {
            ((uk80) this).Q0 = erl1Var;
            I1();
        }
        this.S0 = osl1VarI;
        super/*p.pk80*/.z1();
    }
}
