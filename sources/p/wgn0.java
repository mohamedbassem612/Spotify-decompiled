package p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wgn0 implements mhd, o4l1 {
    public final ohd a;
    public final /* synthetic */ xgn0 b;

    public wgn0(xgn0 xgn0Var, ohd ohdVar) {
        this.b = xgn0Var;
        this.a = ohdVar;
    }

    @Override // p.mhd
    public final jm M(Object obj, xu30 xu30Var) {
        xgn0 xgn0Var = this.b;
        xu30 peaVar = new pea(xgn0Var, this);
        jm jmVarE = this.a.E((rih1) obj, peaVar);
        if (jmVarE != null) {
            xgn0.t.set(xgn0Var, null);
        }
        return jmVarE;
    }

    @Override // p.mhd
    public final void O(Object obj) {
        this.a.O(obj);
    }

    @Override // p.o4l1
    public final void b(hp51 hp51Var, int i) {
        this.a.b(hp51Var, i);
    }

    @Override // p.mhd
    public final void f(Object obj, xu30 xu30Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = xgn0.t;
        xgn0 xgn0Var = this.b;
        atomicReferenceFieldUpdater.set(xgn0Var, null);
        iu30 gv20Var = new gv20(xgn0Var, this);
        this.a.k(gv20Var, (rih1) obj);
    }

    @Override // p.lnm
    public final o8n getContext() {
        return this.a.e;
    }

    @Override // p.mhd
    public final boolean isActive() {
        return this.a.s() instanceof ago0;
    }

    @Override // p.mhd
    public final boolean isCancelled() {
        return this.a.s() instanceof whd;
    }

    @Override // p.mhd
    public final void k(iu30 iu30Var, Object obj) {
        this.a.k(iu30Var, (rih1) obj);
    }

    @Override // p.mhd
    public final void n(iu30 iu30Var) {
        this.a.n(iu30Var);
    }

    @Override // p.mhd
    public final boolean q(Throwable th) {
        return this.a.q(th);
    }

    @Override // p.lnm
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
