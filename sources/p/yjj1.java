package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yjj1 {
    public final Observable a;
    public final Observable b;
    public final Observable c;
    public final Flowable d;
    public final yna e;
    public final v290 f;
    public final BehaviorSubject g = BehaviorSubject.g(Boolean.TRUE);
    public final BehaviorSubject h = BehaviorSubject.g(Boolean.FALSE);
    public final PublishSubject i = new PublishSubject();
    public final Observable j;

    public yjj1(Observable observable, Observable observable2, Observable observable3, Flowable flowable, yna ynaVar, v290 v290Var) {
        this.a = observable;
        this.b = observable2;
        this.c = observable3;
        this.d = flowable;
        this.e = ynaVar;
        this.f = v290Var;
        this.j = new ObservableFromPublisher(flowable.x(gtv0.i).x(vbx0.V0).J(wbx0.W0).t(Functions.a)).map(s9x0.V0).distinctUntilChanged().switchMap(new h5a1(this, (byte) 21)).replay(1).a(1);
    }

    public final Observable a() {
        return Observable.combineLatest(this.a, this.b, this.c.map(ybx0.W0), new ObservableFromPublisher(this.d.x(gtv0.i).x(vbx0.V0).J(wbx0.W0).t(Functions.a)), this.j, this.g, this.h, new lxh1(this, (byte) 3)).distinctUntilChanged();
    }
}
