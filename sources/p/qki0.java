package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qki0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rki0 b;

    public /* synthetic */ qki0(rki0 rki0Var, byte b) {
        this.a = b;
        this.b = rki0Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        rki0 rki0Var = this.b;
        switch (b) {
            case 0:
                return observable.switchMap(new zc80(rki0Var, (byte) 23));
            case 1:
                return observable.switchMap(new z8c0(rki0Var, (byte) 17));
            default:
                return observable.switchMap(new dg90(rki0Var, (byte) 24));
        }
    }
}
