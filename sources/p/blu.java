package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class blu implements View.OnAttachStateChangeListener {
    public final /* synthetic */ p811 a;
    public final /* synthetic */ clu b;
    public final /* synthetic */ p811 c;
    public final /* synthetic */ kwf d;
    public final /* synthetic */ l811 e;
    public final /* synthetic */ brw f;

    public blu(p811 p811Var, clu cluVar, p811 p811Var2, kwf kwfVar, l811 l811Var, brw brwVar) {
        this.a = p811Var;
        this.b = cluVar;
        this.c = p811Var2;
        this.d = kwfVar;
        this.e = l811Var;
        this.f = brwVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        p811 p811Var;
        Object obj;
        x8c0 lifecycle;
        p811 p811Var2 = this.a;
        Object obj2 = p811Var2.a;
        if (obj2 != view) {
            View view2 = (View) obj2;
            clu cluVar = this.b;
            if (view2 != null) {
                p9p1.x(view2).a.remove(cluVar);
            }
            p811Var2.a = view;
            p9p1.r(view, cluVar);
        }
        iac0 iac0VarH = x9p1.h(view);
        if (iac0VarH == null || iac0VarH == (obj = (p811Var = this.c).a)) {
            return;
        }
        iac0 iac0Var = (iac0) obj;
        kwf kwfVar = this.d;
        if (iac0Var != null && (lifecycle = iac0Var.getLifecycle()) != null) {
            lifecycle.d(kwfVar);
        }
        p811Var.a = iac0VarH;
        iac0VarH.getLifecycle().a(kwfVar);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        x8c0 lifecycle;
        if (p9p1.y(view)) {
            return;
        }
        l811 l811Var = this.e;
        if (l811Var.a) {
            l811Var.a = false;
            this.f.stop();
        }
        p811 p811Var = this.c;
        iac0 iac0Var = (iac0) p811Var.a;
        if (iac0Var != null && (lifecycle = iac0Var.getLifecycle()) != null) {
            lifecycle.d(this.d);
        }
        p811Var.a = null;
    }
}
