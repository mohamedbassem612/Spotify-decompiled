package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ye11 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final ze11 b;

    public /* synthetic */ ye11(ze11 ze11Var, eto0 eto0Var, byte b) {
        this.a = b;
        this.b = ze11Var;
    }

    public final ObservableSource apply(Observable observable) {
        switch (this.a) {
            case 0:
                return observable.flatMapSingle(new s6z0(this, (byte) 8));
            default:
                return observable.flatMapSingle(new uqv0(this, (byte) 20));
        }
    }
}
