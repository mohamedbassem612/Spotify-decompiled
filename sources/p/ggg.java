package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ggg extends o6 implements qzh {
    public final ggg N0;
    public iu30 O0;
    public final hrr0 P0;

    public ggg(Context context) {
        super(context, (AttributeSet) null, 0);
        this.N0 = this;
        this.P0 = v8r.q(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getState() {
        return ((Boolean) this.P0.getValue()).booleanValue();
    }

    private final void setState(boolean z) {
        this.P0.setValue(Boolean.valueOf(z));
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-245131022);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nyx.a(2, (wux) null, apo.r(-854861249, new fgg(this), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fgg(this, i);
        }
    }

    public final void f(Object obj) {
        setState(((Boolean) obj).booleanValue());
    }

    public View getView() {
        return this.N0;
    }

    public final void n(iu30 iu30Var) {
        this.O0 = iu30Var;
    }
}
