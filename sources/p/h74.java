package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h74 extends ugp0 {
    public final ypd d;

    public h74(Scheduler scheduler, ypd ypdVar) {
        super(scheduler);
        this.d = ypdVar;
    }

    public final Observable e() {
        return ((Observable) this.d.e.getValue()).map(vf61.e);
    }
}
