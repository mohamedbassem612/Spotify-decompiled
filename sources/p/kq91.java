package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kq91 implements ObservableTransformer {
    public final /* synthetic */ mq91 a;

    public kq91(mq91 mq91Var) {
        this.a = mq91Var;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        return observable.flatMapSingle(new nl51(this.a, (byte) 16));
    }
}
