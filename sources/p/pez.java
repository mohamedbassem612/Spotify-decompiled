package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pez implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qez b;

    public /* synthetic */ pez(qez qezVar, byte b) {
        this.a = b;
        this.b = qezVar;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        qez qezVar = this.b;
        switch (b) {
            case 0:
                return observable.flatMapCompletable(new efr(qezVar, (byte) 28)).w();
            default:
                return observable.flatMapCompletable(new tzo(qezVar, (byte) 28)).w();
        }
    }
}
