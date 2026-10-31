package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fjp0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final sjw0 b;

    public /* synthetic */ fjp0(sjw0 sjw0Var, byte b) {
        this.a = b;
        this.b = sjw0Var;
    }

    public final ObservableSource apply(Observable observable) {
        switch (this.a) {
            case 0:
                return observable.switchMap(new qkn0(this, (byte) 7)).map(o810.T0);
            default:
                return observable.flatMap(new xq81(this, (byte) 9));
        }
    }
}
