package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vpi0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xpi0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vpi0(xpi0 xpi0Var, byte b) {
        super(1);
        this.a = b;
        this.b = xpi0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        xpi0 xpi0Var = this.b;
        switch (b) {
            case 0:
                yge0 yge0Var = new yge0(xpi0Var, ((tpi0) obj).d.a.e, (byte) 22);
                int i = Flowable.a;
                return new soy0(new FlowableCreate(yge0Var, BackpressureStrategy.d));
            case 1:
                tpi0 tpi0Var = (tpi0) obj;
                jwm jwmVar = tpi0Var.d;
                String str = jwmVar.a.e;
                i430 i430VarC = xpi0Var.c.c(str);
                if (i430VarC == null) {
                    i430VarC = new i430(str, 30, false);
                }
                return new upi0(i430VarC.c, jwmVar, tpi0Var.e);
            default:
                ((qtr) obj).b(new k1(xpi0Var, (lnm) null, (byte) 20));
                return rih1.a;
        }
    }
}
