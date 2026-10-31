package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uqn implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final c23 b;

    public /* synthetic */ uqn(c23 c23Var, byte b) {
        this.a = b;
        this.b = c23Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        a33 a33Var = a33.a;
        switch (b) {
            case 0:
                return observable.switchMap(new n4b(this, (byte) 18)).onErrorReturnItem(a33Var);
            case 1:
                return observable.switchMap(new rpv0(this, (byte) 17)).onErrorReturnItem(a33Var);
            case 2:
                return observable.switchMap(new s6z0(this, (byte) 13));
            default:
                return observable.flatMap(new n801(this, (byte) 18));
        }
    }
}
