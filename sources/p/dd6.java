package p;

import android.content.Context;
import android.util.AttributeSet;
import java.text.NumberFormat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dd6 extends o6 {
    public final frr0 N0;

    public dd6(Context context) {
        super(context, (AttributeSet) null, 0);
        setViewCompositionStrategy(p5x0.W0);
        this.N0 = new frr0(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getCurrentListenersCount() {
        return this.N0.s();
    }

    private final void setCurrentListenersCount(long j) {
        this.N0.t(j);
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-322165549);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String str = NumberFormat.getNumberInstance().format(getCurrentListenersCount());
            int currentListenersCount = (int) getCurrentListenersCount();
            str.getClass();
            nyx.a(0, (wux) null, apo.r(-431026842, new oj2(cwl1.U(2131820645, currentListenersCount, new Object[]{str}, x340Var), this, str, (byte) 20), x340Var), x340Var, 3072, 7);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xb2(this, i, (byte) 23);
        }
    }

    public final void setListenersCount(long j) {
        setCurrentListenersCount(j);
    }
}
