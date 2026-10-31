package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class od61 {
    public final d6b1 a;
    public final zwz0 b;
    public final Observable c;

    public od61(Flowable flowable, Scheduler scheduler, d6b1 d6b1Var, zwz0 zwz0Var) {
        this.a = d6b1Var;
        this.b = zwz0Var;
        this.c = new ObservableFromPublisher(new FlowableTake(flowable.x(f4x0.i))).switchMap(new xaz0(this, (byte) 25)).observeOn(scheduler).doOnNext(new tr41(this, (byte) 5));
    }
}
