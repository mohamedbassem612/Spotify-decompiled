package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rhn implements qhn {
    public final dma1 b;
    public final kly0 c;
    public final Scheduler d;
    public final Scheduler e;
    public Disposable f = EmptyDisposable.a;

    public rhn(dma1 dma1Var, kly0 kly0Var, Scheduler scheduler, Scheduler scheduler2) {
        this.b = dma1Var;
        this.c = kly0Var;
        this.d = scheduler;
        this.e = scheduler2;
    }
}
