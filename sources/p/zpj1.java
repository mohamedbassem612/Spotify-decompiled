package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zpj1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nl9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zpj1(nl9 nl9Var, byte b) {
        super(1);
        this.a = b;
        this.b = nl9Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        nl9 nl9Var = this.b;
        switch (b) {
            case 0:
                return Flowable.h((Flowable) nl9Var.t, (FlowableMap) nl9Var.i, mgx0.V0);
            default:
                ((qtr) obj).b(new dgh1(nl9Var, (lnm) null, (byte) 1));
                return rih1.a;
        }
    }
}
