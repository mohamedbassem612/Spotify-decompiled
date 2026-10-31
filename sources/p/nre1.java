package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nre1 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ore1 b;

    public /* synthetic */ nre1(ore1 ore1Var, byte b) {
        this.a = b;
        this.b = ore1Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        ore1 ore1Var = this.b;
        switch (b) {
            case 0:
                return observable.switchMap(new h5a1(ore1Var, (byte) 11));
            default:
                return observable.switchMap(new y281((Object) ore1Var, (byte) 20));
        }
    }
}
