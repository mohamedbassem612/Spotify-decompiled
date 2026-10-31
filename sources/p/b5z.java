package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b5z implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nt8 b;

    public /* synthetic */ b5z(nt8 nt8Var, byte b) {
        this.a = b;
        this.b = nt8Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        nt8 nt8Var = this.b;
        switch (b) {
            case 0:
                return observable.switchMap(new mev(nt8Var, (byte) 7));
            case 1:
                return observable.flatMapCompletable(new h0y(nt8Var, (byte) 3)).w();
            case 2:
                return observable.flatMapCompletable(new zgz0(nt8Var, (byte) 25)).w();
            default:
                return observable.switchMap(new m7y0(nt8Var, (byte) 28));
        }
    }
}
