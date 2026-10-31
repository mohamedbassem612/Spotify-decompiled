package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableError;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class un01 implements w310 {
    public final Flowable a;
    public final ybg b;

    public un01(Flowable flowable, ybg ybgVar) {
        this.a = flowable;
        this.b = ybgVar;
    }

    public final Single b(r9c r9cVar) {
        return new FlowableSingleSingle(new FlowableTake(Flowable.h(this.a.x(new nkx0((byte) 9)), yoi1.h(this.b.a(), o6x.a).N(Boolean.FALSE), new nkx0((byte) 10)).x(new nkx0((byte) 11)).J(new nkx0((byte) 12))).Y(5L, new FlowableError(Functions.h(new TimeoutException())))).map(new nkx0((byte) 13));
    }
}
