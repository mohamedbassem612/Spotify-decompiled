package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h4e0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final c23 b;
    public final PublishSubject c;

    public /* synthetic */ h4e0(c23 c23Var, PublishSubject publishSubject, byte b) {
        this.a = b;
        this.b = c23Var;
        this.c = publishSubject;
    }

    public final ObservableSource apply(Observable observable) {
        switch (this.a) {
            case 0:
                return observable.distinctUntilChanged().concatMap(new yfc0(this, (byte) 5));
            default:
                return observable.flatMap(new ij01(this, (byte) 21));
        }
    }
}
