package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s9b implements r9b {
    public final uu00 a;

    public s9b(uu00 uu00Var) {
        this.a = uu00Var;
    }

    public final mr20 a(String str) {
        Flowable flowable = this.a.b(new oi("bluejay-datasource", false, new nb9(str, (byte) 19))).filter(cq41.Y).map(new gap1(str, (byte) 4)).onErrorReturnItem(Boolean.FALSE).toFlowable(BackpressureStrategy.d);
        flowable.getClass();
        FlowableDistinctUntilChanged flowableDistinctUntilChangedT = flowable.t(Functions.a);
        vbm[] vbmVarArr = q601.a;
        return new kge(flowableDistinctUntilChangedT);
    }
}
