package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ujs {
    public final l5n a;

    public ujs(l5n l5nVar) {
        this.a = l5nVar;
    }

    public final Observable a(Observable observable, iu30 iu30Var, iu30 iu30Var2) {
        Observable observableSwitchMap = observable.switchMap(new iir(this, iu30Var, iu30Var2));
        l5n l5nVar = this.a;
        l5nVar.getClass();
        return observableSwitchMap.compose(new m5n(zxm.b1, y1a1.H(new v7l(l5nVar, (byte) 25)))).compose(nm3.e);
    }
}
