package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ltw0 implements ObservableTransformer {
    public final /* synthetic */ byte a;

    public final ObservableSource apply(Observable observable) {
        switch (this.a) {
            case 0:
                return observable.scan(gg11.g, new bhn0((byte) 12)).skip(1L);
            default:
                return observable.scan(new t8e1((byte) 6));
        }
    }
}
