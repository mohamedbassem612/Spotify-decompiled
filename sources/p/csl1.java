package p;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class csl1 extends bsl1 {
    public static final hsl1 x = hsl1.g(null, WindowInsets.CONSUMED);

    public csl1(hsl1 hsl1Var, WindowInsets windowInsets) {
        super(hsl1Var, windowInsets);
    }

    @Override // p.asl1, p.wrl1, p.esl1
    public nk80 i(int i) {
        return nk80.d(this.c.getInsets(gsl1.a(i)));
    }

    @Override // p.asl1, p.wrl1, p.esl1
    public nk80 j(int i) {
        return nk80.d(this.c.getInsetsIgnoringVisibility(gsl1.a(i)));
    }

    @Override // p.asl1, p.wrl1, p.esl1
    public boolean u(int i) {
        return this.c.isVisible(gsl1.a(i));
    }

    public csl1(hsl1 hsl1Var, csl1 csl1Var) {
        super(hsl1Var, csl1Var);
    }

    @Override // p.wrl1, p.esl1
    public void p(View view) {
    }
}
