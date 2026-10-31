package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class asa implements ObservableTransformer {
    public final /* synthetic */ esa a;

    public asa(esa esaVar) {
        this.a = esaVar;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.flatMap(new bv40(this.a, (byte) 28));
    }
}
