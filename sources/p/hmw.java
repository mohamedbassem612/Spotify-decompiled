package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class hmw implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kmw b;

    public /* synthetic */ hmw(kmw kmwVar, byte b) {
        this.a = b;
        this.b = kmwVar;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        kmw kmwVar = this.b;
        switch (b) {
            case 0:
                return observable.flatMapSingle(new wcr(kmwVar, (byte) 23));
            case 1:
                return observable.flatMapSingle(new dqu(kmwVar, (byte) 5));
            default:
                return observable.flatMapSingle(new xap(kmwVar, (byte) 25));
        }
    }
}
