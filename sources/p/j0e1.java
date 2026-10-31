package p;

import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class j0e1 extends g2p1 {
    public final /* synthetic */ TextPaint c;
    public final /* synthetic */ g2p1 d;
    public final /* synthetic */ k0e1 e;

    public j0e1(k0e1 k0e1Var, TextPaint textPaint, g2p1 g2p1Var) {
        this.e = k0e1Var;
        this.c = textPaint;
        this.d = g2p1Var;
    }

    @Override // p.g2p1
    public final void H(int i) {
        this.d.H(i);
    }

    @Override // p.g2p1
    public final void I(Typeface typeface, boolean z) {
        this.e.g(this.c, typeface);
        this.d.I(typeface, z);
    }
}
