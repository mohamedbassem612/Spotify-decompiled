package p;

import com.spotify.cosmos.rxrouter.RxRouter;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dkp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ dkp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final xec1 a(bas basVar) {
        byte b = this.a;
        caq caqVar = this.b;
        switch (b) {
            case 0:
                gkp gkpVar = (gkp) ((chp) caqVar).c;
                RxRouter rxRouterK = gkpVar.a.k();
                c8o.l(rxRouterK);
                hec1 hec1VarO = cec1.o(rxRouterK);
                t2j0 t2j0Var = (t2j0) gkpVar.a.h;
                c8o.l(t2j0Var);
                lvw0 lvw0Var = (lvw0) gkpVar.q.get();
                Scheduler scheduler = (Scheduler) gkpVar.a.m;
                c8o.l(scheduler);
                be beVar = (be) gkpVar.a.u;
                ynb0 ynb0VarA = xqu.a(gkpVar.r);
                yqg yqgVar = (yqg) gkpVar.a.g;
                c8o.l(yqgVar);
                return new xec1(hec1VarO, t2j0Var, lvw0Var, scheduler, beVar, ynb0VarA, yqgVar, basVar);
            default:
                daq daqVar = caqVar.a;
                return new xec1((hec1) daqVar.au.get(), (t2j0) daqVar.f2.get(), (lvw0) daqVar.Z8.get(), (Scheduler) daqVar.z1.get(), cec1.n((RxRouter) daqVar.G1.get()), xqu.a(daqVar.bu), (yqg) daqVar.J1.get(), basVar);
        }
    }
}
