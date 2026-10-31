package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t0t {
    public final dma1 a;

    public /* synthetic */ t0t(dma1 dma1Var) {
        this.a = dma1Var;
    }

    public boolean a(hsm1 hsm1Var) {
        bma1 bma1Var;
        if (hsm1Var.equals(fsm1.a)) {
            bma1Var = u0t.a;
        } else {
            if (!hsm1Var.equals(gsm1.a)) {
                eg.o();
                return false;
            }
            bma1Var = u0t.b;
        }
        return this.a.h(bma1Var, false);
    }

    public void b(hsm1 hsm1Var, boolean z) {
        bma1 bma1Var;
        hma1 hma1VarEdit = this.a.edit();
        if (hsm1Var.equals(fsm1.a)) {
            bma1Var = u0t.a;
        } else {
            if (!hsm1Var.equals(gsm1.a)) {
                eg.o();
                return;
            }
            bma1Var = u0t.b;
        }
        hma1VarEdit.a(bma1Var, z);
        hma1VarEdit.g();
    }

    public mr20 c(hsm1 hsm1Var) {
        bma1 bma1Var;
        if (hsm1Var.equals(fsm1.a)) {
            bma1Var = u0t.a;
        } else {
            if (!hsm1Var.equals(gsm1.a)) {
                eg.o();
                return null;
            }
            bma1Var = u0t.b;
        }
        return rqt0.u(new ht20(new wef(this.a.q(bma1Var), (byte) 29), new zlo(this, hsm1Var, (lnm) null, (byte) 22)));
    }
}
