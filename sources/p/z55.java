package p;

import android.view.Choreographer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z55 implements rjm0 {
    public final Choreographer a;

    public z55(Choreographer choreographer) {
        this.a = choreographer;
    }

    public final /* bridge */ m8n A(n8n n8nVar) {
        return lvx.j(this, n8nVar);
    }

    public final /* bridge */ o8n C(n8n n8nVar) {
        return lvx.o(this, n8nVar);
    }

    @Override // p.rjm0
    public final Object D(iu30 iu30Var, lnm lnmVar) {
        v55 v55VarA = lnmVar.getContext().A(wdu0.Y);
        v55 v55Var = v55VarA instanceof v55 ? v55VarA : null;
        ohd ohdVar = new ohd(1, aym.t(lnmVar));
        ohdVar.t();
        x55 x55Var = new x55(ohdVar, this, iu30Var);
        if (v55Var == null || !v55Var.c.equals(this.a)) {
            this.a.postFrameCallback(x55Var);
            ohdVar.n(new da(this, x55Var, (byte) 6));
        } else {
            synchronized (v55Var.e) {
                v55Var.g.add(x55Var);
                if (!v55Var.t) {
                    v55Var.t = true;
                    v55Var.c.postFrameCallback(v55Var.X);
                }
            }
            ohdVar.n(new da(v55Var, x55Var, (byte) 4));
        }
        return ohdVar.r();
    }

    public final /* bridge */ Object o(Object obj, vu30 vu30Var) {
        return lvx.i(this, obj, vu30Var);
    }

    public final /* bridge */ o8n y(o8n o8nVar) {
        return lvx.p(this, o8nVar);
    }
}
