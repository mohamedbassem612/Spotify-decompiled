package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zh11 implements mrq0 {
    public final p2o0 a;
    public final Flowable b;

    public zh11(p2o0 p2o0Var, Flowable flowable) {
        this.a = p2o0Var;
        this.b = flowable;
    }

    @Override // p.mrq0
    public final Completable a(tv80 tv80Var) {
        Completable completableFlatMapCompletable = new FlowableSingleSingle(new FlowableTake(this.b)).flatMapCompletable(new uxy0(this, tv80Var, (byte) 15));
        completableFlatMapCompletable.getClass();
        return completableFlatMapCompletable.o(Functions.h);
    }
}
