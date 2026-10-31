package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vtw0 implements vgn {
    public final o241 a;
    public final Scheduler b;

    public vtw0(o241 o241Var, Scheduler scheduler) {
        this.a = o241Var;
        this.b = scheduler;
    }

    public static final dgn a(vtw0 vtw0Var, boolean z, boolean z2) {
        String str;
        if (z) {
            str = z2 ? "on-demand" : "shuffle";
        } else {
            str = "free-tier";
        }
        return new dgn(str);
    }

    public final mr20 b() {
        Observable observable = this.a.a;
        return yoi1.g(Observable.combineLatest(observable.map(as10.d1).distinctUntilChanged(), observable.map(qs10.f1).distinctUntilChanged(), new utw0(this)).distinctUntilChanged().subscribeOn(this.b));
    }
}
