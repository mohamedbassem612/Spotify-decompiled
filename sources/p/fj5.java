package p;

import android.view.LayoutInflater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fj5 implements n2q0 {
    public final /* synthetic */ gj5 a;

    public fj5(gj5 gj5Var) {
        this.a = gj5Var;
    }

    @Override // p.n2q0
    public final void a() {
        gj5 gj5Var = this.a;
        rj5 rj5VarH0 = gj5Var.h0();
        yj5 yj5Var = (yj5) rj5VarH0;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(yj5Var.X);
        if (layoutInflaterFrom.getFactory() == null) {
            tho1.t(layoutInflaterFrom, yj5Var);
        } else {
            layoutInflaterFrom.getFactory2();
        }
        gj5Var.d.j().a("androidx:appcompat");
        rj5VarH0.c();
    }
}
