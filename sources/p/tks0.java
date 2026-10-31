package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tks0 {
    public final zq4 a;
    public final Runnable b;
    public final Observable c;
    public final kc00 d;
    public volatile Disposable e = EmptyDisposable.a;
    public final PublishSubject f = new PublishSubject();

    public tks0(zq4 zq4Var, ic00 ic00Var, Observable observable, kc00 kc00Var) {
        this.a = zq4Var;
        this.b = ic00Var;
        this.c = observable;
        this.d = kc00Var;
    }

    public final synchronized void a() {
        this.f.onNext(new i5w0(rih1.a));
    }

    public final synchronized void b() {
        if (this.e.isDisposed()) {
            Integer numB = adn0.b(((adn0) ((den0) this.d.b).get()).a);
            long jIntValue = numB != null ? numB.intValue() : 30;
            Observable map = Observable.interval(jIntValue, jIntValue, TimeUnit.SECONDS).map(f610.V0);
            j5 j5Var = j5.a;
            this.e = Observable.combineLatest(Observable.combineLatest(map.startWithItem(j5Var), this.f.startWithItem(j5Var), bk20.V0).filter(b610.W0), this.c.distinctUntilChanged().onErrorReturnItem(Boolean.FALSE), y580.n1).filter(ak20.T0).observeOn(Schedulers.c).concatMapCompletable(new sks0(this, (byte) 0)).subscribe(new wqd0(this, (byte) 16), new ixp0(this, (byte) 14));
        }
    }
}
