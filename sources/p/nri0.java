package p;

import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nri0 extends x7e0 {
    public final tri0 d;
    public final Observable e;
    public final uu00 f;
    public lri0 g = new lri0();
    public final CompositeDisposable h = new CompositeDisposable();

    public nri0(tri0 tri0Var, Observable observable, uu00 uu00Var) {
        this.d = tri0Var;
        this.e = observable;
        this.f = uu00Var;
    }

    public final void e() {
        j();
        Observable observableOnErrorReturnItem = this.e.firstOrError().flatMapObservable(new fdc(this.f, "MembershipUpsell", this.d.a, false, "", (byte) 19)).map(zi20.Y).onErrorReturnItem(new lri0());
        Scheduler scheduler = AndroidSchedulers.a;
        RxAndroidPlugins.b(scheduler);
        this.h.b(observableOnErrorReturnItem.observeOn(scheduler).subscribe(new mri0(this, (byte) 0), new mri0(this, (byte) 1)));
    }

    public final void f() {
        this.h.g();
    }
}
