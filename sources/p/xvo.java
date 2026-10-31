package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xvo {
    public final wvo a;
    public final ObservableRefCount b;

    public xvo(o241 o241Var, wvo wvoVar) {
        this.a = wvoVar;
        this.b = ((p241) o241Var).a("user_access_personalized_recs", "1").map(rbc.V0).onErrorReturn(wdu0.Z).distinctUntilChanged().replay(1).f();
    }

    public final Observable a(boolean z) {
        return this.b.skip(z ? 0L : 1L);
    }
}
