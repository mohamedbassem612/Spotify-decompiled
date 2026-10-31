package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class srk1 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Scheduler b;
    public final /* synthetic */ Scheduler c;
    public final /* synthetic */ bih1 d;

    public /* synthetic */ srk1(Scheduler scheduler, Scheduler scheduler2, bih1 bih1Var, byte b) {
        this.a = b;
        this.b = scheduler;
        this.c = scheduler2;
        this.d = bih1Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        Scheduler scheduler = this.c;
        bih1 bih1Var = this.d;
        Scheduler scheduler2 = this.b;
        switch (b) {
            case 0:
                return observable.observeOn(scheduler2).doOnNext(iqa1.a1).throttleLatest(200L, TimeUnit.MILLISECONDS, this.c, true).observeOn(scheduler2).concatMap(new qeh1(bih1Var, (byte) 8));
            case 1:
                return observable.groupBy(vbx0.W0).flatMap(new trk1(scheduler2, scheduler, bih1Var, (byte) 0));
            default:
                return observable.groupBy(icx0.W0).flatMap(new trk1(scheduler2, scheduler, bih1Var, (byte) 1));
        }
    }
}
