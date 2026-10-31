package p;

import android.app.Activity;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p3q {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ p3q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final ywv0 a(th30 th30Var) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                thq thqVar = (thq) r7qVar;
                v5q v5qVar = (v5q) thqVar.c;
                Activity activity = (Activity) v5qVar.i.a;
                oe4 oe4Var = new oe4((luk) v5qVar.b.L1.get());
                daq daqVar = thqVar.b;
                return new ywv0(activity, oe4Var, th30Var, (u4q0) daqVar.em.get(), (lzn0) v5qVar.U0.get(), (a1r0) v5qVar.k1.get(), (pqs) daqVar.ka.get(), (am30) daqVar.Qb.get(), (Scheduler) daqVar.z1.get());
            case 1:
                r7q r7qVar2 = r7qVar;
                s7q s7qVar = (s7q) r7qVar2.d;
                Activity activity2 = (Activity) s7qVar.t.a;
                oe4 oe4Var2 = new oe4((luk) s7qVar.b.L1.get());
                daq daqVar2 = r7qVar2.b;
                return new ywv0(activity2, oe4Var2, th30Var, (u4q0) daqVar2.em.get(), (lzn0) s7qVar.U0.get(), (a1r0) s7qVar.X0.get(), (pqs) daqVar2.ka.get(), (am30) daqVar2.Qb.get(), (Scheduler) daqVar2.z1.get());
            default:
                r7q r7qVar3 = r7qVar;
                teq teqVar = r7qVar3.d;
                Activity activity3 = (Activity) teqVar.f.a;
                oe4 oe4Var3 = new oe4((luk) teqVar.d.L1.get());
                daq daqVar3 = r7qVar3.b;
                return new ywv0(activity3, oe4Var3, th30Var, (u4q0) daqVar3.em.get(), (lzn0) teqVar.i.get(), (a1r0) teqVar.V0.get(), (pqs) daqVar3.ka.get(), (am30) daqVar3.Qb.get(), (Scheduler) daqVar3.z1.get());
        }
    }
}
