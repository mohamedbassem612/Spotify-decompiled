package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q8q {
    public final /* synthetic */ caq a;

    public q8q(caq caqVar) {
        this.a = caqVar;
    }

    public final e27 a(Flowable flowable, Flowable flowable2) {
        daq daqVar = this.a.a;
        return new e27(flowable, flowable2, (ykf0) daqVar.jo.get(), (npf0) daqVar.ko.get(), daqVar.lo, (Scheduler) daqVar.r3.get(), (Scheduler) daqVar.z1.get());
    }
}
