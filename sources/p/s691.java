package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s691 {
    public final FlowableMap a;
    public final Flowable b;
    public final Flowable c;
    public final w9u0 d;

    public s691(FlowableMap flowableMap, Flowable flowable, Flowable flowable2, w9u0 w9u0Var) {
        this.a = flowableMap;
        this.b = flowable;
        this.c = flowable2;
        this.d = w9u0Var;
    }

    public final w691 a(qzh qzhVar) {
        return new w691(this.a, this.b, this.c, this.d, qzhVar);
    }
}
