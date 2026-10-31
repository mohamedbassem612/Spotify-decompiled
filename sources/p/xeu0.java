package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xeu0 implements FlowableTransformer {
    public final /* synthetic */ long a;
    public final /* synthetic */ Scheduler b;
    public final /* synthetic */ yqg c;

    public xeu0(long j, Scheduler scheduler, yqg yqgVar) {
        this.a = j;
        this.b = scheduler;
        this.c = yqgVar;
    }

    public final moy0 a(Flowable flowable) {
        Flowable flowableX = flowable.X(new btf0(this.a, this.b, this.c, (byte) 1));
        flowableX.getClass();
        return flowableX.t(Functions.a);
    }
}
