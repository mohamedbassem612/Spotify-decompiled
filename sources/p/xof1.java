package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xof1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dpf1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xof1(dpf1 dpf1Var, byte b) {
        super(1);
        this.a = b;
        this.b = dpf1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        dpf1 dpf1Var = this.b;
        switch (b) {
            case 0:
                FlowableMap flowableMap = dpf1Var.b;
                Flowable flowableC = Flowable.c(flowableMap, yoi1.h(d3p1.H(dpf1Var.a, dpf1Var.X, (nof1) obj), o6x.a), flowableMap.j(dpf1Var.c), flowableMap.j(dpf1Var.d), flowableMap.j(dpf1Var.e).U(eqa1.a), a4x0.S0);
                vbm[] vbmVarArr = q601.a;
                return new kge(flowableC);
            default:
                rwq0.z((qtr) obj, new nsb1(dpf1Var, (byte) 25));
                return rih1.a;
        }
    }
}
