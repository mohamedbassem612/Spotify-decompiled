package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ckf0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wlk1 b;

    public /* synthetic */ ckf0(wlk1 wlk1Var, byte b) {
        this.a = b;
        this.b = wlk1Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        wlk1 wlk1Var = this.b;
        switch (b) {
            case 0:
                return observable.switchMap(new hod0(wlk1Var, (byte) 7));
            case 1:
                return observable.switchMap(new z8c0(wlk1Var, (byte) 11));
            default:
                return observable.switchMap(new upa0(wlk1Var, (byte) 16));
        }
    }
}
