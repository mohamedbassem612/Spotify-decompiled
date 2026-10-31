package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a9c0 implements man {
    public final x8c0 a;
    public final Scheduler b;
    public final lw81 c;

    public a9c0(x8c0 x8c0Var, yqg yqgVar, Scheduler scheduler) {
        this.a = x8c0Var;
        this.b = scheduler;
        this.c = new lw81(yqgVar, scheduler);
    }

    public final Observable a(long j) {
        Observable map = Observable.create(new z8c0(this.a, (byte) 0)).map(sl10.Z);
        Scheduler scheduler = this.b;
        return map.subscribeOn(scheduler).unsubscribeOn(scheduler).distinctUntilChanged().switchMap(new o0g(this, j, (byte) 4)).takeUntil(as10.t);
    }
}
