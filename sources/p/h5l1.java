package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h5l1 implements o5s {
    public final Observable X;
    public final fmy0 a;
    public final ecl b;
    public final Scheduler c;
    public final Scheduler d;
    public final c5l1 e;
    public final dwe0 f;
    public final boolean g;
    public final juk h;
    public final CompositeDisposable i = new CompositeDisposable();
    public boolean t;

    public h5l1(x8c0 x8c0Var, fmy0 fmy0Var, ecl eclVar, Scheduler scheduler, Scheduler scheduler2, c5l1 c5l1Var, Observable observable, dwe0 dwe0Var, boolean z, juk jukVar) {
        this.a = fmy0Var;
        this.b = eclVar;
        this.c = scheduler;
        this.d = scheduler2;
        this.e = c5l1Var;
        this.f = dwe0Var;
        this.g = z;
        this.h = jukVar;
        x8c0Var.a(this);
        this.X = observable.filter(r6x0.Y0).cast(b141.class);
    }

    public final void a() {
        Single singleOnErrorReturn;
        boolean z = this.g;
        Scheduler scheduler = this.c;
        if (z) {
            singleOnErrorReturn = Single.fromCallable(new sra(this, (byte) 29)).onErrorReturn(p5x0.X0).subscribeOn(scheduler);
            singleOnErrorReturn.getClass();
        } else {
            singleOnErrorReturn = rqt0.F(w0h1.h(scheduler), new w621(this, (lnm) null, (byte) 27)).onErrorReturn(r5x0.Z0);
            singleOnErrorReturn.getClass();
        }
        this.i.b(singleOnErrorReturn.flatMapObservable(new csj1(this, (byte) 4)).doOnSubscribe(new vlk1(this, (byte) 4)).doOnDispose(new ruz0(this, (byte) 24)).observeOn(this.d).subscribe((Consumer) new rdj1(this, (byte) 12)));
    }

    public final void onStart(iac0 iac0Var) {
        if (this.t) {
            a();
        }
    }

    public final void onStop(iac0 iac0Var) {
        this.i.g();
    }
}
