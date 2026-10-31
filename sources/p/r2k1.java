package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r2k1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cd6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r2k1(cd6 cd6Var, byte b) {
        super(1);
        this.a = b;
        this.b = cd6Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        cd6 cd6Var = this.b;
        switch (b) {
            case 0:
                pqc1 pqc1Var = (pqc1) cd6Var.f;
                FlowableMap flowableMapJ = ((Flowable) cd6Var.e).x(a4x0.W0).J(b4x0.W0);
                Function function = Functions.a;
                Flowable flowableE = Flowable.e(flowableMapJ.t(function), Flowable.K(pqc1Var.h.J(c4x0.X0), pqc1Var.i.J(e4x0.V0)).U(rih1Var), cd6Var.b ? yoi1.h(((yge0) cd6Var.g).h(), o6x.a) : Flowable.I(Boolean.TRUE), new zb91(cd6Var, (byte) 29));
                flowableE.getClass();
                return flowableE.t(function).t(function);
            default:
                ((qtr) obj).b(new bgb1(cd6Var, (lnm) null, (byte) 11));
                return rih1Var;
        }
    }
}
