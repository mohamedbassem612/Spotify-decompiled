package p;

import android.view.WindowInsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class zrl1 extends yrl1 {
    public nk80 t;
    public nk80 u;
    public nk80 v;

    public zrl1(hsl1 hsl1Var, WindowInsets windowInsets) {
        super(hsl1Var, windowInsets);
        this.t = null;
        this.u = null;
        this.v = null;
    }

    @Override // p.esl1
    public nk80 k() {
        nk80 nk80Var = this.u;
        if (nk80Var != null) {
            return nk80Var;
        }
        nk80 nk80VarD = nk80.d(this.c.getMandatorySystemGestureInsets());
        this.u = nk80VarD;
        return nk80VarD;
    }

    @Override // p.esl1
    public nk80 m() {
        nk80 nk80Var = this.t;
        if (nk80Var != null) {
            return nk80Var;
        }
        nk80 nk80VarD = nk80.d(this.c.getSystemGestureInsets());
        this.t = nk80VarD;
        return nk80VarD;
    }

    @Override // p.esl1
    public nk80 o() {
        nk80 nk80Var = this.v;
        if (nk80Var != null) {
            return nk80Var;
        }
        nk80 nk80VarD = nk80.d(this.c.getTappableElementInsets());
        this.v = nk80VarD;
        return nk80VarD;
    }

    @Override // p.wrl1, p.esl1
    public hsl1 r(int i, int i2, int i3, int i4) {
        return hsl1.g(null, this.c.inset(i, i2, i3, i4));
    }

    public zrl1(hsl1 hsl1Var, zrl1 zrl1Var) {
        super(hsl1Var, zrl1Var);
        this.t = null;
        this.u = null;
        this.v = null;
    }

    @Override // p.xrl1, p.esl1
    public void z(nk80 nk80Var) {
    }
}
