package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pi11 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ri11 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pi11(ri11 ri11Var, byte b) {
        super(1);
        this.a = b;
        this.b = ri11Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ri11 ri11Var = this.b;
        switch (b) {
            case 0:
                Flowable flowable = ri11Var.a;
                FlowableMap flowableMapJ = flowable.j(mo9.Y).J(wbx0.f);
                FlowableMap flowableMapJ2 = ri11Var.b.b0(ri11Var.Y, ybx0.f).x(hcx0.f).J(icx0.f);
                Flowable flowableJ = flowable.j(mo9.O0);
                Flowable flowableJ2 = flowable.j(mo9.R0);
                mr20 mr20VarD = ri11Var.f.d();
                o6x o6xVar = o6x.a;
                return Flowable.a(flowableMapJ, flowableMapJ2, flowableJ, flowableJ2, yoi1.i(mr20VarD, o6xVar).toFlowable(BackpressureStrategy.d), yoi1.h(lgv.a(ri11Var.X), o6xVar), new ij01(ri11Var, (byte) 4));
            case 1:
                rwq0.z((qtr) obj, new g001(ri11Var, (byte) 18));
                return rih1.a;
            default:
                return ri11Var.h;
        }
    }
}
