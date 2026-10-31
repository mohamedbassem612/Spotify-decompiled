package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yem extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dfm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yem(dfm dfmVar, byte b) {
        super(4);
        this.a = b;
        this.b = dfmVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        dfm dfmVar = this.b;
        switch (b) {
            case 0:
                Flowable flowable = (Flowable) dfmVar.e;
                FlowableSingleSingle flowableSingleSingle = new FlowableSingleSingle(ydh.f(flowable, flowable));
                Flowable flowable2 = (Flowable) dfmVar.d;
                return Single.zip(flowableSingleSingle, new FlowableSingleSingle(ydh.f(flowable2, flowable2)), vrg.S0).observeOn((Scheduler) dfmVar.h).flatMapCompletable(new ham(dfmVar, (tqw) obj4, (byte) 1));
            default:
                return new wc3(dfmVar, (iu30) obj4);
        }
    }
}
