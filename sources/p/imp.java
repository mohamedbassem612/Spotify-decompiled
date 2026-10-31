package p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class imp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ imp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final zb8 a(iu30 iu30Var) {
        byte b = this.a;
        ykq ykqVar = this.b;
        switch (b) {
            case 0:
                kop kopVar = (kop) ((blp) ykqVar).c;
                xfx xfxVarC0 = kopVar.a.c0();
                c8o.l(xfxVarC0);
                zfx zfxVar = new zfx(xfxVarC0.c, (byte) 12);
                urk0 urk0Var = new urk0((byte) 4);
                yqg yqgVar = (yqg) kopVar.d.get();
                xrc0 xrc0Var = (xrc0) kopVar.q.get();
                ww41 ww41Var = kopVar.a;
                iz00 iz00VarI0 = ww41Var.I0();
                c8o.l(iz00VarI0);
                Scheduler schedulerU = ww41Var.U();
                c8o.l(schedulerU);
                return new zb8(zfxVar, urk0Var, yqgVar, new aru0(xrc0Var, iz00VarI0, schedulerU, (byte) 1), kopVar.d(), iu30Var);
            default:
                apq apqVar = (apq) ykqVar.c;
                xfx xfxVarC1 = apqVar.a.c0();
                c8o.l(xfxVarC1);
                zfx zfxVar2 = new zfx(xfxVarC1.c, (byte) 12);
                urk0 urk0Var2 = new urk0((byte) 4);
                yqg yqgVar2 = (yqg) apqVar.d.get();
                xrc0 xrc0Var2 = (xrc0) apqVar.f1p.get();
                v651 v651Var = apqVar.a;
                iz00 iz00VarI1 = v651Var.I0();
                c8o.l(iz00VarI1);
                Scheduler schedulerU2 = v651Var.U();
                c8o.l(schedulerU2);
                return new zb8(zfxVar2, urk0Var2, yqgVar2, new aru0(xrc0Var2, iz00VarI1, schedulerU2, (byte) 1), apqVar.d(), iu30Var);
        }
    }
}
