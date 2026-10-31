package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wbv0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yeu0 b;

    public /* synthetic */ wbv0(yeu0 yeu0Var, byte b) {
        this.a = b;
        this.b = yeu0Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        yeu0 yeu0Var = this.b;
        switch (b) {
            case 0:
                return observable.flatMap(new vgq0(yeu0Var, (byte) 14));
            default:
                return observable.flatMap(new rut0(yeu0Var, (byte) 6));
        }
    }
}
