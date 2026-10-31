package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xqd {
    public final aia0 a;
    public final crd b;
    public final Observable c;
    public final Observable d;
    public final CompositeDisposable e = new CompositeDisposable();
    public boolean f;
    public volatile boolean g;
    public volatile boolean h;

    public xqd(aia0 aia0Var, crd crdVar, Observable observable, Observable observable2) {
        this.a = aia0Var;
        this.b = crdVar;
        this.c = observable;
        this.d = observable2;
    }
}
