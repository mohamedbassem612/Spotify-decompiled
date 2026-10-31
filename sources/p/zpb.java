package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zpb implements f961 {
    public final CompositeDisposable a;
    public final BehaviorSubject b;

    public zpb(bvw0 bvw0Var, fqb fqbVar, Scheduler scheduler) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.a = compositeDisposable;
        BehaviorSubject behaviorSubjectG = BehaviorSubject.g(xpb.a);
        this.b = behaviorSubjectG;
        compositeDisposable.b(behaviorSubjectG.doOnNext(p.h).subscribe());
        compositeDisposable.b(Single.fromCallable(new sra(bvw0Var, (byte) 17)).onErrorReturn(avw0.b).subscribeOn(bvw0Var.b).flatMap(new l7m0(fqbVar, (byte) 7)).subscribeOn(scheduler).doOnSuccess(new xu(this, (byte) 15)).doOnError(new mba(this, (byte) 9)).onErrorComplete().subscribe());
    }

    @Override // p.dwo
    public final void shutdown() {
        this.a.g();
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }
}
