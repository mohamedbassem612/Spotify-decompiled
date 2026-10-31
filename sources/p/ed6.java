package p;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ed6 extends o6 {
    public final err0 N0;

    public ed6(Context context) {
        super(context, (AttributeSet) null, 0);
        setViewCompositionStrategy(p5x0.W0);
        this.N0 = new err0(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCurrentRank() {
        return this.N0.s();
    }

    private final void setCurrentRank(int i) {
        this.N0.t(i);
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1674826195);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nyx.a(0, (wux) null, apo.r(-43376000, new l04(cwl1.n0(2131954683, new Object[]{Integer.valueOf(getCurrentRank())}, x340Var), this, (byte) 1), x340Var), x340Var, 3072, 7);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xb2(this, i, (byte) 24);
        }
    }

    public final void setRank(int i) {
        setCurrentRank(i);
    }
}
