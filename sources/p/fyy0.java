package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fyy0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final goc1 b;

    public /* synthetic */ fyy0(goc1 goc1Var, byte b) {
        this.a = b;
        this.b = goc1Var;
    }

    public final ObservableSource apply(Observable observable) {
        switch (this.a) {
            case 0:
                return observable.flatMapSingle(new sjb((byte) 21));
            default:
                return observable.flatMapSingle(new ekb((byte) 21));
        }
    }
}
