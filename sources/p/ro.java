package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ro implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bza0 b;

    public /* synthetic */ ro(bza0 bza0Var, byte b) {
        this.a = b;
        this.b = bza0Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        bza0 bza0Var = this.b;
        switch (b) {
            case 0:
                return observable.switchMap(new lan1(bza0Var, (byte) 1));
            default:
                return observable.switchMap(new ruc0(bza0Var, (byte) 9));
        }
    }
}
