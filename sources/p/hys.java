package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hys implements Function {
    public final Flowable a;
    public final v5n b;

    public /* synthetic */ hys(Flowable flowable, v5n v5nVar) {
        this.a = flowable;
        this.b = v5nVar;
    }

    public Object apply(Object obj) {
        return new ObservableFromPublisher(this.a).map(xi20.f).filter(yi20.f).firstOrError().flatMap(new dh30(((kt60) obj).b, this.b, (byte) 19)).toObservable().onErrorResumeNext(sa20.f);
    }
}
