package p;

import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d2g0 extends cjg1 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ d2g0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void f(jhg1 jhg1Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ConstraintLayout constraintLayout = ((f2g0) obj).a;
                constraintLayout.requestLayout();
                constraintLayout.requestApplyInsets();
                break;
            case 1:
                glg1 glg1Var = (glg1) obj;
                int i = glg1Var.h1 - 1;
                glg1Var.h1 = i;
                if (i == 0) {
                    glg1Var.i1 = false;
                    glg1Var.r();
                }
                jhg1Var.G(this);
                break;
            case 2:
                ((vm1) obj).invoke();
                break;
            default:
                ((dch1) obj).invoke();
                break;
        }
    }

    public void g(jhg1 jhg1Var) {
        switch (this.a) {
            case 1:
                glg1 glg1Var = (glg1) this.b;
                if (!glg1Var.i1) {
                    glg1Var.R();
                    glg1Var.i1 = true;
                }
                break;
        }
    }
}
