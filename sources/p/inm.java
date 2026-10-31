package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class inm {
    public final Scheduler a;
    public final Scheduler b;
    public final Observable c;
    public final fnm d;
    public final gqr e;
    public final jo91 f;
    public final BehaviorSubject g = BehaviorSubject.g(Boolean.FALSE);

    public inm(Scheduler scheduler, Scheduler scheduler2, Observable observable, fnm fnmVar, hfb hfbVar, gqr gqrVar, jo91 jo91Var) {
        this.a = scheduler;
        this.b = scheduler2;
        this.c = observable;
        this.d = fnmVar;
        this.e = gqrVar;
        this.f = jo91Var;
    }

    public final Observable a(String str, enm enmVar) {
        rku rkuVar = new rku();
        y6b1 y6b1VarU = tto1.u(str);
        return y6b1VarU == null ? Observable.just(new gnm((Boolean) null)) : Observable.combineLatest(this.c.distinctUntilChanged(), enmVar.b(), this.g, fkj0.Z).observeOn(this.b).concatMap(new v1k(this, str, y6b1VarU, (byte) 22)).distinctUntilChanged().doFinally(new hnm(rkuVar, (byte) 0)).subscribeOn(this.a);
    }
}
