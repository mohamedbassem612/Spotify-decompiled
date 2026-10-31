package p;

import io.reactivex.rxjava3.core.Flowable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e0l implements nh91 {
    public c9n X;
    public xab1 Y;
    public final g0l a;
    public final dma1 b;
    public final yqg c;
    public final iur d;
    public final q8n e;
    public final jo20 f;
    public final xid g;
    public final dt71 h;
    public final dt71 i;
    public final c0l t;

    public e0l(Flowable flowable, g0l g0lVar, dma1 dma1Var, yqg yqgVar, iur iurVar, q8n q8nVar, jo20 jo20Var, xid xidVar) {
        this.a = g0lVar;
        this.b = dma1Var;
        this.c = yqgVar;
        this.d = iurVar;
        this.e = q8nVar;
        this.f = jo20Var;
        this.g = xidVar;
        dt71 dt71VarE = mgo1.e(0, 1, 0, 5);
        this.h = dt71VarE;
        this.i = dt71VarE;
        vbm[] vbmVarArr = q601.a;
        this.t = new c0l(new ht20(rqt0.u(new xy0(new kge(flowable), (byte) 9)), new nw5(2, (lnm) null, (byte) 7), (byte) 2), (byte) 0);
        this.X = us71.h(q8nVar);
    }

    public final void a() {
        bma1 bma1Var = f0l.e;
        dma1 dma1Var = this.b;
        if (dma1Var.g(bma1Var, 0L) != 0) {
            return;
        }
        l1d.B(this.c, dma1Var.edit(), bma1Var);
    }

    public final void c(int i) {
        int iC = l1d.C(i);
        lnm lnmVar = null;
        if (iC != 0) {
            if (iC != 1) {
                if (iC == 2) {
                    return;
                }
                eg.o();
                return;
            } else {
                xab1 xab1Var = this.Y;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                this.Y = null;
                return;
            }
        }
        bma1 bma1Var = f0l.a;
        dma1 dma1Var = this.b;
        byte b = 0;
        int iL = dma1Var.l(bma1Var, 0);
        hma1 hma1VarEdit = dma1Var.edit();
        hma1VarEdit.b(bma1Var, iL + 1);
        hma1VarEdit.c(f0l.b, this.c.b());
        hma1VarEdit.c(f0l.c, f0l.g);
        hma1VarEdit.g();
        xab1 xab1Var2 = this.Y;
        if (xab1Var2 != null) {
            xab1Var2.d((CancellationException) null);
        }
        this.Y = fn31.T(this.X, (o8n) null, 0, new a0l(this, lnmVar, b), 3);
    }

    public final mr20 getState() {
        return this.i;
    }

    public final void start() {
        bma1 bma1Var = f0l.d;
        dma1 dma1Var = this.b;
        if (!dma1Var.h(bma1Var, false) && dma1Var.l(f0l.a, 0) < 5) {
            this.X = qmo1.v(this.X, new vjh(this, (byte) 20));
            a();
            lnm lnmVar = null;
            fn31.T(this.X, (o8n) null, 0, new a0l(this, lnmVar, (byte) 1), 3);
            fn31.T(this.X, (o8n) null, 0, new a0l(this, lnmVar, (byte) 2), 3);
            fn31.T(this.X, (o8n) null, 0, new a0l(this, lnmVar, (byte) 3), 3);
        }
    }

    public final void stop() {
        xab1 xab1Var = this.Y;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.Y = null;
        smo1.p(this.X, (CancellationException) null);
    }
}
