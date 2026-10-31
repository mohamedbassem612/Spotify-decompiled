package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r6g implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s6g b;

    public /* synthetic */ r6g(s6g s6gVar, byte b) {
        this.a = b;
        this.b = s6gVar;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        s6g s6gVar = this.b;
        switch (b) {
            case 0:
                return observable.flatMapSingle(new i6b(s6gVar, (byte) 10));
            case 1:
                return observable.flatMapSingle(new mp8(s6gVar, (byte) 17));
            case 2:
                return observable.flatMapSingle(new zwa(s6gVar, (byte) 11));
            default:
                return observable.flatMapSingle(new l2a(s6gVar, (byte) 13));
        }
    }
}
