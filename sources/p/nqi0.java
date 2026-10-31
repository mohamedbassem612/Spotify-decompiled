package p;

import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nqi0 extends x7e0 {
    public final sqi0 d;
    public final Observable e;
    public final uu00 f;
    public final zrj1 g;
    public lqi0 h;
    public String i;
    public final CompositeDisposable t = new CompositeDisposable();

    public nqi0(sqi0 sqi0Var, Observable observable, uu00 uu00Var, zrj1 zrj1Var) {
        this.d = sqi0Var;
        this.e = observable;
        this.f = uu00Var;
        this.g = zrj1Var;
        this.h = new lqi0(sqi0Var.b);
    }

    public final void e() {
        Single singleOnErrorReturn;
        j();
        sqi0 sqi0Var = this.d;
        String str = sqi0Var.b;
        String str2 = sqi0Var.a;
        zrj1 zrj1Var = this.g;
        if (((asi0) zrj1Var.c).a.b()) {
            singleOnErrorReturn = ((e781) zrj1Var.b).a(ihc1.X0(str2, ":")).timeout(5000L, TimeUnit.MILLISECONDS, (Scheduler) zrj1Var.d).map(gex0.X0).onErrorReturn(hgx0.Y0);
        } else {
            singleOnErrorReturn = Single.just(Optional.empty());
        }
        Scheduler scheduler = AndroidSchedulers.a;
        RxAndroidPlugins.b(scheduler);
        Disposable disposableSubscribe = singleOnErrorReturn.observeOn(scheduler).subscribe(new mqi0(this, (byte) 0));
        CompositeDisposable compositeDisposable = this.t;
        compositeDisposable.b(disposableSubscribe);
        compositeDisposable.b(this.e.firstOrError().flatMapObservable(new fdc(this.f, "MembershipConfirmation", str2, true, str, (byte) 19)).map(xi20.P0).onErrorReturnItem(new lqi0(str)).observeOn(scheduler).subscribe(new mqi0(this, (byte) 1), new mqi0(this, (byte) 2)));
    }

    public final void f() {
        this.t.g();
    }
}
