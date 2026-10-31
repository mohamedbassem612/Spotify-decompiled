package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class obl1 {
    public final lvc1 a;
    public final Scheduler b;
    public final Scheduler c;
    public final zn90 d;
    public final Observable g;
    public BehaviorSubject e = BehaviorSubject.f();
    public final rku f = new rku();
    public final BehaviorSubject h = BehaviorSubject.f();

    public obl1(lvc1 lvc1Var, yua yuaVar, Scheduler scheduler, Scheduler scheduler2, zn90 zn90Var, ueg1 ueg1Var) {
        this.a = lvc1Var;
        this.b = scheduler;
        this.c = scheduler2;
        this.d = zn90Var;
        this.g = ueg1Var.t1();
    }

    public final void a(String str) {
        rku rkuVar = this.f;
        rkuVar.a();
        this.e = BehaviorSubject.f();
        rkuVar.b(Observable.zip(this.g, Single.defer(new xf0(this.a, str, (byte) 16)).toObservable(), n9x0.X0).observeOn(this.b).flatMapSingle(new f2g1(this, (byte) 13)).doOnNext(new nbl1(this, (byte) 0)).doOnError(new nbl1(this, (byte) 1)).onErrorComplete().subscribe());
    }

    public final Observable b(Observable observable) {
        return observable.switchMap(o9x0.W0).withLatestFrom(this.e, s9x0.X0).map(new m4c(this, (byte) 29)).distinctUntilChanged().observeOn(this.c);
    }
}
