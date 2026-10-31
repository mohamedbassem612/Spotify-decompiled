package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h11 implements ObservableTransformer {
    public final /* synthetic */ u11 a;

    public h11(u11 u11Var) {
        this.a = u11Var;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        return observable.switchMap(new x6o0(this.a, (byte) 6));
    }
}
