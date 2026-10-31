package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h1l1 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j1l1 b;

    public /* synthetic */ h1l1(j1l1 j1l1Var, byte b) {
        this.a = b;
        this.b = j1l1Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        j1l1 j1l1Var = this.b;
        switch (b) {
            case 0:
                return observable.flatMap(new o2b1(j1l1Var, (byte) 26));
            case 1:
                return observable.flatMap(new qeh1(j1l1Var, (byte) 9));
            case 2:
                return observable.flatMap(new csj1(j1l1Var, (byte) 3));
            default:
                return observable.flatMap(new owf1(j1l1Var, (byte) 13));
        }
    }
}
