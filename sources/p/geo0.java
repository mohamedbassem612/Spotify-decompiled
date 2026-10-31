package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class geo0 extends r6 implements faa0 {
    public static final geo0 b = new geo0(fkj0.W0);

    @Override // p.faa0
    public final qku F(boolean z, boolean z2, v6a v6aVar) {
        return keo0.a;
    }

    @Override // p.faa0
    public final qku L(iu30 iu30Var) {
        return keo0.a;
    }

    @Override // p.faa0
    public final n561 a() {
        return v7x.a;
    }

    @Override // p.faa0
    public final CancellationException g() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // p.faa0
    public final boolean isActive() {
        return true;
    }

    @Override // p.faa0
    public final boolean isCancelled() {
        return false;
    }

    @Override // p.faa0
    public final Object j(lnm lnmVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // p.faa0
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // p.faa0
    public final boolean v() {
        return false;
    }

    @Override // p.faa0
    public final m0g w(saa0 saa0Var) {
        return keo0.a;
    }

    @Override // p.faa0
    public final void d(CancellationException cancellationException) {
    }
}
