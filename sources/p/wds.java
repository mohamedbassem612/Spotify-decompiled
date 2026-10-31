package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class wds implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xds b;

    public /* synthetic */ wds(xds xdsVar, byte b) {
        this.a = b;
        this.b = xdsVar;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        xds xdsVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return xdsVar.d(observable);
    }
}
