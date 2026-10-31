package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dsp0 implements ObservableTransformer {
    public final boolean a;
    public final Single b;

    public dsp0(boolean z, Single single) {
        this.a = z;
        this.b = single;
    }

    @Override // io.reactivex.rxjava3.core.ObservableTransformer
    public final ObservableSource apply(Observable observable) {
        return observable.switchMapSingle(new d4e0(this, (byte) 27));
    }
}
