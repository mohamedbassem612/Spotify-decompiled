package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sh50 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jh50 b;

    public /* synthetic */ sh50(jh50 jh50Var, byte b) {
        this.a = b;
        this.b = jh50Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        jh50 jh50Var = this.b;
        switch (b) {
            case 0:
                return observable.concatMap(new h0y(jh50Var, (byte) 20)).map(kc20.e);
            default:
                return observable.flatMap(new mjv(jh50Var, (byte) 22)).map(ud20.e);
        }
    }
}
