package p;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class asl1 extends zrl1 {
    public static final hsl1 w = hsl1.g(null, WindowInsets.CONSUMED);

    public asl1(hsl1 hsl1Var, WindowInsets windowInsets) {
        super(hsl1Var, windowInsets);
    }

    @Override // p.wrl1, p.esl1
    public nk80 i(int i) {
        return nk80.d(this.c.getInsets(fsl1.a(i)));
    }

    @Override // p.wrl1, p.esl1
    public nk80 j(int i) {
        return nk80.d(this.c.getInsetsIgnoringVisibility(fsl1.a(i)));
    }

    @Override // p.wrl1, p.esl1
    public boolean u(int i) {
        return this.c.isVisible(fsl1.a(i));
    }

    public asl1(hsl1 hsl1Var, asl1 asl1Var) {
        super(hsl1Var, asl1Var);
    }

    @Override // p.wrl1, p.esl1
    public final void d(View view) {
    }
}
