package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kld extends xca {
    public static final /* synthetic */ int h = 0;
    public final Observable f;
    public final CompositeDisposable g;

    public kld(x610 x610Var, o241 o241Var, aos aosVar, Scheduler scheduler) {
        super(x610Var, aosVar);
        this.g = new CompositeDisposable();
        this.f = ((p241) o241Var).b("type").subscribeOn(scheduler).observeOn(scheduler);
    }

    @Override // p.xca
    public final void d() {
        this.g.g();
    }

    @Override // p.xca
    public final void e(q881 q881Var, int i) {
        this.g.b(this.f.subscribe(new ild(this, i, (byte) 0), new jld((byte) 0)));
    }
}
