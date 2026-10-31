package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zn31 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bo31 b;

    public /* synthetic */ zn31(bo31 bo31Var, byte b) {
        this.a = b;
        this.b = bo31Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        bo31 bo31Var = this.b;
        switch (b) {
            case 0:
                return observable.concatMapSingle(new zgz0(bo31Var, (byte) 12));
            case 1:
                return observable.concatMapSingle(new m7y0(bo31Var, (byte) 16));
            case 2:
                return observable.concatMapMaybe(new uqv0(bo31Var, (byte) 27));
            default:
                return observable.take(1L).flatMap(new mlw0(bo31Var, (byte) 24));
        }
    }
}
