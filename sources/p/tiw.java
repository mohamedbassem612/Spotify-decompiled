package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tiw implements ObservableTransformer {
    public final /* synthetic */ iu30 a;

    public tiw(iu30 iu30Var) {
        this.a = iu30Var;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.flatMapCompletable(new hyr(this.a, (byte) 2)).w();
    }
}
