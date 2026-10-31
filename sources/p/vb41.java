package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vb41 implements ma41 {
    public final Scheduler a;
    public final Scheduler b;
    public final Scheduler c;
    public final v5n d;
    public final Flowable e;
    public final co70 f;
    public final oi i;
    public final idd1 j;
    public boolean l;
    public boolean m;
    public boolean n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f90p;
    public final PublishSubject g = new PublishSubject();
    public final BehaviorSubject h = BehaviorSubject.g(new xb41());
    public Disposable k = EmptyDisposable.a;
    public final idd1 o = new idd1(new g521(this, (byte) 17));

    public vb41(RetrofitMaker retrofitMaker, Scheduler scheduler, Scheduler scheduler2, Scheduler scheduler3, v5n v5nVar, Flowable flowable, co70 co70Var, g420 g420Var) {
        this.a = scheduler;
        this.b = scheduler2;
        this.c = scheduler3;
        this.d = v5nVar;
        this.e = flowable;
        this.f = co70Var;
        this.i = g420Var.a();
        this.j = new idd1(new l5v0(retrofitMaker, (byte) 9));
    }

    public final void a() {
        if (!this.f90p || (!this.n && !this.l)) {
            if (this.k.isDisposed()) {
                return;
            }
            this.k.dispose();
        } else if (this.k.isDisposed()) {
            Observable observableCompose = Observable.never().compose(RxMobius.b(l1d.g(Mobius.d(qb41.a, RxConnectables.a(cb41.a(this.b, this.d, this.i, this.f, (s080) this.j.getValue(), this.e))).b(new rb41(this)).d(new sb41(this)).h(op71.D(this.g))), new wb41()));
            Scheduler scheduler = this.a;
            this.k = observableCompose.subscribeOn(scheduler).observeOn(scheduler).subscribe((Consumer) new ub41(this, (byte) 1));
        }
    }
}
