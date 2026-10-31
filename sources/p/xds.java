package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableTransformer;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xds implements ObservableTransformer, SingleTransformer, FlowableTransformer {
    public final iu30 a;
    public final iu30 b;
    public final iu30 c;

    public xds(iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3) {
        this.a = iu30Var;
        this.b = iu30Var2;
        this.c = iu30Var3;
    }

    public static final Observable b(xds xdsVar, Throwable th) {
        Observable observableJust;
        xsq0 xsq0Var = ((Boolean) xdsVar.c.invoke(th)).booleanValue() ? new xsq0(th) : null;
        return (xsq0Var == null || (observableJust = Observable.just(xsq0Var)) == null) ? Observable.error(th) : observableJust;
    }

    public final moy0 a(Flowable flowable) {
        return new ObservableFromPublisher(flowable).compose(new wds(this, (byte) 2)).toFlowable(BackpressureStrategy.d);
    }

    public final ObservableSource apply(Observable observable) {
        return observable.compose(new wds(this, (byte) 0));
    }

    public final Single c(Single single) {
        return single.toObservable().compose(new wds(this, (byte) 1)).firstOrError();
    }

    public final Observable d(Observable observable) {
        return observable.flatMap(new rjn((Object) this, (byte) 16)).onErrorResumeNext(new dp5(this, (byte) 14)).doOnNext(fcc.T0).doOnError(fcc.U0);
    }
}
