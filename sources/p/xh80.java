package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableTransformer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xh80 implements FlowableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h72 b;

    public /* synthetic */ xh80(h72 h72Var, byte b) {
        this.a = b;
        this.b = h72Var;
    }

    public final moy0 a(Flowable flowable) {
        byte b = this.a;
        h72 h72Var = this.b;
        switch (b) {
            case 0:
                Function function = Functions.a;
                Flowable flowableX = flowable.t(function).X(new eb80(h72Var, (byte) 1));
                flowableX.getClass();
                return flowableX.t(function);
            case 1:
                vbm[] vbmVarArr = q601.a;
                return yoi1.h(rqt0.u(hu20.e(new kge(flowable), new uls((lnm) null, h72Var, (byte) 24))), o6x.a);
            default:
                return flowable.J(new hl00(h72Var, (byte) 16)).j((xh80) h72Var.Y).j((xh80) h72Var.X);
        }
    }
}
