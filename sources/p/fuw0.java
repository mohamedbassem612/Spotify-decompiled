package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fuw0 {
    public final Observable a;

    public fuw0(zr00 zr00Var, yh2 yh2Var) {
        this.a = Observable.combineLatest(yoi1.i(zr00Var.a, o6x.a), yh2Var.a(), ws10.e1);
    }
}
