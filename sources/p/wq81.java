package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wq81 implements ObservableTransformer {
    public final /* synthetic */ ar81 a;

    public wq81(ar81 ar81Var) {
        this.a = ar81Var;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        return observable.flatMapSingle(new ks21(this.a, (byte) 22));
    }
}
