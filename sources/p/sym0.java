package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sym0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uym0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sym0(uym0 uym0Var, byte b) {
        super(1);
        this.a = b;
        this.b = uym0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        uym0 uym0Var = this.b;
        switch (b) {
            case 0:
                qym0 qym0Var = (qym0) obj;
                boolean z = qym0Var.b;
                String str = qym0Var.a;
                FlowableMap flowableMapJ = uym0Var.c.J(si10.Q0);
                Function function = Functions.a;
                Flowable flowableX = flowableMapJ.t(function).X(new jqd0(z, str, uym0Var, (byte) 4));
                flowableX.getClass();
                Flowable flowableX2 = flowableX.t(function).X(new jpa0(uym0Var, (byte) 24));
                vbm[] vbmVarArr = q601.a;
                return new kge(flowableX2);
            default:
                rwq0.z((qtr) obj, new pah0(uym0Var, (byte) 22));
                return rih1.a;
        }
    }
}
