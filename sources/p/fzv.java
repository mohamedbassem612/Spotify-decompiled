package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fzv implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ otu b;

    public /* synthetic */ fzv(otu otuVar, byte b) {
        this.a = b;
        this.b = otuVar;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        otu otuVar = this.b;
        switch (b) {
            case 0:
                return observable.map(new h9n(otuVar, (byte) 29));
            default:
                return observable.map(new uqv0(otuVar, (byte) 4));
        }
    }
}
