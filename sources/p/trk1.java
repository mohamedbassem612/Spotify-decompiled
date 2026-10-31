package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.observables.GroupedObservable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class trk1 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Scheduler b;
    public final /* synthetic */ Scheduler c;
    public final /* synthetic */ bih1 d;

    public /* synthetic */ trk1(Scheduler scheduler, Scheduler scheduler2, bih1 bih1Var, byte b) {
        this.a = b;
        this.b = scheduler;
        this.c = scheduler2;
        this.d = bih1Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        bih1 bih1Var = this.d;
        Scheduler scheduler = this.c;
        switch (b) {
            case 0:
                return ((GroupedObservable) obj).throttleLatest(200L, TimeUnit.MILLISECONDS, this.b, true).observeOn(scheduler).concatMap(new dmj1(bih1Var, (byte) 3));
            default:
                return ((GroupedObservable) obj).throttleLatest(200L, TimeUnit.MILLISECONDS, this.b, true).observeOn(scheduler).concatMap(new f2g1(bih1Var, (byte) 12));
        }
    }
}
