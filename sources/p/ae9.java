package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ae9 {
    public final gkb a;
    public final o4o0 b;

    public ae9(gkb gkbVar, o4o0 o4o0Var) {
        this.a = gkbVar;
        this.b = o4o0Var;
    }

    public final Observable a() {
        gkb gkbVar = this.a;
        Observable observableDistinctUntilChanged = gkbVar.d.filter(qzs0.Y).map(rzs0.X).startWithItem(Boolean.valueOf(gkbVar.a())).distinctUntilChanged();
        o4o0 o4o0Var = this.b;
        return Observable.combineLatest(observableDistinctUntilChanged, o4o0Var.d.distinctUntilChanged().startWithItem(Boolean.valueOf(o4o0Var.a())).distinctUntilChanged(), vf61.g);
    }
}
