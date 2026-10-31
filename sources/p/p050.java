package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p050 implements ObservableTransformer {
    public final /* synthetic */ r050 a;

    public p050(r050 r050Var) {
        this.a = r050Var;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.switchMap(new wb00(this.a, (byte) 12));
    }
}
