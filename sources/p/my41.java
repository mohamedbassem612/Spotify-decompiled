package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class my41 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ny41 b;

    public /* synthetic */ my41(ny41 ny41Var, byte b) {
        this.a = b;
        this.b = ny41Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        ny41 ny41Var = this.b;
        switch (b) {
            case 0:
                return observable.switchMapCompletable(new ij01(ny41Var, (byte) 16)).w();
            default:
                return observable.switchMapCompletable(new n801(ny41Var, (byte) 14)).w();
        }
    }
}
