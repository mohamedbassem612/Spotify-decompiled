package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m4t implements ObservableTransformer {
    public final /* synthetic */ long a;
    public final /* synthetic */ n4t b;

    public m4t(long j, n4t n4tVar) {
        this.a = j;
        this.b = n4tVar;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.flatMap(new o0g(this.a, this.b, (byte) 1));
    }
}
