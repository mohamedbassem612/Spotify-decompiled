package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z1e0 implements ObservableTransformer {
    public final r961 a;
    public final yo31 b;
    public final t4d1 c;
    public final ytp0 d;
    public final ow3 e;

    public z1e0(r961 r961Var, yo31 yo31Var, t4d1 t4d1Var, ytp0 ytp0Var, ow3 ow3Var) {
        this.a = r961Var;
        this.b = yo31Var;
        this.c = t4d1Var;
        this.d = ytp0Var;
        this.e = ow3Var;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.switchMapSingle(new eb80(this, (byte) 15));
    }
}
