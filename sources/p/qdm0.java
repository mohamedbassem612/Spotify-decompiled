package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Window;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qdm0 extends o6 implements a4u {
    public final Window N0;
    public final hrr0 O0;
    public boolean P0;

    public qdm0(Context context, Window window) {
        super(context, (AttributeSet) null, 6, 0);
        this.N0 = window;
        this.O0 = v8r.q(k2j.a);
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(576708319);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            ((vu30) this.O0.getValue()).invoke(x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w9(this, i, (byte) 13);
        }
    }

    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.P0;
    }

    @Override // p.a4u
    public final Window getWindow() {
        return this.N0;
    }
}
