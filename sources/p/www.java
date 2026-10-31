package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class www implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hr81 b;

    public /* synthetic */ www(hr81 hr81Var, byte b) {
        this.a = b;
        this.b = hr81Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        hr81 hr81Var = this.b;
        switch (b) {
            case 0:
                return observable.switchMap(new xap(hr81Var, (byte) 26));
            default:
                return observable.switchMap(new l1p0(hr81Var, (byte) 11));
        }
    }
}
