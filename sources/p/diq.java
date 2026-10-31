package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class diq {
    public final /* synthetic */ thq a;

    public diq(thq thqVar) {
        this.a = thqVar;
    }

    public final uj a(rcr rcrVar) {
        thq thqVar = this.a;
        return new uj((l8s) thq.b(thqVar).I6.get(), (Scheduler) thq.b(thqVar).z1.get(), rcrVar);
    }
}
