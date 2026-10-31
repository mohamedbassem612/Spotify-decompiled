package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gzs0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jzs0 b;

    public /* synthetic */ gzs0(jzs0 jzs0Var, byte b) {
        this.a = b;
        this.b = jzs0Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        jzs0 jzs0Var = this.b;
        switch (b) {
            case 0:
                return observable.switchMapMaybe(new jkp0(jzs0Var, (byte) 11));
            default:
                return observable.switchMapCompletable(new vyq0(jzs0Var, (byte) 3)).w();
        }
    }
}
