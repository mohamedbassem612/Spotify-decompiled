package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b221 {
    public final boolean a;
    public final byp0 b;
    public final o241 c;

    public b221(boolean z, byp0 byp0Var, o241 o241Var) {
        this.a = z;
        this.b = byp0Var;
        this.c = o241Var;
    }

    public final Observable a(String str) {
        if (this.a) {
            Observable observableTake = Observable.combineLatest(this.b.d(str), this.c.a, r5x0.g).take(1L);
            observableTake.getClass();
            return observableTake;
        }
        Observable observableJust = Observable.just(new c221(false, false));
        observableJust.getClass();
        return observableJust;
    }
}
