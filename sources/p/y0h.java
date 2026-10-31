package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y0h implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bk1 b;

    public /* synthetic */ y0h(bk1 bk1Var, byte b) {
        this.a = b;
        this.b = bk1Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        bk1 bk1Var = this.b;
        switch (b) {
            case 0:
                return observable.map(s321.Q0).compose(bk1Var);
            case 1:
                return observable.map(s9x0.h).compose(bk1Var);
            default:
                return observable.map(e2x0.t).compose(bk1Var);
        }
    }
}
