package p;

import android.graphics.Rect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class p511 extends pim0 implements mv40 {
    public Rect O0;

    public final void A1() {
        bfn0 bfn0VarH1 = H1();
        Rect rect = this.O0;
        if (rect != null) {
            bfn0VarH1.k(rect);
        }
        I1(bfn0VarH1);
        this.O0 = null;
    }

    public final void E(elb0 elb0Var) {
        n511 n511VarM = nho1.m((ndo0) elb0Var);
        Rect rect = new Rect(jch0.U(n511VarM.a), jch0.U(n511VarM.b), jch0.U(n511VarM.c), jch0.U(n511VarM.d));
        bfn0 bfn0VarH1 = H1();
        Rect rect2 = this.O0;
        if (rect2 != null) {
            bfn0VarH1.k(rect2);
        }
        if (!rect.isEmpty()) {
            bfn0VarH1.b(rect);
        }
        I1(bfn0VarH1);
        this.O0 = rect;
    }

    public bfn0 H1() {
        bfn0 bfn0Var = new bfn0(0, new Rect[16]);
        bfn0Var.c(bfn0Var.c, pap1.E(this).getSystemGestureExclusionRects());
        return bfn0Var;
    }

    public void I1(bfn0 bfn0Var) {
        pap1.E(this).setSystemGestureExclusionRects(bfn0Var.f());
    }
}
