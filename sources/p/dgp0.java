package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dgp0 implements ObservableTransformer {
    public final byte a;
    public final cgp0 b;

    /* JADX WARN: Multi-variable type inference failed */
    public dgp0(int i, long j, int i2) {
        this.a = i;
        this.b = new cgp0(i2, j, Schedulers.b);
    }

    public final ObservableSource apply(Observable observable) {
        return observable.timeout(this.a, TimeUnit.SECONDS, Observable.error(new TimeoutException())).retryWhen(this.b);
    }

    public dgp0() {
        this(30, 1000L, 5);
    }
}
