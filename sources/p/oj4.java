package p;

import android.graphics.Typeface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oj4 extends lm5 {
    public final /* synthetic */ ohd d;
    public final /* synthetic */ yw21 e;

    public oj4(ohd ohdVar, yw21 yw21Var) {
        this.d = ohdVar;
        this.e = yw21Var;
    }

    @Override // p.lm5
    public final void n(int i) {
        this.d.q(new IllegalStateException("Unable to load font " + this.e + " (reason=" + i + ")"));
    }

    @Override // p.lm5
    public final void o(Typeface typeface) {
        this.d.resumeWith(typeface);
    }
}
