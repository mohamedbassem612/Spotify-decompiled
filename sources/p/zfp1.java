package p;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zfp1 extends AbstractOwnableSynchronizer implements Runnable {
    public final mgp1 a;

    public /* synthetic */ zfp1(mgp1 mgp1Var) {
        this.a = mgp1Var;
    }

    public final /* synthetic */ void a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
