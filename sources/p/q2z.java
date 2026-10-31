package p;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnErrorReturn;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q2z extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ bv40 b;
    public final /* synthetic */ Flowable c;
    public final /* synthetic */ zr00 d;
    public final /* synthetic */ yh2 e;
    public final /* synthetic */ g7h f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2z(bv40 bv40Var, zr00 zr00Var, yh2 yh2Var, g7h g7hVar, Flowable flowable) {
        super(1);
        this.b = bv40Var;
        this.d = zr00Var;
        this.e = yh2Var;
        this.f = g7hVar;
        this.c = flowable;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        g7h g7hVar = this.f;
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.d;
        yh2 yh2Var = this.e;
        zr00 zr00Var = this.d;
        o6x o6xVar = o6x.a;
        bv40 bv40Var = this.b;
        switch (b) {
            case 0:
                o2z o2zVar = (o2z) obj;
                String str = o2zVar.a;
                Flowable flowableH = yoi1.h(bv40Var.k(str), o6xVar);
                Flowable flowableH2 = yoi1.h(zr00Var.a, o6xVar);
                Flowable flowable = yh2Var.a().toFlowable(backpressureStrategy);
                FlowableOnErrorReturn flowableOnErrorReturnM = g7h.d(g7hVar, "", new String[]{str}).toFlowable(backpressureStrategy).J(new dqu(o2zVar, (byte) 9)).M(zhm0.Z0);
                Function function = Functions.a;
                Flowable flowableC = Flowable.c(flowableH2, flowable, flowableOnErrorReturnM.t(function), this.c.J(new wcr(o2zVar, (byte) 29)), flowableH, drm0.a1);
                flowableC.getClass();
                return flowableC.t(function);
            default:
                haz hazVar = (haz) obj;
                String str2 = hazVar.a;
                Flowable flowableH3 = yoi1.h(bv40Var.k(str2), o6xVar);
                Flowable flowableH4 = yoi1.h(zr00Var.a, o6xVar);
                Flowable flowable2 = yh2Var.a().toFlowable(backpressureStrategy);
                FlowableOnErrorReturn flowableOnErrorReturnM2 = g7h.d(g7hVar, "", new String[]{str2}).toFlowable(backpressureStrategy).J(new dqu(hazVar, (byte) 10)).M(q9w.d1);
                Function function2 = Functions.a;
                Flowable flowableC2 = Flowable.c(this.c, flowableH4, flowable2, flowableOnErrorReturnM2.t(function2), flowableH3, s9w.c1);
                flowableC2.getClass();
                return flowableC2.t(function2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2z(bv40 bv40Var, Flowable flowable, zr00 zr00Var, yh2 yh2Var, g7h g7hVar) {
        super(1);
        this.b = bv40Var;
        this.c = flowable;
        this.d = zr00Var;
        this.e = yh2Var;
        this.f = g7hVar;
    }
}
