package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pql implements r781 {
    public final uu00 a;
    public final yix0 b;
    public final mwm1 c;
    public final vpp0 d;
    public final Scheduler e;

    public pql(uu00 uu00Var, yix0 yix0Var, mwm1 mwm1Var, vpp0 vpp0Var, Scheduler scheduler) {
        this.a = uu00Var;
        this.b = yix0Var;
        this.c = mwm1Var;
        this.d = vpp0Var;
        this.e = scheduler;
    }

    public final Observable f(String str) {
        return this.a.b(new oi("showMenuLoader", false, new kak(str, (byte) 11))).subscribeOn(this.e).filter(uwg.V0).switchMap(new oql(this, str, (byte) 0)).distinctUntilChanged();
    }
}
