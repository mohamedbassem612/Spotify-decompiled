package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v5u0 implements f961 {
    public final Disposable a;
    public boolean b;

    public v5u0(Flowable flowable, Scheduler scheduler) {
        this.a = flowable.j(mo9.N0).L(scheduler).subscribe(new ixp0(this, (byte) 19));
    }

    public final void shutdown() {
        this.a.dispose();
    }

    public final Object getApi() {
        return this;
    }
}
