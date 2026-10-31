package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ccp implements zcv {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ ccp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    @Override // p.zcv
    public final hdv a(g431 g431Var, vdv vdvVar, ydv ydvVar, cdv cdvVar, mr20 mr20Var) {
        byte b = this.a;
        thq thqVar = this.b;
        switch (b) {
            case 0:
                e93 e93Var = (e93) ((lbp) thqVar).c;
                kv51 kv51Var = (kv51) ((jly0) e93Var.X).get();
                ecp ecpVar = (ecp) ((jly0) e93Var.Y).get();
                p40 p40Var = new p40((byte) 6);
                fcp fcpVar = (fcp) ((jly0) e93Var.N0).get();
                hcp hcpVar = (hcp) ((jly0) e93Var.Q0).get();
                Scheduler scheduler = (Scheduler) ((udv) e93Var.c).k.get();
                c8o.l(scheduler);
                return new hdv(g431Var, cdvVar, mr20Var, kv51Var, ecpVar, p40Var, fcpVar, ydvVar, hcpVar, vdvVar, scheduler);
            case 1:
                r7q r7qVar = (r7q) thqVar;
                s7q s7qVar = r7qVar.d;
                return new hdv(g431Var, cdvVar, mr20Var, (kv51) s7qVar.x9.get(), (ecp) s7qVar.y9.get(), new p40((byte) 6), (fcp) s7qVar.A9.get(), ydvVar, (hcp) s7qVar.D9.get(), vdvVar, (Scheduler) r7qVar.b.r3.get());
            default:
                thq thqVar2 = thqVar;
                teq teqVar = thqVar2.c;
                return new hdv(g431Var, cdvVar, mr20Var, (kv51) teqVar.a.f4.get(), (ecp) teqVar.a.g4.get(), new p40((byte) 6), (fcp) teqVar.a.i4.get(), ydvVar, (hcp) teqVar.a.l4.get(), vdvVar, (Scheduler) thqVar2.b.r3.get());
        }
    }
}
