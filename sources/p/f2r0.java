package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f2r0 implements o5s {
    public final /* synthetic */ qe41 a;
    public final /* synthetic */ g2r0 b;

    public f2r0(qe41 qe41Var, g2r0 g2r0Var) {
        this.a = qe41Var;
        this.b = g2r0Var;
    }

    public final void onCreate(iac0 iac0Var) {
        oe41 oe41VarP = this.a.p();
        g2r0 g2r0Var = this.b;
        Bundle bundleA = oe41VarP.a(g2r0Var.P0);
        if (bundleA != null) {
            g2r0Var.x(bundleA);
        }
    }

    public final void onDestroy(iac0 iac0Var) {
        oe41 oe41VarP = this.a.p();
        g2r0 g2r0Var = this.b;
        oe41VarP.e(g2r0Var.P0);
        g2r0Var.e.reset();
        llm llmVar = g2r0Var.g.q;
        if (llmVar != null) {
            smo1.q(llmVar);
        }
        iac0Var.getLifecycle().d(this);
    }

    public final void onPause(iac0 iac0Var) {
        boolean zIsChangingConfigurations;
        dg30 dg30VarF0;
        g2r0 g2r0Var = this.b;
        String str = g2r0Var.P0;
        if (iac0Var instanceof g0i) {
            zIsChangingConfigurations = ((g0i) iac0Var).isChangingConfigurations();
        } else {
            zIsChangingConfigurations = (!(iac0Var instanceof zf30) || (dg30VarF0 = ((zf30) iac0Var).f0()) == null) ? false : dg30VarF0.isChangingConfigurations();
        }
        if (!zIsChangingConfigurations) {
            g2r0Var.v(false);
            return;
        }
        qe41 qe41Var = this.a;
        qe41Var.p().e(str);
        qe41Var.p().c(str, new uk(g2r0Var, (byte) 14));
    }

    public final void onResume(iac0 iac0Var) {
        g2r0 g2r0Var = this.b;
        int i = g2r0Var.t;
        if (i == 3) {
            return;
        }
        if (i == 4 && !g2r0Var.Y.c.equals(g2r0Var.N0)) {
            tba tbaVar = g2r0Var.Y;
            g2r0Var.C(tbaVar.a, tbaVar.b, tbaVar.d);
        }
        g2r0Var.t();
        g2r0Var.t = 3;
    }

    public final void onStart(iac0 iac0Var) {
        this.b.u();
    }
}
