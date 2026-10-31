package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p211 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cr6 b;

    public /* synthetic */ p211(cr6 cr6Var, byte b) {
        this.a = b;
        this.b = cr6Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        cr6 cr6Var = this.b;
        switch (b) {
            case 0:
                return observable.switchMap(new rut0(cr6Var, (byte) 22));
            default:
                return observable.switchMap(new n801(cr6Var, (byte) 1));
        }
    }
}
