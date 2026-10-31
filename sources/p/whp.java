package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class whp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ whp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final e821 a(ych1 ych1Var) {
        byte b = this.a;
        chp chpVar = this.b;
        switch (b) {
            case 0:
                fip fipVar = (fip) chpVar.c;
                s4b1 s4b1Var = (s4b1) fipVar.l.get();
                Scheduler schedulerD0 = fipVar.b.d0();
                c8o.l(schedulerD0);
                return new e821(s4b1Var, ych1Var, schedulerD0, (tun0) fipVar.j0.get());
            case 1:
                lvq lvqVar = (lvq) ((tsq) chpVar).c;
                s4b1 s4b1Var2 = (s4b1) lvqVar.m.get();
                Scheduler schedulerD1 = lvqVar.b.d0();
                c8o.l(schedulerD1);
                return new e821(s4b1Var2, ych1Var, schedulerD1, (tun0) lvqVar.T0.get());
            default:
                ovq ovqVar = (ovq) ((tsq) chpVar).c;
                s4b1 s4b1Var3 = (s4b1) ovqVar.H.get();
                Scheduler schedulerD2 = ovqVar.b.d0();
                c8o.l(schedulerD2);
                return new e821(s4b1Var3, ych1Var, schedulerD2, (tun0) ovqVar.U.get());
        }
    }
}
