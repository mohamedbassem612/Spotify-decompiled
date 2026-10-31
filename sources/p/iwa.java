package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iwa implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final nwa b;

    public /* synthetic */ iwa(nwa nwaVar, byte b) {
        this.a = b;
        this.b = nwaVar;
    }

    public final ObservableSource apply(Observable observable) {
        switch (this.a) {
            case 0:
                return observable.switchMap(new mp8(this, (byte) 5));
            default:
                return observable.switchMap(new mre0(this.b, (byte) 9));
        }
    }
}
