package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z1x0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zsc b;

    public /* synthetic */ z1x0(zsc zscVar, byte b) {
        this.a = b;
        this.b = zscVar;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        zsc zscVar = this.b;
        switch (b) {
            case 0:
                return observable.switchMap(new jkp0(zscVar, (byte) 23));
            default:
                return observable.flatMap(new vyq0(zscVar, (byte) 15));
        }
    }
}
