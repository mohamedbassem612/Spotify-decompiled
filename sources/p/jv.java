package p;

import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jv extends v9 {
    public final zq c;
    public final Scheduler d;
    public final Scheduler e;

    public jv(zq zqVar, Scheduler scheduler, Scheduler scheduler2, qe41 qe41Var) {
        super(qe41Var);
        this.c = zqVar;
        this.d = scheduler;
        this.e = scheduler2;
    }

    public final xbk1 e(fe41 fe41Var) {
        iv ivVar = new iv(this);
        ios iosVar = ios.b;
        zu zuVar = (zu) fe41Var.b.s("VIEW_STATE");
        if (zuVar == null) {
            zuVar = zu.b;
        }
        return new lv(ivVar, zuVar, iosVar, MainThreadWorkRunner.a());
    }
}
