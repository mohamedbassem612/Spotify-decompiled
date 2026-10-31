package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kiu0 {
    public final xvo a;
    public final jh4 b;
    public final o241 c;

    public kiu0(xvo xvoVar, jh4 jh4Var, o241 o241Var) {
        this.a = xvoVar;
        this.b = jh4Var;
        this.c = o241Var;
    }

    public final Observable a(boolean z) {
        return Observable.combineLatest(((p241) this.c).a.map(yj20.Y0), z ? this.a.a(true) : Observable.just(Boolean.FALSE), zj20.X0);
    }
}
