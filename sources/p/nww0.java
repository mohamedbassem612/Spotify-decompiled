package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nww0 {
    public final v5n a;
    public final Scheduler b;
    public final Scheduler c;
    public final CompositeDisposable d = new CompositeDisposable();

    public nww0(v5n v5nVar, Scheduler scheduler, Scheduler scheduler2) {
        this.a = v5nVar;
        this.b = scheduler;
        this.c = scheduler2;
    }
}
