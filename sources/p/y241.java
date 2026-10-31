package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y241 {
    public final Flowable a;

    public y241(Scheduler scheduler, Observable observable, dxz0 dxz0Var) {
        this.a = observable.ofType(vbl.class).flatMap(new xaz0(dxz0Var, (byte) 17)).replay(1).f().observeOn(scheduler).toFlowable(BackpressureStrategy.d);
    }
}
