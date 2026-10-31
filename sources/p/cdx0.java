package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cdx0 {
    public final Scheduler a;
    public final Scheduler b;

    public cdx0(Scheduler scheduler, Scheduler scheduler2) {
        this.a = scheduler;
        this.b = scheduler2;
    }

    public final edx0 a(sdx0 sdx0Var, udx0 udx0Var, Observable observable) {
        return new edx0(this.a, this.b, sdx0Var, udx0Var, observable);
    }
}
