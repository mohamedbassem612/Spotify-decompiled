package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pki0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gj10 b;

    public /* synthetic */ pki0(gj10 gj10Var, byte b) {
        this.a = b;
        this.b = gj10Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        gj10 gj10Var = this.b;
        switch (b) {
            case 0:
                return observable.flatMapSingle(new hod0(gj10Var, (byte) 14));
            default:
                return observable.switchMap(new eea0(gj10Var, (byte) 21));
        }
    }
}
