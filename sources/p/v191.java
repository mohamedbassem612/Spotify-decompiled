package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v191 implements SingleTransformer {
    public final ObservableRefCount a;

    public v191(Observable observable) {
        this.a = observable.replay(1).f();
    }

    @Override // io.reactivex.rxjava3.core.SingleTransformer
    public final Single c(Single single) {
        return Single.zip(single, this.a.first(""), new uh61((byte) 10));
    }
}
