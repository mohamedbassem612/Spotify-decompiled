package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rwf0 implements ObservableTransformer {
    public final /* synthetic */ wwf0 a;
    public final /* synthetic */ nxf0 b;

    public rwf0(wwf0 wwf0Var, nxf0 nxf0Var) {
        this.a = wwf0Var;
        this.b = nxf0Var;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.flatMapSingle(new yge0(this.a, this.b, (byte) 9));
    }
}
