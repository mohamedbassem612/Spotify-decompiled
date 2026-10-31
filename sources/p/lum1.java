package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lum1 implements wqp0 {
    public final ium1 a;
    public final mwm1 b;
    public final ynb0 c;
    public final Scheduler d;

    public lum1(ium1 ium1Var, mwm1 mwm1Var, ynb0 ynb0Var, Scheduler scheduler) {
        this.a = ium1Var;
        this.b = mwm1Var;
        this.c = ynb0Var;
        this.d = scheduler;
    }

    @Override // p.wqp0
    public final Observable a() {
        return Observable.defer(new aj91(this, (byte) 5));
    }
}
