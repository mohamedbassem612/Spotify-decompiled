package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zj1 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final txz0 b;

    public /* synthetic */ zj1(txz0 txz0Var, byte b) {
        this.a = b;
        this.b = txz0Var;
    }

    public final ObservableSource apply(Observable observable) {
        switch (this.a) {
            case 0:
                return observable.switchMapSingle(new w4b1(this, (byte) 9));
            default:
                return observable.switchMapSingle(new m7y0(this, (byte) 11));
        }
    }
}
