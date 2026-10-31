package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.processors.BehaviorProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class skn0 {
    public final Scheduler a;
    public Disposable b;
    public final idd1 c;
    public final FlowableMap d;
    public final BehaviorProcessor e = BehaviorProcessor.e0(Boolean.FALSE);

    public skn0(Flowable flowable, Context context, Scheduler scheduler) {
        this.a = scheduler;
        this.c = new idd1(new qnd0(context, (byte) 9));
        this.d = flowable.j(mo9.i).J(new qkn0(this, (byte) 0));
    }
}
