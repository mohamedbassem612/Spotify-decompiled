package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nam0 extends Observable {
    public final mr20 a;
    public final /* synthetic */ sam0 b;

    public nam0(sam0 sam0Var, mr20 mr20Var) {
        this.b = sam0Var;
        this.a = mr20Var;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        yoi1.i(this.a, o6x.a).observeOn(this.b.b.h()).subscribe((Observer) new mam0(this, observer));
    }
}
