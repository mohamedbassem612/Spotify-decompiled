package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bb41 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ co70 b;

    public /* synthetic */ bb41(co70 co70Var, byte b) {
        this.a = b;
        this.b = co70Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        co70 co70Var = this.b;
        switch (b) {
            case 0:
                return observable.switchMap(new m7y0(co70Var, (byte) 19));
            case 1:
                return observable.switchMap(new mlw0(co70Var, (byte) 26));
            case 2:
                return observable.switchMap(new vqv0(co70Var, (byte) 29));
            case 3:
                return observable.switchMap(new ep31(co70Var, (byte) 3));
            default:
                return observable.switchMap(new bb01(co70Var, (byte) 14));
        }
    }
}
