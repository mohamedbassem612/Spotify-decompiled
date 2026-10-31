package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class evs0 implements f961 {
    public final Flowable a;
    public final yqg b;
    public final t8r0 c;
    public w9u0 d;
    public final vku e = new vku();
    public final ReentrantLock f;

    public evs0(xrp xrpVar, Flowable flowable, yqg yqgVar, t8r0 t8r0Var) {
        this.a = flowable;
        this.b = yqgVar;
        this.c = t8r0Var;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f = reentrantLock;
        reentrantLock.lock();
        try {
            this.d = (w9u0) xrpVar.get();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Single a(int i, iu30 iu30Var) {
        Flowable flowable = this.a;
        return new FlowableSingleSingle(ydh.f(flowable, flowable)).map(new uip0(this, (byte) 10)).doOnSuccess(new a74(iu30Var, (byte) 5)).map(new hn5(i)).flatMap(new l1p0(this, (byte) 14));
    }

    public final void shutdown() {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            this.d = null;
            this.e.c();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Object getApi() {
        return this;
    }
}
