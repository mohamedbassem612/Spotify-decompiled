package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x2a1 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g0l b;
    public final /* synthetic */ Scheduler c;
    public final /* synthetic */ n381 d;

    public /* synthetic */ x2a1(g0l g0lVar, Scheduler scheduler, n381 n381Var, byte b) {
        this.a = b;
        this.b = g0lVar;
        this.c = scheduler;
        this.d = n381Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        n381 n381Var = this.d;
        inr inrVar = this.b;
        switch (b) {
            case 0:
                Single map = inrVar.j().map(wbx0.P0).filter(ybx0.P0).firstOrError().map(hcx0.P0);
                Single singleError = Single.error(new TimeoutException());
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                Scheduler scheduler = this.c;
                return map.timeout(5000L, timeUnit, scheduler, singleError).doOnError(new z0u0((byte) 19, new Object[0], "Failed getting local device id")).compose(new t2a1(n381Var, ((u1a1) obj).a, scheduler)).onErrorReturn(o9x0.O0).toObservable();
            default:
                Single map2 = inrVar.j().map(wbx0.P0).filter(ybx0.P0).firstOrError().map(hcx0.P0);
                Single singleError2 = Single.error(new TimeoutException());
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                Scheduler scheduler2 = this.c;
                return map2.timeout(5000L, timeUnit2, scheduler2, singleError2).doOnError(new z0u0((byte) 19, new Object[0], "Failed getting local device id")).compose(new u2a1(n381Var, scheduler2)).toObservable().onErrorReturn(s9x0.P0);
        }
    }
}
