package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hx7 {
    public final Scheduler a;
    public final Flowable b;
    public final ix7 c;
    public final b7n d;

    public hx7(Scheduler scheduler, Flowable flowable, ix7 ix7Var, b7n b7nVar) {
        this.a = scheduler;
        this.b = flowable;
        this.c = ix7Var;
        this.d = b7nVar;
    }

    public final Observable a(boolean z) {
        return Observable.combineLatest((ObservableSource) yoi1.i(new hs6(this.d.a(j6n.a), (byte) 3), o6x.a), (ObservableSource) b().map(new m980((byte) 4, z)).toObservable(), (BiFunction) vap1.h);
    }

    public final Single b() {
        return this.b.x(xbp1.i).J(wcp1.h).z().map(new x5j1(this.c, (byte) 24)).subscribeOn(this.a);
    }
}
