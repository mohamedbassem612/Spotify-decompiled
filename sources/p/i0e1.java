package p;

import android.graphics.Typeface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i0e1 extends lm5 {
    public final /* synthetic */ g2p1 d;
    public final /* synthetic */ k0e1 e;

    public i0e1(k0e1 k0e1Var, g2p1 g2p1Var) {
        this.e = k0e1Var;
        this.d = g2p1Var;
    }

    public final void n(int i) {
        this.e.m = true;
        this.d.H(i);
    }

    public final void o(Typeface typeface) {
        k0e1 k0e1Var = this.e;
        Typeface typefaceCreate = Typeface.create(typeface, k0e1Var.c);
        k0e1Var.n = typefaceCreate;
        k0e1Var.m = true;
        this.d.I(typefaceCreate, false);
    }
}
