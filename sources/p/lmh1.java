package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lmh1 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nmh1 b;

    public /* synthetic */ lmh1(nmh1 nmh1Var, byte b) {
        this.a = b;
        this.b = nmh1Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        nmh1 nmh1Var = this.b;
        switch (b) {
            case 0:
                return observable.switchMap(new dn81(nmh1Var, (byte) 26));
            case 1:
                return observable.switchMap(new a1g1(nmh1Var, (byte) 4));
            case 2:
                return observable.switchMap(new ltf1(nmh1Var, (byte) 6));
            case 3:
                return observable.flatMap(new f2g1(nmh1Var, (byte) 3));
            default:
                return observable.flatMap(new zb91(nmh1Var, (byte) 22));
        }
    }
}
