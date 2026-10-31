package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mm3 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ om3 b;

    public /* synthetic */ mm3(om3 om3Var, byte b) {
        this.a = b;
        this.b = om3Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        om3 om3Var = this.b;
        switch (b) {
            case 0:
                return observable.flatMap(new fl1((Object) om3Var, (byte) 12));
            default:
                return observable.switchMap(new a42(om3Var, (byte) 13));
        }
    }
}
