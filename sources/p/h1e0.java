package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h1e0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final tjh b;

    public /* synthetic */ h1e0(tjh tjhVar, byte b) {
        this.a = b;
        this.b = tjhVar;
    }

    public final ObservableSource apply(Observable observable) {
        switch (this.a) {
            case 0:
                return observable.switchMapSingle(new eea0(this, (byte) 11));
            case 1:
                return observable.switchMapSingle(new hod0(this, (byte) 4));
            case 2:
                return observable.switchMapSingle(new z8c0(this, (byte) 8));
            default:
                return observable.switchMapCompletable(new ij01(this, (byte) 3)).w();
        }
    }
}
