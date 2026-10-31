package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tbm {
    public final Flowable a;
    public final Scheduler b;
    public final rku c = new rku();

    public tbm(Flowable flowable, Scheduler scheduler) {
        this.a = flowable;
        this.b = scheduler;
    }
}
