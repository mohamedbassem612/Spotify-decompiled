package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zmq {
    public final /* synthetic */ ykq a;

    public zmq(ykq ykqVar) {
        this.a = ykqVar;
    }

    public final n501 a(o501 o501Var, n401 n401Var) {
        Scheduler scheduler = (Scheduler) ((e401) ((f0a) this.a.c).b).b.get();
        c8o.l(scheduler);
        return new n501(scheduler, o501Var, n401Var);
    }
}
