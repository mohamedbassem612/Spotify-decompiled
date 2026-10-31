package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fex0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tzr0 b;

    public /* synthetic */ fex0(tzr0 tzr0Var, byte b) {
        this.a = b;
        this.b = tzr0Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        tzr0 tzr0Var = this.b;
        switch (b) {
            case 0:
                return observable.switchMap(new mlw0(tzr0Var, (byte) 3));
            case 1:
                return observable.switchMap(new vqv0(tzr0Var, (byte) 4));
            case 2:
                return observable.map(new ypa(tzr0Var, (byte) 21));
            case 3:
                return observable.map(new n0v0(tzr0Var, (byte) 7));
            case 4:
                return observable.map(new vgq0(tzr0Var, (byte) 21));
            case 5:
                return observable.map(new rut0(tzr0Var, (byte) 12));
            default:
                return observable.switchMap(new jkp0(tzr0Var, (byte) 25));
        }
    }
}
