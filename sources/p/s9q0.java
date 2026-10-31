package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s9q0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t9q0 b;

    public /* synthetic */ s9q0(t9q0 t9q0Var, byte b) {
        this.a = b;
        this.b = t9q0Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        t9q0 t9q0Var = this.b;
        switch (b) {
            case 0:
                return observable.switchMap(new hvp0(t9q0Var, (byte) 2));
            case 1:
                return observable.switchMap(new uip0(t9q0Var, (byte) 5));
            default:
                return observable.switchMap(new l1p0(t9q0Var, (byte) 8));
        }
    }
}
