package p;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xek1 implements ViewTreeObserver.OnPreDrawListener {
    public boolean a;
    public final /* synthetic */ dg01 b;
    public final /* synthetic */ ViewTreeObserver c;
    public final /* synthetic */ ohd d;

    public xek1(dg01 dg01Var, ViewTreeObserver viewTreeObserver, ohd ohdVar) {
        this.b = dg01Var;
        this.c = viewTreeObserver;
        this.d = ohdVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        dg01 dg01Var = this.b;
        k291 k291VarC = dg01Var.c();
        if (k291VarC != null) {
            ViewTreeObserver viewTreeObserver = this.c;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                dg01Var.a.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.a) {
                this.a = true;
                this.d.resumeWith(k291VarC);
            }
        }
        return true;
    }
}
