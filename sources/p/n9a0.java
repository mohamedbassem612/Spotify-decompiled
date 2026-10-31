package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableBuffer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableZip;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class n9a0 {
    public static final FlowableJust a;

    static {
        mo9 mo9Var = mo9.g;
        Flowable flowableP = Flowable.E(o9a0.a).P(Long.MAX_VALUE);
        Scheduler scheduler = Schedulers.b;
        FlowableZip flowableZipC0 = flowableP.c0(new FlowableOnBackpressureLatest(Flowable.G(40L, 40L, TimeUnit.MILLISECONDS, scheduler)), a020.h);
        ObjectHelper.a(2, "count");
        ObjectHelper.a(1, "skip");
        new FlowableBuffer(flowableZipC0).m(sa20.h).c0(new FlowableOnBackpressureLatest(Flowable.G(16666L, 16666L, TimeUnit.MICROSECONDS, scheduler)), ta20.h).j(mo9Var);
        a = Flowable.I(l9a0.d);
    }
}
