package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tp91 {
    public final /* synthetic */ rqq a;

    public tp91(rqq rqqVar) {
        this.a = rqqVar;
    }

    public final hj91 a(pp91 pp91Var) {
        ipq ipqVar = this.a.a;
        ynb0 ynb0VarA = xqu.a((ipq) ipq.a(ipqVar).f);
        ynb0 ynb0VarA2 = xqu.a((ipq) ipq.a(ipqVar).h);
        Scheduler schedulerB = ip31.b(ipq.a(ipqVar)).b();
        c8o.l(schedulerB);
        Scheduler schedulerA = ip31.b(ipq.a(ipqVar)).a();
        c8o.l(schedulerA);
        return new hj91(pp91Var, ynb0VarA, ynb0VarA2, schedulerB, schedulerA);
    }
}
