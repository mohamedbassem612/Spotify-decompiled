package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.rxjava3.internal.operators.completable.CompletablePeek;
import io.reactivex.rxjava3.schedulers.Schedulers;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vz11 implements f961 {
    public final Scheduler a;
    public final d021 b;
    public final aq80 c;
    public final Optional d;
    public final CompositeDisposable e;
    public final AtomicLong f;
    public final BehaviorSubject g;

    public vz11(Scheduler scheduler, d021 d021Var, avw0 avw0Var, aq80 aq80Var, Optional optional) {
        this.a = scheduler;
        this.b = d021Var;
        this.c = aq80Var;
        this.d = optional;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.e = compositeDisposable;
        this.f = new AtomicLong(0L);
        this.g = BehaviorSubject.g(ieh1.a);
        Single singleA = d021Var.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        compositeDisposable.b(singleA.timeout(5000L, timeUnit, scheduler).onErrorReturnItem(e3c1.a).flatMapCompletable(new rpv0(this, (byte) 19)).t(15000L, timeUnit, Schedulers.b, null).h(new uz11(this, (byte) 0)).o(Functions.h).subscribe());
    }

    public final CompletableOnErrorComplete a(x020 x020Var) {
        CompletablePeek completablePeekH = this.b.b(x020Var).compose(new hyy0(x020Var, this, (byte) 24)).subscribeOn(this.a).doOnSubscribe(p.d1).doOnSuccess(new dy40(this, (byte) 20)).ignoreElement().h(new uz11(this, (byte) 1));
        uz11 uz11Var = new uz11(this, (byte) 2);
        Consumer consumer = Functions.d;
        Action action = Functions.c;
        return completablePeekH.i(uz11Var, consumer, action, action, action, action).h(new uz11(this, (byte) 3)).o(Functions.h);
    }

    public final Completable b() {
        Completable completableIgnoreElement;
        BehaviorSubject behaviorSubject = (BehaviorSubject) this.d.orElse(null);
        return (behaviorSubject == null || (completableIgnoreElement = behaviorSubject.filter(r3x0.g).firstOrError().timeout(5L, TimeUnit.SECONDS, this.a).ignoreElement()) == null) ? CompletableEmpty.a : completableIgnoreElement;
    }

    @Override // p.dwo
    public final void shutdown() {
        this.e.g();
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }
}
