package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jbs0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lbs0 b;

    public /* synthetic */ jbs0(lbs0 lbs0Var, byte b) {
        this.a = b;
        this.b = lbs0Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        lbs0 lbs0Var = this.b;
        switch (b) {
            case 0:
                return observable.flatMap(new jxp0(lbs0Var, (byte) 5));
            default:
                return Observable.wrap(observable.flatMapSingle(new vgq0(lbs0Var.a, (byte) 3))).map(new jkp0(lbs0Var, (byte) 8));
        }
    }
}
