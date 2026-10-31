package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gfh implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hfh b;

    public /* synthetic */ gfh(hfh hfhVar, byte b) {
        this.a = b;
        this.b = hfhVar;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        hfh hfhVar = this.b;
        switch (b) {
            case 0:
                return observable.switchMap(new l2a(hfhVar, (byte) 17));
            default:
                return observable.switchMap(new uq8(hfhVar, (byte) 17));
        }
    }
}
