package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fj11 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gj11 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fj11(gj11 gj11Var, byte b) {
        super(4);
        this.a = b;
        this.b = gj11Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        gj11 gj11Var = this.b;
        switch (b) {
            case 0:
                zi11 zi11Var = (zi11) obj2;
                tqw tqwVar = (tqw) obj4;
                Flowable flowable = gj11Var.a;
                dj11 dj11Var = zi11Var.b;
                if (dj11Var instanceof bj11) {
                    Completable completableFlatMapCompletable = new FlowableSingleSingle(ydh.f(flowable, flowable)).flatMapCompletable(new k811(zi11Var, gj11Var, tqwVar, (byte) 6));
                    completableFlatMapCompletable.getClass();
                    return completableFlatMapCompletable;
                }
                if (dj11Var.equals(cj11.a)) {
                    Completable completableFlatMapCompletable2 = new FlowableSingleSingle(ydh.f(flowable, flowable)).flatMapCompletable(new xaz0(gj11Var, (byte) 9));
                    completableFlatMapCompletable2.getClass();
                    return completableFlatMapCompletable2;
                }
                CompletableEmpty completableEmpty = CompletableEmpty.a;
                completableEmpty.getClass();
                return completableEmpty;
            default:
                return new as0(gj11Var, (iu30) obj4);
        }
    }
}
