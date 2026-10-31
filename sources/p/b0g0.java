package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b0g0 implements dar0 {
    public final axn0 a;
    public final dar0 b;

    public b0g0(axn0 axn0Var, dar0 dar0Var) {
        this.a = axn0Var;
        this.b = dar0Var;
    }

    public final Observable a() {
        Observable observableA = this.b.a();
        axn0 axn0Var = this.a;
        return Observable.merge(observableA, Observable.combineLatest(axn0Var.b, axn0Var.c, ta20.Q0).distinctUntilChanged());
    }
}
