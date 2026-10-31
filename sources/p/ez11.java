package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ez11 implements f961, luk {
    public final lw21 a;
    public final CompositeDisposable b;

    public ez11(zc00 zc00Var, lw21 lw21Var, vte0 vte0Var) {
        this.a = lw21Var;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.b = compositeDisposable;
        FlowableMap flowableMapJ = vte0Var.a.x(mif1.h1).J(sl10.O0);
        vbm[] vbmVarArr = q601.a;
        compositeDisposable.b(yoi1.i(new kge(flowableMapJ), o6x.a).doOnNext(new lyw0(this, (byte) 24)).doOnError(p.c1).subscribe());
        vwz0 vwz0Var = new vwz0(this, (byte) 22);
        PublishSubject publishSubject = zc00Var.c;
        String strA = ((c3n0) zc00Var.a.get()).a();
        zc00Var.b = publishSubject.startWith(Observable.just(Boolean.valueOf(!(strA == null || ihc1.y0(strA))))).filter(vf61.S0).map(mm10.j1).take(1L).subscribe((Consumer) new cfs(vwz0Var, (byte) 24));
    }

    @Override // p.luk
    public final pdy0 e(ydy0 ydy0Var) {
        return this.a.e(ydy0Var);
    }

    @Override // p.dwo
    public final synchronized void shutdown() {
        this.b.g();
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }
}
