package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.processors.PublishProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mmf0 {
    public final /* synthetic */ kmf0 a;

    public mmf0(ypa ypaVar, kmf0 kmf0Var) {
        this.a = kmf0Var;
    }

    public final yxb0 a(iac0 iac0Var, mr20 mr20Var) {
        lmf0 lmf0VarMo877create = this.a.mo877create();
        p2o0 p2o0Var = new p2o0(lmf0VarMo877create, iac0Var, mr20Var);
        q8q q8qVarD = lmf0VarMo877create.D();
        c8o.l(q8qVarD);
        Flowable flowable = (Flowable) ((jly0) p2o0Var.e).get();
        Flowable flowableC = lmf0VarMo877create.c();
        c8o.l(flowableC);
        Scheduler schedulerO = lmf0VarMo877create.o();
        c8o.l(schedulerO);
        yqg yqgVarA = lmf0VarMo877create.a();
        c8o.l(yqgVarA);
        Flowable flowableW = zgf0.w(flowableC, schedulerO, yqgVarA);
        FlowableOnBackpressureLatest flowableOnBackpressureLatest = new FlowableOnBackpressureLatest((PublishProcessor) ((jly0) p2o0Var.f).get());
        oqa1 oqa1VarH = lmf0VarMo877create.H();
        c8o.l(oqa1VarH);
        if (oqa1VarH.h) {
            flowable = flowableW;
        }
        e27 e27VarA = q8qVarD.a(flowable, flowableOnBackpressureLatest);
        aqs0 aqs0VarY = lmf0VarMo877create.y();
        c8o.l(aqs0VarY);
        smf0 smf0VarI = lmf0VarMo877create.I();
        c8o.l(smf0VarI);
        m3e0 m3e0VarA = lmf0VarMo877create.A();
        c8o.l(m3e0VarA);
        mr20 mr20VarU = lmf0VarMo877create.u();
        c8o.l(mr20VarU);
        gmt gmtVarO0 = lmf0VarMo877create.o0();
        mr20 mr20VarE = lmf0VarMo877create.E();
        c8o.l(mr20VarE);
        cce cceVar = new cce(mr20VarU, gmtVarO0, new fzw(mr20VarE, brt.x()));
        blp blpVar = (blp) p2o0Var.g;
        sqs0 sqs0VarX = lmf0VarMo877create.x();
        c8o.l(sqs0VarX);
        luk lukVarK = lmf0VarMo877create.k();
        c8o.l(lukVarK);
        boolean zD = new pg4(lukVarK).d();
        luk lukVarK2 = lmf0VarMo877create.k();
        c8o.l(lukVarK2);
        return new yxb0(e27VarA, aqs0VarY, smf0VarI, m3e0VarA, cceVar, blpVar, sqs0VarX, zD, mr20Var, iac0Var, new pg4(lukVarK2).e());
    }
}
