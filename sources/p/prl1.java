package p;

import android.view.WindowInsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class prl1 extends vrl1 {
    public final WindowInsets.Builder e;

    public prl1(hsl1 hsl1Var) {
        super(hsl1Var);
        WindowInsets windowInsetsF = hsl1Var.f();
        this.e = windowInsetsF != null ? orl1.b(windowInsetsF) : orl1.a();
    }

    @Override // p.vrl1
    public hsl1 b() {
        a();
        hsl1 hsl1VarG = hsl1.g(null, this.e.build());
        nk80[] nk80VarArr = this.b;
        esl1 esl1Var = hsl1VarG.a;
        esl1Var.w(nk80VarArr);
        esl1Var.v(null);
        esl1Var.B(this.c);
        esl1Var.C(this.d);
        return hsl1VarG;
    }

    @Override // p.vrl1
    public void e(nk80 nk80Var) {
        this.e.setMandatorySystemGestureInsets(nk80Var.e());
    }

    @Override // p.vrl1
    public void f(nk80 nk80Var) {
        this.e.setStableInsets(nk80Var.e());
    }

    @Override // p.vrl1
    public void g(nk80 nk80Var) {
        this.e.setSystemGestureInsets(nk80Var.e());
    }

    @Override // p.vrl1
    public void h(nk80 nk80Var) {
        this.e.setSystemWindowInsets(nk80Var.e());
    }

    @Override // p.vrl1
    public void i(nk80 nk80Var) {
        this.e.setTappableElementInsets(nk80Var.e());
    }

    public prl1() {
        this.e = orl1.a();
    }
}
