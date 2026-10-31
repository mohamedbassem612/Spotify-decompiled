package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uiw implements ObservableTransformer {
    public final /* synthetic */ xaj1 a;

    public uiw(xaj1 xaj1Var) {
        this.a = xaj1Var;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.debounce(100L, TimeUnit.MILLISECONDS).flatMapCompletable(new lqr(this.a, (byte) 22)).w();
    }
}
