package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tr51 implements ObservableTransformer {
    public final /* synthetic */ zr51 a;

    public tr51(zr51 zr51Var) {
        this.a = zr51Var;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.flatMap(new xaz0(this.a, (byte) 23));
    }
}
