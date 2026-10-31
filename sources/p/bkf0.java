package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bkf0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Flowable b;

    public /* synthetic */ bkf0(Flowable flowable, byte b) {
        this.a = b;
        this.b = flowable;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        Flowable flowable = this.b;
        switch (b) {
            case 0:
                return observable.switchMap(new ldn(flowable, (byte) 1));
            case 1:
                return observable.switchMap(new yfc0(flowable, (byte) 10));
            default:
                return observable.switchMap(new ab41(flowable, (byte) 0));
        }
    }
}
