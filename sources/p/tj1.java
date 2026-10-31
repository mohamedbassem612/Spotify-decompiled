package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tj1 implements ObservableTransformer {
    public final /* synthetic */ byte a = 0;
    public final mzr0 b;
    public final km3 c;

    public tj1(mzr0 mzr0Var, km3 km3Var) {
        this.b = mzr0Var;
        this.c = km3Var;
    }

    public final ObservableSource apply(Observable observable) {
        switch (this.a) {
            case 0:
                return observable.flatMap(new kr60(this, (byte) 7));
            default:
                return observable.switchMap(new a1g1(this, (byte) 5));
        }
    }

    public tj1(mzr0 mzr0Var, mka mkaVar, km3 km3Var) {
        this.b = mzr0Var;
        this.c = km3Var;
    }
}
