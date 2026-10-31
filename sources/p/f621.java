package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f621 extends o6 implements qzh {
    public final f621 N0;
    public iu30 O0;
    public final err0 P0;

    public f621(Context context) {
        super(context, (AttributeSet) null, 0);
        this.N0 = this;
        this.P0 = new err0(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getNumSelectedItems() {
        return this.P0.s();
    }

    private final void setNumSelectedItems(int i) {
        this.P0.t(i);
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(655442514);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nyx.a(2, (wux) null, apo.r(-1376272993, new e621(this), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e621(this, i);
        }
    }

    public final void f(Object obj) {
        setNumSelectedItems(((Number) obj).intValue());
    }

    public View getView() {
        return this.N0;
    }

    public final void n(iu30 iu30Var) {
        this.O0 = iu30Var;
    }
}
