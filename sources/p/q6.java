package p;

import kotlinx.coroutines.CompletionHandlerException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class q6 extends saa0 implements lnm, c9n {
    public final o8n d;

    public q6(o8n o8nVar, boolean z, boolean z2) {
        super(z2);
        if (z) {
            j0((faa0) o8nVar.A(fkj0.W0));
        }
        this.d = o8nVar.y(this);
    }

    public final void A0(int i, q6 q6Var, vu30 vu30Var) {
        int iC = l1d.C(i);
        if (iC == 0) {
            ozn1.s(vu30Var, q6Var, this);
            return;
        }
        if (iC != 1) {
            if (iC == 2) {
                l6o1.E(vu30Var, q6Var, this);
            } else if (iC == 3) {
                wgo1.D(vu30Var, q6Var, this);
            } else {
                eg.o();
            }
        }
    }

    @Override // p.c9n
    public final o8n J() {
        return this.d;
    }

    @Override // p.saa0
    public final String U() {
        return v8r.l(this).concat(" was cancelled");
    }

    @Override // p.lnm
    public final o8n getContext() {
        return this.d;
    }

    @Override // p.saa0
    public final void i0(CompletionHandlerException completionHandlerException) {
        omo1.p(completionHandlerException, this.d);
    }

    @Override // p.saa0
    public String o0() {
        return v8r.l(this);
    }

    @Override // p.saa0
    public final void r0(Object obj) {
        if (!(obj instanceof nyh)) {
            z0(obj);
        } else {
            nyh nyhVar = (nyh) obj;
            y0(nyhVar.a, avg.a.getIntVolatile(nyhVar, nyh.b) == 1);
        }
    }

    @Override // p.lnm
    public final void resumeWith(Object obj) {
        Object objN0 = n0(uap1.r(obj));
        if (objN0 == j1e1.b) {
            return;
        }
        P(objN0);
    }

    public void z0(Object obj) {
    }

    public void y0(Throwable th, boolean z) {
    }
}
