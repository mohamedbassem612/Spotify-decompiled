package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gmj1 implements mrq0 {
    public final rh11 a;
    public final zh11 b;
    public final un4 c;

    public gmj1(rh11 rh11Var, zh11 zh11Var, un4 un4Var) {
        this.a = rh11Var;
        this.b = zh11Var;
        this.c = un4Var;
    }

    public final Completable a(tv80 tv80Var) {
        if (!this.c.f()) {
            return CompletableEmpty.a;
        }
        Completable completableFlatMapCompletable = new FlowableSingleSingle(new FlowableTake(Flowable.F(q601.b(this.a.b())))).flatMapCompletable(new ilh1(this, tv80Var, (byte) 10));
        completableFlatMapCompletable.getClass();
        return completableFlatMapCompletable.o(Functions.h);
    }
}
