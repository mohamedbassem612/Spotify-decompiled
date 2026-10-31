package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class p9x0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k8x0 b;

    public /* synthetic */ p9x0(k8x0 k8x0Var, byte b) {
        this.a = b;
        this.b = k8x0Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        k8x0 k8x0Var = this.b;
        switch (b) {
            case 0:
                return observable.switchMap(new vgq0(k8x0Var, (byte) 20));
            default:
                return observable.switchMap(new jxp0(k8x0Var, (byte) 20));
        }
    }
}
