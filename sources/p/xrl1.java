package p;

import android.view.WindowInsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class xrl1 extends wrl1 {
    public nk80 s;

    public xrl1(hsl1 hsl1Var, xrl1 xrl1Var) {
        super(hsl1Var, xrl1Var);
        this.s = null;
        this.s = xrl1Var.s;
    }

    @Override // p.esl1
    public hsl1 b() {
        return hsl1.g(null, this.c.consumeStableInsets());
    }

    @Override // p.esl1
    public hsl1 c() {
        return hsl1.g(null, this.c.consumeSystemWindowInsets());
    }

    @Override // p.esl1
    public final nk80 l() {
        nk80 nk80Var = this.s;
        if (nk80Var != null) {
            return nk80Var;
        }
        WindowInsets windowInsets = this.c;
        nk80 nk80VarC = nk80.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.s = nk80VarC;
        return nk80VarC;
    }

    @Override // p.esl1
    public boolean s() {
        return this.c.isConsumed();
    }

    @Override // p.esl1
    public void z(nk80 nk80Var) {
        this.s = nk80Var;
    }

    public xrl1(hsl1 hsl1Var, WindowInsets windowInsets) {
        super(hsl1Var, windowInsets);
        this.s = null;
    }
}
