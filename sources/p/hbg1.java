package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hbg1 {
    public final /* synthetic */ bbg1 a;

    public hbg1(bbg1 bbg1Var) {
        this.a = bbg1Var;
    }

    public final sma1 a(n6r0 n6r0Var, uot0 uot0Var, iac0 iac0Var, hyy0 hyy0Var) {
        f0a f0aVar = (f0a) ((gtq) ((jly0) new f0a(this.a.create(), uot0Var, iac0Var).O0).get()).a.c;
        dpq dpqVar = (dpq) ((jly0) f0aVar.Y).get();
        ecd1 ecd1Var = new ecd1(f0aVar.s(), (fcd1) ((jly0) f0aVar.Z).get());
        gpq gpqVar = (gpq) ((jly0) f0aVar.N0).get();
        fcd1 fcd1Var = (fcd1) ((jly0) f0aVar.Z).get();
        cbg1 cbg1Var = (cbg1) f0aVar.b;
        Scheduler schedulerO = cbg1Var.o();
        c8o.l(schedulerO);
        p801 p801Var = new p801(fcd1Var, schedulerO, (zde1) ((jly0) f0aVar.h).get());
        FlowableMap flowableMapA = f0aVar.A();
        Flowable flowableF = cbg1Var.f();
        c8o.l(flowableF);
        FlowableMap flowableMapJ = new FlowableOnBackpressureLatest(flowableF).j(mo9.Z).x(ok10.X0).J(sl10.b1);
        Flowable flowableF2 = cbg1Var.f();
        c8o.l(flowableF2);
        FlowableDistinctUntilChanged flowableDistinctUntilChangedT = new FlowableOnBackpressureLatest(flowableF2).x(mi10.Z0).J(si10.Z0).t(Functions.a);
        q8n q8nVarR0 = cbg1Var.r0();
        c8o.l(q8nVarR0);
        return new sma1(hyy0Var, dpqVar, ecd1Var, gpqVar, p801Var, new m801(flowableMapA, flowableMapJ, flowableDistinctUntilChangedT, q8nVarR0));
    }
}
