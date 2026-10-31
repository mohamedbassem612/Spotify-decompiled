package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qam0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sam0 b;

    public /* synthetic */ qam0(sam0 sam0Var, byte b) {
        this.a = b;
        this.b = sam0Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        sam0 sam0Var = this.b;
        switch (b) {
            case 0:
                return observable.map(new ruc0(sam0Var, (byte) 18));
            case 1:
                return observable.map(new hod0(sam0Var, (byte) 19));
            default:
                return observable.flatMap(new d4e0(sam0Var, (byte) 16));
        }
    }
}
