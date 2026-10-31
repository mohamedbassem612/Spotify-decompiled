package p;

import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtSingle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n980 implements Function {
    public final FlowableElementAtSingle a;
    public final io91 b;

    public /* synthetic */ n980(FlowableElementAtSingle flowableElementAtSingle, io91 io91Var) {
        this.a = flowableElementAtSingle;
        this.b = io91Var;
    }

    public Object apply(Object obj) {
        return this.a.flatMapCompletable(new h0y(this.b, (byte) 24)).w();
    }
}
