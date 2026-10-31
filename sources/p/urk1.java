package p;

import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.completable.CompletablePeek;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class urk1 {
    public static final ObservableTransformer a(onr onrVar, cpr cprVar, bih1 bih1Var, Scheduler scheduler, Scheduler scheduler2, x6m0 x6m0Var) {
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(nrk1.class, new cp81(onrVar, (byte) 11));
        subtypeEffectHandlerBuilderC.g(erk1.class, new g2x0(scheduler2, onrVar, (byte) 13));
        subtypeEffectHandlerBuilderC.c(jrk1.class, new rdj1(cprVar, (byte) 5));
        subtypeEffectHandlerBuilderC.g(lrk1.class, new qt60(scheduler2, scheduler, bih1Var, (byte) 3));
        subtypeEffectHandlerBuilderC.g(crk1.class, new srk1(scheduler2, scheduler, bih1Var, (byte) 0));
        subtypeEffectHandlerBuilderC.c(grk1.class, iqa1.c1);
        subtypeEffectHandlerBuilderC.c(frk1.class, iqa1.b1);
        subtypeEffectHandlerBuilderC.g(hrk1.class, new lk1(scheduler, (byte) 8));
        subtypeEffectHandlerBuilderC.g(mrk1.class, new srk1(scheduler, scheduler2, bih1Var, (byte) 2));
        subtypeEffectHandlerBuilderC.g(drk1.class, new srk1(scheduler, scheduler2, bih1Var, (byte) 1));
        subtypeEffectHandlerBuilderC.g(irk1.class, new lk1(scheduler, (byte) 7));
        subtypeEffectHandlerBuilderC.c(krk1.class, new qdj1(onrVar, x6m0Var, (byte) 1));
        return subtypeEffectHandlerBuilderC.h();
    }

    public static final Observable b(bih1 bih1Var, rrk1 rrk1Var, int i, double d, String str) {
        CompletablePeek completablePeekG = bih1Var.l(i, str, (String) null).g(new qs4());
        if (rrk1Var instanceof crk1) {
            return completablePeekG.w();
        }
        if (!(rrk1Var instanceof lrk1)) {
            return Observable.empty();
        }
        lrk1 lrk1Var = (lrk1) rrk1Var;
        xl61 xl61Var = lrk1Var.a;
        return completablePeekG.x(new dsk1(xl61Var, true, xl61Var.a, lrk1Var.b)).onErrorReturnItem(new dsk1(xl61Var, false, xl61Var.a, lrk1Var.b)).toObservable();
    }
}
