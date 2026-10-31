package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p1v0 implements l1v0, f961 {
    public final dw4 a;
    public final onf0 b;
    public final pmf0 c;
    public final nmf0 d;
    public final kyl1 e;
    public final Scheduler f;
    public final CompositeDisposable g = new CompositeDisposable();

    public p1v0(dw4 dw4Var, onf0 onf0Var, pmf0 pmf0Var, nmf0 nmf0Var, kyl1 kyl1Var, Scheduler scheduler) {
        this.a = dw4Var;
        this.b = onf0Var;
        this.c = pmf0Var;
        this.d = nmf0Var;
        this.e = kyl1Var;
        this.f = scheduler;
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }

    @Override // p.dwo
    public final void shutdown() {
    }
}
