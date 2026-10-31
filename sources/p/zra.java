package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zra implements ObservableTransformer {
    public final /* synthetic */ esa a;

    public zra(esa esaVar) {
        this.a = esaVar;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.flatMap(new fna(this.a, (byte) 1));
    }
}
