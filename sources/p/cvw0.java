package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletablePeek;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cvw0 implements f961 {
    public final jxp a;
    public final jxp b;
    public final BehaviorSubject c;
    public final CompositeDisposable d;

    public cvw0(lmy0 lmy0Var, Scheduler scheduler, sz11 sz11Var, vte0 vte0Var, ph61 ph61Var, jxp jxpVar, jxp jxpVar2) {
        this.a = jxpVar;
        this.b = jxpVar2;
        BehaviorSubject behaviorSubjectF = BehaviorSubject.f();
        this.c = behaviorSubjectF;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.d = compositeDisposable;
        FlowableMap flowableMapJ = vte0Var.a.x(mif1.h1).J(sl10.O0);
        vbm[] vbmVarArr = q601.a;
        kge kgeVar = new kge(flowableMapJ);
        o6x o6xVar = o6x.a;
        compositeDisposable.b(yoi1.i(kgeVar, o6xVar).observeOn(scheduler).doOnNext(new ixp0(this, (byte) 26)).doOnError(p.a1).subscribe());
        CompletablePeek completablePeekH = lmy0Var.b("ap://product-state-update", fft0.g).throttleWithTimeout(500L, TimeUnit.MILLISECONDS).doOnNext(xfs0.W0).switchMapCompletable(new vyq0(this, (byte) 13)).h(xfs0.X0);
        Predicate predicate = Functions.h;
        compositeDisposable.b(completablePeekH.o(predicate).subscribe());
        compositeDisposable.b(yoi1.i(hu20.e(lmy0Var.b, new an6((lnm) null, fft0.Z, (byte) 1)), o6xVar).scan(new mmr0("", ""), zov0.c).skip(2L).filter(va20.d1).doOnNext(xfs0.Y0).flatMapCompletable(new jxp0(this, (byte) 18)).h(xfs0.S0).o(predicate).subscribe());
        compositeDisposable.b(sz11Var.a().filter(ta20.e1).map(ua20.d1).startWith(Observable.just(rih1.a)).subscribeOn(scheduler).switchMapSingle(new jkp0(this, (byte) 22)).doOnNext(xfs0.T0).subscribe((Consumer) new rc6(behaviorSubjectF, (byte) 8)));
        compositeDisposable.b(behaviorSubjectF.subscribe((Consumer) new z0u0(this, ph61Var, (byte) 5)));
    }

    @Override // p.dwo
    public final synchronized void shutdown() {
        this.d.dispose();
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }
}
