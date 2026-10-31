package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableTransformer;
import io.reactivex.rxjava3.internal.functions.Functions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r481 implements FlowableTransformer {
    public final lkd a;
    public final l7m0 b;

    public r481(lkd lkdVar, l7m0 l7m0Var) {
        this.a = lkdVar;
        this.b = l7m0Var;
    }

    public final moy0 a(Flowable flowable) {
        Flowable flowableX = flowable.X(new tz01(this, (byte) 20));
        flowableX.getClass();
        return flowableX.t(Functions.a);
    }
}
