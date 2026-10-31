package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xyu {
    public final o241 a;
    public final Observable b;
    public final b7n c;
    public final ynb0 d;
    public final Scheduler e;
    public final Scheduler f;

    public xyu(o241 o241Var, Observable observable, b7n b7nVar, ynb0 ynb0Var, Scheduler scheduler, Scheduler scheduler2) {
        this.a = o241Var;
        this.b = observable;
        this.c = b7nVar;
        this.d = ynb0Var;
        this.e = scheduler;
        this.f = scheduler2;
    }

    public final CompletableSubscribeOn a(String str, String str2, tv80 tv80Var) {
        Completable completableFlatMapCompletable = Observable.zip(this.a.a("offline", "0").map(cq41.Z0), yoi1.i(this.c.a(i6n.a), o6x.a), this.b, uml1.Z0).firstOrError().flatMapCompletable(new mxr(this, str, str2, tv80Var));
        completableFlatMapCompletable.getClass();
        return completableFlatMapCompletable.o(Functions.h).s(this.e);
    }
}
