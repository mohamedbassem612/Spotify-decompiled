package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x0h implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z0h b;

    public /* synthetic */ x0h(z0h z0hVar, byte b) {
        this.a = b;
        this.b = z0hVar;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        z0h z0hVar = this.b;
        switch (b) {
            case 0:
                return observable.flatMapCompletable(new kba(z0hVar, (byte) 18)).w();
            case 1:
                return observable.flatMapSingle(new fp8(z0hVar, (byte) 21));
            case 2:
                return observable.flatMapSingle(new lo9(z0hVar, (byte) 18));
            case 3:
                return observable.flatMapCompletable(new i6b(z0hVar, (byte) 14)).w();
            case 4:
                return observable.flatMapCompletable(new jc9(z0hVar, (byte) 19)).w();
            case 5:
                return observable.flatMapCompletable(new mp8(z0hVar, (byte) 20)).w();
            case 6:
                return observable.flatMapCompletable(new zwa(z0hVar, (byte) 14)).w();
            case 7:
                return observable.flatMapCompletable(new l2a(z0hVar, (byte) 15)).w();
            case 8:
                return observable.flatMapCompletable(new uq8(z0hVar, (byte) 15)).w();
            default:
                return observable.flatMapCompletable(new fna(z0hVar, (byte) 17)).w();
        }
    }
}
