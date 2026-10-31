package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class izr implements ObservableTransformer {
    public final dzr a;
    public final Scheduler b;

    public izr(dzr dzrVar, Scheduler scheduler) {
        this.a = dzrVar;
        this.b = scheduler;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.map(wcp1.U0).distinctUntilChanged().throttleLatest(300L, TimeUnit.MILLISECONDS, this.b).switchMap(new wcr(this, (byte) 8)).map(vgp1.V0).distinctUntilChanged().flatMap(zp8.W0);
    }
}
