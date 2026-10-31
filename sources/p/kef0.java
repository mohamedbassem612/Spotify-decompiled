package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kef0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lnf0 b;

    public /* synthetic */ kef0(lnf0 lnf0Var, byte b) {
        this.a = b;
        this.b = lnf0Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        lnf0 lnf0Var = this.b;
        switch (b) {
            case 0:
                return observable.switchMap(new zud0(lnf0Var, (byte) 5));
            default:
                return observable.switchMap(new zc80(lnf0Var, (byte) 17));
        }
    }
}
