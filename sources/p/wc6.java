package p;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wc6 extends o6 {
    public final hrr0 N0;
    public final hrr0 O0;

    public wc6(Context context) {
        super(context, (AttributeSet) null, 0);
        this.N0 = v8r.q(Boolean.FALSE);
        this.O0 = v8r.q(t16.i);
        setViewCompositionStrategy(p5x0.W0);
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1143257867);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nyx.a(0, (wux) null, apo.r(726949784, new vc6(this), x340Var), x340Var, 3072, 7);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vc6(this, i);
        }
    }

    public final iu30 getOnLearnMoreClick() {
        return (iu30) this.O0.getValue();
    }

    public final void setLikely(boolean z) {
        this.N0.setValue(Boolean.valueOf(z));
    }

    public final void setOnLearnMoreClick(iu30 iu30Var) {
        this.O0.setValue(iu30Var);
    }
}
