package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vra implements ObservableTransformer {
    public final /* synthetic */ esa a;

    public vra(esa esaVar) {
        this.a = esaVar;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.flatMapSingle(new yo31(this.a, (byte) 29));
    }
}
