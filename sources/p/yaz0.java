package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yaz0 implements waz0 {
    public final eh4 a;
    public final rh11 b;
    public final o241 c;
    public final qns0 d;
    public final Flowable e;
    public final krh f;
    public final Scheduler g;
    public volatile bbz0 h;
    public final Observable i;

    public yaz0(eh4 eh4Var, rh11 rh11Var, o241 o241Var, qns0 qns0Var, Flowable flowable, krh krhVar, Scheduler scheduler) {
        this.a = eh4Var;
        this.b = rh11Var;
        this.c = o241Var;
        this.d = qns0Var;
        this.e = flowable;
        this.f = krhVar;
        this.g = scheduler;
        zaz0 zaz0Var = zaz0.c;
        Set set = abz0.a;
        bbz0 bbz0Var = new bbz0(true, 3, ujo1.m(), ujo1.m(), ujo1.m(), ujo1.m(), ujo1.m(), true, ujo1.m(), ujo1.m(), false, false, (t380) null, 12288);
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.h = bbz0Var;
        Observable observableA = Observable.combineLatest(Observable.defer(new yj1(this, (byte) 24)).doOnError(mux0.X).retryWhen(new xaz0(this, (byte) 0)), Observable.defer(new o900(this, (byte) 2)).doOnError(mux0.Y).retryWhen(new vyq0(this, (byte) 24)).startWithItem(zaz0Var), new gtv0(this)).distinctUntilChanged().replay(1).a(1);
        this.i = observableA;
        compositeDisposable.b(((p241) o241Var).a.distinctUntilChanged().retryWhen(new jxp0(this, (byte) 27)).subscribe(new jkt0(this, (byte) 4), p.b1));
        compositeDisposable.b(observableA.subscribe(new lyw0(this, (byte) 10), mux0.t));
    }

    @Override // p.waz0
    public final bbz0 a() {
        return this.h;
    }

    @Override // p.waz0
    public final boolean b(bbz0 bbz0Var, String str) {
        abz0 abz0Var;
        Set set = bbz0Var.k;
        Set set2 = abz0.a;
        if (u890.j(set, ujo1.o())) {
            return false;
        }
        Set set3 = s4b1.f;
        int iOrdinal = uic.x(str).c.ordinal();
        if (iOrdinal == 416) {
            abz0Var = abz0.c;
        } else if (iOrdinal != 844) {
            if (iOrdinal != 926) {
                return false;
            }
            abz0Var = abz0.c;
        } else {
            abz0Var = abz0.d;
        }
        return set.contains(abz0Var);
    }

    @Override // p.waz0
    public final Observable c() {
        return this.i;
    }

    @Override // p.waz0
    public final Flowable d() {
        return this.i.toFlowable(BackpressureStrategy.d);
    }

    @Override // p.waz0
    public final mr20 e() {
        return yoi1.g(this.i);
    }

    public final boolean f(Map map) {
        if (y7y0.G(map)) {
            return false;
        }
        this.b.getClass();
        return rh11.c(map);
    }
}
