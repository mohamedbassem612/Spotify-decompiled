package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ak1 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final sxz0 b;
    public final frd1 c;

    public /* synthetic */ ak1(sxz0 sxz0Var, frd1 frd1Var, byte b) {
        this.a = b;
        this.b = sxz0Var;
        this.c = frd1Var;
    }

    public final ObservableSource apply(Observable observable) {
        switch (this.a) {
            case 0:
                return observable.flatMap(new t4d1(this, (byte) 5));
            case 1:
                return observable.switchMapSingle(new jpa0(this, (byte) 10));
            case 2:
                return observable.switchMapSingle(new vqv0(this, (byte) 21));
            default:
                return observable.flatMap(new n0v0(this, (byte) 25));
        }
    }
}
