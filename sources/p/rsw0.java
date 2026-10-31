package p;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rsw0 extends q6 implements ssw0, jfe {
    public final bbc e;

    public rsw0(o8n o8nVar, bbc bbcVar) {
        super(o8nVar, true, true);
        this.e = bbcVar;
    }

    @Override // p.r261
    public final void B(iu30 iu30Var) {
        this.e.B(iu30Var);
    }

    @Override // p.saa0, p.r261
    public final boolean H(Throwable th) {
        return this.e.e(th, false);
    }

    @Override // p.r261
    public final boolean K() {
        return this.e.K();
    }

    @Override // p.saa0
    public final void S(CancellationException cancellationException) {
        this.e.e(cancellationException, true);
        R(cancellationException);
    }

    @Override // p.r261
    public final Object b(Object obj, lnm lnmVar) {
        return this.e.b(obj, lnmVar);
    }

    @Override // p.saa0, p.faa0
    public final void d(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(U(), null, this);
        }
        S(cancellationException);
    }

    @Override // p.jfe
    public final Object h(a8d1 a8d1Var) {
        bbc bbcVar = this.e;
        bbcVar.getClass();
        return bbc.O(bbcVar, a8d1Var);
    }

    @Override // p.jfe
    public final uac iterator() {
        bbc bbcVar = this.e;
        bbcVar.getClass();
        return new uac(bbcVar);
    }

    @Override // p.r261
    public final Object l(Object obj) {
        return this.e.l(obj);
    }

    @Override // p.jfe
    public final Object r(lnm lnmVar) {
        return this.e.r(lnmVar);
    }

    @Override // p.jfe
    public final zsc s() {
        return this.e.s();
    }

    @Override // p.jfe
    public final zsc t() {
        return this.e.t();
    }

    @Override // p.jfe
    public final Object x() {
        return this.e.x();
    }

    @Override // p.q6
    public final void y0(Throwable th, boolean z) {
        if (this.e.e(th, false) || z) {
            return;
        }
        omo1.p(th, this.d);
    }

    @Override // p.q6
    public final void z0(Object obj) {
        this.e.H(null);
    }

    @Override // p.ssw0
    public final r261 c() {
        return this;
    }
}
