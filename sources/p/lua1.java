package p;

import android.app.Activity;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lua1 {
    public final /* synthetic */ b2q a;

    public lua1(b2q b2qVar) {
        this.a = b2qVar;
    }

    public final oss a(dg30 dg30Var, lik1 lik1Var) {
        wmy wmyVar;
        th30 th30VarE0 = dg30Var.e0();
        b2q b2qVar = this.a;
        switch (b2qVar.a) {
            case 0:
                i2q i2qVar = (i2q) b2qVar.b;
                daq daqVar = i2qVar.a;
                wmyVar = new wmy((luk) daqVar.L1.get(), (pta1) daqVar.Q9.get(), i2qVar.c.u(), (Activity) dg30Var, th30VarE0, (Scheduler) daqVar.z1.get(), (Scheduler) daqVar.r3.get());
                break;
            case 1:
                thq thqVar = (thq) b2qVar.b;
                daq daqVar2 = thqVar.b;
                wmyVar = new wmy((luk) daqVar2.L1.get(), (pta1) daqVar2.Q9.get(), ((v5q) thqVar.c).b0(), (Activity) dg30Var, th30VarE0, (Scheduler) daqVar2.z1.get(), (Scheduler) daqVar2.r3.get());
                break;
            case 2:
                r7q r7qVar = b2qVar.b;
                daq daqVar3 = r7qVar.b;
                wmyVar = new wmy((luk) daqVar3.L1.get(), (pta1) daqVar3.Q9.get(), ((s7q) r7qVar.d).S2(), (Activity) dg30Var, th30VarE0, (Scheduler) daqVar3.z1.get(), (Scheduler) daqVar3.r3.get());
                break;
            default:
                thq thqVar2 = (thq) b2qVar.b;
                daq daqVar4 = thqVar2.b;
                wmyVar = new wmy((luk) daqVar4.L1.get(), (pta1) daqVar4.Q9.get(), thqVar2.c.b.I0(), (Activity) dg30Var, th30VarE0, (Scheduler) daqVar4.z1.get(), (Scheduler) daqVar4.r3.get());
                break;
        }
        gg11 gg11Var = (gg11) wmyVar.c;
        th30 th30Var = (th30) wmyVar.e;
        pta1 pta1Var = (pta1) wmyVar.b;
        c8o.l(pta1Var);
        hp91 hp91Var = (hp91) wmyVar.f;
        Scheduler scheduler = (Scheduler) hp91Var.c;
        c8o.m(scheduler);
        Scheduler scheduler2 = (Scheduler) hp91Var.b;
        c8o.m(scheduler2);
        Activity activity = (Activity) wmyVar.d;
        luk lukVar = (luk) wmyVar.a;
        c8o.l(lukVar);
        return new oss(new ip31(gg11Var, th30Var, pta1Var, scheduler, scheduler2, activity, new iy4(false, false, lukVar), new qta1(), new rta1(), activity));
    }
}
