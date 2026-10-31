package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x1x0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v5n b;

    public /* synthetic */ x1x0(v5n v5nVar, byte b) {
        this.a = b;
        this.b = v5nVar;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        v5n v5nVar = this.b;
        switch (b) {
            case 0:
                return observable.switchMap(new sks0(v5nVar, (byte) 17));
            case 1:
                return observable.switchMap(new s6z0(v5nVar, (byte) 17));
            default:
                return observable.switchMap(new uqv0((Object) v5nVar, (byte) 29));
        }
    }
}
