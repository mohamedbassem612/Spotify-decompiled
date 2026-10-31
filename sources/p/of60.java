package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class of60 {
    public final o241 a;

    public of60(o241 o241Var) {
        this.a = o241Var;
    }

    public final Observable a() {
        return this.a.a.map(o810.f);
    }

    public final Observable b() {
        return this.a.a.map(yb10.f).distinctUntilChanged();
    }
}
