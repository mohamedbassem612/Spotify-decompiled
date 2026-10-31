package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t42 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u961 b;

    public /* synthetic */ t42(u961 u961Var, byte b) {
        this.a = b;
        this.b = u961Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        u961 u961Var = this.b;
        switch (b) {
            case 0:
                return observable.switchMapSingle(new bv40(u961Var, (byte) 8));
            default:
                return observable.switchMapSingle(new kr60(u961Var, (byte) 9));
        }
    }
}
