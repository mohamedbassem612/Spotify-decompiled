package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cz1 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final on01 b;

    public /* synthetic */ cz1(on01 on01Var, byte b) {
        this.a = b;
        this.b = on01Var;
    }

    public final ObservableSource apply(Observable observable) {
        switch (this.a) {
            case 0:
                return observable.flatMap(new t4d1(this, (byte) 6));
            case 1:
                return observable.flatMap(new x5j1(this, (byte) 8));
            case 2:
                return observable.flatMap(new lan1(this, (byte) 8));
            case 3:
                return observable.flatMap(new ps7(this, (byte) 20));
            default:
                return observable.flatMap(new n801((Object) this, (byte) 5));
        }
    }
}
