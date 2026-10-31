package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bip0 implements ObservableTransformer {
    public final c23 a;
    public final Scheduler b;
    public final kly0 c;
    public final PublishSubject d;
    public final PublishSubject e;
    public final PublishSubject f;

    public bip0(c23 c23Var, Scheduler scheduler, ykq ykqVar, PublishSubject publishSubject, PublishSubject publishSubject2, PublishSubject publishSubject3) {
        this.a = c23Var;
        this.b = scheduler;
        this.c = ykqVar;
        this.d = publishSubject;
        this.e = publishSubject2;
        this.f = publishSubject3;
    }

    public final ObservableSource apply(Observable observable) {
        return Observable.merge(observable.switchMap(new ewn0(this, (byte) 8)).groupBy(bj20.S0).map(new zud0(this, (byte) 25))).map(new mre0(this, (byte) 20));
    }
}
