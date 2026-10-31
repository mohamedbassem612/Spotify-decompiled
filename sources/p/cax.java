package p;

import android.os.Build;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableTransformer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cax implements FlowableTransformer {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ cax(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final moy0 a(Flowable flowable) {
        Flowable flowableI;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                gvs0 gvs0Var = (gvs0) obj;
                gvs0Var.getClass();
                if (Build.VERSION.SDK_INT >= 31) {
                    flowableI = Flowable.h(flowable, yoi1.h(new ht20(new iib(gvs0Var.b.q(hvs0.a), gvs0Var, (byte) 9), new cto0(gvs0Var, (lnm) null, (byte) 29)), o6x.a), ios.a1);
                } else {
                    flowableI = Flowable.I(Boolean.FALSE);
                }
                flowableI.getClass();
                return flowableI.t(Functions.a);
            case 1:
                FlowableMap flowableMapJ = flowable.J(as10.X);
                Function function = Functions.a;
                Flowable flowableX = flowableMapJ.t(function).X(new yfc0((o860) obj, (byte) 4));
                flowableX.getClass();
                return flowableX.t(function);
            case 2:
                qzo0 qzo0Var = (qzo0) obj;
                Flowable flowableX2 = flowable.J(new e5l0(qzo0Var, (byte) 9)).t(Functions.a).X(new zud0(qzo0Var, (byte) 22));
                b7x b7xVar = b7x.a;
                return flowableX2.U(new lzo0(b7xVar, b7xVar, b7xVar, b7xVar));
            case 3:
                return flowable.J(a020.S0).j(((tap) obj).a("nowplaying-track-info-speed-badge")).J(sa20.S0);
            case 4:
                Flowable flowableX3 = flowable.X(new ks21(this, (byte) 17));
                flowableX3.getClass();
                return flowableX3.t(Functions.a);
            default:
                return flowable.U(gu41.a).X(new ab41((Flowable) obj, (byte) 1)).s(gex0.S0).s(hgx0.T0);
        }
    }
}
