package p;

import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vua1 {
    public final drm1 a;
    public final ObservableTransformer b;
    public final pta1 c;
    public final Scheduler d;
    public final Scheduler e;

    public vua1(drm1 drm1Var, ObservableTransformer observableTransformer, pta1 pta1Var, Scheduler scheduler, Scheduler scheduler2) {
        this.a = drm1Var;
        this.b = observableTransformer;
        this.c = pta1Var;
        this.d = scheduler;
        this.e = scheduler2;
    }
}
