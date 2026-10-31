package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jm8 implements ObservableTransformer {
    public final /* synthetic */ km8 a;

    public jm8(km8 km8Var) {
        this.a = km8Var;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.flatMapSingle(new x5j1(this.a, (byte) 27));
    }
}
