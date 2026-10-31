package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fgb implements vgn {
    public final Observable a;
    public final Observable b;
    public Disposable c;
    public final dt71 d = mgo1.e(1, 0, 0, 6);

    public fgb(Observable observable, Observable observable2) {
        this.a = observable;
        this.b = observable2;
    }

    @Override // p.vgn
    public final mr20 b() {
        return this.d;
    }
}
