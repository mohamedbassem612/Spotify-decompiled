package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xra implements ObservableTransformer {
    public final /* synthetic */ esa a;

    public xra(esa esaVar) {
        this.a = esaVar;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.flatMapSingle(new uq8(this.a, (byte) 3));
    }
}
