package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wiw implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final ObservableTransformer b;

    public /* synthetic */ wiw(ObservableTransformer observableTransformer, byte b) {
        this.a = b;
        this.b = observableTransformer;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        ObservableTransformer observableTransformer = this.b;
        switch (b) {
            case 0:
                return observable.compose(observableTransformer).doOnError(dxu.g);
            default:
                return observable.map(ok10.c).compose(observableTransformer);
        }
    }
}
